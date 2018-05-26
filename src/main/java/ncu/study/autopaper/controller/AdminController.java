package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.QuestionCommentPojo;
import ncu.study.autopaper.common.pojo.QuestionFavPojo;
import ncu.study.autopaper.common.pojo.QuestionResponsePojo;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.PaperCommentService;
import ncu.study.autopaper.service.QuestionCommentService;
import ncu.study.autopaper.service.QuestionService;
import ncu.study.autopaper.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  AdminController .java  v0.1  2018/5/25 19:22 Exp $
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    private UserService userService;

    @Resource
    private QuestionCommentService questionCommentService;
    @Resource
    private PaperCommentService paperCommentService;
    @Resource
    private QuestionService questionService;

    @RequestMapping(value = "/login.do")
    public ModelAndView login(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/admin_login");
        return modelAndView;
    }

    @RequestMapping(value = "/index.do")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/admin_index");
        return modelAndView;
    }

    @RequestMapping(value = "/login_in.do")
    public ModelAndView loginIn(HttpServletRequest request,String name,String password){
        ModelAndView modelAndView = new ModelAndView();


        User user = userService.login(name,password);
        if (user!=null){
            if(user.getUserPassword().equals(password)&&user.getUserType().equals("0")){
                HttpSession session = request.getSession(true);
                session.setAttribute("admin",user);
                modelAndView.addObject("user",user);
                modelAndView.setViewName("admin/admin_index");
            }else{
                modelAndView.setViewName( "redirect:/admin/login.do");
            }
        }else{
            modelAndView.setViewName( "redirect:/admin/login.do");
        }
        return modelAndView;

    }




    @ResponseBody
    @RequestMapping(value = "/question/record.do")
    public TableResult<QuestionResponsePojo> questionRecord(HttpServletRequest request,String type){
        HttpSession session = request.getSession(false);
        TableResult<QuestionResponsePojo> questionResponsePojoTableResult = new TableResult<QuestionResponsePojo>();
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                if(type==null||type.equals("")){
                    session.setAttribute("questionType","101");
                }else {
                    session.setAttribute("questionType",type);
                }
                String questionType = (String) session.getAttribute("questionType");
                List<QuestionResponsePojo> questionResponsePojoByType = questionService.getQuestionResponsePojoByType(questionType);
                questionResponsePojoTableResult.setData(questionResponsePojoByType);
                questionResponsePojoTableResult.setCount(questionResponsePojoByType.size());

            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return questionResponsePojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/question/delete.do",method = RequestMethod.POST)
    public String questionDelete(HttpServletRequest request,long questionId){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                    int status = questionService.deleteQuestion(questionId);
                    if (status == 1) {
                        return "success";
                }
            } else {
            }
        } else {
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping(value = "/question/pass.do",method = RequestMethod.POST)
    public String questionPass(HttpServletRequest request,long questionId,String questionIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                if (questionId == 0) {
                    if (null != questionIds && !questionIds.equals("")) {
                        String[] split = questionIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionService.pass(a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = questionService.pass(questionId);
                    if (status == 1) {
                        return "success";
                    }
                }
            } else {
            }
        } else {
        }
        return "fail";
    }

    @ResponseBody
    @RequestMapping(value = "/question/nopass.do",method = RequestMethod.POST)
    public String questionNoPass(HttpServletRequest request,long questionId,String questionIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                if (questionId == 0) {
                    if (null != questionIds && !questionIds.equals("")) {
                        String[] split = questionIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionService.noPass(a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = questionService.noPass(questionId);
                    if (status == 1) {
                        return "success";
                    }
                }
            } else {
            }
        } else {
        }
        return "fail";
    }



/*

    @ResponseBody
    @RequestMapping(value = "/question_comment/record.do")
    public TableResult<QuestionCommentPojo> question_commentRecord(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        TableResult<QuestionCommentPojo> questionCommentPojoTableResult = new TableResult<QuestionCommentPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                List<QuestionCommentPojo> all = questionCommentService.getAll();
                    questionCommentPojoTableResult.setData(all);
                    questionCommentPojoTableResult.setCount(all.size());

            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return questionCommentPojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/question_comment/delete.do",method = RequestMethod.POST)
    public String question_commentDelete(HttpServletRequest request,long questionCommentId,String questionCommentIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("admin");
            if (user != null) {
                if (questionCommentId == 0) {
                    if (null != questionCommentIds && !questionCommentIds.equals("")) {
                        String[] split = questionCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionCommentService.deleteComment(a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = questionCommentService.deleteComment(questionCommentId);
                    if (status == 1) {
                        return "success";
                    }
                }
            } else {
            }
        } else {
        }
        return "fail";
    }*/




















}
