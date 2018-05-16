package ncu.study.autopaper.model;

import java.util.Date;

public class QuestionBasket extends QuestionBasketKey {
    private String grade;

    private String gradeName;

    private String courseName;

    private String questionIdCollection;

    private String questionTypeCollection;

    private String typeCountCollection;

    private Integer total;

    private Date createTime;

    public QuestionBasket(Integer userId, String course, String grade, String gradeName, String courseName, String questionIdCollection, String questionTypeCollection, String typeCountCollection, Integer total, Date createTime) {
        super(userId, course);
        this.grade = grade;
        this.gradeName = gradeName;
        this.courseName = courseName;
        this.questionIdCollection = questionIdCollection;
        this.questionTypeCollection = questionTypeCollection;
        this.typeCountCollection = typeCountCollection;
        this.total = total;
        this.createTime = createTime;
    }

    public QuestionBasket() {
        super();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getQuestionIdCollection() {
        return questionIdCollection;
    }

    public void setQuestionIdCollection(String questionIdCollection) {
        this.questionIdCollection = questionIdCollection == null ? null : questionIdCollection.trim();
    }

    public String getQuestionTypeCollection() {
        return questionTypeCollection;
    }

    public void setQuestionTypeCollection(String questionTypeCollection) {
        this.questionTypeCollection = questionTypeCollection == null ? null : questionTypeCollection.trim();
    }

    public String getTypeCountCollection() {
        return typeCountCollection;
    }

    public void setTypeCountCollection(String typeCountCollection) {
        this.typeCountCollection = typeCountCollection == null ? null : typeCountCollection.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}