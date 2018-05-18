package ncu.study.autopaper.model;

public class PaperDownloadKey {
    private Integer paperId;

    private Integer userId;

    public PaperDownloadKey(Integer paperId, Integer userId) {
        this.paperId = paperId;
        this.userId = userId;
    }

    public PaperDownloadKey() {
        super();
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}