package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.PaperCommentPojo;
import ncu.study.autopaper.common.pojo.QuestionCommentPojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperCommentService .java  v0.1  2018/5/25 13:42 Exp $
 */
public interface PaperCommentService {
    public int saveComment(int userId,int paperId,String comment);
    public List<PaperCommentPojo> getCommentByPaperId(int paperId);
    public int deleteComment(long paperCommentId);
    public int passComment(long paperCommentId);
    public int noPassComment(long paperCommentId);
    public List<PaperCommentPojo> getAll();
}
