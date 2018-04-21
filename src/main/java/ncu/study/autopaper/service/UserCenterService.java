package ncu.study.autopaper.service;

import ncu.study.autopaper.model.Student;
import ncu.study.autopaper.model.Teacher;
import ncu.study.autopaper.model.User;

/**
 * @author Ridup
 * @version FleName:  UserCenterService.java   v0.1  2018/4/17 18:52  Exp $
 */
public interface UserCenterService {
    public User getUserInfo(String phone);
    public Teacher getTeacherInfo(int teacherId);
    public Student getStudentInfo(int studentId);
}
