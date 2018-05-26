package ncu.study.autopaper.controller;

import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.PaperCommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Ridup
 * @version FleName:  PaperCommentController .java  v0.1  2018/5/25 17:19 Exp $
 */
@Controller
@RequestMapping(value = "/paper_comment")
public class PaperCommentController {
    @Resource
    private PaperCommentService paperCommentService;

    @ResponseBody
    @RequestMapping(value = "/submit.do")
    public String submit(HttpServletRequest request, int paperId, String content) {
        String a = "";
        HttpSession session = request.getSession();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                Integer userId = user.getUserId();
                if (content != null && !content.equals("")) {
                    int i = paperCommentService.saveComment(userId, paperId, content);
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
    public String delete(HttpServletRequest request, long paperCommentId, String paperCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (paperCommentId == 0) {
                    if (null != paperCommentIds && !paperCommentIds.equals("")) {
                        String[] split = paperCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (paperCommentService.deleteComment(a) == 0) {
                                return "fail";
                            }
                        }
                        return "success";
                    }
                } else {
                    int status = paperCommentService.deleteComment(paperCommentId);
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
    public String pass(HttpServletRequest request, long paperCommentId, String paperCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (paperCommentId == 0) {
                    if (null != paperCommentIds && !paperCommentIds.equals("")) {
                        String[] split = paperCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (paperCommentService.passComment(a) == 0) {
                                return "fail";
                            }
                        }
                        return "success";
                    }
                } else {
                    int status = paperCommentService.passComment(paperCommentId);
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
    public String nopass(HttpServletRequest request, long paperCommentId, String paperCommentIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (paperCommentId == 0) {
                    if (null != paperCommentIds && !paperCommentIds.equals("")) {
                        String[] split = paperCommentIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (paperCommentService.noPassComment(a) == 0) {
                                return "fail";
                            }
                        }
                        return "success";
                    }
                } else {
                    int status = paperCommentService.noPassComment(paperCommentId);
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
