package ncu.study.autopaper.core;

import com.google.gson.Gson;
import ncu.study.autopaper.service.QuestionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试类
 *
 * @author lixiaolin
 * @createDate 2016-06-22 20:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class MainTest {

    @Autowired
    private QuestionService questionService;

    /*public static void main(String[] args) {
        Paper resultPaper = null;
        // 迭代计数器
        int count = 0;
        int runCount = 100;
        // 适应度期望值
        double expand = 0.98;
        // 可自己初始化组卷规则rule
        RuleBean rule = new RuleBean();
        if (rule != null) {
            // 初始化种群
            Population population = new Population(20, true, rule);
            System.out.println("初次适应度  " + population.getFitness().getAdaptationDegree());
            while (count < runCount && population.getFitness().getAdaptationDegree() < expand) {
                count++;
                GA ga = new GA();
                population = ga.evolvePopulation(population, rule);
                System.out.println("第 " + count + " 次进化，适应度为： " + population.getFitness().getAdaptationDegree());
            }
            System.out.println("进化次数： " + count);
            System.out.println(population.getFitness().getAdaptationDegree());
            resultPaper = population.getFitness();
        }
        System.out.println(resultPaper);
    }*/

    @Test
    public void test() {
        long l = System.currentTimeMillis();
        List<String> logstrs = new ArrayList<String>();
        Paper resultPaper = null;
        // 迭代计数器
        int count = 0;
        int runCount = 100;
        // 适应度期望值
        double expand = 0.97;
        // 可自己初始化组卷规则rule
        RuleBean rule = new RuleBean();
        rule.setId(new Long(3));
        rule.setExamId(new Long(3));
        rule.setTotalMark(100);
        rule.setDifficulty(new Double(0.2));
        rule.setSingleNum(10);
        rule.setSingleScore(new Double(5.0));
        rule.setJudgmentNum(10);
        rule.setJudgmentScore(new Double(5.0));
        List<String> points = new ArrayList<String>();
        points.add("259");
        points.add("268");
        rule.setPointIds(points);
        if (rule != null) {
            // 初始化种群
            Population population = new Population(20, true, rule,questionService);
            System.out.println("初次适应度  " + population.getFitness().getAdaptationDegree());
            while (count < runCount && population.getFitness().getAdaptationDegree() < expand) {
                count++;
                GA ga = new GA(questionService);
                population = ga.evolvePopulation(population, rule);
                System.out.println("第 " + count + " 次进化，适应度为： " + population.getFitness().getAdaptationDegree());
                logstrs.add("第 " + count + " 次进化，适应度为： " + population.getFitness().getAdaptationDegree());
            }
            System.out.println("进化次数： " + count);
            System.out.println(population.getFitness().getAdaptationDegree());
            resultPaper = population.getFitness();
        }
        long l1 = System.currentTimeMillis();
        float seconds = (l1 - l) / 1000F;
        System.out.println("改进后的遗传算法耗时为：" + seconds+"毫秒");
        Gson g1 = new Gson();
        System.out.println(g1.toJson(logstrs));
        System.out.println(g1.toJson(resultPaper));
    }
}
