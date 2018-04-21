package ncu.study.autopaper.model;

public class QuestionBugget {
    private Long questionId;

    private String questionComment;

    private String questionCount;

    private String questionType;

    private String questionScore;

    private String point;

    public QuestionBugget(Long questionId, String questionComment, String questionCount, String questionType, String questionScore, String point) {
        this.questionId = questionId;
        this.questionComment = questionComment;
        this.questionCount = questionCount;
        this.questionType = questionType;
        this.questionScore = questionScore;
        this.point = point;
    }

    public QuestionBugget() {
        super();
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment == null ? null : questionComment.trim();
    }

    public String getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(String questionCount) {
        this.questionCount = questionCount == null ? null : questionCount.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(String questionScore) {
        this.questionScore = questionScore == null ? null : questionScore.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }
}