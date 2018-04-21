package ncu.study.autopaper.model;

public class QuestionFavKey {
    private Long userId;

    private Long questionId;

    public QuestionFavKey(Long userId, Long questionId) {
        this.userId = userId;
        this.questionId = questionId;
    }

    public QuestionFavKey() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}