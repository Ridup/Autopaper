package ncu.study.autopaper.common.pojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  CoursesPojo .java  v0.1  2018/5/1 12:12 Exp $
 */
public class CoursesPojo {
    private String gradeName;
    private String gradeId;
    private List<CoursePojo> coursePojos;

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public List<CoursePojo> getCoursePojos() {
        return coursePojos;
    }

    public void setCoursePojos(List<CoursePojo> coursePojos) {
        this.coursePojos = coursePojos;
    }
}
