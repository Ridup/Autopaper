package ncu.study.autopaper.common.pojo;

/**
 * @author Ridup
 * @version FleName:  PaperResponsePojo .java  v0.1  2018/5/15 16:37 Exp $
 */
public class PaperResponsePojo {
    private int totalScore;
    private int totalTime;
    private int avgDifficulty;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getAvgDifficulty() {
        return avgDifficulty;
    }

    public void setAvgDifficulty(int avgDifficulty) {
        this.avgDifficulty = avgDifficulty;
    }
}
