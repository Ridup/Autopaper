package ncu.study.autopaper.core;

import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.service.QuestionService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 遗传算法组卷实现类
 *
 * @author: lixiaolin
 * @CreateDate: 2016-4-29 下午03:57:55
 * @version: 1.0
 */
public class GA {
    /**
     * 变异概率
     */
    private static final double mutationRate = 0.085;
    /**
     * 精英主义
     */
    private static final boolean elitism = true;
    /**
     * 淘汰数组大小
     */
    private static final int tournamentSize = 5;

    public QuestionService questionService;
    public GA(QuestionService questionService){
        this.questionService = questionService;
    }

    // 进化种群
    public Population evolvePopulation(Population pop, RuleBean rule) {
        Population newPopulation = new Population(pop.getLength());
        int elitismOffset;
        // 精英主义
        if (elitism) {
            elitismOffset = 1;
            // 保留上一代最优秀个体
            Paper fitness = pop.getFitness();
            fitness.setId(0);
            newPopulation.setPaper(0, fitness);
        }
        // 种群交叉操作，从当前的种群pop来创建下一代种群newPopulation
        for (int i = elitismOffset; i < newPopulation.getLength(); i++) {
            // 较优选择parent
            Paper parent1 = select(pop);
            Paper parent2 = select(pop);
            while (parent2.getId() == parent1.getId()) {
                parent2 = select(pop);
            }
            // 交叉
            Paper child = crossover(parent1, parent2, rule);
            child.setId(i);
            newPopulation.setPaper(i, child);
        }
        // 种群变异操作
        Paper tmpPaper;
        for (int i = elitismOffset; i < newPopulation.getLength(); i++) {
            tmpPaper = newPopulation.getPaper(i);
            mutate(tmpPaper);
            // 计算知识点覆盖率与适应度
            tmpPaper.setKpCoverage(rule);
            tmpPaper.setAdaptationDegree(rule, Global.KP_WEIGHT, Global.DIFFCULTY_WEIGHt);
        }
        return newPopulation;
    }

    /**
     * 交叉算子
     *
     * @param parent1
     * @param parent2
     * @return
     */
    public Paper crossover(Paper parent1, Paper parent2, RuleBean rule) {
        Paper child = new Paper(parent1.getQuestionSize());
        int s1 = (int) (Math.random() * parent1.getQuestionSize());
        int s2 = (int) (Math.random() * parent1.getQuestionSize());

        // parent1的startPos endPos之间的序列，会被遗传到下一代
        int startPos = s1 < s2 ? s1 : s2;
        int endPos = s1 > s2 ? s1 : s2;
        for (int i = startPos; i < endPos; i++) {
            child.saveQuestion(i, parent1.getQuestion(i));
        }

        // 继承parent2中未被child继承的question
        // 防止出现重复的元素
        List<String> idString = rule.getPointIds();
        for (int i = 0; i < startPos; i++) {
            if (!child.containsQuestion(parent2.getQuestion(i))) {
                child.saveQuestion(i, parent2.getQuestion(i));
            } else {
                String type = getTypeByIndex(i, rule);
                // getQuestionArray()用来选择指定类型和知识点的试题数组
                List<Question> questionArrayRelated = questionService.getQuestionArrayRelated(type, idString);
                Question[] singleArray = new Question[questionArrayRelated.size()];
                child.saveQuestion(i, singleArray[(int) (Math.random() * singleArray.length)]);
            }
        }
        for (int i = endPos; i < parent2.getQuestionSize(); i++) {
            if (!child.containsQuestion(parent2.getQuestion(i))) {
                child.saveQuestion(i, parent2.getQuestion(i));
            } else {
                String type = getTypeByIndex(i, rule);
                List<Question> questionArrayRelated = questionService.getQuestionArrayRelated(type, idString);
                Question[] singleArray = new Question[questionArrayRelated.size()];
                child.saveQuestion(i, singleArray[(int) (Math.random() * singleArray.length)]);
            }
        }
        return child;
    }

    private String getTypeByIndex(int index, RuleBean rule) {
        String type = "";
        // 单选题
        if (index < rule.getSingleNum()) {
            type = "101";
        }
        //判断题
        else if (index < rule.getSingleNum() + rule.getJudgmentNum()) {
            type = "102";
        }
        //填空题
        else if (index < rule.getSingleNum() + rule.getJudgmentNum() + rule.getCompleteNum()) {
            type = "103";
        }
        //简答题
        else if (index < rule.getSingleNum() + rule.getJudgmentNum() + rule.getCompleteNum() + rule.getSimpleNum()) {
            type = "104";
        }
        //作文
        else {
            type = "105";
        }
        return type;
    }

    /**
     * 突变算子 每个个体的每个基因都有可能突变
     *
     * @param paper
     */
    public void mutate(Paper paper) {
        Question tmpQuestion;
        List<Question> list;
        int index;
        for (int i = 0; i < paper.getQuestionSize(); i++) {
            if (Math.random() < mutationRate) {
                // 进行突变，第i道
                tmpQuestion = paper.getQuestion(i);
                // 从题库中获取和变异的题目类型一样分数相同的题目（不包含变异题目）
                list = questionService.getQuestionListWithOutSId(tmpQuestion);
                if (list.size() > 0) {
                    // 随机获取一道
                    index = (int) (Math.random() * list.size());
                    // 设置分数
                    list.get(index).setQuestionScore(tmpQuestion.getQuestionScore());
                    paper.saveQuestion(i, list.get(index));
                }
            }
        }
    }

    /**
     * 选择算子
     *
     * @param population
     */
    private Paper select(Population population) {
        Population pop = new Population(tournamentSize);
        for (int i = 0; i < tournamentSize; i++) {
            pop.setPaper(i, population.getPaper((int) (Math.random() * population.getLength())));
        }
        return pop.getFitness();
    }
}
