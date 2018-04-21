package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBuggetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionBuggetExample() {
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

        public Criteria andQuestionCountIsNull() {
            addCriterion("QUESTION_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNotNull() {
            addCriterion("QUESTION_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountEqualTo(String value) {
            addCriterion("QUESTION_COUNT =", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotEqualTo(String value) {
            addCriterion("QUESTION_COUNT <>", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThan(String value) {
            addCriterion("QUESTION_COUNT >", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_COUNT >=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThan(String value) {
            addCriterion("QUESTION_COUNT <", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_COUNT <=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLike(String value) {
            addCriterion("QUESTION_COUNT like", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotLike(String value) {
            addCriterion("QUESTION_COUNT not like", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIn(List<String> values) {
            addCriterion("QUESTION_COUNT in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotIn(List<String> values) {
            addCriterion("QUESTION_COUNT not in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountBetween(String value1, String value2) {
            addCriterion("QUESTION_COUNT between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotBetween(String value1, String value2) {
            addCriterion("QUESTION_COUNT not between", value1, value2, "questionCount");
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

        public Criteria andQuestionScoreIsNull() {
            addCriterion("QUESTION_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNotNull() {
            addCriterion("QUESTION_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreEqualTo(String value) {
            addCriterion("QUESTION_SCORE =", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotEqualTo(String value) {
            addCriterion("QUESTION_SCORE <>", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThan(String value) {
            addCriterion("QUESTION_SCORE >", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_SCORE >=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThan(String value) {
            addCriterion("QUESTION_SCORE <", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_SCORE <=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLike(String value) {
            addCriterion("QUESTION_SCORE like", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotLike(String value) {
            addCriterion("QUESTION_SCORE not like", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIn(List<String> values) {
            addCriterion("QUESTION_SCORE in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotIn(List<String> values) {
            addCriterion("QUESTION_SCORE not in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreBetween(String value1, String value2) {
            addCriterion("QUESTION_SCORE between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotBetween(String value1, String value2) {
            addCriterion("QUESTION_SCORE not between", value1, value2, "questionScore");
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