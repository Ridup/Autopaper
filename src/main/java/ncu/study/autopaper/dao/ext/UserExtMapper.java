package ncu.study.autopaper.dao.ext;


        import ncu.study.autopaper.model.User;

/**
 * @author Ridup
 * @version $Id: UserExtMapper.java, v 0.1  2018/4/10 15:01 Ridup Exp $
 */
public interface UserExtMapper {
    public User checkUserByPhone(String userPhone);
}
