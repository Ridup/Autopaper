package ncu.study.autopaper.controller;


import ncu.study.autopaper.common.param.UserRegisterParam;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Ridup
 * @version $Id: UserController.java, v 0.1 2018/1/26 17:53 Ridup Exp $
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

   /* @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }*/

    @RequestMapping("/login.do")
    public ModelAndView login(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(model);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/loginIn.do",method= RequestMethod.POST)
    public String loginIn(HttpServletRequest request, String username, String password,RedirectAttributes attr){
        String msg = new String();
        User user = userService.login(username,password);
        if (user!=null){
            if(user.getUserPassword().equals(password)&&user.getUserType()!="0"){
                msg = "登陆成功！";
                attr.addFlashAttribute("msg",msg);
                HttpSession session = request.getSession(true);
                session.setAttribute("loginUser",user);
                return "redirect:/";
            }else if(user.getUserType()=="0"){
                msg = "管理员无法登陆！";
                attr.addFlashAttribute("msg",msg);
                attr.addFlashAttribute("name",username);
                attr.addFlashAttribute("password",password);
                return "redirect:/user/login.do";
            }
            else{
                msg = "密码错误";
                attr.addFlashAttribute("msg",msg);
                attr.addFlashAttribute("name",username);
                attr.addFlashAttribute("password",password);
                return "redirect:/user/login.do";
            }
        }else{
            msg = "用户不存在！";
            attr.addFlashAttribute("msg",msg);
            attr.addFlashAttribute("name",username);
            attr.addFlashAttribute("password",password);
            return "redirect:/user/login.do";
        }
    }

    @RequestMapping("/register.do")
    public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping(value = "/registerIn.do",method = RequestMethod.POST)
    public JsonResult registerIn(HttpServletRequest request, UserRegisterParam param){
        JsonResult result = new JsonResult(true);
        User user = userService.register(param);
        if (user!=null){
            result.addData("user",user);
        }else{
            result.setCode("1");
            result.setMsg("注册失败！");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value="/check-account.do",method = RequestMethod.POST)
    public JsonResult checkAccount(String val, String type, String t){
        JsonResult result = new JsonResult(true);
        if(userService.checkRegistor(val)){
            result.setCode("1");
            result.setMsg("用户已存在！");
        }else{
            result.setCode("0");
            //result.setMsg("<span style='color:green'>该账号可用！<span>");
        }
        return  result;
    }




    @RequestMapping("/logout.do")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        request.getSession().removeAttribute("loginUser");
        return "redirect:/";
    }

}
