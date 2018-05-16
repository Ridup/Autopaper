package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("PAPER_ID =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("PAPER_ID <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("PAPER_ID >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAPER_ID >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("PAPER_ID <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAPER_ID <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("PAPER_ID in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("PAPER_ID not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_ID between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_ID not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("PAPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("PAPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("PAPER_NAME =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("PAPER_NAME <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("PAPER_NAME >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_NAME >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("PAPER_NAME <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("PAPER_NAME <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("PAPER_NAME like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("PAPER_NAME not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("PAPER_NAME in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("PAPER_NAME not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("PAPER_NAME between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("PAPER_NAME not between", value1, value2, "paperName");
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

        public Criteria andPaperDifficultyIsNull() {
            addCriterion("PAPER_DIFFICULTY is null");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIsNotNull() {
            addCriterion("PAPER_DIFFICULTY is not null");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyEqualTo(Integer value) {
            addCriterion("PAPER_DIFFICULTY =", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotEqualTo(Integer value) {
            addCriterion("PAPER_DIFFICULTY <>", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThan(Integer value) {
            addCriterion("PAPER_DIFFICULTY >", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAPER_DIFFICULTY >=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThan(Integer value) {
            addCriterion("PAPER_DIFFICULTY <", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("PAPER_DIFFICULTY <=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIn(List<Integer> values) {
            addCriterion("PAPER_DIFFICULTY in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotIn(List<Integer> values) {
            addCriterion("PAPER_DIFFICULTY not in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_DIFFICULTY between", value1, value2, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_DIFFICULTY not between", value1, value2, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperHotIsNull() {
            addCriterion("PAPER_HOT is null");
            return (Criteria) this;
        }

        public Criteria andPaperHotIsNotNull() {
            addCriterion("PAPER_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andPaperHotEqualTo(Integer value) {
            addCriterion("PAPER_HOT =", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotNotEqualTo(Integer value) {
            addCriterion("PAPER_HOT <>", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotGreaterThan(Integer value) {
            addCriterion("PAPER_HOT >", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAPER_HOT >=", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotLessThan(Integer value) {
            addCriterion("PAPER_HOT <", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotLessThanOrEqualTo(Integer value) {
            addCriterion("PAPER_HOT <=", value, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotIn(List<Integer> values) {
            addCriterion("PAPER_HOT in", values, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotNotIn(List<Integer> values) {
            addCriterion("PAPER_HOT not in", values, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_HOT between", value1, value2, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperHotNotBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_HOT not between", value1, value2, "paperHot");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdIsNull() {
            addCriterion("PAPER_GRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdIsNotNull() {
            addCriterion("PAPER_GRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdEqualTo(String value) {
            addCriterion("PAPER_GRADE_ID =", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotEqualTo(String value) {
            addCriterion("PAPER_GRADE_ID <>", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdGreaterThan(String value) {
            addCriterion("PAPER_GRADE_ID >", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE_ID >=", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdLessThan(String value) {
            addCriterion("PAPER_GRADE_ID <", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdLessThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE_ID <=", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdLike(String value) {
            addCriterion("PAPER_GRADE_ID like", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotLike(String value) {
            addCriterion("PAPER_GRADE_ID not like", value, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdIn(List<String> values) {
            addCriterion("PAPER_GRADE_ID in", values, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotIn(List<String> values) {
            addCriterion("PAPER_GRADE_ID not in", values, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE_ID between", value1, value2, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIdNotBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE_ID not between", value1, value2, "paperGradeId");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameIsNull() {
            addCriterion("PAPER_GRADE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameIsNotNull() {
            addCriterion("PAPER_GRADE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameEqualTo(String value) {
            addCriterion("PAPER_GRADE_NAME =", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameNotEqualTo(String value) {
            addCriterion("PAPER_GRADE_NAME <>", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameGreaterThan(String value) {
            addCriterion("PAPER_GRADE_NAME >", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE_NAME >=", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameLessThan(String value) {
            addCriterion("PAPER_GRADE_NAME <", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameLessThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE_NAME <=", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameLike(String value) {
            addCriterion("PAPER_GRADE_NAME like", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameNotLike(String value) {
            addCriterion("PAPER_GRADE_NAME not like", value, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameIn(List<String> values) {
            addCriterion("PAPER_GRADE_NAME in", values, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameNotIn(List<String> values) {
            addCriterion("PAPER_GRADE_NAME not in", values, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE_NAME between", value1, value2, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNameNotBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE_NAME not between", value1, value2, "paperGradeName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdIsNull() {
            addCriterion("PAPER_COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdIsNotNull() {
            addCriterion("PAPER_COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdEqualTo(String value) {
            addCriterion("PAPER_COURSE_ID =", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdNotEqualTo(String value) {
            addCriterion("PAPER_COURSE_ID <>", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdGreaterThan(String value) {
            addCriterion("PAPER_COURSE_ID >", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE_ID >=", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdLessThan(String value) {
            addCriterion("PAPER_COURSE_ID <", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdLessThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE_ID <=", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdLike(String value) {
            addCriterion("PAPER_COURSE_ID like", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdNotLike(String value) {
            addCriterion("PAPER_COURSE_ID not like", value, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdIn(List<String> values) {
            addCriterion("PAPER_COURSE_ID in", values, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdNotIn(List<String> values) {
            addCriterion("PAPER_COURSE_ID not in", values, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE_ID between", value1, value2, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIdNotBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE_ID not between", value1, value2, "paperCourseId");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameIsNull() {
            addCriterion("PAPER_COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameIsNotNull() {
            addCriterion("PAPER_COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameEqualTo(String value) {
            addCriterion("PAPER_COURSE_NAME =", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameNotEqualTo(String value) {
            addCriterion("PAPER_COURSE_NAME <>", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameGreaterThan(String value) {
            addCriterion("PAPER_COURSE_NAME >", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE_NAME >=", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameLessThan(String value) {
            addCriterion("PAPER_COURSE_NAME <", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameLessThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE_NAME <=", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameLike(String value) {
            addCriterion("PAPER_COURSE_NAME like", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameNotLike(String value) {
            addCriterion("PAPER_COURSE_NAME not like", value, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameIn(List<String> values) {
            addCriterion("PAPER_COURSE_NAME in", values, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameNotIn(List<String> values) {
            addCriterion("PAPER_COURSE_NAME not in", values, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE_NAME between", value1, value2, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNameNotBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE_NAME not between", value1, value2, "paperCourseName");
            return (Criteria) this;
        }

        public Criteria andPaperVersionIsNull() {
            addCriterion("PAPER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andPaperVersionIsNotNull() {
            addCriterion("PAPER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andPaperVersionEqualTo(String value) {
            addCriterion("PAPER_VERSION =", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionNotEqualTo(String value) {
            addCriterion("PAPER_VERSION <>", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionGreaterThan(String value) {
            addCriterion("PAPER_VERSION >", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_VERSION >=", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionLessThan(String value) {
            addCriterion("PAPER_VERSION <", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionLessThanOrEqualTo(String value) {
            addCriterion("PAPER_VERSION <=", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionLike(String value) {
            addCriterion("PAPER_VERSION like", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionNotLike(String value) {
            addCriterion("PAPER_VERSION not like", value, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionIn(List<String> values) {
            addCriterion("PAPER_VERSION in", values, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionNotIn(List<String> values) {
            addCriterion("PAPER_VERSION not in", values, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionBetween(String value1, String value2) {
            addCriterion("PAPER_VERSION between", value1, value2, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperVersionNotBetween(String value1, String value2) {
            addCriterion("PAPER_VERSION not between", value1, value2, "paperVersion");
            return (Criteria) this;
        }

        public Criteria andPaperScoresIsNull() {
            addCriterion("PAPER_SCORES is null");
            return (Criteria) this;
        }

        public Criteria andPaperScoresIsNotNull() {
            addCriterion("PAPER_SCORES is not null");
            return (Criteria) this;
        }

        public Criteria andPaperScoresEqualTo(String value) {
            addCriterion("PAPER_SCORES =", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresNotEqualTo(String value) {
            addCriterion("PAPER_SCORES <>", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresGreaterThan(String value) {
            addCriterion("PAPER_SCORES >", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_SCORES >=", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresLessThan(String value) {
            addCriterion("PAPER_SCORES <", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresLessThanOrEqualTo(String value) {
            addCriterion("PAPER_SCORES <=", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresLike(String value) {
            addCriterion("PAPER_SCORES like", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresNotLike(String value) {
            addCriterion("PAPER_SCORES not like", value, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresIn(List<String> values) {
            addCriterion("PAPER_SCORES in", values, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresNotIn(List<String> values) {
            addCriterion("PAPER_SCORES not in", values, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresBetween(String value1, String value2) {
            addCriterion("PAPER_SCORES between", value1, value2, "paperScores");
            return (Criteria) this;
        }

        public Criteria andPaperScoresNotBetween(String value1, String value2) {
            addCriterion("PAPER_SCORES not between", value1, value2, "paperScores");
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

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPaperUrlIsNull() {
            addCriterion("PAPER_URL is null");
            return (Criteria) this;
        }

        public Criteria andPaperUrlIsNotNull() {
            addCriterion("PAPER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPaperUrlEqualTo(String value) {
            addCriterion("PAPER_URL =", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlNotEqualTo(String value) {
            addCriterion("PAPER_URL <>", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlGreaterThan(String value) {
            addCriterion("PAPER_URL >", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_URL >=", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlLessThan(String value) {
            addCriterion("PAPER_URL <", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlLessThanOrEqualTo(String value) {
            addCriterion("PAPER_URL <=", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlLike(String value) {
            addCriterion("PAPER_URL like", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlNotLike(String value) {
            addCriterion("PAPER_URL not like", value, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlIn(List<String> values) {
            addCriterion("PAPER_URL in", values, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlNotIn(List<String> values) {
            addCriterion("PAPER_URL not in", values, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlBetween(String value1, String value2) {
            addCriterion("PAPER_URL between", value1, value2, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andPaperUrlNotBetween(String value1, String value2) {
            addCriterion("PAPER_URL not between", value1, value2, "paperUrl");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(Integer value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(Integer value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(Integer value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(Integer value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<Integer> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<Integer> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(Integer value1, Integer value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
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