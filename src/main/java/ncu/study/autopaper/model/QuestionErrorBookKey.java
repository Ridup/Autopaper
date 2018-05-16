package ncu.study.autopaper.model;

public class QuestionErrorBookKey {
    private Integer userId;

    private Long questionId;

    public QuestionErrorBookKey(Integer userId, Long questionId) {
        this.userId = userId;
        this.questionId = questionId;
    }

    public QuestionErrorBookKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}