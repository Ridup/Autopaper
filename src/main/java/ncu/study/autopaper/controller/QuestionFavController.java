package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.PaperTestPojo;
import ncu.study.autopaper.common.pojo.QuestionFavPojo;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.QuestionFavService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionFavController .java  v0.1  2018/5/10 11:01 Exp $
 */

@Controller
@RequestMapping(value = "/questionfav")
public class QuestionFavController {

    @Resource
    private QuestionFavService questionFavService;

    @RequestMapping(value = "/view.do")
    public ModelAndView questionfav(){
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/fav.do",method = RequestMethod.POST)
    public JsonResult fav(HttpServletRequest request,String questionId){
        JsonResult jsonResult = new JsonResult(true);
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if(null!=loginUser&&null!=questionId&&""!=questionId){
            int status = questionFavService.questionFav(loginUser.getUserId(),Long.parseLong(questionId));
            jsonResult.setCode("X0"+status);
        }else{
            jsonResult.setCode("X03");
        }
        return jsonResult;
    }


    @ResponseBody
    @RequestMapping(value = "/record.do")
    public TableResult<QuestionFavPojo> testRecord(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        TableResult<QuestionFavPojo> questionFavPojoTableResult = new TableResult<QuestionFavPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                List<QuestionFavPojo> qfByUserId = questionFavService.getQFByUserId(user.getUserId());
                if(qfByUserId!=null){
                    questionFavPojoTableResult.setData(qfByUserId);
                    questionFavPojoTableResult.setCount(qfByUserId.size());
                }
            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return questionFavPojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    public String testDelete(HttpServletRequest request,long questionId,String questionIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (questionId == 0) {
                    if (null != questionIds && !questionIds.equals("")) {
                        String[] split = questionIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionFavService.deleteFavRecord(user.getUserId(),a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = questionFavService.deleteFavRecord(user.getUserId(),questionId);
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
