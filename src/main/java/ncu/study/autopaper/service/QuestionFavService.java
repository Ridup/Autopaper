package ncu.study.autopaper.service;

import ncu.study.autopaper.model.QuestionFav;

/**
 * @author Ridup
 * @version FleName:  QuestionFavService .java  v0.1  2018/5/10 11:06 Exp $
 */
public interface QuestionFavService {
    public int questionFav(int userId,Long questionId);
    public QuestionFav getQuestionFavInfo(int userId,Long questionId);
}
