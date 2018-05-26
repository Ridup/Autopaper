package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.QuestionFavPojo;
import ncu.study.autopaper.model.QuestionFav;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionFavService .java  v0.1  2018/5/10 11:06 Exp $
 */
public interface QuestionFavService {
    public int questionFav(int userId,Long questionId);
    public QuestionFav getQuestionFavInfo(int userId,Long questionId);
    public List<QuestionFavPojo> getQFByUserId(int userId);
    public int deleteFavRecord(int userd,long questionId);
}
