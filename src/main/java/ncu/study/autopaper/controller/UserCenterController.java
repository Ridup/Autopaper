package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.model.Student;
import ncu.study.autopaper.model.Teacher;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.UserCenterService;
import ncu.study.autopaper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  UserCenterController.java   v0.1  2018/4/17 17:01  Exp $
 */
@Controller
@RequestMapping("/ucenter")
public class UserCenterController {

    @Resource
    private UserService userService;

    @Resource
    private UserCenterService userCenterService;


    @RequestMapping(value = {"/", "/index.do"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                //查询用户信息并与展示
                modelAndView.addObject("user", user);
                if (user.getUserType().equals("1")) {
                    Teacher teacher = new Teacher();
                    teacher = userCenterService.getTeacherInfo(user.getUserId());
                    modelAndView.addObject("teacher", teacher);
                }
                if (user.getUserType().equals("2")) {
                    Student student = new Student();
                    student = userCenterService.getStudentInfo(user.getUserId());
                    modelAndView.addObject("student", student);
                }
                modelAndView.setViewName("user/ucenter");
                modelAndView.addObject("ucenter_position", "index");
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
    @RequestMapping(value = "/userbaseinfo.do", method = RequestMethod.POST)
    public JsonResult userbaseinfo(HttpServletRequest request, User user) {
        JsonResult jsonResult = new JsonResult(false);
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                if (user != null) {
                    user.setUserType(obj.getUserType());
                    user.setUserId(obj.getUserId());
                    user.setUserPhone(obj.getUserPhone());
                    user.setUserPassword(obj.getUserPassword());
                    user.setRegisterTime(obj.getRegisterTime());
                    user.setModifyTime(new Date());
                    int status = userService.updatetUser(user);
                    if (status == 1) {
                        jsonResult.setSuccess(true);
                    } else {
                        jsonResult.setCode("X03");
                        jsonResult.setMsg("保存失败！");
                    }
                } else {
                    jsonResult.setCode("X02");
                    jsonResult.setMsg("请输入数据！");
                }
            } else {
                jsonResult.setCode("X01");
                jsonResult.setMsg("请重新登陆！");
            }
        } else {
            jsonResult.setCode("X01");
            jsonResult.setMsg("请重新登陆！");
        }


        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value = "/modifypassword.do",method = RequestMethod.POST)
    public JsonResult modifypassword(HttpServletRequest request, ModelMap modelMap,User user){
        HttpSession session = request.getSession(false);
        JsonResult jsonResult = new JsonResult(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                if (user != null) {
                    String oldpwd = new String();
                    oldpwd = obj.getUserPassword();
                    if (oldpwd.equals(user.getUserPassword())){
                        jsonResult.setCode("C02");
                        jsonResult.setMsg("密码相同！");
                    }else{
                        user.setUserType(obj.getUserType());
                        user.setUserId(obj.getUserId());
                        user.setUserPhone(obj.getUserPhone());
                        user.setRegisterTime(obj.getRegisterTime());
                        user.setModifyTime(new Date());
                        int status = userService.updatetUser(user);
                        if (status == 1) {
                            jsonResult.setCode("C01");
                            jsonResult.setMsg("修改密码成功！");
                            jsonResult.setSuccess(true);
                        } else {
                            jsonResult.setCode("C03");
                            jsonResult.setMsg("修改密码失败！");
                        }
                    }

                } else {
                    jsonResult.setCode("C03");
                    jsonResult.setMsg("请输入数据！");
                }
            } else {
                jsonResult.setCode("X01");
                jsonResult.setMsg("请重新登陆！");
            }
        } else {
            jsonResult.setCode("X01");
            jsonResult.setMsg("请重新登陆！");
        }
         return  jsonResult;
    }


    @ResponseBody
    @RequestMapping(value = "/modifyemail.do",method = RequestMethod.POST)
    public JsonResult modifyemail(HttpServletRequest request, ModelMap modelMap,User user){
        HttpSession session = request.getSession(false);
        JsonResult jsonResult = new JsonResult(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                if (user != null) {
                        user.setUserType(obj.getUserType());
                        user.setUserId(obj.getUserId());
                        user.setUserPhone(obj.getUserPhone());
                        user.setRegisterTime(obj.getRegisterTime());
                        user.setModifyTime(new Date());
                        int status = userService.updatetUser(user);
                        if (status == 1) {
                            jsonResult.setCode("C01");
                            jsonResult.setSuccess(true);
                        } else {
                            jsonResult.setCode("C03");
                            jsonResult.setMsg("绑定邮箱失败！");
                        }
                    } else {
                    jsonResult.setCode("C03");
                    jsonResult.setMsg("请输入数据！");
                }
            } else {
                jsonResult.setCode("X01");
                jsonResult.setMsg("请重新登陆！");
            }
        } else {
            jsonResult.setCode("X01");
            jsonResult.setMsg("请重新登陆！");
        }
        return  jsonResult;
    }



    @RequestMapping(value = "/download_record.do")
    public ModelAndView download_record(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/download_record");
                modelAndView.addObject("ucenter_position", "download_record");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/generate_record.do")
    public ModelAndView generate_record(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/generate_record");
                modelAndView.addObject("ucenter_position", "generate_record");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/test_record.do")
    public ModelAndView test_record(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/test_record");
                modelAndView.addObject("ucenter_position", "test_record");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/error_record.do")
    public ModelAndView error_record(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/error_record");
                modelAndView.addObject("ucenter_position", "error_record");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/question_in_record.do")
    public ModelAndView question_in_record(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/question_in_record");
                modelAndView.addObject("ucenter_position", "question_in_record");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/error_question.do")
    public ModelAndView error_question(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/error_question");
                modelAndView.addObject("ucenter_position", "error_question");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/u_question.do")
    public ModelAndView u_question(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/u_question");
                modelAndView.addObject("ucenter_position", "u_question");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/u_paper.do")
    public ModelAndView u_paper(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");
            if (obj != null) {
                //查询用户信息并与展示
                User user = userCenterService.getUserInfo(obj.getUserPhone());
                modelAndView.addObject("user", user);
                modelAndView.setViewName("user/u_paper");
                modelAndView.addObject("ucenter_position", "u_paper");
            } else {
                //超时重登
                modelAndView.setViewName("redirect:/ucenter/redirect.do");
            }
        } else {
            modelAndView.setViewName("redirect:/ucenter/redirect.do");
        }
        return modelAndView;
    }


}
