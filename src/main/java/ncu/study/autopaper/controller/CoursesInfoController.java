package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.service.CoursesInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Ridup
 * @version FleName:  CoursesInfoController .java  v0.1  2018/5/1 11:59 Exp $
 */
@Controller
@RequestMapping(value = "/course")
public class CoursesInfoController {

    @Resource
    private CoursesInfoService coursesInfoService;

    @RequestMapping(value = "/saveCurrentCourse.do")
    public String saveCurrentCourse(HttpServletRequest request, GradePojo gradePojo, CoursePojo coursePojo) throws Exception {
        coursesInfoService.setCurrentCourse(request, gradePojo, coursePojo);
        return "redirect:/index.do";
    }

}
