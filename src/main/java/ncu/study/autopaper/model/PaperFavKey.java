package ncu.study.autopaper.model;

public class PaperFavKey {
    private Long userId;

    private Long paperId;

    public PaperFavKey(Long userId, Long paperId) {
        this.userId = userId;
        this.paperId = paperId;
    }

    public PaperFavKey() {
        super();
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
}