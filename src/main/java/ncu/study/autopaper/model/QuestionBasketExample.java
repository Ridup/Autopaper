package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionBasketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionBasketExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("COURSE is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("COURSE =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("COURSE <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("COURSE >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("COURSE <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("COURSE <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("COURSE like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("COURSE not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("COURSE in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("COURSE not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("COURSE between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("COURSE not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("GRADE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("GRADE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("GRADE_NAME =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("GRADE_NAME <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("GRADE_NAME >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_NAME >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("GRADE_NAME <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("GRADE_NAME <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("GRADE_NAME like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("GRADE_NAME not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("GRADE_NAME in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("GRADE_NAME not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("GRADE_NAME between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("GRADE_NAME not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionIsNull() {
            addCriterion("QUESTION_ID_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionIsNotNull() {
            addCriterion("QUESTION_ID_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionEqualTo(String value) {
            addCriterion("QUESTION_ID_COLLECTION =", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionNotEqualTo(String value) {
            addCriterion("QUESTION_ID_COLLECTION <>", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionGreaterThan(String value) {
            addCriterion("QUESTION_ID_COLLECTION >", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID_COLLECTION >=", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionLessThan(String value) {
            addCriterion("QUESTION_ID_COLLECTION <", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID_COLLECTION <=", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionLike(String value) {
            addCriterion("QUESTION_ID_COLLECTION like", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionNotLike(String value) {
            addCriterion("QUESTION_ID_COLLECTION not like", value, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionIn(List<String> values) {
            addCriterion("QUESTION_ID_COLLECTION in", values, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionNotIn(List<String> values) {
            addCriterion("QUESTION_ID_COLLECTION not in", values, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionBetween(String value1, String value2) {
            addCriterion("QUESTION_ID_COLLECTION between", value1, value2, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionIdCollectionNotBetween(String value1, String value2) {
            addCriterion("QUESTION_ID_COLLECTION not between", value1, value2, "questionIdCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionIsNull() {
            addCriterion("QUESTION_TYPE_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionIsNotNull() {
            addCriterion("QUESTION_TYPE_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionEqualTo(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION =", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionNotEqualTo(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION <>", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionGreaterThan(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION >", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION >=", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionLessThan(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION <", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION <=", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionLike(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION like", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionNotLike(String value) {
            addCriterion("QUESTION_TYPE_COLLECTION not like", value, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionIn(List<String> values) {
            addCriterion("QUESTION_TYPE_COLLECTION in", values, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionNotIn(List<String> values) {
            addCriterion("QUESTION_TYPE_COLLECTION not in", values, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionBetween(String value1, String value2) {
            addCriterion("QUESTION_TYPE_COLLECTION between", value1, value2, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeCollectionNotBetween(String value1, String value2) {
            addCriterion("QUESTION_TYPE_COLLECTION not between", value1, value2, "questionTypeCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionIsNull() {
            addCriterion("TYPE_COUNT_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionIsNotNull() {
            addCriterion("TYPE_COUNT_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionEqualTo(String value) {
            addCriterion("TYPE_COUNT_COLLECTION =", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionNotEqualTo(String value) {
            addCriterion("TYPE_COUNT_COLLECTION <>", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionGreaterThan(String value) {
            addCriterion("TYPE_COUNT_COLLECTION >", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_COUNT_COLLECTION >=", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionLessThan(String value) {
            addCriterion("TYPE_COUNT_COLLECTION <", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionLessThanOrEqualTo(String value) {
            addCriterion("TYPE_COUNT_COLLECTION <=", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionLike(String value) {
            addCriterion("TYPE_COUNT_COLLECTION like", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionNotLike(String value) {
            addCriterion("TYPE_COUNT_COLLECTION not like", value, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionIn(List<String> values) {
            addCriterion("TYPE_COUNT_COLLECTION in", values, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionNotIn(List<String> values) {
            addCriterion("TYPE_COUNT_COLLECTION not in", values, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionBetween(String value1, String value2) {
            addCriterion("TYPE_COUNT_COLLECTION between", value1, value2, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTypeCountCollectionNotBetween(String value1, String value2) {
            addCriterion("TYPE_COUNT_COLLECTION not between", value1, value2, "typeCountCollection");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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