package ncu.study.autopaper.model;

import java.util.Date;

public class Paper {
    private Integer paperId;

    private String paperName;

    private String typeCountCollection;

    private Integer paperDifficulty;

    private Integer paperHot;

    private String paperGradeId;

    private String paperGradeName;

    private String paperCourseId;

    private String paperCourseName;

    private String paperVersion;

    private String paperScores;

    private Integer total;

    private Integer score;

    private Integer time;

    private String paperUrl;

    private Integer owner;

    private Date createTime;

    public Paper(Integer paperId, String paperName, String typeCountCollection, Integer paperDifficulty, Integer paperHot, String paperGradeId, String paperGradeName, String paperCourseId, String paperCourseName, String paperVersion, String paperScores, Integer total, Integer score, Integer time, String paperUrl, Integer owner, Date createTime) {
        this.paperId = paperId;
        this.paperName = paperName;
        this.typeCountCollection = typeCountCollection;
        this.paperDifficulty = paperDifficulty;
        this.paperHot = paperHot;
        this.paperGradeId = paperGradeId;
        this.paperGradeName = paperGradeName;
        this.paperCourseId = paperCourseId;
        this.paperCourseName = paperCourseName;
        this.paperVersion = paperVersion;
        this.paperScores = paperScores;
        this.total = total;
        this.score = score;
        this.time = time;
        this.paperUrl = paperUrl;
        this.owner = owner;
        this.createTime = createTime;
    }

    public Paper() {
        super();
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

    public String getTypeCountCollection() {
        return typeCountCollection;
    }

    public void setTypeCountCollection(String typeCountCollection) {
        this.typeCountCollection = typeCountCollection == null ? null : typeCountCollection.trim();
    }

    public Integer getPaperDifficulty() {
        return paperDifficulty;
    }

    public void setPaperDifficulty(Integer paperDifficulty) {
        this.paperDifficulty = paperDifficulty;
    }

    public Integer getPaperHot() {
        return paperHot;
    }

    public void setPaperHot(Integer paperHot) {
        this.paperHot = paperHot;
    }

    public String getPaperGradeId() {
        return paperGradeId;
    }

    public void setPaperGradeId(String paperGradeId) {
        this.paperGradeId = paperGradeId == null ? null : paperGradeId.trim();
    }

    public String getPaperGradeName() {
        return paperGradeName;
    }

    public void setPaperGradeName(String paperGradeName) {
        this.paperGradeName = paperGradeName == null ? null : paperGradeName.trim();
    }

    public String getPaperCourseId() {
        return paperCourseId;
    }

    public void setPaperCourseId(String paperCourseId) {
        this.paperCourseId = paperCourseId == null ? null : paperCourseId.trim();
    }

    public String getPaperCourseName() {
        return paperCourseName;
    }

    public void setPaperCourseName(String paperCourseName) {
        this.paperCourseName = paperCourseName == null ? null : paperCourseName.trim();
    }

    public String getPaperVersion() {
        return paperVersion;
    }

    public void setPaperVersion(String paperVersion) {
        this.paperVersion = paperVersion == null ? null : paperVersion.trim();
    }

    public String getPaperScores() {
        return paperScores;
    }

    public void setPaperScores(String paperScores) {
        this.paperScores = paperScores == null ? null : paperScores.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getPaperUrl() {
        return paperUrl;
    }

    public void setPaperUrl(String paperUrl) {
        this.paperUrl = paperUrl == null ? null : paperUrl.trim();
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}