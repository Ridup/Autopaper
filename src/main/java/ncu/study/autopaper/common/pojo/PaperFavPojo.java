package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.model.PaperFav;

import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  PaperFavPojo .java  v0.1  2018/5/25 10:49 Exp $
 */
public class PaperFavPojo extends PaperFav {
    private String paperDifficultyDesc;
    private String collectTimeStr;
    private int downloadTimes;
    private String paperName;

    private String typeCountCollection;

    private Double paperDifficulty1;

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

    public String getPaperDifficultyDesc() {
        return paperDifficultyDesc;
    }

    public void setPaperDifficultyDesc(String paperDifficultyDesc) {
        this.paperDifficultyDesc = paperDifficultyDesc;
    }

    public int getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(int downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getTypeCountCollection() {
        return typeCountCollection;
    }

    public void setTypeCountCollection(String typeCountCollection) {
        this.typeCountCollection = typeCountCollection;
    }

    public Double getPaperDifficulty1() {
        return paperDifficulty1;
    }

    public void setPaperDifficulty1(Double paperDifficulty1) {
        this.paperDifficulty1 = paperDifficulty1;
    }

    public String getCollectTimeStr() {
        return collectTimeStr;
    }

    public void setCollectTimeStr(String collectTimeStr) {
        this.collectTimeStr = collectTimeStr;
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
        this.paperGradeId = paperGradeId;
    }

    public String getPaperGradeName() {
        return paperGradeName;
    }

    public void setPaperGradeName(String paperGradeName) {
        this.paperGradeName = paperGradeName;
    }

    public String getPaperCourseId() {
        return paperCourseId;
    }

    public void setPaperCourseId(String paperCourseId) {
        this.paperCourseId = paperCourseId;
    }

    public String getPaperCourseName() {
        return paperCourseName;
    }

    public void setPaperCourseName(String paperCourseName) {
        this.paperCourseName = paperCourseName;
    }

    public String getPaperVersion() {
        return paperVersion;
    }

    public void setPaperVersion(String paperVersion) {
        this.paperVersion = paperVersion;
    }

    public String getPaperScores() {
        return paperScores;
    }

    public void setPaperScores(String paperScores) {
        this.paperScores = paperScores;
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
        this.paperUrl = paperUrl;
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
