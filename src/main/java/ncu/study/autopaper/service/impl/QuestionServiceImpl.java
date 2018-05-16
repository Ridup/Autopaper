package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.*;
import ncu.study.autopaper.common.pojo.*;
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
import java.util.List;

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
        int status = questionMapper.insertSelective(question);
        return status;
    }

    @Override
    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content) {
        QuestionExample questionExample = new QuestionExample();
        QuestionExample.Criteria criteria = questionExample.createCriteria();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        System.out.println("dsadasd" + gradeName + "dsadadsa");
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
        for (int i = 0;i<questionBasketPojos.size();i++) {
            QuestionBasketPojo questionBasketPojo = questionBasketPojos.get(i);
            PaperQCResponsePojo paperQCResponsePojo = new PaperQCResponsePojo();
            paperQCResponsePojo.setQuestionType(questionBasketPojo.getQuestionType());
            paperQCResponsePojo.setQuestionTypeName(questionBasketPojo.getQuestionTypeName());
            List<Long> questionIds = questionBasketPojo.getQuestionIds();
            paperQCResponsePojo.setQuestionCount(questionIds.size());
            int code = 1+i;
            paperQCResponsePojo.setTypeNumName(EnumNumTrans.find(code+"").getDesc());
            List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
            int typeTotal = 0;
            int typeTime = 0;
            int typeDiffi = 0;
            for (Long questionId : questionIds) {

                Question questionContents = questionMapper.selectByPrimaryKey(questionId);
                typeTotal = typeTotal+questionContents.getQuestionScore();
                typeTime = typeTime +questionContents.getQuestionTime();
                typeDiffi = typeDiffi + questionContents.getQuestionDifficulty();
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
}
