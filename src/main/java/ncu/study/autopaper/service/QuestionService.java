package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.model.Question;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionService .java  v0.1  2018/4/26 14:40 Exp $
 */
public interface QuestionService {
    public int insertQuestionInfo(Question question);

    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content);

    public List<Question> getSearchQuestions(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content, int start);

    public List<PaperQCResponsePojo> getPaperQCInfo(List<QuestionBasketPojo> questionBasketPojos, int userId);

    public List<Question> getQuestionArrayRelated(String type, List<String> points);

    public List<Question> getQuestionArrayAccurate(String type, List<String> points);

    public List<Question> getQuestionListWithOutSId(Question question);

    public QuestionResponsePojo getQuestionDetail(long questionId);

    public int deleteRecord(long questionId);
    public List<QuestionResponsePojo> getQuestionResponsePojoByUserId(int userId);

    public List<QuestionResponsePojo> getQuestionResponsePojoByType(String type);

    public int deleteQuestion(long questionId);
    public int pass(long questionId);
    public int noPass(long questionId);

}
