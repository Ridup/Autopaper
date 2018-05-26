package ncu.study.autopaper.controller;

import com.google.gson.Gson;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.common.result.TableResult;
import ncu.study.autopaper.common.util.DateUtil;
import ncu.study.autopaper.common.util.DoubleUtil;
import ncu.study.autopaper.common.util.MySimHash;
import ncu.study.autopaper.model.PaperTest;
import ncu.study.autopaper.model.QuestionErrorBook;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.DownloadRecordService;
import ncu.study.autopaper.service.PaperService;
import ncu.study.autopaper.service.PaperTestService;
import ncu.study.autopaper.service.QuestionErrorBookService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperTestController .java  v0.1  2018/5/22 21:30 Exp $
 */
@Controller
@RequestMapping(value = "/paper")
public class PaperTestController {

    @Resource
    private PaperService paperService;

    @Resource
    private DownloadRecordService downloadRecordService;
    @Resource
    private PaperTestService paperTestService;
    @Resource
    private QuestionErrorBookService questionErrorBookService;

    @RequestMapping(value = "/test.do")
    public ModelAndView paperTest(HttpServletRequest request, int paperId) {
        ModelAndView modelAndView = new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null && paperId != 0) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                modelAndView.addObject("user", user);
                Integer userId = user.getUserId();
                PaperPojo paperPojo = paperService.getPaperById(userId, paperId);
                //考试时间设置
                Integer eaxmTime = paperPojo.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH,mm,ss");
                Date now = new Date();
                System.out.println("当前时间：" + sdf.format(now));
                Calendar nowTime = Calendar.getInstance();
                nowTime.add(Calendar.MINUTE, eaxmTime);
                System.out.println(sdf.format(nowTime.getTime()));
                /*Date end = new Date(eaxmTime*60000+now.getTime());*/
                modelAndView.addObject("startTime", sdf.format(now));
                modelAndView.addObject("endTime", sdf.format(nowTime.getTime()));

                modelAndView.addObject("paperPojo", paperPojo);

