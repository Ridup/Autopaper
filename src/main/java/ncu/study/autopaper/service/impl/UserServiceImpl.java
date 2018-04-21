
package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.EnumUserType;
import ncu.study.autopaper.common.param.UserRegisterParam;
import ncu.study.autopaper.dao.StudentMapper;
import ncu.study.autopaper.dao.TeacherMapper;
import ncu.study.autopaper.dao.UserMapper;
import ncu.study.autopaper.dao.ext.UserExtMapper;
import ncu.study.autopaper.model.Student;
import ncu.study.autopaper.model.Teacher;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author Ridup
 * @version $Id: UserServiceImpl.java, v 0.1 2018/1/26 17:58 Ridup Exp $
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private UserExtMapper userExtMapper;

    public User login(String userPhone, String userPassword){

        User user = userExtMapper.checkUserByPhone(userPhone);
        return user;
    }

    @Override
    public Boolean checkRegistor(String userPhone) {
        User user = userExtMapper.checkUserByPhone(userPhone);
        if(user==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public User register(UserRegisterParam param) {
        String userPhone = param.getMobile();
        User user = userExtMapper.checkUserByPhone(userPhone);
        if(user==null){
            //param插入User表
            User record = new User();
            record.setUserPhone(userPhone);

            record.setRegisterTime(new Date());
            record.setModifyTime(new Date());
            record.setNickName(userPhone);
            record.setUserPassword(param.getPassword());
            String userType = param.getIdentity();
            record.setUserType(EnumUserType.valueOf(userType).getCode());
            int status = userMapper.insertSelective(record);

            //插入User表成功，同步用户类型表，返回默认User数据
            if(status==1){
                User res =  userExtMapper.checkUserByPhone(userPhone);
                int insertStatus = 0;
                if(EnumUserType.valueOf(userType)==EnumUserType.teacher){
                    Teacher teacher = new Teacher();
                    teacher.setTeacherId(res.getUserId());
                    teacher.setTeacherPhone(res.getUserPhone());
                    insertStatus = teacherMapper.insertSelective(teacher);
                }else if(EnumUserType.valueOf(userType)==EnumUserType.student){
                    Student student = new Student();
                    student.setStudentId(res.getUserId());
                    student.setStudentPhone(res.getUserPhone());
                    insertStatus = studentMapper.insertSelective(student);
                }else {
                    return null;
                }
                if(insertStatus==1){return res;}else {return null;}
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public int updatetUser(User user) {
        int statu = 0;
        String userType = user.getUserType();
        statu = userMapper.updateByPrimaryKeySelective(user);
        if (userType!=null&&EnumUserType.find(userType)==EnumUserType.teacher){
            Teacher teacher = new Teacher();
            teacher.setTeacherId(user.getUserId());
            teacher.setTeacherPhone(user.getUserPhone());
            teacher.setTeacherAge(user.getUserAge());
            teacher.setTeacherName(user.getUserName());
            teacher.setTeacherSex(user.getUserSex());
            statu = teacherMapper.updateByPrimaryKeySelective(teacher);
        }else if(userType!=null&&EnumUserType.find(userType)==EnumUserType.student){
            Student student = new Student();
            student.setStudentId(user.getUserId());
            student.setStudentPhone(user.getUserPhone());
            student.setStudentAge(user.getUserAge());
            student.setStudentName(user.getUserName());
            student.setStudentSex(user.getUserSex());
            statu = studentMapper.updateByPrimaryKeySelective(student);
        }else{
            statu = 0;
        }
        return statu;
    }
}
