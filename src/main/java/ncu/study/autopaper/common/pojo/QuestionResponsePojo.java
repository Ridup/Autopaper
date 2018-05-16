package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.enums.EnumQuestionClass;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.QuestionFav;
import ncu.study.autopaper.model.User;

import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  QuestionResponsePojo .java  v0.1  2018/5/8 1:30 Exp $
 */
public class QuestionResponsePojo extends Question{
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
}
