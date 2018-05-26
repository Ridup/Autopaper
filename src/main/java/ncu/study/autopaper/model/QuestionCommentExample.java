package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionCommentExample() {
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

        public Criteria andQuestionCommentIdIsNull() {
            addCriterion("QUESTION_COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdIsNotNull() {
            addCriterion("QUESTION_COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdEqualTo(Long value) {
            addCriterion("QUESTION_COMMENT_ID =", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotEqualTo(Long value) {
            addCriterion("QUESTION_COMMENT_ID <>", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdGreaterThan(Long value) {
            addCriterion("QUESTION_COMMENT_ID >", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTION_COMMENT_ID >=", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdLessThan(Long value) {
            addCriterion("QUESTION_COMMENT_ID <", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("QUESTION_COMMENT_ID <=", value, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdIn(List<Long> values) {
            addCriterion("QUESTION_COMMENT_ID in", values, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotIn(List<Long> values) {
            addCriterion("QUESTION_COMMENT_ID not in", values, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdBetween(Long value1, Long value2) {
            addCriterion("QUESTION_COMMENT_ID between", value1, value2, "questionCommentId");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_COMMENT_ID not between", value1, value2, "questionCommentId");
            return (Criteria) this;
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

        public Criteria andQuestionCommentTimeIsNull() {
            addCriterion("QUESTION_COMMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeIsNotNull() {
            addCriterion("QUESTION_COMMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeEqualTo(Date value) {
            addCriterion("QUESTION_COMMENT_TIME =", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeNotEqualTo(Date value) {
            addCriterion("QUESTION_COMMENT_TIME <>", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeGreaterThan(Date value) {
            addCriterion("QUESTION_COMMENT_TIME >", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("QUESTION_COMMENT_TIME >=", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeLessThan(Date value) {
            addCriterion("QUESTION_COMMENT_TIME <", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("QUESTION_COMMENT_TIME <=", value, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeIn(List<Date> values) {
            addCriterion("QUESTION_COMMENT_TIME in", values, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeNotIn(List<Date> values) {
            addCriterion("QUESTION_COMMENT_TIME not in", values, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeBetween(Date value1, Date value2) {
            addCriterion("QUESTION_COMMENT_TIME between", value1, value2, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("QUESTION_COMMENT_TIME not between", value1, value2, "questionCommentTime");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseIsNull() {
            addCriterion("QUESTION_COMMENT_PRAISE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseIsNotNull() {
            addCriterion("QUESTION_COMMENT_PRAISE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseEqualTo(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE =", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseNotEqualTo(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE <>", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseGreaterThan(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE >", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE >=", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseLessThan(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE <", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("QUESTION_COMMENT_PRAISE <=", value, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseIn(List<Integer> values) {
            addCriterion("QUESTION_COMMENT_PRAISE in", values, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseNotIn(List<Integer> values) {
            addCriterion("QUESTION_COMMENT_PRAISE not in", values, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_COMMENT_PRAISE between", value1, value2, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andQuestionCommentPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("QUESTION_COMMENT_PRAISE not between", value1, value2, "questionCommentPraise");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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