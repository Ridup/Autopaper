package ncu.study.autopaper.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.QuestionBasketTypeCountPojo;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.QuestionBasket;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.QuestionBasketService;
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
 * @version FleName:  QuestionBasketController .java  v0.1  2018/5/10 22:40 Exp $
 */
@Controller
@RequestMapping(value = "/question_basket")
public class QuestionBasketController {

    @Resource
    private QuestionBasketService questionBasketService;

    @ResponseBody
    @RequestMapping(value = "/add.do",method = RequestMethod.POST)
    public JsonResult add(HttpServletRequest request,String questionId,String questionType){
        JsonResult jsonResult = new JsonResult(true);
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");

        if(null!=loginUser&&null!=questionId&&null!=questionType){
            GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
            CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
            String course = currentCourse.getCourse();

            int status = questionBasketService.addQuestion(loginUser.getUserId(),Long.parseLong(questionId),questionType,currentGrade,currentCourse);

            QuestionBasket questionBasket = questionBasketService.getQuestionBasketInfo(loginUser.getUserId(),course);
            if(null!=questionBasket){
                String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
                Gson gson = new Gson();
                List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
                }.getType());
                int questionBasketTotal = questionBasket.getTotal();
                jsonResult.addData("questionBasketTypeCountPojos",questionBasketTypeCountPojos);
                jsonResult.addData("questionBasketTotal",questionBasketTotal);
            }

            jsonResult.setCode("X0"+status);
        }else{
            jsonResult.setCode("X03");
        }
        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    public JsonResult delete(HttpServletRequest request,String questionId,String questionType){
        JsonResult jsonResult = new JsonResult(true);
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if(null!=loginUser&&null!=questionId&&null!=questionType){
            GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
            CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
            String course = currentCourse.getCourse();
            int status = questionBasketService.deleteQuestion(loginUser.getUserId(),Long.parseLong(questionId),questionType,currentGrade,currentCourse);

            QuestionBasket questionBasket = questionBasketService.getQuestionBasketInfo(loginUser.getUserId(),course);
            if(null!=questionBasket){
                String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
                Gson gson = new Gson();
                List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
                }.getType());
                int questionBasketTotal = questionBasket.getTotal();
                jsonResult.addData("questionBasketTypeCountPojos",questionBasketTypeCountPojos);
                jsonResult.addData("questionBasketTotal",questionBasketTotal);
            }

            jsonResult.setCode("X0"+status);
        }else{
            jsonResult.setCode("X03");
        }
        return jsonResult;
    }
}
