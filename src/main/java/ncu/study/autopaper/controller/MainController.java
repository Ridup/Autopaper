package ncu.study.autopaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Ridup
 * @version $Id: MainController.java, v 0.1  2018/4/11 9:51 Ridup Exp $
 */

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/show.do")
    public ModelAndView show(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if(session!=null){

        }
        modelAndView.setViewName("main");
        return modelAndView;
    }

}
