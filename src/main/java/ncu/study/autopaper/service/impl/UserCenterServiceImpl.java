package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.dao.StudentMapper;
import ncu.study.autopaper.dao.TeacherMapper;
import ncu.study.autopaper.dao.ext.UserExtMapper;
import ncu.study.autopaper.model.Student;
import ncu.study.autopaper.model.Teacher;
import ncu.study.autopaper.model.User;
import ncu.study.autopaper.service.UserCenterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ridup
 * @version FleName:  UserCenterServiceImpl.java   v0.1  2018/4/17 18:54  Exp $
 */
@Service("userCenterService")
public class UserCenterServiceImpl implements UserCenterService{

    @Resource
    private UserExtMapper userExtMapper;

    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private StudentMapper studentMapper;

    @Override
    public User getUserInfo(String phone) {

        return userExtMapper.checkUserByPhone(phone);
    }

    @Override
    public Teacher getTeacherInfo(int teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public Student getStudentInfo(int studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }
}
