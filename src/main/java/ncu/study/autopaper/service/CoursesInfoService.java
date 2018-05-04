package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.ChapterPojo;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.CoursesPojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.model.CoursesInfo;

import java.util.List;

public interface CoursesInfoService {
    public List<String> getAllGradeName();
    public List<String> getAllCourseName(GradePojo gradePojo);
    public List<String> getAllVersionName(GradePojo gradePojo, CoursePojo coursePojo);
    public List<CoursesPojo> getAllCourses();
    public List<CoursesInfo> getCoursesInfo(CoursesInfo coursesInfo);
    public List<ChapterPojo> getChapterInfoById(String courseId);
}
