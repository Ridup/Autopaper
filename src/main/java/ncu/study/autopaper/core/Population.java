package ncu.study.autopaper.core;

import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.service.QuestionService;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * 种群，即多套试卷
 *
 * @author:
 * @CreateDate: 2016-4-29 下午01:29:02
 * @version: 1.0
 */
public class Population {
    private static final Logger logger  =  LoggerFactory.getLogger(Population. class );

    private QuestionService questionService;
/**
     * 试卷集合
     */

    private Paper[] papers;


/**
     * 初始种群
     *
     * @param populationSize 种群规模
     * @param initFlag       初始化标志 true-初始化
     * @param rule           规则bean
     */

    public Population(int populationSize, boolean initFlag, RuleBean rule,QuestionService questionService) {
        this.questionService = questionService;
        papers = new Paper[populationSize];
        if (initFlag) {
            Paper paper;
            Random random = new Random();
            for (int i = 0; i < populationSize; i++) {
                System.out.println("populationSize===================================================================="+i);
                paper = new Paper();
                paper.setId(i + 1);
                while (paper.getTotalScore() != rule.getTotalMark()) {
                    paper.getQuestionList().clear();
                    List<String> pointIds = rule.getPointIds();
                    // 单选题
                    if (rule.getSingleNum() > 0) {
                        generateQuestion("101", random, rule.getSingleNum(), rule.getSingleScore(), pointIds,
                                "单选题数量不够，组卷失败", paper);
                    }
                    // 判断题
                    if (rule.getJudgmentNum() > 0) {
                        generateQuestion("102", random, rule.getJudgmentNum(), rule.getJudgmentScore(), pointIds,
                                "判断题数量不够，组卷失败", paper);
                    }
                    // 填空题
                    if (rule.getCompleteNum() > 0) {
                        generateQuestion("103", random, rule.getCompleteNum(), rule.getCompleteScore(), pointIds,
                                "填空题数量不够，组卷失败", paper);
                    }
                    // 简答题
                    if (rule.getSimpleNum() > 0) {
                        generateQuestion("104", random, rule.getSimpleNum(), rule.getSimpleScore(), pointIds,
                                "简答题数量不够，组卷失败", paper);
                    }
                    // 作文题
                    if (rule.getCompositionNum() > 0) {
                        generateQuestion("105", random, rule.getCompositionNum(), rule.getCompositionScore(), pointIds,
                                "作文题数量不够，组卷失败", paper);
                    }
                }
                // 计算试卷知识点覆盖率
                paper.setKpCoverage(rule);
                // 计算试卷适应度
                paper.setAdaptationDegree(rule, Global.KP_WEIGHT, Global.DIFFCULTY_WEIGHt);
                papers[i] = paper;
            }
        }
    }

    private void generateQuestion(String type, Random random, int qustionNum, double score, List<String> points,
                                  String errorMsg, Paper paper) {
        List<Question> questions = questionService.getQuestionArrayRelated(type, points);
        if(questions!=null){
            Question[] singleArray = new Question[questions.size()];
            questions.toArray(singleArray);
            if (questions.size() < qustionNum) {
                return;
            }
            Question tmpQuestion;
            for (int j = 0; j < qustionNum; j++) {
                int index = random.nextInt(questions.size() - j);
                // 初始化分数
                singleArray[index].setQuestionScore((int)score);
                paper.addQuestion(singleArray[index]);
                // 保证不会重复添加试题
                tmpQuestion = singleArray[singleArray.length - j - 1];
                singleArray[singleArray.length - j - 1] = singleArray[index];
                singleArray[index] = tmpQuestion;
            }
        }

    }


/**
     * 获取种群中最优秀个体
     *
     * @return
     */

    public Paper getFitness() {
        Paper paper = papers[0];
        for (int i = 1; i < papers.length; i++) {
            if (paper.getAdaptationDegree() < papers[i].getAdaptationDegree()) {
                paper = papers[i];
            }
        }
        return paper;
    }

    public Population(int populationSize) {
        papers = new Paper[populationSize];
    }


/**
     * 获取种群中某个个体
     *
     * @param index
     * @return
     */
    public Paper getPaper(int index) {
        return papers[index];
    }


/**
     * 设置种群中某个个体
     *
     * @param index
     * @param paper
     */

    public void setPaper(int index, Paper paper) {
        papers[index] = paper;
    }


/**
     * 返回种群规模
     *
     * @return
     */

    public int getLength() {
        return papers.length;
    }

}

