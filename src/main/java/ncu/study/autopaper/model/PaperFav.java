package ncu.study.autopaper.model;

import java.util.Date;

public class PaperFav extends PaperFavKey {
    private Date collectTime;

    private Boolean paperDifficulty;

    public PaperFav(Long userId, Long paperId, Date collectTime, Boolean paperDifficulty) {
        super(userId, paperId);
        this.collectTime = collectTime;
        this.paperDifficulty = paperDifficulty;
    }

    public PaperFav() {
        super();
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Boolean getPaperDifficulty() {
        return paperDifficulty;
    }

    public void setPaperDifficulty(Boolean paperDifficulty) {
        this.paperDifficulty = paperDifficulty;
    }
}