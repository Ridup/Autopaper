package ncu.study.autopaper.common.pojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionBasketPojo .java  v0.1  2018/5/13 16:09 Exp $
 */
public class QuestionBasketPojo {
    private String questionType;
    private String questionTypeName;
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

    public List<Long> getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(List<Long> questionIds) {
        this.questionIds = questionIds;
    }
}
