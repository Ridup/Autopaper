package ncu.study.dao;

import com.google.gson.Gson;
import ncu.study.autopaper.dao.ext.UserExtMapper;
import ncu.study.autopaper.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ridup
 * @version $Id: UserDaoExtTest.java, v 0.1  2018/4/10 15:00 Ridup Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserDaoExtTest {
    @Autowired
    private UserExtMapper userExtMapper;
    @Test
    public void test() throws Exception{
        User user = userExtMapper.checkUserByPhone("18114990001");
        System.out.println("响应1："+new Gson().toJson(user));
    }
}
