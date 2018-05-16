package ncu.study.autopaper.model;

import java.util.Date;

public class QuestionErrorBook extends QuestionErrorBookKey {
    private Integer myScore;

    private String myAnswer;

    private Date createTime;

    public QuestionErrorBook(Integer userId, Long questionId, Integer myScore, String myAnswer, Date createTime) {
        super(userId, questionId);
        this.myScore = myScore;
        this.myAnswer = myAnswer;
        this.createTime = createTime;
    }

    public QuestionErrorBook() {
        super();
    }

    public Integer getMyScore() {
        return myScore;
    }

    public void setMyScore(Integer myScore) {
        this.myScore = myScore;
    }

    public String getMyAnswer() {
        return myAnswer;
    }

    public void setMyAnswer(String myAnswer) {
        this.myAnswer = myAnswer == null ? null : myAnswer.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}