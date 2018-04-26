package ncu.study.autopaper.model;

import java.util.Date;

public class Question {
    private Long questionId;

    private String questionType;

    private String questionClass;

    private Integer questionDifficulty;

    private Integer pointNumber;

    private String point;

    private String source;

    private Long usetimes;

    private String type;

    private Integer questionScore;

    private Integer questionTime;

    private String gradeName;

    private String courseName;

    private String versionName;

    private String chapterName;

    private String selectionA;

    private String selectionB;

    private String selectionC;

    private String selectionD;

    private String answer;

    private String analysis;

    private Long questionHot;

    private Integer ownner;

    private Date createTime;

    private Date updateTime;

    private String questionComment;

    public Question(Long questionId, String questionType, String questionClass, Integer questionDifficulty, Integer pointNumber, String point, String source, Long usetimes, String type, Integer questionScore, Integer questionTime, String gradeName, String courseName, String versionName, String chapterName, String selectionA, String selectionB, String selectionC, String selectionD, String answer, String analysis, Long questionHot, Integer ownner, Date createTime, Date updateTime, String questionComment) {
        this.questionId = questionId;
        this.questionType = questionType;
        this.questionClass = questionClass;
        this.questionDifficulty = questionDifficulty;
        this.pointNumber = pointNumber;
        this.point = point;
        this.source = source;
        this.usetimes = usetimes;
        this.type = type;
        this.questionScore = questionScore;
        this.questionTime = questionTime;
        this.gradeName = gradeName;
        this.courseName = courseName;
        this.versionName = versionName;
        this.chapterName = chapterName;
        this.selectionA = selectionA;
        this.selectionB = selectionB;
        this.selectionC = selectionC;
        this.selectionD = selectionD;
        this.answer = answer;
        this.analysis = analysis;
        this.questionHot = questionHot;
        this.ownner = ownner;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.questionComment = questionComment;
    }

    public Question() {
        super();
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getQuestionClass() {
        return questionClass;
    }

    public void setQuestionClass(String questionClass) {
        this.questionClass = questionClass == null ? null : questionClass.trim();
    }

    public Integer getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(Integer questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public Integer getPointNumber() {
        return pointNumber;
    }

    public void setPointNumber(Integer pointNumber) {
        this.pointNumber = pointNumber;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getUsetimes() {
        return usetimes;
    }

    public void setUsetimes(Long usetimes) {
        this.usetimes = usetimes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Integer questionTime) {
        this.questionTime = questionTime;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public String getSelectionA() {
        return selectionA;
    }

    public void setSelectionA(String selectionA) {
        this.selectionA = selectionA == null ? null : selectionA.trim();
    }

    public String getSelectionB() {
        return selectionB;
    }

    public void setSelectionB(String selectionB) {
        this.selectionB = selectionB == null ? null : selectionB.trim();
    }

    public String getSelectionC() {
        return selectionC;
    }

    public void setSelectionC(String selectionC) {
        this.selectionC = selectionC == null ? null : selectionC.trim();
    }

    public String getSelectionD() {
        return selectionD;
    }

    public void setSelectionD(String selectionD) {
        this.selectionD = selectionD == null ? null : selectionD.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public Long getQuestionHot() {
        return questionHot;
    }

    public void setQuestionHot(Long questionHot) {
        this.questionHot = questionHot;
    }

    public Integer getOwnner() {
        return ownner;
    }

    public void setOwnner(Integer ownner) {
        this.ownner = ownner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment == null ? null : questionComment.trim();
    }
}