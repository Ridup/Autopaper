package ncu.study.autopaper.model;

public class CoursesInfo {
    private Integer courseId;

    private String grade;

    private String gradeName;

    private String course;

    private String courseName;

    private String version;

    private String versionName;

    private String chapter;

    private String chapterName;

    private String point;

    private String pointName;

    public CoursesInfo(Integer courseId, String grade, String gradeName, String course, String courseName, String version, String versionName, String chapter, String chapterName, String point, String pointName) {
        this.courseId = courseId;
        this.grade = grade;
        this.gradeName = gradeName;
        this.course = course;
        this.courseName = courseName;
        this.version = version;
        this.versionName = versionName;
        this.chapter = chapter;
        this.chapterName = chapterName;
        this.point = point;
        this.pointName = pointName;
    }

    public CoursesInfo() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point == null ? null : point.trim();
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName == null ? null : pointName.trim();
    }
}