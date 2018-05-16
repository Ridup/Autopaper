package ncu.study.autopaper.common.pojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperQCMiniPojo .java  v0.1  2018/5/17 2:57 Exp $
 */
public class PaperQCMiniPojo {
    private String questionType;
    private String questionTypeName;
    private String typeNumName;
    private int questionCount;
    private int questionTypeScore;
    private int questionTypeTime;
    private  int questionTypeDiffi;
    private List<Long> questionIds;

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

    public String getTypeNumName() {
        return typeNumName;
    }

    public void setTypeNumName(String typeNumName) {
        this.typeNumName = typeNumName;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
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

    public int getQuestionTypeDiffi() {
        return questionTypeDiffi;
    }

    public void setQuestionTypeDiffi(int questionTypeDiffi) {
        this.questionTypeDiffi = questionTypeDiffi;
    }

    public List<Long> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<Long> questionIds) {
        this.questionIds = questionIds;
    }
}
