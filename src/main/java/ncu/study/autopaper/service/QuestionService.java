package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.model.Question;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionService .java  v0.1  2018/4/26 14:40 Exp $
 */
public interface QuestionService {
    public int insertQuestionInfo(Question question);
    public int getSearchCount(GradePojo currentGrade ,CoursePojo currentCourse,String questionType, String content);
    public List<Question> getSearchQuestions(GradePojo currentGrade ,CoursePojo currentCourse,String questionType, String content,int start);
}
