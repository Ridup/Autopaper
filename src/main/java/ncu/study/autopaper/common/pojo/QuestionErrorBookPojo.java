package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.common.enums.EnumQuestionClass;
import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.model.QuestionErrorBook;
import ncu.study.autopaper.model.QuestionFav;

import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  QuestionErrorBookPojo .java  v0.1  2018/5/24 19:24 Exp $
 */
public class QuestionErrorBookPojo extends QuestionErrorBook {
    private String createDate;
    private EnumQuestionType enumQuestionType;

    private EnumQuestionClass enumQuestionClass;

    private EnumQuestionDifficulty enumQuestionDifficulty;

    private EnumQuestionStatus enumQuestionStatus;

    private QuestionFav questionFav;

    private Boolean isInBasket;


    private String questionType1;

    private String questionClass1;

    private String questionDifficulty1;

    private String questionStatus1;

    private String questionType;

    private String questionClass;

    private Double questionDifficulty;

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

    private String questionContent;

    private String status;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public EnumQuestionType getEnumQuestionType() {
        return enumQuestionType;
    }

    public void setEnumQuestionType(EnumQuestionType enumQuestionType) {
        this.enumQuestionType = enumQuestionType;
    }

    public EnumQuestionClass getEnumQuestionClass() {
        return enumQuestionClass;
    }

    public void setEnumQuestionClass(EnumQuestionClass enumQuestionClass) {
        this.enumQuestionClass = enumQuestionClass;
    }

    public EnumQuestionDifficulty getEnumQuestionDifficulty() {
        return enumQuestionDifficulty;
    }

    public void setEnumQuestionDifficulty(EnumQuestionDifficulty enumQuestionDifficulty) {
        this.enumQuestionDifficulty = enumQuestionDifficulty;
    }

    public EnumQuestionStatus getEnumQuestionStatus() {
        return enumQuestionStatus;
    }

    public void setEnumQuestionStatus(EnumQuestionStatus enumQuestionStatus) {
        this.enumQuestionStatus = enumQuestionStatus;
    }

    public QuestionFav getQuestionFav() {
        return questionFav;
    }

    public void setQuestionFav(QuestionFav questionFav) {
        this.questionFav = questionFav;
    }

    public Boolean getInBasket() {
        return isInBasket;
    }

    public void setInBasket(Boolean inBasket) {
        isInBasket = inBasket;
    }

    public String getQuestionType1() {
        return questionType1;
    }

    public void setQuestionType1(String questionType1) {
        this.questionType1 = questionType1;
    }

    public String getQuestionClass1() {
        return questionClass1;
    }

    public void setQuestionClass1(String questionClass1) {
        this.questionClass1 = questionClass1;
    }

    public String getQuestionDifficulty1() {
        return questionDifficulty1;
    }

    public void setQuestionDifficulty1(String questionDifficulty1) {
        this.questionDifficulty1 = questionDifficulty1;
    }

    public String getQuestionStatus1() {
        return questionStatus1;
    }

    public void setQuestionStatus1(String questionStatus1) {
        this.questionStatus1 = questionStatus1;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionClass() {
        return questionClass;
    }

    public void setQuestionClass(String questionClass) {
        this.questionClass = questionClass;
    }

    public Double getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(Double questionDifficulty) {
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
        this.point = point;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
        this.type = type;
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
        this.gradeName = gradeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSelectionA() {
        return selectionA;
    }

    public void setSelectionA(String selectionA) {
        this.selectionA = selectionA;
    }

    public String getSelectionB() {
        return selectionB;
    }

    public void setSelectionB(String selectionB) {
        this.selectionB = selectionB;
    }

    public String getSelectionC() {
        return selectionC;
    }

    public void setSelectionC(String selectionC) {
        this.selectionC = selectionC;
    }

    public String getSelectionD() {
        return selectionD;
    }

    public void setSelectionD(String selectionD) {
        this.selectionD = selectionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
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

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
