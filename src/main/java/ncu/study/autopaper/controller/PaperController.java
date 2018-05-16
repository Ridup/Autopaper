package ncu.study.autopaper.controller;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.common.util.WordUtils;
import ncu.study.autopaper.common.util.htmltowp.poihtml2word.PoiHtml2Word;
import ncu.study.autopaper.common.util.htmltowp.util.ReadText;
import ncu.study.autopaper.model.QuestionBasket;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.PaperService;
import ncu.study.autopaper.service.QuestionBasketService;
import ncu.study.autopaper.service.QuestionService;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ridup
 * @version FleName:  PaperController .java  v0.1  2018/5/15 0:52 Exp $
 */
@Controller
@RequestMapping(value = "/paper")
public class PaperController {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionBasketService questionBasketService;

    @Resource
    private PaperService paperService;


    @RequestMapping(value = "/edit.do")
    public ModelAndView edit(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        Gson gson = new Gson();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");

            if (obj != null) {
                int userId = obj.getUserId();
                GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
                CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
                String course = currentCourse.getCourse();
                QuestionBasket questionBasketInfo = questionBasketService.getQuestionBasketInfo(userId, course);
                String questionIdCollection = questionBasketInfo.getQuestionIdCollection();
                List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionIdCollection, new TypeToken<List<QuestionBasketPojo>>() {
                }.getType());
                if (questionBasketPojos != null) {

                    List<PaperQCResponsePojo> paperQCInfo = questionService.getPaperQCInfo(questionBasketPojos, userId);
                    int totalScore = 0;
                    int totalTime = 0;
                    for (PaperQCResponsePojo paperQCResponsePojo : paperQCInfo) {
                        totalScore = totalScore + paperQCResponsePojo.getQuestionTypeScore();
                        totalTime = totalTime + paperQCResponsePojo.getQuestionTypeTime();
                    }
                    PaperResponsePojo paperResponsePojo = new PaperResponsePojo();
                    paperResponsePojo.setTotalScore(totalScore);
                    paperResponsePojo.setTotalTime(totalTime);
                    modelAndView.addObject("paperResponsePojo", paperResponsePojo);
                    modelAndView.addObject("paperQCInfo", paperQCInfo);
                    modelAndView.addObject("questionBasketInfo", questionBasketInfo);
                    // TODO  试卷总分与考试时间
                    modelAndView.setViewName("/paper/paper_edit");

                } else {
                    //试题篮为空
                    modelAndView.setViewName("redirect:/question/search.do?tips=e02");
                }
                modelAndView.addObject("user", obj);
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
    @RequestMapping(value = "/download.do", method = RequestMethod.POST)
    public String download(HttpServletRequest request, HttpServletResponse response, String schtml) throws IOException {
        String status = new String();


        Gson gson = new Gson();
        HttpSession session = request.getSession(false);
        if (session != null) {
            User obj = (User) session.getAttribute("loginUser");

            if (obj != null) {
                int userId = obj.getUserId();
                GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
                CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
                String course = currentCourse.getCourse();
                QuestionBasket questionBasketInfo = questionBasketService.getQuestionBasketInfo(userId, course);
                String questionIdCollection = questionBasketInfo.getQuestionIdCollection();
                List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionIdCollection, new TypeToken<List<QuestionBasketPojo>>() {
                }.getType());
                if (questionBasketPojos != null) {
                    List<PaperQCResponsePojo> paperQCInfo = questionService.getPaperQCInfo(questionBasketPojos, userId);
                    int totalScore = 0;
                    int totalTime = 0;
                    int totalDiffi = 0;
                    int sum =questionBasketInfo.getTotal();
                    for (PaperQCResponsePojo paperQCResponsePojo : paperQCInfo) {
                        totalScore = totalScore + paperQCResponsePojo.getQuestionTypeScore();
                        totalTime = totalTime + paperQCResponsePojo.getQuestionTypeTime();
                        totalDiffi = totalDiffi + paperQCResponsePojo.getQuestionTypeDiffi();
                    }
                    int avgDiffi = totalDiffi/sum; //TODO 难度计算
                    PaperResponsePojo paperResponsePojo = new PaperResponsePojo();
                    paperResponsePojo.setTotalScore(totalScore);
                    paperResponsePojo.setTotalTime(totalTime);
                    paperResponsePojo.setAvgDifficulty(avgDiffi);


                    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
                    SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy年MM月dd日");
                    String currentTime1 = formatter1.format(new Date());
                    String currentTime2 = formatter2.format(new Date());
                    String gradeName = questionBasketInfo.getGradeName();
                    String courseName = questionBasketInfo.getCourseName();
                    String fileName = gradeName + courseName + "试卷" + currentTime1 + userId;
                    Boolean fileSaveStatus = PoiHtml2Word.writeHtmlWordFile(fileName, schtml);
                    String paperName = currentTime2 + gradeName + courseName + "试卷";
                    String paperPath = "/doc/"+fileName+".doc";
                    //试卷WORD生成成功
                    if (fileSaveStatus) {
                        int a = paperService.savePaper(userId,paperName,paperPath,questionBasketInfo,paperQCInfo,paperResponsePojo);
                        //TODO 增加下载记录

                        if(a==1){
                            //清空试题篮
                            int b = questionBasketService.clearQuestionBasket(userId,course);
                            if(b!=1){
                                status = "PE01";//失败
                            }
                        }else{
                            status = "PE01";//插入失败
                        }
                    } else {
                        status = "PE02";//WORD生成失败
                    }


                } else {
                    //试题篮为空
                    return "redirect:/question/search.do?tips=e02";
                }
            } else {
                //超时重登
                return "redirect:/index.do?tips=e01";
            }
        } else {
            return "redirect:/index.do";
        }
        return status;
    }


}
