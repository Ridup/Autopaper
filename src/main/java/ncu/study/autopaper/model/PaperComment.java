package ncu.study.autopaper.model;

import java.util.Date;

public class PaperComment {
    private Long paperCommentId;

    private Long userId;

    private Long paperId;

    private String paperComment;

    private Date paperCommentTime;

    private Integer paperCommentPraise;

    public PaperComment(Long paperCommentId, Long userId, Long paperId, String paperComment, Date paperCommentTime, Integer paperCommentPraise) {
        this.paperCommentId = paperCommentId;
        this.userId = userId;
        this.paperId = paperId;
        this.paperComment = paperComment;
        this.paperCommentTime = paperCommentTime;
        this.paperCommentPraise = paperCommentPraise;
    }

    public PaperComment() {
        super();
    }

    public Long getPaperCommentId() {
        return paperCommentId;
    }

    public void setPaperCommentId(Long paperCommentId) {
        this.paperCommentId = paperCommentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public String getPaperComment() {
        return paperComment;
    }

    public void setPaperComment(String paperComment) {
        this.paperComment = paperComment == null ? null : paperComment.trim();
    }

    public Date getPaperCommentTime() {
        return paperCommentTime;
    }

    public void setPaperCommentTime(Date paperCommentTime) {
        this.paperCommentTime = paperCommentTime;
    }

    public Integer getPaperCommentPraise() {
        return paperCommentPraise;
    }

    public void setPaperCommentPraise(Integer paperCommentPraise) {
        this.paperCommentPraise = paperCommentPraise;
    }
}