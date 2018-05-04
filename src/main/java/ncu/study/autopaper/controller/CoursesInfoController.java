package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.service.CoursesInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Ridup
 * @version FleName:  CoursesInfoController .java  v0.1  2018/5/1 11:59 Exp $
 */
@RequestMapping(value = "/course")
public class CoursesInfoController {

    @Resource
    private CoursesInfoService coursesInfoService;

    @RequestMapping(value = "/saveCurrentCourse.do")
    public ModelAndView saveCurrentCourse(HttpServletRequest request, String grade) {
        return null;
    }

}
