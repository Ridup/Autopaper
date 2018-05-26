package ncu.study.autopaper.model;

import java.util.Date;

public class PaperComment {
    private Long paperCommentId;

    private Integer userId;

    private Integer paperId;

    private String paperComment;

    private Date paperCommentTime;

    private Integer paperCommentPraise;

    private String status;

    public PaperComment(Long paperCommentId, Integer userId, Integer paperId, String paperComment, Date paperCommentTime, Integer paperCommentPraise, String status) {
        this.paperCommentId = paperCommentId;
        this.userId = userId;
        this.paperId = paperId;
        this.paperComment = paperComment;
        this.paperCommentTime = paperCommentTime;
        this.paperCommentPraise = paperCommentPraise;
        this.status = status;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}