package ncu.study.autopaper.model;

public class Paper {
    private Integer paperId;

    private String paperName;

    private String questions;

    private Integer paperDifficulty;

    private Integer paperHot;

    private String paperGrade;

    private String paperCourse;

    private String paperVersion;

    private String paperItems;

    private String paperScores;

    private Integer score;

    private Integer itemTime;

    private Integer time;

    public Paper(Integer paperId, String paperName, String questions, Integer paperDifficulty, Integer paperHot, String paperGrade, String paperCourse, String paperVersion, String paperItems, String paperScores, Integer score, Integer itemTime, Integer time) {
        this.paperId = paperId;
        this.paperName = paperName;
        this.questions = questions;
        this.paperDifficulty = paperDifficulty;
        this.paperHot = paperHot;
        this.paperGrade = paperGrade;
        this.paperCourse = paperCourse;
        this.paperVersion = paperVersion;
        this.paperItems = paperItems;
        this.paperScores = paperScores;
        this.score = score;
        this.itemTime = itemTime;
        this.time = time;
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

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions == null ? null : questions.trim();
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

    public String getPaperGrade() {
        return paperGrade;
    }

    public void setPaperGrade(String paperGrade) {
        this.paperGrade = paperGrade == null ? null : paperGrade.trim();
    }

    public String getPaperCourse() {
        return paperCourse;
    }

    public void setPaperCourse(String paperCourse) {
        this.paperCourse = paperCourse == null ? null : paperCourse.trim();
    }

    public String getPaperVersion() {
        return paperVersion;
    }

    public void setPaperVersion(String paperVersion) {
        this.paperVersion = paperVersion == null ? null : paperVersion.trim();
    }

    public String getPaperItems() {
        return paperItems;
    }

    public void setPaperItems(String paperItems) {
        this.paperItems = paperItems == null ? null : paperItems.trim();
    }

    public String getPaperScores() {
        return paperScores;
    }

    public void setPaperScores(String paperScores) {
        this.paperScores = paperScores == null ? null : paperScores.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getItemTime() {
        return itemTime;
    }

    public void setItemTime(Integer itemTime) {
        this.itemTime = itemTime;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}