package ncu.study.autopaper.model;

import java.util.Date;

public class QuestionErrorBook extends QuestionErrorBookKey {
    private Double myScore;

    private String myAnswer;

    private Date createTime;

    public QuestionErrorBook(Integer userId, Long questionId, Double myScore, String myAnswer, Date createTime) {
        super(userId, questionId);
        this.myScore = myScore;
        this.myAnswer = myAnswer;
        this.createTime = createTime;
    }

    public QuestionErrorBook() {
        super();
    }

    public Double getMyScore() {
        return myScore;
    }

    public void setMyScore(Double myScore) {
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