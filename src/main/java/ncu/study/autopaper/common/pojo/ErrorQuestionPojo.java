package ncu.study.autopaper.common.pojo;

/**
 * @author Ridup
 * @version FleName:  ErrorQuestionPojo .java  v0.1  2018/5/23 20:09 Exp $
 */
public class ErrorQuestionPojo {
    private Long questionId;
    private Boolean isRight;
    private double myScore;
    private String answer;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Boolean getRight() {
        return isRight;
    }

    public void setRight(Boolean right) {
        isRight = right;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getMyScore() {
        return myScore;
    }

    public void setMyScore(double myScore) {
        this.myScore = myScore;
    }
}
