package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.*;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.common.util.DoubleUtil;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.dao.ext.QuestionExtMapper;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.QuestionExample;
import ncu.study.autopaper.model.QuestionFav;
import ncu.study.autopaper.service.QuestionFavService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Ridup
 * @version FleName:  QuestionServiceImpl .java  v0.1  2018/4/26 14:41 Exp $
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionMapper questionMapper;
    @Resource
    private QuestionExtMapper questionExtMapper;
    @Resource
    private QuestionFavService questionFavService;

    @Override
    public int insertQuestionInfo(Question question) {
        double a = DoubleUtil.div(question.getQuestionDifficulty(), 5, 1);
        question.setQuestionDifficulty(a);
        int status = questionMapper.insertSelective(question);
        return status;
    }

    @Override
    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content) {
        QuestionExample questionExample = new QuestionExample();
        QuestionExample.Criteria criteria = questionExample.createCriteria();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        if (gradeName != null && gradeName != "" && !gradeName.trim().equals("")) {
            criteria.andGradeNameLike(gradeName);
        }
        if (courseName != null && courseName != "" && !courseName.trim().equals("")) {
            criteria.andCourseNameLike(courseName);
        }
        if (questionType != null && questionType != "" && !questionType.trim().equals("")) {
            criteria.andQuestionTypeLike(questionType.trim());
        }
        if (content != null && content != "" && !content.trim().equals("")) {
            criteria.andQuestionContentLike("%" + content.trim() + "%");
        }
        criteria.andStatusEqualTo(EnumQuestionStatus.audit_passed.getCode());
        int count = (int) questionMapper.countByExample(questionExample);
        return count;
    }

    @Override
    public List<Question> getSearchQuestions(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content, int start) {
        List<Question> questions = new ArrayList<Question>();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        questions = questionExtMapper.getSearchQuestions(gradeName, courseName, questionType, content, start);
        return questions;
    }

    @Override
    public List<PaperQCResponsePojo> getPaperQCInfo(List<QuestionBasketPojo> questionBasketPojos, int userId) {
        List<PaperQCResponsePojo> paperQCResponsePojos = new ArrayList<PaperQCResponsePojo>();
        for (int i = 0; i < questionBasketPojos.size(); i++) {
            QuestionBasketPojo questionBasketPojo = questionBasketPojos.get(i);
            PaperQCResponsePojo paperQCResponsePojo = new PaperQCResponsePojo();
            paperQCResponsePojo.setQuestionType(questionBasketPojo.getQuestionType());
            paperQCResponsePojo.setQuestionTypeName(questionBasketPojo.getQuestionTypeName());
            List<Long> questionIds = questionBasketPojo.getQuestionIds();
            paperQCResponsePojo.setQuestionCount(questionIds.size());
            int code = 1 + i;
            paperQCResponsePojo.setTypeNumName(EnumNumTrans.find(code + "").getDesc());
            List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
            int typeTotal = 0;
            int typeTime = 0;
            double typeDiffi = 0;
            for (Long questionId : questionIds) {

                Question questionContents = questionMapper.selectByPrimaryKey(questionId);
                typeTotal = typeTotal + questionContents.getQuestionScore();
                typeTime = typeTime + questionContents.getQuestionTime();
                typeDiffi = DoubleUtil.add(typeDiffi, questionContents.getQuestionDifficulty());
                QuestionResponsePojo questionResponsePojo = new QuestionResponsePojo();
                BeanUtils.copyProperties(questionContents, questionResponsePojo);
                questionResponsePojo.setEnumQuestionClass(EnumQuestionClass.find(questionContents.getQuestionClass()));
                questionResponsePojo.setEnumQuestionDifficulty(EnumQuestionDifficulty.find(questionContents.getQuestionDifficulty().toString()));
                questionResponsePojo.setEnumQuestionStatus(EnumQuestionStatus.find(questionContents.getStatus()));
                questionResponsePojo.setEnumQuestionType(EnumQuestionType.find(questionContents.getQuestionType()));
                QuestionFav questionFav = questionFavService.getQuestionFavInfo(userId, questionId);
                questionResponsePojo.setQuestionFav(questionFav);
                questionResponsePojos.add(questionResponsePojo);
            }
            paperQCResponsePojo.setQuestionResponsePojos(questionResponsePojos);
            //分数计算
            paperQCResponsePojo.setQuestionTypeScore(typeTotal);
            paperQCResponsePojo.setQuestionTypeTime(typeTime);
            paperQCResponsePojo.setQuestionTypeDiffi(typeDiffi);
            paperQCResponsePojos.add(paperQCResponsePojo);
        }
        return paperQCResponsePojos;
    }


    @Override
    public List<Question> getQuestionArrayRelated(String type, List<String> points) {
        List<Question> questionListByRuleOR = new ArrayList<Question>();
        if (null != type && !type.equals("") && points != null) {
            questionListByRuleOR = questionExtMapper.getQuestionListByRuleOR(type, points, points.size());
        }
        return questionListByRuleOR;
    }

    @Override
    public List<Question> getQuestionArrayAccurate(String type, List<String> points) {
        List<Question> questionListByRuleOR = new ArrayList<Question>();
        if (null != type && !type.equals("") && points != null) {
            questionListByRuleOR = questionExtMapper.getQuestionListByRuleOR(type, points, points.size());
            ListIterator<Question> questionListIterator = questionListByRuleOR.listIterator();
            while (questionListIterator.hasNext()) {
                Question question = questionListIterator.next();
                String[] pointArr = question.getPoint().split(",");
                for (String point : pointArr) {
                    //精准出题：只要知识点不包含，则remove而后break
                    if (!points.contains(point)) {
                        questionListIterator.remove();
                        break;
                    }
                }
            }
        }
        return questionListByRuleOR;
    }


    @Override
    public List<Question> getQuestionListWithOutSId(Question tempQuestion) {
        List<Question> questions = new ArrayList<Question>();
        //获取相似试题：题型、分数、知识点.除去tempQuestion中的id
        if (null!=tempQuestion){
            String questionType = tempQuestion.getQuestionType();
            int questionScore = tempQuestion.getQuestionScore();
            String[] a = tempQuestion.getPoint().split(",");
            List<String> points = Arrays.asList(a);
            long questionId = tempQuestion.getQuestionId();
            questions = questionExtMapper.getQuestionListByTempQuestion(questionType,questionId,questionScore,points,points.size());

            //严格
            ListIterator<Question> questionListIterator = questions.listIterator();
            while (questionListIterator.hasNext()) {
                Question question = questionListIterator.next();
                String[] pointArr = question.getPoint().split(",");
                for (String point : pointArr) {
                    //精准出题：只要知识点不包含，则remove而后break
                    if (!points.contains(point)) {
                        questionListIterator.remove();
                        break;
                    }
                }
            }
        }
        return questions;
    }

    @Override
    public QuestionResponsePojo getQuestionDetail(long questionId) {
        QuestionResponsePojo questionResponsePojo = new QuestionResponsePojo();
        if(0!=questionId){
            Question question =  questionMapper.selectByPrimaryKey(questionId);
            if(question!=null){
                BeanUtils.copyProperties(question,questionResponsePojo);
                questionResponsePojo.setQuestionType1(EnumQuestionType.find(question.getQuestionType()).getDesc());
                questionResponsePojo.setQuestionDifficulty1(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()).getDesc());
                questionResponsePojo.setQuestionStatus1(EnumQuestionStatus.find(question.getStatus()).getDesc());
                questionResponsePojo.setQuestionClass1(EnumQuestionClass.find(question.getQuestionClass()).getDesc());
            }
        }
        return questionResponsePojo;
    }


    @Override
    public int deleteRecord(long questionId) {
        return 0;
    }

    @Override
    public List<QuestionResponsePojo> getQuestionResponsePojoByUserId(int userId) {
        List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
        if(0!=userId){
            QuestionExample questionExample = new QuestionExample();
            QuestionExample.Criteria criteria = questionExample.createCriteria();
            criteria.andOwnnerEqualTo(userId);
            List<Question> questions = questionMapper.selectByExample(questionExample);
            if(null!=questions){
                for(Question question :questions){
                    QuestionResponsePojo questionResponsePojo =new QuestionResponsePojo();
                    BeanUtils.copyProperties(question,questionResponsePojo);
                    questionResponsePojo.setQuestionType1(EnumQuestionType.find(question.getQuestionType()).getDesc());
                    questionResponsePojo.setQuestionDifficulty1(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()).getDesc());
                    questionResponsePojo.setQuestionStatus1(EnumQuestionStatus.find(question.getStatus()).getDesc());
                    questionResponsePojo.setQuestionClass1(EnumQuestionClass.find(question.getQuestionClass()).getDesc());
                    questionResponsePojos.add(questionResponsePojo);
                }
            }
        }
        return questionResponsePojos;
    }

    @Override
    public List<QuestionResponsePojo> getQuestionResponsePojoByType(String type) {
        List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
        if(null!=type&&!type.equals("")){
            QuestionExample questionExample = new QuestionExample();
            QuestionExample.Criteria criteria = questionExample.createCriteria();
            criteria.andQuestionTypeLike("%" + type+ "%");
            List<Question> questions = questionMapper.selectByExample(questionExample);
            if(null!=questions){
                for(Question question :questions){
                    QuestionResponsePojo questionResponsePojo =new QuestionResponsePojo();
                    BeanUtils.copyProperties(question,questionResponsePojo);
                    questionResponsePojo.setQuestionType1(EnumQuestionType.find(question.getQuestionType()).getDesc());
                    questionResponsePojo.setQuestionDifficulty1(EnumQuestionDifficulty.find(question.getQuestionDifficulty().toString()).getDesc());
                    questionResponsePojo.setQuestionStatus1(EnumQuestionStatus.find(question.getStatus()).getDesc());
                    questionResponsePojo.setQuestionClass1(EnumQuestionClass.find(question.getQuestionClass()).getDesc());
                    questionResponsePojos.add(questionResponsePojo);
                }
            }
        }
        return questionResponsePojos;
    }


    @Override
    public int deleteQuestion(long questionId) {
        int a= 0;
        if(0!=questionId){
            Question question= new Question();
            question.setQuestionId(questionId);
            question.setStatus(EnumQuestionStatus.deleted.getCode());
            a =questionMapper.updateByPrimaryKeySelective(question);
        }
        return a;
    }

    @Override
    public int pass(long questionId) {
        int a= 0;
        if(0!=questionId){
            Question question= new Question();
            question.setQuestionId(questionId);
            question.setStatus(EnumQuestionStatus.audit_passed.getCode());
            a =questionMapper.updateByPrimaryKeySelective(question);
        }
        return a;
    }

    @Override
    public int noPass(long questionId) {
        int a= 0;
        if(0!=questionId){
            Question question= new Question();
            question.setQuestionId(questionId);
            question.setStatus(EnumQuestionStatus.audit_failed.getCode());
            a =questionMapper.updateByPrimaryKeySelective(question);
        }
        return a;
    }
}
