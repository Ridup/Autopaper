package ncu.study.autopaper.controller;


import ncu.study.autopaper.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @RequestMapping(value = "/question_in.do")
    public ModelAndView questionIn(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/question/question_in");
        return modelAndView;
    }

    @RequestMapping(value = "/question_insert.do",method = RequestMethod.POST)
    public ModelAndView question_insert(HttpServletRequest request,Question question){
        // TODO add images
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/question/question_in");
        return modelAndView;
    }

}
