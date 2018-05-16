package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.result.JsonResult;
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


}
