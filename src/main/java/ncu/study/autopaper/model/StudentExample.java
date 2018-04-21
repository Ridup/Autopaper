package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("STUDENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("STUDENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("STUDENT_NO =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("STUDENT_NO <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("STUDENT_NO >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NO >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("STUDENT_NO <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NO <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("STUDENT_NO like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("STUDENT_NO not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("STUDENT_NO in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("STUDENT_NO not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("STUDENT_NO between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NO not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("STUDENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("STUDENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("STUDENT_NAME =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("STUDENT_NAME <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("STUDENT_NAME >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("STUDENT_NAME <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_NAME <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("STUDENT_NAME like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("STUDENT_NAME not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("STUDENT_NAME in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("STUDENT_NAME not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("STUDENT_NAME not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("STUDENT_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("STUDENT_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(Integer value) {
            addCriterion("STUDENT_SEX =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(Integer value) {
            addCriterion("STUDENT_SEX <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(Integer value) {
            addCriterion("STUDENT_SEX >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_SEX >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(Integer value) {
            addCriterion("STUDENT_SEX <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_SEX <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<Integer> values) {
            addCriterion("STUDENT_SEX in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<Integer> values) {
            addCriterion("STUDENT_SEX not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_SEX between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_SEX not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNull() {
            addCriterion("STUDENT_AGE is null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIsNotNull() {
            addCriterion("STUDENT_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAgeEqualTo(Integer value) {
            addCriterion("STUDENT_AGE =", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotEqualTo(Integer value) {
            addCriterion("STUDENT_AGE <>", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThan(Integer value) {
            addCriterion("STUDENT_AGE >", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_AGE >=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThan(Integer value) {
            addCriterion("STUDENT_AGE <", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("STUDENT_AGE <=", value, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeIn(List<Integer> values) {
            addCriterion("STUDENT_AGE in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotIn(List<Integer> values) {
            addCriterion("STUDENT_AGE not in", values, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_AGE between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("STUDENT_AGE not between", value1, value2, "studentAge");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("STUDENT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("STUDENT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("STUDENT_PHONE =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("STUDENT_PHONE <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("STUDENT_PHONE >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_PHONE >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("STUDENT_PHONE <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_PHONE <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("STUDENT_PHONE like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("STUDENT_PHONE not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("STUDENT_PHONE in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("STUDENT_PHONE not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("STUDENT_PHONE between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("STUDENT_PHONE not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNull() {
            addCriterion("STUDENT_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNotNull() {
            addCriterion("STUDENT_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolEqualTo(String value) {
            addCriterion("STUDENT_SCHOOL =", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotEqualTo(String value) {
            addCriterion("STUDENT_SCHOOL <>", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThan(String value) {
            addCriterion("STUDENT_SCHOOL >", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_SCHOOL >=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThan(String value) {
            addCriterion("STUDENT_SCHOOL <", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_SCHOOL <=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLike(String value) {
            addCriterion("STUDENT_SCHOOL like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotLike(String value) {
            addCriterion("STUDENT_SCHOOL not like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIn(List<String> values) {
            addCriterion("STUDENT_SCHOOL in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotIn(List<String> values) {
            addCriterion("STUDENT_SCHOOL not in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolBetween(String value1, String value2) {
            addCriterion("STUDENT_SCHOOL between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotBetween(String value1, String value2) {
            addCriterion("STUDENT_SCHOOL not between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentAddrIsNull() {
            addCriterion("STUDENT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddrIsNotNull() {
            addCriterion("STUDENT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddrEqualTo(String value) {
            addCriterion("STUDENT_ADDR =", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrNotEqualTo(String value) {
            addCriterion("STUDENT_ADDR <>", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrGreaterThan(String value) {
            addCriterion("STUDENT_ADDR >", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_ADDR >=", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrLessThan(String value) {
            addCriterion("STUDENT_ADDR <", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_ADDR <=", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrLike(String value) {
            addCriterion("STUDENT_ADDR like", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrNotLike(String value) {
            addCriterion("STUDENT_ADDR not like", value, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrIn(List<String> values) {
            addCriterion("STUDENT_ADDR in", values, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrNotIn(List<String> values) {
            addCriterion("STUDENT_ADDR not in", values, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrBetween(String value1, String value2) {
            addCriterion("STUDENT_ADDR between", value1, value2, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentAddrNotBetween(String value1, String value2) {
            addCriterion("STUDENT_ADDR not between", value1, value2, "studentAddr");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIsNull() {
            addCriterion("STUDENT_COURSE is null");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIsNotNull() {
            addCriterion("STUDENT_COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCourseEqualTo(String value) {
            addCriterion("STUDENT_COURSE =", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseNotEqualTo(String value) {
            addCriterion("STUDENT_COURSE <>", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseGreaterThan(String value) {
            addCriterion("STUDENT_COURSE >", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_COURSE >=", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseLessThan(String value) {
            addCriterion("STUDENT_COURSE <", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_COURSE <=", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseLike(String value) {
            addCriterion("STUDENT_COURSE like", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseNotLike(String value) {
            addCriterion("STUDENT_COURSE not like", value, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseIn(List<String> values) {
            addCriterion("STUDENT_COURSE in", values, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseNotIn(List<String> values) {
            addCriterion("STUDENT_COURSE not in", values, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseBetween(String value1, String value2) {
            addCriterion("STUDENT_COURSE between", value1, value2, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentCourseNotBetween(String value1, String value2) {
            addCriterion("STUDENT_COURSE not between", value1, value2, "studentCourse");
            return (Criteria) this;
        }

        public Criteria andStudentVersionIsNull() {
            addCriterion("STUDENT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andStudentVersionIsNotNull() {
            addCriterion("STUDENT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andStudentVersionEqualTo(String value) {
            addCriterion("STUDENT_VERSION =", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionNotEqualTo(String value) {
            addCriterion("STUDENT_VERSION <>", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionGreaterThan(String value) {
            addCriterion("STUDENT_VERSION >", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_VERSION >=", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionLessThan(String value) {
            addCriterion("STUDENT_VERSION <", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_VERSION <=", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionLike(String value) {
            addCriterion("STUDENT_VERSION like", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionNotLike(String value) {
            addCriterion("STUDENT_VERSION not like", value, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionIn(List<String> values) {
            addCriterion("STUDENT_VERSION in", values, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionNotIn(List<String> values) {
            addCriterion("STUDENT_VERSION not in", values, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionBetween(String value1, String value2) {
            addCriterion("STUDENT_VERSION between", value1, value2, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentVersionNotBetween(String value1, String value2) {
            addCriterion("STUDENT_VERSION not between", value1, value2, "studentVersion");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNull() {
            addCriterion("STUDENT_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIsNotNull() {
            addCriterion("STUDENT_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentGradeEqualTo(String value) {
            addCriterion("STUDENT_GRADE =", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotEqualTo(String value) {
            addCriterion("STUDENT_GRADE <>", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThan(String value) {
            addCriterion("STUDENT_GRADE >", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_GRADE >=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThan(String value) {
            addCriterion("STUDENT_GRADE <", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_GRADE <=", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeLike(String value) {
            addCriterion("STUDENT_GRADE like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotLike(String value) {
            addCriterion("STUDENT_GRADE not like", value, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeIn(List<String> values) {
            addCriterion("STUDENT_GRADE in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotIn(List<String> values) {
            addCriterion("STUDENT_GRADE not in", values, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeBetween(String value1, String value2) {
            addCriterion("STUDENT_GRADE between", value1, value2, "studentGrade");
            return (Criteria) this;
        }

        public Criteria andStudentGradeNotBetween(String value1, String value2) {
            addCriterion("STUDENT_GRADE not between", value1, value2, "studentGrade");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}