package ncu.study.autopaper.model;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Integer teacherSex;

    private Integer teacherAge;

    private String teacherPhone;

    private String teacherAddr;

    private String teacherSchool;

    private String teacherNo;

    private String teacherTc;

    private String teacherGrade;

    private String teachVersion;

    public Teacher(Integer teacherId, String teacherName, Integer teacherSex, Integer teacherAge, String teacherPhone, String teacherAddr, String teacherSchool, String teacherNo, String teacherTc, String teacherGrade, String teachVersion) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSex = teacherSex;
        this.teacherAge = teacherAge;
        this.teacherPhone = teacherPhone;
        this.teacherAddr = teacherAddr;
        this.teacherSchool = teacherSchool;
        this.teacherNo = teacherNo;
        this.teacherTc = teacherTc;
        this.teacherGrade = teacherGrade;
        this.teachVersion = teachVersion;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Integer teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(Integer teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone == null ? null : teacherPhone.trim();
    }

    public String getTeacherAddr() {
        return teacherAddr;
    }

    public void setTeacherAddr(String teacherAddr) {
        this.teacherAddr = teacherAddr == null ? null : teacherAddr.trim();
    }

    public String getTeacherSchool() {
        return teacherSchool;
    }

    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool == null ? null : teacherSchool.trim();
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo == null ? null : teacherNo.trim();
    }

    public String getTeacherTc() {
        return teacherTc;
    }

    public void setTeacherTc(String teacherTc) {
        this.teacherTc = teacherTc == null ? null : teacherTc.trim();
    }

    public String getTeacherGrade() {
        return teacherGrade;
    }

    public void setTeacherGrade(String teacherGrade) {
        this.teacherGrade = teacherGrade == null ? null : teacherGrade.trim();
    }

    public String getTeachVersion() {
        return teachVersion;
    }

    public void setTeachVersion(String teachVersion) {
        this.teachVersion = teachVersion == null ? null : teachVersion.trim();
    }
}