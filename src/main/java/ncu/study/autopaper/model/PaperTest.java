package ncu.study.autopaper.model;

import java.util.Date;

public class PaperTest {
    private Integer testId;

    private Integer userId;

    private Integer paperId;

    private String paperName;

    private Integer answerTime;

    private Double testScore;

    private Double totalScore;

    private Integer costTime;

    private String testAnswer;

    private Date startTime;

    public PaperTest(Integer testId, Integer userId, Integer paperId, String paperName, Integer answerTime, Double testScore, Double totalScore, Integer costTime, String testAnswer, Date startTime) {
        this.testId = testId;
        this.userId = userId;
        this.paperId = paperId;
        this.paperName = paperName;
        this.answerTime = answerTime;
        this.testScore = testScore;
        this.totalScore = totalScore;
        this.costTime = costTime;
        this.testAnswer = testAnswer;
        this.startTime = startTime;
    }

    public PaperTest() {
        super();
    }

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
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

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Integer answerTime) {
        this.answerTime = answerTime;
    }

    public Double getTestScore() {
        return testScore;
    }

    public void setTestScore(Double testScore) {
        this.testScore = testScore;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public String getTestAnswer() {
        return testAnswer;
    }

    public void setTestAnswer(String testAnswer) {
        this.testAnswer = testAnswer == null ? null : testAnswer.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}