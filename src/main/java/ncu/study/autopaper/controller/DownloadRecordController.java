package ncu.study.autopaper.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.pojo.PaperDownloadPojo;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.model.PaperDownload;
import ncu.study.autopaper.model.Student;
import ncu.study.autopaper.model.Teacher;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.DownloadRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  DownloadRecordController .java  v0.1  2018/5/24 12:26 Exp $
 */
@Controller
@RequestMapping(value = "/download")
public class DownloadRecordController {
    @Resource
    private DownloadRecordService downloadRecordService;

    @ResponseBody
    @RequestMapping(value = "/record.do")
    public TableResult<PaperDownloadPojo> record(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        TableResult<PaperDownloadPojo> paperDownloadTableResult = new TableResult<PaperDownloadPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                List<PaperDownloadPojo> userDownloadRecord = downloadRecordService.getUserDownloadRecord(user.getUserId());
                if (userDownloadRecord != null) {
                    paperDownloadTableResult.setData(userDownloadRecord);
                    paperDownloadTableResult.setCount(userDownloadRecord.size());
                }

            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return paperDownloadTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/delete.do", method = RequestMethod.POST)
    public String delete(HttpServletRequest request, int paperId, String paperIds) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (paperId == 0) {
                    if (null != paperIds && !paperIds.equals("")) {
                        String[] split = paperIds.split(",");
                        for (String str : split) {
                            int a = Integer.parseInt(str);
                            if (downloadRecordService.delete(user.getUserId(), a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = downloadRecordService.delete(user.getUserId(), paperId);
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
