package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.CoursesPojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.CoursesInfoService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ridup
 * @version $Id: MainController.java, v 0.1  2018/4/11 9:51 Ridup Exp $
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Resource
    private CoursesInfoService coursesInfoService;

    @Resource
    private QuestionService questionService;

    @RequestMapping(value = {"index.do"})
    public ModelAndView show(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession();
        //查询所有年级+科目展示在左上角选项卡；中部内容--资源导航
        List<CoursesPojo> allCourses = coursesInfoService.getAllCourses();
        if (allCourses!=null){
            modelAndView.addObject("allCourses",allCourses);
        }
        //访问主页，当前选择的课程信息,如为空初始化
        GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
        CoursePojo currentCourse= (CoursePojo) session.getAttribute("currentCourse");
        if(currentGrade!=null&&currentCourse!=null&&currentGrade.getGrade()!=null&&currentCourse.getCourse()!=null){
            modelAndView.addObject("currentGrade",currentGrade);
            modelAndView.addObject("currentCourse",currentCourse);

        }else {
            GradePojo gradePojo = new GradePojo();
            CoursePojo coursePojo = new CoursePojo();
            gradePojo.setGrade("G07");
            gradePojo.setGradeName("初一");
            coursePojo.setCourse("shuxue");
            coursePojo.setCourseName("数学");
            session.setAttribute("currentGrade",gradePojo);
            session.setAttribute("currentCourse",coursePojo);
            modelAndView.addObject("currentGrade",gradePojo);
            modelAndView.addObject("currentCourse",coursePojo);
        }
        //滚动页面关联试卷详情
        //推荐热度高的试卷
        //公告关联页面
        //数据统计：试题总量 、试卷总量、组卷总量、测试总量


        modelAndView.setViewName("main");
        return modelAndView;
    }

}