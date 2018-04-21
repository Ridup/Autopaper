package ncu.study.autopaper.model;

public class Student {
    private Integer studentId;

    private String studentNo;

    private String studentName;

    private Integer studentSex;

    private Integer studentAge;

    private String studentPhone;

    private String studentSchool;

    private String studentAddr;

    private String studentCourse;

    private String studentVersion;

    private String studentGrade;

    public Student(Integer studentId, String studentNo, String studentName, Integer studentSex, Integer studentAge, String studentPhone, String studentSchool, String studentAddr, String studentCourse, String studentVersion, String studentGrade) {
        this.studentId = studentId;
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentPhone = studentPhone;
        this.studentSchool = studentSchool;
        this.studentAddr = studentAddr;
        this.studentCourse = studentCourse;
        this.studentVersion = studentVersion;
        this.studentGrade = studentGrade;
    }

    public Student() {
        super();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool == null ? null : studentSchool.trim();
    }

    public String getStudentAddr() {
        return studentAddr;
    }

    public void setStudentAddr(String studentAddr) {
        this.studentAddr = studentAddr == null ? null : studentAddr.trim();
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse == null ? null : studentCourse.trim();
    }

    public String getStudentVersion() {
        return studentVersion;
    }

    public void setStudentVersion(String studentVersion) {
        this.studentVersion = studentVersion == null ? null : studentVersion.trim();
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade == null ? null : studentGrade.trim();
    }
}