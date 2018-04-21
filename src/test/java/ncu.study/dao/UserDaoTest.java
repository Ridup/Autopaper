package ncu.study.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ncu.study.autopaper.dao.UserMapper;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.model.UserKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ridup
 * @version $Id: UserDaoTest.java, v 0.1 2018/1/29 10:02 Ridup Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserDaoTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() throws Exception{
        long id = 1;
        UserKey userKey = new UserKey();
        userKey.setUserPhone("18214990000");
        User user = userMapper.selectByPrimaryKey(userKey);
        System.out.println("响应1："+new Gson().toJson(user));
        Gson gson = new GsonBuilder().serializeNulls().create();
        System.out.println("响应2："+gson.toJson(user));
    }
}