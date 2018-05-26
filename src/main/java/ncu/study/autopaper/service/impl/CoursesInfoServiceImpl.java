package ncu.study.autopaper.service.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
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
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
        if (coursesInfo.getChapter() != null)
            criteria.andChapterEqualTo(coursesInfo.getChapter());
        if (coursesInfo.getChapterName() != null)
            criteria.andChapterNameEqualTo(coursesInfo.getChapterName());
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

    @Override
    public List<VCPPojo> getVCP(CoursesInfo coursesInfo) {
        List<VCPPojo> vcpPojos = new ArrayList<VCPPojo>();
        //version
        GradePojo gradePojo = new GradePojo();
        CoursePojo coursePojo = new CoursePojo();
        gradePojo.setGrade(coursesInfo.getGrade());
        gradePojo.setGradeName(coursesInfo.getGradeName());

        coursePojo.setCourse(coursesInfo.getCourse());
        coursePojo.setCourseName(coursesInfo.getCourseName());

        List<VersionPojo> version = coursesInfoExtMapper.getAllVersion(gradePojo, coursePojo);
        for (VersionPojo versionPojo : version) {
            VCPPojo vcpPojo = new VCPPojo();
            String versionId = versionPojo.getVersion();
            String versionName = versionPojo.getVersionName();
            vcpPojo.setTitle(versionName);
            vcpPojo.setValue(versionId);
            coursesInfo.setVersion(versionId);
            coursesInfo.setVersionName(versionName);
            List<ChapterPojo> chapterPojos = coursesInfoExtMapper.getAllChapter(coursesInfo);
            //chapter
            List<VCPPojo> vcpPojos1 = new ArrayList<VCPPojo>();
            for (ChapterPojo chapterPojo : chapterPojos) {
                VCPPojo vcpPojo1 = new VCPPojo();
                String chapterId = chapterPojo.getChapterId();
                String chapterName = chapterPojo.getChapterName();
                vcpPojo1.setTitle(chapterName);
                vcpPojo1.setValue(chapterId);
                vcpPojos1.add(vcpPojo1);
                //point
                coursesInfo.setChapter(chapterId);
                coursesInfo.setChapterName(chapterName);
                List<PointPojo> allPoint = coursesInfoExtMapper.getAllPoint(coursesInfo);
                ArrayList<VCPPojo> vcpPojos2 = new ArrayList<>();
                for (PointPojo pointPojo : allPoint) {
                    VCPPojo vcpPojo2 = new VCPPojo();
                    String pointId = pointPojo.getCourseId().toString();
                    String pointName = pointPojo.getPointName();
                    vcpPojo2.setTitle(pointName);
                    vcpPojo2.setValue(pointId);
                    vcpPojos2.add(vcpPojo2);
                }
                vcpPojo1.setData(vcpPojos2);
            }
            vcpPojo.setData(vcpPojos1);
            vcpPojos.add(vcpPojo);
        }

        return vcpPojos;
    }



    /*@Override
    public List<VCPPojo> getVCP(CoursesInfo coursesInfo) {
        JsonObject object = new JsonObject();
        JsonArray array = new JsonArray();
        //version
        GradePojo gradePojo = new GradePojo();
        CoursePojo coursePojo = new CoursePojo();
        gradePojo.setGrade(coursesInfo.getGrade());
        gradePojo.setGradeName(coursesInfo.getGradeName());

        coursePojo.setCourse(coursesInfo.getCourse());
        coursePojo.setCourseName(coursesInfo.getCourseName());

        List<VersionPojo> version = coursesInfoExtMapper.getAllVersion(gradePojo, coursePojo);
        for (VersionPojo versionPojo : version) {
            JsonObject object1 = new JsonObject();
            String versionId = versionPojo.getVersion();
            String versionName = versionPojo.getVersionName();
            object1.addProperty("title",versionName);
            object1.addProperty("value",versionId);
            coursesInfo.setVersion(versionId);
            coursesInfo.setVersionName(versionName);
            List<ChapterPojo> chapterPojos = coursesInfoExtMapper.getAllChapter(coursesInfo);
            //chapter
            JsonObject object2 = new JsonObject();
            JsonArray array1 = new JsonArray();
            List<VCPPojo> vcpPojos1 = new ArrayList<VCPPojo>();
            for (ChapterPojo chapterPojo : chapterPojos) {
                JsonObject object3 = new JsonObject();
                String chapterId = chapterPojo.getChapterId();
                String chapterName = chapterPojo.getChapterName();
                object3.addProperty("title",chapterName);
                object3.addProperty("value",chapterId);
                vcpPojos1.add(vcpPojo1);
                //point
                coursesInfo.setChapter(chapterId);
                coursesInfo.setChapterName(chapterName);
                List<PointPojo> allPoint = coursesInfoExtMapper.getAllPoint(coursesInfo);
                JsonObject object4 = new JsonObject();
                ArrayList<VCPPojo> vcpPojos2 = new ArrayList<>();
                for (PointPojo pointPojo : allPoint) {
                    VCPPojo vcpPojo2 = new VCPPojo();
                    String pointId = pointPojo.getCourseId().toString();
                    String pointName = pointPojo.getPointName();
                    vcpPojo2.setTitle(pointName);
                    vcpPojo2.setValue(pointId);
                    vcpPojos2.add(vcpPojo2);
                }
                object3.addProperty("data",);
            }
            JsonElement jsonElement = new JsonArray();
            object1.addProperty("data",chapterPojos);
            array.add(object1);
        }

        return vcpPojos;
    }*/






    @Override
    public List<CoursesInfo> getCoursesInfoDistinct(CoursesInfo coursesInfo, String orderByClause) {
        CoursesInfoExample coursesInfoExample = new CoursesInfoExample();
        CoursesInfoExample.Criteria criteria = coursesInfoExample.createCriteria();
        coursesInfoExample.setOrderByClause(orderByClause);
        coursesInfoExample.setDistinct(true);
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
        if (coursesInfo.getChapter() != null)
            criteria.andChapterEqualTo(coursesInfo.getChapter());
        if (coursesInfo.getChapterName() != null)
            criteria.andChapterNameEqualTo(coursesInfo.getChapterName());
        if (coursesInfo.getPointName() != null)
            criteria.andPointNameEqualTo(coursesInfo.getPointName());
        List<CoursesInfo> coursesInfos = coursesInfoMapper.selectByExample(coursesInfoExample);
        return coursesInfos;
    }

}
