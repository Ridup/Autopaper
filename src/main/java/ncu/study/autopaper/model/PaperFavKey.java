package ncu.study.autopaper.model;

public class PaperFavKey {
    private Integer userId;

    private Integer paperId;

    public PaperFavKey(Integer userId, Integer paperId) {
        this.userId = userId;
        this.paperId = paperId;
    }

    public PaperFavKey() {
        super();
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
}