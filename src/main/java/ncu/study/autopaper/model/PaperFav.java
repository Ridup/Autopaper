package ncu.study.autopaper.model;

import java.util.Date;

public class PaperFav extends PaperFavKey {
    private Date collectTime;

    private Integer paperDifficulty;

    public PaperFav(Integer userId, Integer paperId, Date collectTime, Integer paperDifficulty) {
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

    public Integer getPaperDifficulty() {
        return paperDifficulty;
    }

    public void setPaperDifficulty(Integer paperDifficulty) {
        this.paperDifficulty = paperDifficulty;
    }
}