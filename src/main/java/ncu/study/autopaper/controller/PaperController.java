package ncu.study.autopaper.controller;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.enums.EnumQuestionClass;
import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.common.result.JsonResult;
import ncu.study.autopaper.common.util.WordUtils;
import ncu.study.autopaper.common.util.htmltowp.poihtml2word.PoiHtml2Word;
import ncu.study.autopaper.common.util.htmltowp.util.ReadText;
import ncu.study.autopaper.model.*;
import ncu.study.autopaper.service.*;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Resource
    private PaperFavService paperFavService;

    @Resource
    private DownloadRecordService downloadRecordService;

    @Resource
    private CoursesInfoService coursesInfoService;



    @RequestMapping(value = "search.do")
    public ModelAndView search(HttpServletRequest request, GradePojo gradePojo, CoursePojo coursePojo,String content) throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        List<CoursesPojo> allCourses = coursesInfoService.getAllCourses();
        Boolean isLogin = false;
        Boolean isInBasket = false;
        if (allCourses != null) {
            modelAndView.addObject("allCourses", allCourses);
        }
        if (gradePojo != null && coursePojo != null) {
            //将搜索条件存入session
            coursesInfoService.setCurrentCourse(request, gradePojo, coursePojo);
        }
        if (content != null && content != "") {
            String a = new String(content.getBytes("iso-8859-1"), "utf-8");
            content = a;
        }
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser != null) {
            isLogin = true;
        }
        GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
        CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
        String course = currentCourse.getCourse();

        int count = paperService.getSearchCount(currentGrade, currentCourse, content);


        List<PaperPojo> paperPojos = new ArrayList<PaperPojo>();
        List<Paper> papers = paperService.getSearchPapers(currentGrade, currentCourse,content, 0);
        if (papers != null) {
            for (Paper paper : papers) {
                PaperPojo paperPojo = new PaperPojo();
                BeanUtils.copyProperties(paper, paperPojo);

                //试卷下载次数
                int downloadTimes = downloadRecordService.getDownloadTimes(paper.getPaperId());
                paperPojo.setDownloadTimes(downloadTimes);
                String diffiCode = paper.getPaperDifficulty().toString();
                String diffiDesc = EnumQuestionDifficulty.find(diffiCode).getDesc();
                paperPojo.setPaperDifficultyDesc(diffiDesc);

                /*if (isLogin) {
                    QuestionFav questionFav = questionFavService.getQuestionFavInfo(loginUser.getUserId(), question.getQuestionId());

                    isInBasket = questionBasketService.isInBasket(loginUser.getUserId(), course, question.getQuestionId(), question.getQuestionType());


                    questionResponsePojo.setQuestionFav(questionFav);

                }*/
                paperPojos.add(paperPojo);
            }
        }




        //将搜索条件出入session
        modelAndView.addObject("currentContent", content);
        modelAndView.addObject("currentGrade", currentGrade);
        modelAndView.addObject("currentCourse", currentCourse);

        modelAndView.addObject("count", count);
        modelAndView.addObject("papers", paperPojos);

        modelAndView.addObject("isLogin", isLogin);

        modelAndView.setViewName("/paper/paper_search");

        return modelAndView;
    }






    //试题分页查询
    @ResponseBody
    @RequestMapping(value = "searchPage.do")
    public JsonResult searchPage(HttpServletRequest request, String content, int page) throws Exception {
        JsonResult jsonResult = new JsonResult(true);
        Boolean isLogin = false;
        if (content != null && content != "") {
            String a = new String(content.getBytes("iso-8859-1"), "utf-8");
            content = a;
        }
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");
        if (loginUser != null) {
            isLogin = true;
        }
        GradePojo currentGrade = (GradePojo) session.getAttribute("currentGrade");
        CoursePojo currentCourse = (CoursePojo) session.getAttribute("currentCourse");
        List<PaperPojo> paperPojos = new ArrayList<PaperPojo>();
        int start = (page - 1) * 10;
        List<Paper> papers = paperService.getSearchPapers(currentGrade, currentCourse,content, start);
        if (papers != null) {
            for (Paper paper : papers) {
                PaperPojo paperPojo = new PaperPojo();
                BeanUtils.copyProperties(paper, paperPojo);
                //试卷下载次数
                int downloadTimes = downloadRecordService.getDownloadTimes(paper.getPaperId());
                paperPojo.setDownloadTimes(downloadTimes);
                String diffiCode = paper.getPaperDifficulty().toString();
                String diffiDesc = EnumQuestionDifficulty.find(diffiCode).getDesc();
                paperPojo.setPaperDifficultyDesc(diffiDesc);
                paperPojos.add(paperPojo);
            }
        }
        jsonResult.addData("paperList", paperPojos);
        return jsonResult;
    }





    @RequestMapping(value = "/view.do")
    public ModelAndView view(HttpServletRequest request, int paperId) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        Boolean isLogin = false;
        int userId = 0;
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                isLogin = true;
                userId = user.getUserId();
                //查询用户信息并与展示
                modelAndView.addObject("user", user);
                //试卷收藏信息
                Boolean isPaperFav = paperFavService.isFav(userId, paperId);
                modelAndView.addObject("isPaperFav", isPaperFav);
            }
        }
        modelAndView.addObject("isLogin",isLogin);
        PaperPojo paperPojo = paperService.getPaperById(userId, paperId);
        if (isLogin) {
            //试题篮信息查询
            QuestionBasket questionBasket = questionBasketService.getQuestionBasketInfo(userId, paperPojo.getPaperCourseId());
            if (null != questionBasket) {
                String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
                Gson gson = new Gson();
                List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
                }.getType());
                int questionBasketTotal = questionBasket.getTotal();
                modelAndView.addObject("questionBasketTypeCountPojos", questionBasketTypeCountPojos);
                modelAndView.addObject("questionBasketTotal", questionBasketTotal);
            }
        }



        //试卷下载次数
        int downloadTimes = downloadRecordService.getDownloadTimes(paperId);
        modelAndView.addObject("downloadTimes", downloadTimes);


        modelAndView.addObject("paperPojo", paperPojo);
        modelAndView.setViewName("paper/paper_view");
        return modelAndView;
    }


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
    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    public String save(HttpServletRequest request, HttpServletResponse response, String schtml) throws IOException {
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
                if (questionBasketInfo != null) {
                    String questionIdCollection = questionBasketInfo.getQuestionIdCollection();
                    List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionIdCollection, new TypeToken<List<QuestionBasketPojo>>() {
                    }.getType());

                    List<PaperQCResponsePojo> paperQCInfo = questionService.getPaperQCInfo(questionBasketPojos, userId);
                    int totalScore = 0;
                    int totalTime = 0;
                    int totalDiffi = 0;
                    int sum = questionBasketInfo.getTotal();
                    for (PaperQCResponsePojo paperQCResponsePojo : paperQCInfo) {
                        totalScore = totalScore + paperQCResponsePojo.getQuestionTypeScore();
                        totalTime = totalTime + paperQCResponsePojo.getQuestionTypeTime();
                        totalDiffi = totalDiffi + paperQCResponsePojo.getQuestionTypeDiffi();
                    }
                    int avgDiffi = totalDiffi / sum;
                    PaperResponsePojo paperResponsePojo = new PaperResponsePojo();
                    paperResponsePojo.setTotalScore(totalScore);
                    paperResponsePojo.setTotalTime(totalTime);
                    paperResponsePojo.setAvgDifficulty(avgDiffi);

                    Date createTime = new Date();
                    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
                    SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy年MM月dd日");
                    String currentTime1 = formatter1.format(createTime);
                    String currentTime2 = formatter2.format(createTime);
                    String gradeName = questionBasketInfo.getGradeName();
                    String courseName = questionBasketInfo.getCourseName();
                    String fileName = gradeName + courseName + "试卷" + currentTime1 + userId;

                    Boolean fileSaveStatus = PoiHtml2Word.writeHtmlWordFile(fileName, schtml);

                    String paperName = currentTime2 + gradeName + courseName + "试卷";
                    String paperPath = "/doc/" + fileName + ".doc";
                    //试卷WORD生成成功
                    if (fileSaveStatus) {
                        int a = paperService.savePaper(userId, createTime, paperName, paperPath, questionBasketInfo, paperQCInfo, paperResponsePojo);

                        if (a == 1) {
                            //清空试题篮
                            int b = questionBasketService.clearQuestionBasket(userId, course);
                            PaperExample paperExample = new PaperExample();
                            PaperExample.Criteria criteria = paperExample.createCriteria();
                            criteria.andOwnerEqualTo(userId);
                            criteria.andPaperCourseIdEqualTo(course);
                            criteria.andPaperUrlEqualTo(paperPath);
                            List<Paper> papers = paperService.getPaperInfoByExample(paperExample);
                            Paper paper = papers.get(papers.size() - 1);

                            status = paper.getPaperId().toString();
                            if (b != 1) {
                                status = "PE03";//失败
                            }

                        } else {
                            status = "PE03";//插入失败
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
                if (questionBasketInfo != null) {
                    String questionIdCollection = questionBasketInfo.getQuestionIdCollection();
                    List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionIdCollection, new TypeToken<List<QuestionBasketPojo>>() {
                    }.getType());

                    List<PaperQCResponsePojo> paperQCInfo = questionService.getPaperQCInfo(questionBasketPojos, userId);
                    int totalScore = 0;
                    int totalTime = 0;
                    int totalDiffi = 0;
                    int sum = questionBasketInfo.getTotal();
                    for (PaperQCResponsePojo paperQCResponsePojo : paperQCInfo) {
                        totalScore = totalScore + paperQCResponsePojo.getQuestionTypeScore();
                        totalTime = totalTime + paperQCResponsePojo.getQuestionTypeTime();
                        totalDiffi = totalDiffi + paperQCResponsePojo.getQuestionTypeDiffi();
                    }
                    int avgDiffi = totalDiffi / sum;
                    PaperResponsePojo paperResponsePojo = new PaperResponsePojo();
                    paperResponsePojo.setTotalScore(totalScore);
                    paperResponsePojo.setTotalTime(totalTime);
                    paperResponsePojo.setAvgDifficulty(avgDiffi);

                    Date createTime = new Date();
                    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
                    SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy年MM月dd日");
                    String currentTime1 = formatter1.format(createTime);
                    String currentTime2 = formatter2.format(createTime);
                    String gradeName = questionBasketInfo.getGradeName();
                    String courseName = questionBasketInfo.getCourseName();
                    String fileName = gradeName + courseName + "试卷" + currentTime1 + userId;

                    Boolean fileSaveStatus = PoiHtml2Word.writeHtmlWordFile(fileName, schtml);

                    String paperName = currentTime2 + gradeName + courseName + "试卷";
                    String paperPath = "/doc/" + fileName + ".doc";
                    //试卷WORD生成成功
                    if (fileSaveStatus) {
                        int a = paperService.savePaper(userId, createTime, paperName, paperPath, questionBasketInfo, paperQCInfo, paperResponsePojo);
                        if (a == 1) {
                            //清空试题篮
                            int b = questionBasketService.clearQuestionBasket(userId, course);
                            PaperExample paperExample = new PaperExample();
                            PaperExample.Criteria criteria = paperExample.createCriteria();
                            criteria.andOwnerEqualTo(userId);
                            criteria.andPaperCourseIdEqualTo(course);
                            criteria.andPaperUrlEqualTo(paperPath);
                            List<Paper> papers = paperService.getPaperInfoByExample(paperExample);
                            Paper paper = papers.get(papers.size() - 1);

                            status = paper.getPaperId().toString();
                            if (b != 1) {
                                status = "PE03";//失败
                            }

                        } else {
                            status = "PE03";//插入失败
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


    @RequestMapping(value = "/download_paper_doc.do")
    public ResponseEntity<byte[]> downloadPaperDoc(HttpServletRequest request,
                                                   @RequestParam("paperId") int paperId,
                                                   Model model) throws Exception {
        String paperPath = paperService.getPaperDocPath(paperId);
        File file = new File("F://tmp/autopaper" + paperPath);
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        String file_name = file.getName();
        file_name = URLEncoder.encode(file_name, "UTF-8");
        headers.add("Content-Disposition", "attchement;filename=" + file_name);
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        HttpSession session = request.getSession();
        if(null!=session){
            User user = (User)session.getAttribute("loginUser");
            if(null!=user){
                //record
                downloadRecordService.saveUserDownloadRecord(user.getUserId(),paperId);
            }
        }

        return entity;
    }


}
