package ncu.study.autopaper.core;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 组卷规则Bean
 *
 * @author: xlli
 * @CreateDate: 2016-4-28 下午05:02:05
 * @version: 1.0
 */
public class RuleBean {
    /**
     * 规则id
     */
    private long id;
    /**
     * 规则对应的考试id
     */
    private long examId;
    /**
     * 试卷总分
     */
    private int totalMark;
    /**
     * 试卷期望难度系数
     */
    private double difficulty;
    /**
     * 单选题数量
     */
    private int singleNum;
    /**
     * 单选题单个分值
     */
    private double singleScore;

    /**
     * 判断题数量
     */
    private int judgmentNum;
    /**
     * 判断题单个分值
     */
    private double judgmentScore;


    /**
     * 填空题数量
     */
    private int completeNum;
    /**
     * 填空题单个分值
     */
    private double completeScore;
    /**
     * 简答题数量
     */
    private int simpleNum;
    /**
     * 简答题单个分值
     */
    private double simpleScore;

    /**
     * 作文数量
     */
    private int compositionNum;
    /**
     * 作文单个分值
     */
    private double compositionScore;

    /**
     * 试卷包含的知识点id
     */
    private List<String> pointIds;
    /**
     * 规则创建时间
     */
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getExamId() {
        return examId;
    }

    public void setExamId(long examId) {
        this.examId = examId;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public int getSingleNum() {
        return singleNum;
    }

    public void setSingleNum(int singleNum) {
        this.singleNum = singleNum;
    }

    public double getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(double singleScore) {
        this.singleScore = singleScore;
    }

    public int getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(int completeNum) {
        this.completeNum = completeNum;
    }

    public double getCompleteScore() {
        return completeScore;
    }

    public void setCompleteScore(double completeScore) {
        this.completeScore = completeScore;
    }

    public int getJudgmentNum() {
        return judgmentNum;
    }

    public void setJudgmentNum(int judgmentNum) {
        this.judgmentNum = judgmentNum;
    }

    public double getJudgmentScore() {
        return judgmentScore;
    }

    public void setJudgmentScore(double judgmentScore) {
        this.judgmentScore = judgmentScore;
    }

    public int getSimpleNum() {
        return simpleNum;
    }

    public void setSimpleNum(int simpleNum) {
        this.simpleNum = simpleNum;
    }

    public double getSimpleScore() {
        return simpleScore;
    }

    public void setSimpleScore(double simpleScore) {
        this.simpleScore = simpleScore;
    }

    public int getCompositionNum() {
        return compositionNum;
    }

    public void setCompositionNum(int compositionNum) {
        this.compositionNum = compositionNum;
    }

    public double getCompositionScore() {
        return compositionScore;
    }

    public void setCompositionScore(double compositionScore) {
        this.compositionScore = compositionScore;
    }

    public List<String> getPointIds() {
        return pointIds;
    }

    public void setPointIds(List<String> pointIds) {
        this.pointIds = pointIds;
    }



    /* public void setPointIds(String pointIds) {
        // 是否是表单传过来的数据
        if (pointIds.endsWith("#")) {
            pointIds = pointIds.substring(0, pointIds.lastIndexOf("#"));
        }
        // 使用HashSet去重
        this.pointIds = new ArrayList<>(new HashSet<>(Arrays.asList(pointIds.split("#"))));
    }*/

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
