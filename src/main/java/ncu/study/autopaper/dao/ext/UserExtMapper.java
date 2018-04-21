package ncu.study.autopaper.dao.ext;


import ncu.study.autopaper.model.User;

/**
 * @author zhanghq23531
 * @version $Id: UserExtMapper.java, v 0.1  2018/4/10 15:01 zhanghq23531 Exp $
 */
public interface UserExtMapper {
    public User checkUserByPhone(String userPhone);
}
