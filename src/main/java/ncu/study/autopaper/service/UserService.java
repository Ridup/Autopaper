package ncu.study.autopaper.service;

import ncu.study.autopaper.common.param.UserRegisterParam;
import ncu.study.autopaper.model.User;

/**
 * @author Ridup
 * @version $Id: UserService.java, v 0.1  2018/4/9 13:42 Ridup Exp $
 */
public interface UserService {
    public User login(String userPhone, String userPassword);
    public Boolean checkRegistor(String userPhone);
    public User register(UserRegisterParam param);
}
