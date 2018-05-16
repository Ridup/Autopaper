package ncu.study.autopaper.model;

public class QuestionBasketKey {
    private Integer userId;

    private String course;

    public QuestionBasketKey(Integer userId, String course) {
        this.userId = userId;
        this.course = course;
    }

    public QuestionBasketKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }
}