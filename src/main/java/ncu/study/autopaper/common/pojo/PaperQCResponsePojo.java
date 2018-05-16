package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.model.Question;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperQCResponsePojo .java  v0.1  2018/5/15 1:06 Exp $
 */
public class PaperQCResponsePojo {
    private String questionType;
    private String questionTypeName;
    private String typeNumName;
    private int questionCount;
    private int questionTypeScore;
    private int questionTypeTime;
    private  int questionTypeDiffi;
    private List<QuestionResponsePojo> questionResponsePojos;

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName;
    }

    public List<QuestionResponsePojo> getQuestionResponsePojos() {
        return questionResponsePojos;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public void setQuestionResponsePojos(List<QuestionResponsePojo> questionResponsePojos) {
        this.questionResponsePojos = questionResponsePojos;
    }

    public int getQuestionTypeScore() {
        return questionTypeScore;
    }

    public void setQuestionTypeScore(int questionTypeScore) {
        this.questionTypeScore = questionTypeScore;
    }

    public int getQuestionTypeTime() {
        return questionTypeTime;
    }

    public void setQuestionTypeTime(int questionTypeTime) {
        this.questionTypeTime = questionTypeTime;
    }

    public String getTypeNumName() {
        return typeNumName;
    }

    public void setTypeNumName(String typeNumName) {
        this.typeNumName = typeNumName;
    }

    public int getQuestionTypeDiffi() {
        return questionTypeDiffi;
    }

    public void setQuestionTypeDiffi(int questionTypeDiffi) {
        this.questionTypeDiffi = questionTypeDiffi;
    }
}