                //试卷下载次数
                int downloadTimes = downloadRecordService.getDownloadTimes(paperId);
                modelAndView.addObject("downloadTimes", downloadTimes);
                modelAndView.setViewName("paper/paper_test");
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
    @RequestMapping(value = "/test_over.do")
    public String testOver(HttpServletRequest request, int paperId, AnswerPojo answerPojo, int spendTime, String startTime) throws Exception {
        int status = 0;
        Gson gson = new Gson();
        HttpSession session = request.getSession(false);
        if (session != null && paperId != 0) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                Integer userId = user.getUserId();
                PaperPojo paperPojo = paperService.getPaperById(userId, paperId);

                //对比答案
                List<PaperQCResponsePojo> paperQCResponsePojos = paperPojo.getPaperQCResponsePojos();
                List<QuestionResponsePojo> questionList = new ArrayList<QuestionResponsePojo>();
                for (PaperQCResponsePojo paperQCResponsePojo : paperQCResponsePojos) {
                    List<QuestionResponsePojo> questionResponsePojos = paperQCResponsePojo.getQuestionResponsePojos();
                    questionList.addAll(questionResponsePojos);
                }
                List<ErrorQuestionPojo> errorQuestionPojos = new ArrayList<ErrorQuestionPojo>();
                int questionsSize = questionList.size();
                double total = 0;
                for (int i = 0; i < questionsSize; i++) {
                    ErrorQuestionPojo errorQuestionPojo = new ErrorQuestionPojo();
                    QuestionResponsePojo questionResponsePojo = questionList.get(i);
                    String questionType = questionResponsePojo.getType();
                    Long questionId = questionResponsePojo.getQuestionId();
                    String correctAnswer = questionResponsePojo.getAnswer();
                    int c = i + 1;
                    String paramName = "q" + c;
                    String myAnswer = BeanUtils.getProperty(answerPojo, paramName);
                    if (myAnswer != null && !myAnswer.equals("")) {
                        if (questionType.equals("1")) {
                            //主观题，使用相似度：当相似度
                            MySimHash hash1 = new MySimHash(correctAnswer, 64);
                            MySimHash hash2 = new MySimHash(myAnswer, 64);
                            double simAns = hash1.getSemblance(hash2);
                            simAns = DoubleUtil.round(simAns, 2);
                            double scorePercent = 0.00;
                            if (simAns < 0.40) {
                                scorePercent = 0.00;
                                errorQuestionPojo.setRight(false);
                            } else if (simAns >= 0.40) {
                                scorePercent = 0.50;
                                errorQuestionPojo.setRight(false);
                            } else if (simAns >= 0.60) {
                                scorePercent = simAns;
                                errorQuestionPojo.setRight(false);
                            } else if (simAns >= 0.90) {
                                scorePercent = 1.00;
                                errorQuestionPojo.setRight(true);
                            } else {
                                scorePercent = 1.00;
                                errorQuestionPojo.setRight(true);
                            }
                            double questionScore = DoubleUtil.mul(questionResponsePojo.getQuestionScore(), DoubleUtil.round(scorePercent, 1));
                            errorQuestionPojo.setAnswer(myAnswer);
                            errorQuestionPojo.setQuestionId(questionId);
                            errorQuestionPojo.setMyScore(questionScore);
                            total = DoubleUtil.add(total, questionScore);
                        } else {
                            //客观题 严格
                            if (myAnswer.equals(correctAnswer)) {
                                errorQuestionPojo.setMyScore(questionResponsePojo.getQuestionScore());
                                errorQuestionPojo.setQuestionId(questionId);
                                errorQuestionPojo.setRight(true);
                                errorQuestionPojo.setAnswer(myAnswer);
                                total = DoubleUtil.add(total, questionResponsePojo.getQuestionScore());
                            } else {
                                errorQuestionPojo.setMyScore(0);
                                errorQuestionPojo.setQuestionId(questionId);
                                errorQuestionPojo.setRight(false);
                                errorQuestionPojo.setAnswer(myAnswer);
                            }
                        }
                    } else {
                        errorQuestionPojo.setMyScore(0);
                        errorQuestionPojo.setQuestionId(questionId);
                        errorQuestionPojo.setRight(false);
                    }
                    if (errorQuestionPojo.getRight()) {
                        status = questionErrorBookService.deleteErrorRecord(userId, questionId);
                    } else {
                        QuestionErrorBook questionErrorBook = new QuestionErrorBook();
                        questionErrorBook.setUserId(userId);
                        questionErrorBook.setQuestionId(questionId);
                        questionErrorBook.setCreateTime(new Date());
                        questionErrorBook.setMyAnswer(errorQuestionPojo.getAnswer());
                        questionErrorBook.setMyScore(errorQuestionPojo.getMyScore());
                        status = questionErrorBookService.saveErrorRecord(questionErrorBook);
                    }
                    errorQuestionPojos.add(errorQuestionPojo);
                }

                //TODO  调整难度

                //ErrorTestPojo:用户ID，试卷ID，试题ID List<ErrorQuestionPojo>:试题ID，isRight，answer
                PaperTest paperTest = new PaperTest();
                paperTest.setAnswerTime(paperPojo.getTime());
                paperTest.setCostTime(spendTime);
                paperTest.setPaperId(paperId);
                paperTest.setPaperName(paperPojo.getPaperName());
                paperTest.setTestAnswer(gson.toJson(errorQuestionPojos));
                Date date = DateUtil.parseDate(startTime, "yyyy,MM,dd,HH,mm,ss");
                paperTest.setStartTime(date);
                paperTest.setTestScore(total);
                paperTest.setUserId(userId);
                paperTest.setTotalScore((double)paperPojo.getTotal());
                status = paperTestService.saveTestRecord(paperTest);
                if (status == 1) {
                    List<PaperTest> paperTestByRecord = paperTestService.getPaperTestByRecord(paperTest);
                    if (paperTestByRecord != null) {
                        PaperTest paperTest1 = paperTestByRecord.get(paperTestByRecord.size() - 1);
                        status = paperTest1.getTestId();
                    }
                } else {
                    status = 0;
                }

            } else {
                //超时重登
                return "redirect:/index.do?tips=e01";
            }
        } else {
            return "redirect:/index.do";
        }
        return status+"";
    }

    @RequestMapping(value = "/test_report.do")
    public ModelAndView testReport(HttpServletRequest request,int testId){
        ModelAndView modelAndView =  new ModelAndView();
        HttpSession session = request.getSession(false);
        if (session != null && testId != 0) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
        PaperTestPojo paperTestPojo = paperTestService.getPaperTestById(testId);
        modelAndView.addObject("paperTestPojo",paperTestPojo);
                modelAndView.addObject("user",user);
        modelAndView.setViewName("paper/test_report");
        //试卷下载次数
        int downloadTimes = downloadRecordService.getDownloadTimes(paperTestPojo.getPaperId());
        //percent
        if(paperTestPojo!=null){
            Double timePer =DoubleUtil.div(paperTestPojo.getCostTime(),paperTestPojo.getAnswerTime(),2)*100;
            Double scorePer = DoubleUtil.div(paperTestPojo.getTestScore(),paperTestPojo.getTotalScore(),2)*100;
            modelAndView.addObject("timePer",timePer);
            modelAndView.addObject("scorePer",scorePer);
        }

        modelAndView.addObject("downloadTimes", downloadTimes);
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
    @RequestMapping(value = "/test_record.do")
    public TableResult<PaperTestPojo> testRecord(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        TableResult<PaperTestPojo> paperTestPojoTableResult = new TableResult<PaperTestPojo>();
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                List<PaperTestPojo> paperTestByUserId = paperTestService.getPaperTestByUserId(user.getUserId());
                if(paperTestByUserId!=null){
                    paperTestPojoTableResult.setData(paperTestByUserId);
                    paperTestPojoTableResult.setCount(paperTestByUserId.size());
                }
            } else {
                //超时重登
                //modelAndView.setViewName("redirect:/index.do?tips=e01");
            }
        } else {
            //modelAndView.setViewName("redirect:/index.do");
        }
        return paperTestPojoTableResult;
    }


    @ResponseBody
    @RequestMapping(value = "/test_delete.do",method = RequestMethod.POST)
    public String testDelete(HttpServletRequest request,int testId,String testIds){
        HttpSession session = request.getSession(false);
        if (session != null) {
            User user = (User) session.getAttribute("loginUser");
            if (user != null) {
                if (testId == 0) {
                    if (null != testIds && !testIds.equals("")) {
                        String[] split = testIds.split(",");
                        for (String str : split) {
                            int a = Integer.parseInt(str);
                            if (paperTestService.deleteRecord(a) == 0) {
                                return "fail";
                            }

                        }
                        return "success";
                    }
                } else {
                    int status = paperTestService.deleteRecord(testId);
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
