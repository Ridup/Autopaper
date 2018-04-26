package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("QUESTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("QUESTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(String value) {
            addCriterion("QUESTION_TYPE =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(String value) {
            addCriterion("QUESTION_TYPE <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(String value) {
            addCriterion("QUESTION_TYPE >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_TYPE >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(String value) {
            addCriterion("QUESTION_TYPE <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_TYPE <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLike(String value) {
            addCriterion("QUESTION_TYPE like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotLike(String value) {
            addCriterion("QUESTION_TYPE not like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<String> values) {
            addCriterion("QUESTION_TYPE in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<String> values) {
            addCriterion("QUESTION_TYPE not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(String value1, String value2) {
            addCriterion("QUESTION_TYPE between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(String value1, String value2) {
            addCriterion("QUESTION_TYPE not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionClassIsNull() {
            addCriterion("QUESTION_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andQuestionClassIsNotNull() {
            addCriterion("QUESTION_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionClassEqualTo(String value) {
            addCriterion("QUESTION_CLASS =", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassNotEqualTo(String value) {
            addCriterion("QUESTION_CLASS <>", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassGreaterThan(String value) {
            addCriterion("QUESTION_CLASS >", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_CLASS >=", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassLessThan(String value) {
            addCriterion("QUESTION_CLASS <", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_CLASS <=", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassLike(String value) {
            addCriterion("QUESTION_CLASS like", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassNotLike(String value) {
            addCriterion("QUESTION_CLASS not like", value, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassIn(List<String> values) {
            addCriterion("QUESTION_CLASS in", values, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassNotIn(List<String> values) {
            addCriterion("QUESTION_CLASS not in", values, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassBetween(String value1, String value2) {
            addCriterion("QUESTION_CLASS between", value1, value2, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionClassNotBetween(String value1, String value2) {
            addCriterion("QUESTION_CLASS not between", value1, value2, "questionClass");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyIsNull() {
            addCriterion("QUESTION_DIFFICULTY is null");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyIsNotNull() {
            addCriterion("QUESTION_DIFFICULTY is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyEqualTo(Integer value) {
            addCriterion("QUESTION_DIFFICULTY =", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyNotEqualTo(Integer value) {
            addCriterion("QUESTION_DIFFICULTY <>", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyGreaterThan(Integer value) {
            addCriterion("QUESTION_DIFFICULTY >", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_DIFFICULTY >=", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyLessThan(Integer value) {
            addCriterion("QUESTION_DIFFICULTY <", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_DIFFICULTY <=", value, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyIn(List<Integer> values) {
            addCriterion("QUESTION_DIFFICULTY in", values, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyNotIn(List<Integer> values) {
            addCriterion("QUESTION_DIFFICULTY not in", values, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_DIFFICULTY between", value1, value2, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andQuestionDifficultyNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_DIFFICULTY not between", value1, value2, "questionDifficulty");
            return (Criteria) this;
        }

        public Criteria andPointNumberIsNull() {
            addCriterion("POINT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPointNumberIsNotNull() {
            addCriterion("POINT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPointNumberEqualTo(Integer value) {
            addCriterion("POINT_NUMBER =", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberNotEqualTo(Integer value) {
            addCriterion("POINT_NUMBER <>", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberGreaterThan(Integer value) {
            addCriterion("POINT_NUMBER >", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("POINT_NUMBER >=", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberLessThan(Integer value) {
            addCriterion("POINT_NUMBER <", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberLessThanOrEqualTo(Integer value) {
            addCriterion("POINT_NUMBER <=", value, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberIn(List<Integer> values) {
            addCriterion("POINT_NUMBER in", values, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberNotIn(List<Integer> values) {
            addCriterion("POINT_NUMBER not in", values, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberBetween(Integer value1, Integer value2) {
            addCriterion("POINT_NUMBER between", value1, value2, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("POINT_NUMBER not between", value1, value2, "pointNumber");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("POINT is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(String value) {
            addCriterion("POINT =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(String value) {
            addCriterion("POINT <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(String value) {
            addCriterion("POINT >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(String value) {
            addCriterion("POINT >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(String value) {
            addCriterion("POINT <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(String value) {
            addCriterion("POINT <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLike(String value) {
            addCriterion("POINT like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotLike(String value) {
            addCriterion("POINT not like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<String> values) {
            addCriterion("POINT in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<String> values) {
            addCriterion("POINT not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(String value1, String value2) {
            addCriterion("POINT between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(String value1, String value2) {
            addCriterion("POINT not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUsetimesIsNull() {
            addCriterion("USETIMES is null");
            return (Criteria) this;
        }

        public Criteria andUsetimesIsNotNull() {
            addCriterion("USETIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUsetimesEqualTo(Long value) {
            addCriterion("USETIMES =", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesNotEqualTo(Long value) {
            addCriterion("USETIMES <>", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesGreaterThan(Long value) {
            addCriterion("USETIMES >", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesGreaterThanOrEqualTo(Long value) {
            addCriterion("USETIMES >=", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesLessThan(Long value) {
            addCriterion("USETIMES <", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesLessThanOrEqualTo(Long value) {
            addCriterion("USETIMES <=", value, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesIn(List<Long> values) {
            addCriterion("USETIMES in", values, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesNotIn(List<Long> values) {
            addCriterion("USETIMES not in", values, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesBetween(Long value1, Long value2) {
            addCriterion("USETIMES between", value1, value2, "usetimes");
            return (Criteria) this;
        }

        public Criteria andUsetimesNotBetween(Long value1, Long value2) {
            addCriterion("USETIMES not between", value1, value2, "usetimes");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNull() {
            addCriterion("QUESTION_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNotNull() {
            addCriterion("QUESTION_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreEqualTo(Integer value) {
            addCriterion("QUESTION_SCORE =", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotEqualTo(Integer value) {
            addCriterion("QUESTION_SCORE <>", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThan(Integer value) {
            addCriterion("QUESTION_SCORE >", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_SCORE >=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThan(Integer value) {
            addCriterion("QUESTION_SCORE <", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_SCORE <=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIn(List<Integer> values) {
            addCriterion("QUESTION_SCORE in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotIn(List<Integer> values) {
            addCriterion("QUESTION_SCORE not in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_SCORE between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_SCORE not between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNull() {
            addCriterion("QUESTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNotNull() {
            addCriterion("QUESTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeEqualTo(Integer value) {
            addCriterion("QUESTION_TIME =", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotEqualTo(Integer value) {
            addCriterion("QUESTION_TIME <>", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThan(Integer value) {
            addCriterion("QUESTION_TIME >", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_TIME >=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThan(Integer value) {
            addCriterion("QUESTION_TIME <", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_TIME <=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIn(List<Integer> values) {
            addCriterion("QUESTION_TIME in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotIn(List<Integer> values) {
            addCriterion("QUESTION_TIME not in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_TIME between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_TIME not between", value1, value2, "questionTime");
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

        public Criteria andVersionNameIsNull() {
            addCriterion("VERSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNotNull() {
            addCriterion("VERSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNameEqualTo(String value) {
            addCriterion("VERSION_NAME =", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotEqualTo(String value) {
            addCriterion("VERSION_NAME <>", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThan(String value) {
            addCriterion("VERSION_NAME >", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_NAME >=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThan(String value) {
            addCriterion("VERSION_NAME <", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThanOrEqualTo(String value) {
            addCriterion("VERSION_NAME <=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLike(String value) {
            addCriterion("VERSION_NAME like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotLike(String value) {
            addCriterion("VERSION_NAME not like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameIn(List<String> values) {
            addCriterion("VERSION_NAME in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotIn(List<String> values) {
            addCriterion("VERSION_NAME not in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameBetween(String value1, String value2) {
            addCriterion("VERSION_NAME between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotBetween(String value1, String value2) {
            addCriterion("VERSION_NAME not between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNull() {
            addCriterion("CHAPTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("CHAPTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("CHAPTER_NAME =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("CHAPTER_NAME <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("CHAPTER_NAME >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_NAME >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("CHAPTER_NAME <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_NAME <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("CHAPTER_NAME like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("CHAPTER_NAME not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("CHAPTER_NAME in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("CHAPTER_NAME not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("CHAPTER_NAME between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_NAME not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andSelectionAIsNull() {
            addCriterion("SELECTION_A is null");
            return (Criteria) this;
        }

        public Criteria andSelectionAIsNotNull() {
            addCriterion("SELECTION_A is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionAEqualTo(String value) {
            addCriterion("SELECTION_A =", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionANotEqualTo(String value) {
            addCriterion("SELECTION_A <>", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionAGreaterThan(String value) {
            addCriterion("SELECTION_A >", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionAGreaterThanOrEqualTo(String value) {
            addCriterion("SELECTION_A >=", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionALessThan(String value) {
            addCriterion("SELECTION_A <", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionALessThanOrEqualTo(String value) {
            addCriterion("SELECTION_A <=", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionALike(String value) {
            addCriterion("SELECTION_A like", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionANotLike(String value) {
            addCriterion("SELECTION_A not like", value, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionAIn(List<String> values) {
            addCriterion("SELECTION_A in", values, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionANotIn(List<String> values) {
            addCriterion("SELECTION_A not in", values, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionABetween(String value1, String value2) {
            addCriterion("SELECTION_A between", value1, value2, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionANotBetween(String value1, String value2) {
            addCriterion("SELECTION_A not between", value1, value2, "selectionA");
            return (Criteria) this;
        }

        public Criteria andSelectionBIsNull() {
            addCriterion("SELECTION_B is null");
            return (Criteria) this;
        }

        public Criteria andSelectionBIsNotNull() {
            addCriterion("SELECTION_B is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionBEqualTo(String value) {
            addCriterion("SELECTION_B =", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBNotEqualTo(String value) {
            addCriterion("SELECTION_B <>", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBGreaterThan(String value) {
            addCriterion("SELECTION_B >", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBGreaterThanOrEqualTo(String value) {
            addCriterion("SELECTION_B >=", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBLessThan(String value) {
            addCriterion("SELECTION_B <", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBLessThanOrEqualTo(String value) {
            addCriterion("SELECTION_B <=", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBLike(String value) {
            addCriterion("SELECTION_B like", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBNotLike(String value) {
            addCriterion("SELECTION_B not like", value, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBIn(List<String> values) {
            addCriterion("SELECTION_B in", values, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBNotIn(List<String> values) {
            addCriterion("SELECTION_B not in", values, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBBetween(String value1, String value2) {
            addCriterion("SELECTION_B between", value1, value2, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionBNotBetween(String value1, String value2) {
            addCriterion("SELECTION_B not between", value1, value2, "selectionB");
            return (Criteria) this;
        }

        public Criteria andSelectionCIsNull() {
            addCriterion("SELECTION_C is null");
            return (Criteria) this;
        }

        public Criteria andSelectionCIsNotNull() {
            addCriterion("SELECTION_C is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionCEqualTo(String value) {
            addCriterion("SELECTION_C =", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCNotEqualTo(String value) {
            addCriterion("SELECTION_C <>", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCGreaterThan(String value) {
            addCriterion("SELECTION_C >", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCGreaterThanOrEqualTo(String value) {
            addCriterion("SELECTION_C >=", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCLessThan(String value) {
            addCriterion("SELECTION_C <", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCLessThanOrEqualTo(String value) {
            addCriterion("SELECTION_C <=", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCLike(String value) {
            addCriterion("SELECTION_C like", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCNotLike(String value) {
            addCriterion("SELECTION_C not like", value, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCIn(List<String> values) {
            addCriterion("SELECTION_C in", values, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCNotIn(List<String> values) {
            addCriterion("SELECTION_C not in", values, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCBetween(String value1, String value2) {
            addCriterion("SELECTION_C between", value1, value2, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionCNotBetween(String value1, String value2) {
            addCriterion("SELECTION_C not between", value1, value2, "selectionC");
            return (Criteria) this;
        }

        public Criteria andSelectionDIsNull() {
            addCriterion("SELECTION_D is null");
            return (Criteria) this;
        }

        public Criteria andSelectionDIsNotNull() {
            addCriterion("SELECTION_D is not null");
            return (Criteria) this;
        }

        public Criteria andSelectionDEqualTo(String value) {
            addCriterion("SELECTION_D =", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDNotEqualTo(String value) {
            addCriterion("SELECTION_D <>", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDGreaterThan(String value) {
            addCriterion("SELECTION_D >", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDGreaterThanOrEqualTo(String value) {
            addCriterion("SELECTION_D >=", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDLessThan(String value) {
            addCriterion("SELECTION_D <", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDLessThanOrEqualTo(String value) {
            addCriterion("SELECTION_D <=", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDLike(String value) {
            addCriterion("SELECTION_D like", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDNotLike(String value) {
            addCriterion("SELECTION_D not like", value, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDIn(List<String> values) {
            addCriterion("SELECTION_D in", values, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDNotIn(List<String> values) {
            addCriterion("SELECTION_D not in", values, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDBetween(String value1, String value2) {
            addCriterion("SELECTION_D between", value1, value2, "selectionD");
            return (Criteria) this;
        }

        public Criteria andSelectionDNotBetween(String value1, String value2) {
            addCriterion("SELECTION_D not between", value1, value2, "selectionD");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("ANSWER =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("ANSWER <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("ANSWER >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("ANSWER >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("ANSWER <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("ANSWER <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("ANSWER like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("ANSWER not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("ANSWER in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("ANSWER not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("ANSWER between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("ANSWER not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("ANALYSIS =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("ANALYSIS <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("ANALYSIS >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("ANALYSIS <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("ANALYSIS like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("ANALYSIS not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("ANALYSIS in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("ANALYSIS not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("ANALYSIS between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS not between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andQuestionHotIsNull() {
            addCriterion("QUESTION_HOT is null");
            return (Criteria) this;
        }

        public Criteria andQuestionHotIsNotNull() {
            addCriterion("QUESTION_HOT is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionHotEqualTo(Long value) {
            addCriterion("QUESTION_HOT =", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotNotEqualTo(Long value) {
            addCriterion("QUESTION_HOT <>", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotGreaterThan(Long value) {
            addCriterion("QUESTION_HOT >", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTION_HOT >=", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotLessThan(Long value) {
            addCriterion("QUESTION_HOT <", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotLessThanOrEqualTo(Long value) {
            addCriterion("QUESTION_HOT <=", value, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotIn(List<Long> values) {
            addCriterion("QUESTION_HOT in", values, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotNotIn(List<Long> values) {
            addCriterion("QUESTION_HOT not in", values, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_HOT between", value1, value2, "questionHot");
            return (Criteria) this;
        }

        public Criteria andQuestionHotNotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_HOT not between", value1, value2, "questionHot");
            return (Criteria) this;
        }

        public Criteria andOwnnerIsNull() {
            addCriterion("OWNNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnnerIsNotNull() {
            addCriterion("OWNNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnnerEqualTo(Integer value) {
            addCriterion("OWNNER =", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerNotEqualTo(Integer value) {
            addCriterion("OWNNER <>", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerGreaterThan(Integer value) {
            addCriterion("OWNNER >", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNNER >=", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerLessThan(Integer value) {
            addCriterion("OWNNER <", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerLessThanOrEqualTo(Integer value) {
            addCriterion("OWNNER <=", value, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerIn(List<Integer> values) {
            addCriterion("OWNNER in", values, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerNotIn(List<Integer> values) {
            addCriterion("OWNNER not in", values, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerBetween(Integer value1, Integer value2) {
            addCriterion("OWNNER between", value1, value2, "ownner");
            return (Criteria) this;
        }

        public Criteria andOwnnerNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNNER not between", value1, value2, "ownner");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIsNull() {
            addCriterion("QUESTION_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIsNotNull() {
            addCriterion("QUESTION_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentEqualTo(String value) {
            addCriterion("QUESTION_COMMENT =", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentNotEqualTo(String value) {
            addCriterion("QUESTION_COMMENT <>", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentGreaterThan(String value) {
            addCriterion("QUESTION_COMMENT >", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_COMMENT >=", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLessThan(String value) {
            addCriterion("QUESTION_COMMENT <", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_COMMENT <=", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentLike(String value) {
            addCriterion("QUESTION_COMMENT like", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentNotLike(String value) {
            addCriterion("QUESTION_COMMENT not like", value, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIn(List<String> values) {
            addCriterion("QUESTION_COMMENT in", values, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentNotIn(List<String> values) {
            addCriterion("QUESTION_COMMENT not in", values, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentBetween(String value1, String value2) {
            addCriterion("QUESTION_COMMENT between", value1, value2, "questionComment");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentNotBetween(String value1, String value2) {
            addCriterion("QUESTION_COMMENT not between", value1, value2, "questionComment");
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