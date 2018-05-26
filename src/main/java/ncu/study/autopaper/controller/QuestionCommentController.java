package ncu.study.autopaper.controller;

import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.QuestionCommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Ridup
 * @version FleName:  QuestionCommentController .java  v0.1  2018/5/25 13:26 Exp $
 */
@Controller
@RequestMapping(value = "/question_comment")
public class QuestionCommentController {
    @Resource
    private QuestionCommentService questionCommentService;

    @ResponseBody
    @RequestMapping(value = "/submit.do")
    public String submit(HttpServletRequest request, long questionId, String content) {
        String a = "";
        HttpSession session = request.getSession();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                Integer userId = user.getUserId();
                if (content != null && !content.equals("")) {
                    int i = questionCommentService.saveComment(userId, questionId, content);
                    if (i == 0) {
                        return "fail";
                    }
                    if (i == 1) {
                        return "success";
                    }
                } else {
                    return "fail";
                }
            } else {
                return "redirect:/index.do?tips=e01";
            }
        } else {
            return "redirect:/index.do";
        }
        return a;
    }

    @ResponseBody
    @RequestMapping(value = "/delete.do")
    public String delete(HttpServletRequest request, long questionCommentId, String questionCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
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
    }


    @ResponseBody
    @RequestMapping(value = "/pass.do")
    public String pass(HttpServletRequest request, long questionCommentId, String questionCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (questionCommentId == 0) {
                    if (null != questionCommentIds && !questionCommentIds.equals("")) {
                        String[] split = questionCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionCommentService.passComment(a) == 0) {
                                return "fail";
                            }
                        }
                        return "success";
                    }
                } else {
                    int status = questionCommentService.passComment(questionCommentId);
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
    @RequestMapping(value = "/nopass.do")
    public String nopass(HttpServletRequest request, long questionCommentId, String questionCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (questionCommentId == 0) {
                    if (null != questionCommentIds && !questionCommentIds.equals("")) {
                        String[] split = questionCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionCommentService.noPassComment(a) == 0) {
                                return "fail";
                            }
                        }
                        return "success";
                    }
                } else {
                    int status = questionCommentService.noPassComment(questionCommentId);
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


}
