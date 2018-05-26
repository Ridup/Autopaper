package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.QuestionErrorBookPojo;
import ncu.study.autopaper.model.QuestionErrorBook;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionErrorBookServiceImpl .java  v0.1  2018/5/23 23:49 Exp $
 */
public interface QuestionErrorBookService {
    public int saveErrorRecord(QuestionErrorBook questionErrorBook);
    public List<QuestionErrorBookPojo> getUserErrorBook(int userId);
    public int deleteErrorRecord(int userId,Long questionId);
}
