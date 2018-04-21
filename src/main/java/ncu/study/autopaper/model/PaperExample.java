package ncu.study.autopaper.model;

import java.util.ArrayList;
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

        public Criteria andQuestionsIsNull() {
            addCriterion("QUESTIONS is null");
            return (Criteria) this;
        }

        public Criteria andQuestionsIsNotNull() {
            addCriterion("QUESTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionsEqualTo(String value) {
            addCriterion("QUESTIONS =", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotEqualTo(String value) {
            addCriterion("QUESTIONS <>", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsGreaterThan(String value) {
            addCriterion("QUESTIONS >", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTIONS >=", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLessThan(String value) {
            addCriterion("QUESTIONS <", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLessThanOrEqualTo(String value) {
            addCriterion("QUESTIONS <=", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsLike(String value) {
            addCriterion("QUESTIONS like", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotLike(String value) {
            addCriterion("QUESTIONS not like", value, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsIn(List<String> values) {
            addCriterion("QUESTIONS in", values, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotIn(List<String> values) {
            addCriterion("QUESTIONS not in", values, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsBetween(String value1, String value2) {
            addCriterion("QUESTIONS between", value1, value2, "questions");
            return (Criteria) this;
        }

        public Criteria andQuestionsNotBetween(String value1, String value2) {
            addCriterion("QUESTIONS not between", value1, value2, "questions");
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

        public Criteria andPaperGradeIsNull() {
            addCriterion("PAPER_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIsNotNull() {
            addCriterion("PAPER_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andPaperGradeEqualTo(String value) {
            addCriterion("PAPER_GRADE =", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNotEqualTo(String value) {
            addCriterion("PAPER_GRADE <>", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeGreaterThan(String value) {
            addCriterion("PAPER_GRADE >", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE >=", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeLessThan(String value) {
            addCriterion("PAPER_GRADE <", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeLessThanOrEqualTo(String value) {
            addCriterion("PAPER_GRADE <=", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeLike(String value) {
            addCriterion("PAPER_GRADE like", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNotLike(String value) {
            addCriterion("PAPER_GRADE not like", value, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeIn(List<String> values) {
            addCriterion("PAPER_GRADE in", values, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNotIn(List<String> values) {
            addCriterion("PAPER_GRADE not in", values, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE between", value1, value2, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperGradeNotBetween(String value1, String value2) {
            addCriterion("PAPER_GRADE not between", value1, value2, "paperGrade");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIsNull() {
            addCriterion("PAPER_COURSE is null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIsNotNull() {
            addCriterion("PAPER_COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCourseEqualTo(String value) {
            addCriterion("PAPER_COURSE =", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNotEqualTo(String value) {
            addCriterion("PAPER_COURSE <>", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseGreaterThan(String value) {
            addCriterion("PAPER_COURSE >", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE >=", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseLessThan(String value) {
            addCriterion("PAPER_COURSE <", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseLessThanOrEqualTo(String value) {
            addCriterion("PAPER_COURSE <=", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseLike(String value) {
            addCriterion("PAPER_COURSE like", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNotLike(String value) {
            addCriterion("PAPER_COURSE not like", value, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseIn(List<String> values) {
            addCriterion("PAPER_COURSE in", values, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNotIn(List<String> values) {
            addCriterion("PAPER_COURSE not in", values, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE between", value1, value2, "paperCourse");
            return (Criteria) this;
        }

        public Criteria andPaperCourseNotBetween(String value1, String value2) {
            addCriterion("PAPER_COURSE not between", value1, value2, "paperCourse");
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

        public Criteria andPaperItemsIsNull() {
            addCriterion("PAPER_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andPaperItemsIsNotNull() {
            addCriterion("PAPER_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andPaperItemsEqualTo(String value) {
            addCriterion("PAPER_ITEMS =", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsNotEqualTo(String value) {
            addCriterion("PAPER_ITEMS <>", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsGreaterThan(String value) {
            addCriterion("PAPER_ITEMS >", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_ITEMS >=", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsLessThan(String value) {
            addCriterion("PAPER_ITEMS <", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsLessThanOrEqualTo(String value) {
            addCriterion("PAPER_ITEMS <=", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsLike(String value) {
            addCriterion("PAPER_ITEMS like", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsNotLike(String value) {
            addCriterion("PAPER_ITEMS not like", value, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsIn(List<String> values) {
            addCriterion("PAPER_ITEMS in", values, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsNotIn(List<String> values) {
            addCriterion("PAPER_ITEMS not in", values, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsBetween(String value1, String value2) {
            addCriterion("PAPER_ITEMS between", value1, value2, "paperItems");
            return (Criteria) this;
        }

        public Criteria andPaperItemsNotBetween(String value1, String value2) {
            addCriterion("PAPER_ITEMS not between", value1, value2, "paperItems");
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

        public Criteria andItemTimeIsNull() {
            addCriterion("ITEM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andItemTimeIsNotNull() {
            addCriterion("ITEM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andItemTimeEqualTo(Integer value) {
            addCriterion("ITEM_TIME =", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotEqualTo(Integer value) {
            addCriterion("ITEM_TIME <>", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThan(Integer value) {
            addCriterion("ITEM_TIME >", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_TIME >=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThan(Integer value) {
            addCriterion("ITEM_TIME <", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_TIME <=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeIn(List<Integer> values) {
            addCriterion("ITEM_TIME in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotIn(List<Integer> values) {
            addCriterion("ITEM_TIME not in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_TIME between", value1, value2, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_TIME not between", value1, value2, "itemTime");
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