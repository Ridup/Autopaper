package ncu.study.autopaper.model;

public class PaperDownloadKey {
    private Long paperId;

    private Integer userId;

    public PaperDownloadKey(Long paperId, Integer userId) {
        this.paperId = paperId;
        this.userId = userId;
    }

    public PaperDownloadKey() {
        super();
    }

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}