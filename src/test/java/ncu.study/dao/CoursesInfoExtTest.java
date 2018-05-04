package ncu.study.dao;

import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.VersionPojo;
import ncu.study.autopaper.dao.ext.CoursesInfoExtMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  CoursesInfoExtTest .java  v0.1  2018/4/25 12:07 Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class CoursesInfoExtTest {
    @Autowired
    private CoursesInfoExtMapper coursesInfoExtMapper;//记住加入注解，否则为null
    @Test
    public void test(){
       List<GradePojo> gradePojos = coursesInfoExtMapper.getAllGrade();

        System.out.print(gradePojos.toString());

    }

    @Test
    public void test1(){
        GradePojo gradePojo = new GradePojo();
        //gradePojo.setGrade("G07");
        gradePojo.setGradeName("初一");
        List<CoursePojo> coursePojos = coursesInfoExtMapper.getAllCourse(gradePojo);

        System.out.print(coursePojos.toString());

    }

    @Test
    public void test2(){
        GradePojo gradePojo = new GradePojo();
        //gradePojo.setGrade("G07");
        gradePojo.setGradeName("初一");
        CoursePojo coursePojo = new CoursePojo();
        //coursePojo.setCourse("C01");
        coursePojo.setCourseName("数学");
        List<VersionPojo> versionPojos = coursesInfoExtMapper.getAllVersion(gradePojo,coursePojo);

        System.out.print(versionPojos.toString());

    }
}
