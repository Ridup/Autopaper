package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("TEACHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("TEACHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("TEACHER_NAME =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("TEACHER_NAME <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("TEACHER_NAME >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("TEACHER_NAME <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NAME <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("TEACHER_NAME like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("TEACHER_NAME not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("TEACHER_NAME in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("TEACHER_NAME not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NAME not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("TEACHER_SEX is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("TEACHER_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(Integer value) {
            addCriterion("TEACHER_SEX =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(Integer value) {
            addCriterion("TEACHER_SEX <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(Integer value) {
            addCriterion("TEACHER_SEX >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_SEX >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(Integer value) {
            addCriterion("TEACHER_SEX <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_SEX <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<Integer> values) {
            addCriterion("TEACHER_SEX in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<Integer> values) {
            addCriterion("TEACHER_SEX not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_SEX between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_SEX not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNull() {
            addCriterion("TEACHER_AGE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIsNotNull() {
            addCriterion("TEACHER_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeEqualTo(Integer value) {
            addCriterion("TEACHER_AGE =", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotEqualTo(Integer value) {
            addCriterion("TEACHER_AGE <>", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThan(Integer value) {
            addCriterion("TEACHER_AGE >", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_AGE >=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThan(Integer value) {
            addCriterion("TEACHER_AGE <", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeLessThanOrEqualTo(Integer value) {
            addCriterion("TEACHER_AGE <=", value, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeIn(List<Integer> values) {
            addCriterion("TEACHER_AGE in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotIn(List<Integer> values) {
            addCriterion("TEACHER_AGE not in", values, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_AGE between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("TEACHER_AGE not between", value1, value2, "teacherAge");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("TEACHER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("TEACHER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("TEACHER_PHONE =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("TEACHER_PHONE <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("TEACHER_PHONE >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_PHONE >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("TEACHER_PHONE <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_PHONE <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("TEACHER_PHONE like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("TEACHER_PHONE not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("TEACHER_PHONE in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("TEACHER_PHONE not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("TEACHER_PHONE between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("TEACHER_PHONE not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrIsNull() {
            addCriterion("TEACHER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrIsNotNull() {
            addCriterion("TEACHER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrEqualTo(String value) {
            addCriterion("TEACHER_ADDR =", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrNotEqualTo(String value) {
            addCriterion("TEACHER_ADDR <>", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrGreaterThan(String value) {
            addCriterion("TEACHER_ADDR >", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_ADDR >=", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrLessThan(String value) {
            addCriterion("TEACHER_ADDR <", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_ADDR <=", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrLike(String value) {
            addCriterion("TEACHER_ADDR like", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrNotLike(String value) {
            addCriterion("TEACHER_ADDR not like", value, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrIn(List<String> values) {
            addCriterion("TEACHER_ADDR in", values, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrNotIn(List<String> values) {
            addCriterion("TEACHER_ADDR not in", values, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrBetween(String value1, String value2) {
            addCriterion("TEACHER_ADDR between", value1, value2, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherAddrNotBetween(String value1, String value2) {
            addCriterion("TEACHER_ADDR not between", value1, value2, "teacherAddr");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIsNull() {
            addCriterion("TEACHER_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIsNotNull() {
            addCriterion("TEACHER_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolEqualTo(String value) {
            addCriterion("TEACHER_SCHOOL =", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotEqualTo(String value) {
            addCriterion("TEACHER_SCHOOL <>", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolGreaterThan(String value) {
            addCriterion("TEACHER_SCHOOL >", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_SCHOOL >=", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLessThan(String value) {
            addCriterion("TEACHER_SCHOOL <", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_SCHOOL <=", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolLike(String value) {
            addCriterion("TEACHER_SCHOOL like", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotLike(String value) {
            addCriterion("TEACHER_SCHOOL not like", value, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolIn(List<String> values) {
            addCriterion("TEACHER_SCHOOL in", values, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotIn(List<String> values) {
            addCriterion("TEACHER_SCHOOL not in", values, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolBetween(String value1, String value2) {
            addCriterion("TEACHER_SCHOOL between", value1, value2, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherSchoolNotBetween(String value1, String value2) {
            addCriterion("TEACHER_SCHOOL not between", value1, value2, "teacherSchool");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIsNull() {
            addCriterion("TEACHER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIsNotNull() {
            addCriterion("TEACHER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoEqualTo(String value) {
            addCriterion("TEACHER_NO =", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotEqualTo(String value) {
            addCriterion("TEACHER_NO <>", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThan(String value) {
            addCriterion("TEACHER_NO >", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_NO >=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThan(String value) {
            addCriterion("TEACHER_NO <", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_NO <=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLike(String value) {
            addCriterion("TEACHER_NO like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotLike(String value) {
            addCriterion("TEACHER_NO not like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIn(List<String> values) {
            addCriterion("TEACHER_NO in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotIn(List<String> values) {
            addCriterion("TEACHER_NO not in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoBetween(String value1, String value2) {
            addCriterion("TEACHER_NO between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotBetween(String value1, String value2) {
            addCriterion("TEACHER_NO not between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherTcIsNull() {
            addCriterion("TEACHER_TC is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTcIsNotNull() {
            addCriterion("TEACHER_TC is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTcEqualTo(String value) {
            addCriterion("TEACHER_TC =", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcNotEqualTo(String value) {
            addCriterion("TEACHER_TC <>", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcGreaterThan(String value) {
            addCriterion("TEACHER_TC >", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_TC >=", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcLessThan(String value) {
            addCriterion("TEACHER_TC <", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_TC <=", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcLike(String value) {
            addCriterion("TEACHER_TC like", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcNotLike(String value) {
            addCriterion("TEACHER_TC not like", value, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcIn(List<String> values) {
            addCriterion("TEACHER_TC in", values, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcNotIn(List<String> values) {
            addCriterion("TEACHER_TC not in", values, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcBetween(String value1, String value2) {
            addCriterion("TEACHER_TC between", value1, value2, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherTcNotBetween(String value1, String value2) {
            addCriterion("TEACHER_TC not between", value1, value2, "teacherTc");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIsNull() {
            addCriterion("TEACHER_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIsNotNull() {
            addCriterion("TEACHER_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeEqualTo(String value) {
            addCriterion("TEACHER_GRADE =", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotEqualTo(String value) {
            addCriterion("TEACHER_GRADE <>", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeGreaterThan(String value) {
            addCriterion("TEACHER_GRADE >", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_GRADE >=", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeLessThan(String value) {
            addCriterion("TEACHER_GRADE <", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_GRADE <=", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeLike(String value) {
            addCriterion("TEACHER_GRADE like", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotLike(String value) {
            addCriterion("TEACHER_GRADE not like", value, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeIn(List<String> values) {
            addCriterion("TEACHER_GRADE in", values, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotIn(List<String> values) {
            addCriterion("TEACHER_GRADE not in", values, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeBetween(String value1, String value2) {
            addCriterion("TEACHER_GRADE between", value1, value2, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeacherGradeNotBetween(String value1, String value2) {
            addCriterion("TEACHER_GRADE not between", value1, value2, "teacherGrade");
            return (Criteria) this;
        }

        public Criteria andTeachVersionIsNull() {
            addCriterion("TEACH_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andTeachVersionIsNotNull() {
            addCriterion("TEACH_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andTeachVersionEqualTo(String value) {
            addCriterion("TEACH_VERSION =", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionNotEqualTo(String value) {
            addCriterion("TEACH_VERSION <>", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionGreaterThan(String value) {
            addCriterion("TEACH_VERSION >", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionGreaterThanOrEqualTo(String value) {
            addCriterion("TEACH_VERSION >=", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionLessThan(String value) {
            addCriterion("TEACH_VERSION <", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionLessThanOrEqualTo(String value) {
            addCriterion("TEACH_VERSION <=", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionLike(String value) {
            addCriterion("TEACH_VERSION like", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionNotLike(String value) {
            addCriterion("TEACH_VERSION not like", value, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionIn(List<String> values) {
            addCriterion("TEACH_VERSION in", values, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionNotIn(List<String> values) {
            addCriterion("TEACH_VERSION not in", values, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionBetween(String value1, String value2) {
            addCriterion("TEACH_VERSION between", value1, value2, "teachVersion");
            return (Criteria) this;
        }

        public Criteria andTeachVersionNotBetween(String value1, String value2) {
            addCriterion("TEACH_VERSION not between", value1, value2, "teachVersion");
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