package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.PaperFavService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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


}
