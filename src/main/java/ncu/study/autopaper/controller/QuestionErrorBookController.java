package ncu.study.autopaper.controller;

import ncu.study.autopaper.common.pojo.PaperDownloadPojo;
import ncu.study.autopaper.common.pojo.QuestionErrorBookPojo;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.model.QuestionErrorBook;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.QuestionErrorBookService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionErrorBookController .java  v0.1  2018/5/24 19:20 Exp $
 */
@Controller
@RequestMapping(value = "/error_book")
public class QuestionErrorBookController {


    @Resource
    private QuestionErrorBookService questionErrorBookService;



    @ResponseBody
    @RequestMapping(value = "/record.do")
    public TableResult<QuestionErrorBookPojo> record(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        TableResult<QuestionErrorBookPojo> questionErrorBookPojoTableResult = new TableResult<QuestionErrorBookPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                List<QuestionErrorBookPojo> questionErrorBookPojos = questionErrorBookService.getUserErrorBook(user.getUserId());
                if(questionErrorBookPojos!=null){
                    questionErrorBookPojoTableResult.setData(questionErrorBookPojos);
                    questionErrorBookPojoTableResult.setCount(questionErrorBookPojos.size());
                }

            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return questionErrorBookPojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    public String delete(HttpServletRequest request,long questionId,String questionIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (questionId == 0) {
                    if (null != questionIds && !questionIds.equals("")) {
                        String[] split = questionIds.split(",");
                        for (String str : split) {
                            long a = Long.parseLong(str);
                            if (questionErrorBookService.deleteErrorRecord(user.getUserId(), a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = questionErrorBookService.deleteErrorRecord(user.getUserId(), questionId);
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
