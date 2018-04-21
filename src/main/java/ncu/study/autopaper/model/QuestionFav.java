package ncu.study.autopaper.model;

import java.util.Date;

public class QuestionFav extends QuestionFavKey {
    private Date collectTime;

    private Integer questionDifficulty;

    private Integer isWrong;

    public QuestionFav(Long userId, Long questionId, Date collectTime, Integer questionDifficulty, Integer isWrong) {
        super(userId, questionId);
        this.collectTime = collectTime;
        this.questionDifficulty = questionDifficulty;
        this.isWrong = isWrong;
    }

    public QuestionFav() {
        super();
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Integer getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(Integer questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public Integer getIsWrong() {
        return isWrong;
    }

    public void setIsWrong(Integer isWrong) {
        this.isWrong = isWrong;
    }
}