package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.PaperFavPojo;
import ncu.study.autopaper.common.pojo.PaperPojo;
import ncu.study.autopaper.common.pojo.QuestionFavPojo;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.PaperFavService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperFavController .java  v0.1  2018/5/18 12:25 Exp $
 */
@Controller
@RequestMapping(value = "/paperfav")
public class PaperFavController {

    @Resource
    private PaperFavService paperFavService;

    @ResponseBody
    @RequestMapping(value = "/fav.do")
    public JsonResult fav(HttpServletRequest request,int userId,int paperId){
        JsonResult jsonResult = new JsonResult(true);
        if (userId!=0&&paperId!=0){
            int status = paperFavService.favPaper(userId,paperId);
            jsonResult.setCode("X0"+status);
        }else{
            jsonResult.setCode("X03");
        }
        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value = "/cancel_fav.do")
    public JsonResult cancelFav(HttpServletRequest request,int userId,int paperId){
        JsonResult jsonResult = new JsonResult(true);
        if (userId!=0&&paperId!=0){
            int status = paperFavService.cancleFav(userId,paperId);
            jsonResult.setCode("X0"+status);
        }else{
            jsonResult.setCode("X03");
        }
        return jsonResult;
    }



    @ResponseBody
    @RequestMapping(value = "/record.do")
    public TableResult<PaperFavPojo> record(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        TableResult<PaperFavPojo> paperFavPojoTableResult = new TableResult<PaperFavPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                List<PaperFavPojo> paperFavPojos = paperFavService.getPaperPojoByUserId(user.getUserId());
                if(paperFavPojos!=null){
                    paperFavPojoTableResult.setData(paperFavPojos);
                    paperFavPojoTableResult.setCount(paperFavPojos.size());
                }
            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return paperFavPojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    public String testDelete(HttpServletRequest request,int paperId,String paperIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (paperId == 0) {
                    if (null != paperIds && !paperIds.equals("")) {
                        String[] split = paperIds.split(",");
                        for (String str : split) {
                            int a = Integer.parseInt(str);
                            if (paperFavService.cancleFav(user.getUserId(),a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = paperFavService.cancleFav(user.getUserId(),paperId);
                    if (status == 1) {
                        return "success";
                    }
                }
            } else {
            }
        } else {
        }
        return "fail";
    }


}
