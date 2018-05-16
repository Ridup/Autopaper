package ncu.study.autopaper.common.pojo;

/**
 * @author Ridup
 * @version FleName:  QuestionBasketTypeCountPojo .java  v0.1  2018/5/13 16:16 Exp $
 */
public class QuestionBasketTypeCountPojo {
    private String questionType;
    private String questionTypeName;
    private int questionCount;

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

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }
}
