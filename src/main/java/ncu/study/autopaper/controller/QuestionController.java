package ncu.study.autopaper.controller;


import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.enums.EnumQuestionClass;
import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.*;
import ncu.study.autopaper.service.CoursesInfoService;
import ncu.study.autopaper.service.QuestionBasketService;
import ncu.study.autopaper.service.QuestionFavService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
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

    @Resource
    private QuestionFavService questionFavService;

    @Resource
    private QuestionBasketService questionBasketService;

    //带着条件首次进入试题查询
    @RequestMapping(value = "/search.do")
    public ModelAndView search(HttpServletRequest request, GradePojo gradePojo, CoursePojo coursePojo, String questionType, String content) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<CoursesPojo> allCourses = coursesInfoService.getAllCourses();
        Boolean isLogin = false;
        Boolean isInBasket = false;
        if (allCourses != null) {
            modelAndView.addObject("allCourses", allCourses);
        }
        if (gradePojo != null && coursePojo != null) {
            //将搜索条件存入session
            coursesInfoService.setCurrentCourse(request, gradePojo, coursePojo);
        }
        if (content != null && content != "") {
            String a = new String(content.getBytes("iso-8859-1"), "utf-8");
            content = a;
        }
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser != null) {
            isLogin = true;
        }
        GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
        CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
        String course = currentCourse.getCourse();
        int count = questionService.getSearchCount(currentGrade, currentCourse, questionType, content);
        List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
        List<Question> questions = questionService.getSearchQuestions(currentGrade, currentCourse, questionType, content, 0);
        if (questions != null) {
            for (Question question : questions) {
                QuestionResponsePojo questionResponsePojo = new QuestionResponsePojo();
                BeanUtils.copyProperties(question, questionResponsePojo);
                questionResponsePojo.setEnumQuestionClass(EnumQuestionClass.find(question.getQuestionClass()));
                questionResponsePojo.setEnumQuestionDifficulty(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()));
                questionResponsePojo.setEnumQuestionStatus(EnumQuestionStatus.find(question.getStatus()));
                questionResponsePojo.setEnumQuestionType(EnumQuestionType.find(question.getQuestionType()));
                if (isLogin) {
                    QuestionFav questionFav = questionFavService.getQuestionFavInfo(loginUser.getUserId(), question.getQuestionId());

                    isInBasket = questionBasketService.isInBasket(loginUser.getUserId(), course, question.getQuestionId(), question.getQuestionType());


                    questionResponsePojo.setQuestionFav(questionFav);

                }
                questionResponsePojo.setInBasket(isInBasket);
                questionResponsePojos.add(questionResponsePojo);
            }
        }


        if (isLogin) {
            //试题篮信息查询
            QuestionBasket questionBasket = questionBasketService.getQuestionBasketInfo(loginUser.getUserId(), course);
            if (null != questionBasket) {
                String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
                Gson gson = new Gson();
                List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
                }.getType());
                int questionBasketTotal = questionBasket.getTotal();
                modelAndView.addObject("questionBasketTypeCountPojos", questionBasketTypeCountPojos);
                modelAndView.addObject("questionBasketTotal", questionBasketTotal);
            }
        }

        //将搜索条件出入session
        modelAndView.addObject("currentContent", content);
        modelAndView.addObject("currentQuestionType", questionType);
        modelAndView.addObject("currentGrade", currentGrade);
        modelAndView.addObject("currentCourse", currentCourse);

        modelAndView.addObject("count", count);
        modelAndView.addObject("questions", questionResponsePojos);

        modelAndView.addObject("isLogin", isLogin);

        modelAndView.setViewName("/question/question_search");
        return modelAndView;
    }

    //试题分页查询
    @ResponseBody
    @RequestMapping(value = "searchPage.do")
    public JsonResult searchPage(HttpServletRequest request, String questionType, String content, int page) throws Exception {
        JsonResult jsonResult = new JsonResult(true);
        Boolean isLogin = false;
        if (content != null && content != "") {
            String a = new String(content.getBytes("iso-8859-1"), "utf-8");
            content = a;
        }
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser != null) {
            isLogin = true;
        }
        GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
        CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
        List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
        int start = (page - 1) * 10;
        List<Question> questions = questionService.getSearchQuestions(currentGrade, currentCourse, questionType, content, start);
        if (questions != null) {
            for (Question question : questions) {
                QuestionResponsePojo questionResponsePojo = new QuestionResponsePojo();
                BeanUtils.copyProperties(question, questionResponsePojo);

                questionResponsePojo.setQuestionClass1(EnumQuestionClass.find(question.getQuestionClass()).getDesc());
                questionResponsePojo.setQuestionDifficulty1(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()).getDesc());
                questionResponsePojo.setQuestionStatus1(EnumQuestionStatus.find(question.getStatus()).getDesc());
                questionResponsePojo.setQuestionType1(EnumQuestionType.find(question.getQuestionType()).getDesc());

                questionResponsePojo.setEnumQuestionClass(EnumQuestionClass.find(question.getQuestionClass()));
                questionResponsePojo.setEnumQuestionDifficulty(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()));
                questionResponsePojo.setEnumQuestionStatus(EnumQuestionStatus.find(question.getStatus()));
                questionResponsePojo.setEnumQuestionType(EnumQuestionType.find(question.getQuestionType()));

                if (isLogin) {
                    QuestionFav questionFav = questionFavService.getQuestionFavInfo(loginUser.getUserId(), question.getQuestionId());
                    questionResponsePojo.setQuestionFav(questionFav);
                }

                questionResponsePojos.add(questionResponsePojo);
            }
        }
        jsonResult.addData("questionList", questionResponsePojos);
        return jsonResult;
    }


    @RequestMapping(value = "/question_in.do")
    public ModelAndView questionIn(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询到年纪、学科、版本
                // TODO 三维JSON数组DEMO
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
                modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            modelAndView.setViewName("redirect:/index.do");
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
                // TODO 初始化试题状态为：001审核中
                question.setStatus(EnumQuestionStatus.audit_passed.getCode());
                int status = questionService.insertQuestionInfo(question);
                if (status == 1) {
                    modelAndView.addObject("tips", "试题录入成功！");
                    modelAndView.addObject("insertStatus", "6");
                } else {
                    modelAndView.addObject("tips", "系统异常，请重试");
                    modelAndView.addObject("insertStatus", "5");
                }
                modelAndView.setViewName("/question/question_in");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            modelAndView.setViewName("redirect:/index.do");
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
