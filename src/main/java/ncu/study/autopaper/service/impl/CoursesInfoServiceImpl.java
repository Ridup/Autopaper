package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.dao.CoursesInfoMapper;
import ncu.study.autopaper.dao.ext.CoursesInfoExtMapper;
import ncu.study.autopaper.model.CoursesInfo;
import ncu.study.autopaper.model.CoursesInfoExample;
import ncu.study.autopaper.service.CoursesInfoService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service("coursesInfoService")
public class CoursesInfoServiceImpl implements CoursesInfoService {

    @Resource
    private CoursesInfoMapper coursesInfoMapper;
    @Resource
    private CoursesInfoExtMapper coursesInfoExtMapper;

    @Override
    public List<String> getAllGradeName() {
        List<String> list = new ArrayList<>();
        List<GradePojo> pojos = coursesInfoExtMapper.getAllGrade();
        for (GradePojo pojo : pojos) {
            list.add(pojo.getGradeName());
        }
        return list;
    }

    @Override
    public List<String> getAllCourseName(GradePojo gradePojo) {

        List<String> list = new ArrayList<>();
        List<CoursePojo> pojos = coursesInfoExtMapper.getAllCourse(gradePojo);
        for (CoursePojo pojo : pojos) {
            list.add(pojo.getCourseName());
        }
        return list;
    }

    @Override
    public List<String> getAllVersionName(GradePojo gradePojo, CoursePojo coursePojo) {

        List<String> list = new ArrayList<>();
        List<VersionPojo> pojos = coursesInfoExtMapper.getAllVersion(gradePojo, coursePojo);
        for (VersionPojo pojo : pojos) {
            list.add(pojo.getVersionName());
        }
        return list;
    }

    @Override
    public List<CoursesInfo> getCoursesInfo(CoursesInfo coursesInfo) {
        CoursesInfoExample coursesInfoExample = new CoursesInfoExample();
        CoursesInfoExample.Criteria criteria = coursesInfoExample.createCriteria();
        if (coursesInfo.getGrade() != null)
            criteria.andGradeEqualTo(coursesInfo.getGrade());
        if (coursesInfo.getGradeName() != null)
            criteria.andGradeNameEqualTo(coursesInfo.getGradeName());
        if (coursesInfo.getCourse() != null)
            criteria.andCourseEqualTo(coursesInfo.getCourse());
        if (coursesInfo.getCourseName() != null)
            criteria.andCourseNameEqualTo(coursesInfo.getCourseName());
        if (coursesInfo.getVersion() != null)
            criteria.andVersionEqualTo(coursesInfo.getVersion());
        if (coursesInfo.getVersionName() != null)
            criteria.andVersionNameEqualTo(coursesInfo.getVersionName());
        if (coursesInfo.getPointName() != null)
            criteria.andPointNameEqualTo(coursesInfo.getPointName());
        List<CoursesInfo> coursesInfos = coursesInfoMapper.selectByExample(coursesInfoExample);
        return coursesInfos;
    }

    @Override
    public List<ChapterPojo> getChapterInfoById(String courseId) {
        List<ChapterPojo> chapterPojos = new ArrayList<ChapterPojo>();
        if (courseId != null && courseId != "") {
            //chapterPojos = coursesInfoExtMapper.getChapterInfoById(courseId);
        }
        return chapterPojos;
    }


    /**
     * 获得所有年级+学科
     *
     * @return
     */
    @Override
    public List<CoursesPojo> getAllCourses() {
        List<CoursesPojo> coursesPojos = new ArrayList<CoursesPojo>();
        List<GradePojo> pojos = coursesInfoExtMapper.getAllGrade();
        for (GradePojo gradePojo : pojos) {
            CoursesPojo coursesPojo = new CoursesPojo();
            coursesPojo.setGradeId(gradePojo.getGrade());
            coursesPojo.setGradeName(gradePojo.getGradeName());
            List<CoursePojo> allCoursePojos = coursesInfoExtMapper.getAllCourse(gradePojo);
            List<CoursePojo> coursePojos = new ArrayList<CoursePojo>();
            for (CoursePojo coursePojo : allCoursePojos) {
                coursePojos.add(coursePojo);
            }
            coursesPojo.setCoursePojos(coursePojos);
            coursesPojos.add(coursesPojo);
        }
        return coursesPojos;
    }

    @Override
    public void setCurrentCourse(HttpServletRequest request, GradePojo gradePojo, CoursePojo coursePojo) throws Exception {
        if (request.getParameter("gradeName") != null && request.getParameter("courseName") != null) {
            String gradeName = new String(request.getParameter("gradeName").getBytes("iso-8859-1"), "utf-8");
            String courseName = new String(request.getParameter("courseName").getBytes("iso-8859-1"), "utf-8");
            gradePojo.setGradeName(gradeName);
            coursePojo.setCourseName(courseName);
        }

        HttpSession session = request.getSession();
        session.setAttribute("currentGrade", gradePojo);
        session.setAttribute("currentCourse", coursePojo);
    }
}
