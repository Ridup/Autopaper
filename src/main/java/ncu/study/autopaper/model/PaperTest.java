package ncu.study.autopaper.model;

import java.util.Date;

public class PaperTest {
    private Integer testId;

    private Integer userId;

    private String userType;

    private Integer paperId;

    private String wrongQuestions;

    private Integer answerTime;

    private Integer testScore;

    private Integer costTime;

    private String testAnswer;

    private Date startTime;

    private Date endTime;

    public PaperTest(Integer testId, Integer userId, String userType, Integer paperId, String wrongQuestions, Integer answerTime, Integer testScore, Integer costTime, String testAnswer, Date startTime, Date endTime) {
        this.testId = testId;
        this.userId = userId;
        this.userType = userType;
        this.paperId = paperId;
        this.wrongQuestions = wrongQuestions;
        this.answerTime = answerTime;
        this.testScore = testScore;
        this.costTime = costTime;
        this.testAnswer = testAnswer;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getWrongQuestions() {
        return wrongQuestions;
    }

    public void setWrongQuestions(String wrongQuestions) {
        this.wrongQuestions = wrongQuestions == null ? null : wrongQuestions.trim();
    }

    public Integer getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Integer answerTime) {
        this.answerTime = answerTime;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}