package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.QuestionCommentPojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionCommentService .java  v0.1  2018/5/25 13:27 Exp $
 */
public interface QuestionCommentService {
    public int saveComment(int userId,long questionId,String comment);
    public List<QuestionCommentPojo> getCommentByQuestionId(long questionId);
    public int deleteComment(long questionCommentId);
    public int passComment(long questionCommentId);
    public int noPassComment(long questionCommentId);
    public List<QuestionCommentPojo> getAll();
}
