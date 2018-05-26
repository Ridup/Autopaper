package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.model.CoursesInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CoursesInfoService {
    public List<String> getAllGradeName();
    public List<String> getAllCourseName(GradePojo gradePojo);
    public List<String> getAllVersionName(GradePojo gradePojo, CoursePojo coursePojo);
    public List<CoursesPojo> getAllCourses();
    public List<CoursesInfo> getCoursesInfo(CoursesInfo coursesInfo);
    public List<ChapterPojo> getChapterInfoById(String courseId);

    //设置session中当前选择的课程信息普遍（抽象）
    public void setCurrentCourse(HttpServletRequest request, GradePojo gradePojo, CoursePojo coursePojo)  throws Exception ;

    public List<VCPPojo> getVCP(CoursesInfo coursesInfo);
    public List<CoursesInfo> getCoursesInfoDistinct(CoursesInfo coursesInfo,String orderByClause);
}
