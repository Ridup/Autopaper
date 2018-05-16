package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.QuestionBasketTypeCountPojo;
import ncu.study.autopaper.model.QuestionBasket;

/**
 * @author Ridup
 * @version FleName:  QuestionBasketService .java  v0.1  2018/5/11 15:43 Exp $
 */
public interface QuestionBasketService {
    public Boolean hasBasket(int userId,String course);
    public Boolean isInBasket(int userId, String course,Long questionId, String questionType);

    public int addQuestion(int userId, Long questionId, String questionType, GradePojo currentGrade, CoursePojo currentCourse);

    public int deleteQuestion(int userId, Long questionId, String questionType, GradePojo currentGrade, CoursePojo currentCourse);

    public QuestionBasket getQuestionBasketInfo(int userId,String course);

    public  int  clearQuestionBasket(int userId,String course);
}
