package ncu.study.autopaper.controller;


import com.google.gson.*;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.PointPojo;
import ncu.study.autopaper.common.pojo.PointsPojo;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.CoursesInfo;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.CoursesInfoService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @Resource
    private CoursesInfoService coursesInfoService;

    @Resource
    private QuestionService questionService;

    @RequestMapping(value = "/question_in.do")
    public ModelAndView questionIn(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询到年纪、学科、版本
                // TODO 三维JSON数组DEMO、
                JsonObject object = new JsonObject();
                List<String> grades = coursesInfoService.getAllGradeName();
                for (String grade : grades) {
                    GradePojo gradePojo = new GradePojo();
                    gradePojo.setGradeName(grade);
                    List<String> courses = coursesInfoService.getAllCourseName(gradePojo);
                    JsonObject object1 = new JsonObject();
                    for (String course : courses) {
                        CoursePojo coursePojo = new CoursePojo();
                        coursePojo.setCourseName(course);
                        List<String> versions = coursesInfoService.getAllVersionName(gradePojo, coursePojo);
                        JsonParser jsonParser = new JsonParser();
                        JsonElement jsonElement = jsonParser.parse(versions.toString());  //将json字符串转换成JsonElement
                        //JsonArray jsonArray=jsonElement.getAsJsonArray();  //将JsonElement转换成JsonArray
                        object1.add(course, jsonElement);

                    }
                    object.add(grade, object1);
                }
                modelAndView.addObject("coursesJson", object);
                modelAndView.setViewName("/question/question_in");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/?tips=e01");
            }
        } else {
            modelAndView.setViewName("redirect:/");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/question_insert.do", method = RequestMethod.POST)
    public ModelAndView question_insert(HttpServletRequest request, Question question) {
        // TODO add images
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //去除多余 的都逗号
                if (question.getQuestionType().equals("101") || question.getQuestionType().equals("102"))
                    question.setAnswer(question.getAnswer().substring(1));
                //知识点数
                String points = question.getPoint();
                Integer pointNumber = points.split(",").length;
                question.setPointNumber(pointNumber);
                question.setUsetimes(new Long(0));
                question.setQuestionHot(new Long(0));
                question.setOwnner(obj.getUserId());
                question.setCreateTime(new Date());
                question.setUpdateTime(new Date());
                int status = questionService.insertQuestionInfo(question);
                if (status==1){
                    modelAndView.addObject("tips","试题录入成功！");
                    modelAndView.addObject("insertStatus","6");
                }else {
                    modelAndView.addObject("tips","系统异常，请重试");
                    modelAndView.addObject("insertStatus","5");
                }
                modelAndView.setViewName("/question/question_in");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/?tips=e01");
            }
        } else {
            modelAndView.setViewName("redirect:/");
        }
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/question_point.do", method = RequestMethod.POST)
    public List<PointsPojo> questionPoint(HttpServletRequest request, CoursesInfo coursesInfo) {
        List<PointsPojo> pointsPojos = new ArrayList<PointsPojo>();
        List<CoursesInfo> coursesInfos = coursesInfoService.getCoursesInfo(coursesInfo);
        for (CoursesInfo pojo : coursesInfos) {
            int flag = 0;
            for (PointsPojo pointsPojo1 : pointsPojos) {
                if (pointsPojo1.getChapter().equals(pojo.getChapterName()) && pointsPojo1.getChapterId().equals(pojo.getChapter())) {
                           /* pointsPojo1.setChapter(pojo.getChapterName());
                            pointsPojo1.setChapterId(pojo.getChapter());*/
                    PointPojo pointPojo = new PointPojo();
                    pointPojo.setCourseId(pojo.getCourseId());
                    pointPojo.setPointName(pojo.getPointName());
                    pointsPojo1.getPointPojoList().add(pointPojo);
                    flag = 1;
                    break;
                }/*else {
                    PointsPojo pointsPojo = new PointsPojo();
                    PointPojo pointPojo = new PointPojo();
                    pointsPojo.setChapterId(pojo.getChapter());
                    pointsPojo.setChapter(pojo.getChapterName());
                    pointPojo.setCourseId(pojo.getCourseId());
                    pointPojo.setPointName(pojo.getPointName());
                    pointsPojo.getPointPojoList().add(pointPojo);
                    pointsPojos.add(pointsPojo);
                }*/
            }
            if (flag == 0) {
                PointsPojo pointsPojo = new PointsPojo();
                PointPojo pointPojo = new PointPojo();
                pointsPojo.setChapterId(pojo.getChapter());
                pointsPojo.setChapter(pojo.getChapterName());
                pointPojo.setCourseId(pojo.getCourseId());
                pointPojo.setPointName(pojo.getPointName());
                List<PointPojo> pointPojoList = new ArrayList<PointPojo>();
                pointPojoList.add(pointPojo);
                pointsPojo.setPointPojoList(pointPojoList);
                pointsPojos.add(pointsPojo);
            }

        }

        return pointsPojos;
    }

}
