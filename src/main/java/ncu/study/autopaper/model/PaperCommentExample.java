package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperCommentExample() {
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

        public Criteria andPaperCommentIdIsNull() {
            addCriterion("PAPER_COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdIsNotNull() {
            addCriterion("PAPER_COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdEqualTo(Long value) {
            addCriterion("PAPER_COMMENT_ID =", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdNotEqualTo(Long value) {
            addCriterion("PAPER_COMMENT_ID <>", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdGreaterThan(Long value) {
            addCriterion("PAPER_COMMENT_ID >", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAPER_COMMENT_ID >=", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdLessThan(Long value) {
            addCriterion("PAPER_COMMENT_ID <", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("PAPER_COMMENT_ID <=", value, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdIn(List<Long> values) {
            addCriterion("PAPER_COMMENT_ID in", values, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdNotIn(List<Long> values) {
            addCriterion("PAPER_COMMENT_ID not in", values, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdBetween(Long value1, Long value2) {
            addCriterion("PAPER_COMMENT_ID between", value1, value2, "paperCommentId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("PAPER_COMMENT_ID not between", value1, value2, "paperCommentId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("PAPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("PAPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Long value) {
            addCriterion("PAPER_ID =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Long value) {
            addCriterion("PAPER_ID <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Long value) {
            addCriterion("PAPER_ID >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAPER_ID >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Long value) {
            addCriterion("PAPER_ID <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Long value) {
            addCriterion("PAPER_ID <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Long> values) {
            addCriterion("PAPER_ID in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Long> values) {
            addCriterion("PAPER_ID not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Long value1, Long value2) {
            addCriterion("PAPER_ID between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Long value1, Long value2) {
            addCriterion("PAPER_ID not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIsNull() {
            addCriterion("PAPER_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIsNotNull() {
            addCriterion("PAPER_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentEqualTo(String value) {
            addCriterion("PAPER_COMMENT =", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotEqualTo(String value) {
            addCriterion("PAPER_COMMENT <>", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentGreaterThan(String value) {
            addCriterion("PAPER_COMMENT >", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_COMMENT >=", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLessThan(String value) {
            addCriterion("PAPER_COMMENT <", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLessThanOrEqualTo(String value) {
            addCriterion("PAPER_COMMENT <=", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentLike(String value) {
            addCriterion("PAPER_COMMENT like", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotLike(String value) {
            addCriterion("PAPER_COMMENT not like", value, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentIn(List<String> values) {
            addCriterion("PAPER_COMMENT in", values, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotIn(List<String> values) {
            addCriterion("PAPER_COMMENT not in", values, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentBetween(String value1, String value2) {
            addCriterion("PAPER_COMMENT between", value1, value2, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentNotBetween(String value1, String value2) {
            addCriterion("PAPER_COMMENT not between", value1, value2, "paperComment");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeIsNull() {
            addCriterion("PAPER_COMMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeIsNotNull() {
            addCriterion("PAPER_COMMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeEqualTo(Date value) {
            addCriterion("PAPER_COMMENT_TIME =", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeNotEqualTo(Date value) {
            addCriterion("PAPER_COMMENT_TIME <>", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeGreaterThan(Date value) {
            addCriterion("PAPER_COMMENT_TIME >", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAPER_COMMENT_TIME >=", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeLessThan(Date value) {
            addCriterion("PAPER_COMMENT_TIME <", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAPER_COMMENT_TIME <=", value, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeIn(List<Date> values) {
            addCriterion("PAPER_COMMENT_TIME in", values, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeNotIn(List<Date> values) {
            addCriterion("PAPER_COMMENT_TIME not in", values, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeBetween(Date value1, Date value2) {
            addCriterion("PAPER_COMMENT_TIME between", value1, value2, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAPER_COMMENT_TIME not between", value1, value2, "paperCommentTime");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseIsNull() {
            addCriterion("PAPER_COMMENT_PRAISE is null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseIsNotNull() {
            addCriterion("PAPER_COMMENT_PRAISE is not null");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseEqualTo(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE =", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseNotEqualTo(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE <>", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseGreaterThan(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE >", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE >=", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseLessThan(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE <", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("PAPER_COMMENT_PRAISE <=", value, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseIn(List<Integer> values) {
            addCriterion("PAPER_COMMENT_PRAISE in", values, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseNotIn(List<Integer> values) {
            addCriterion("PAPER_COMMENT_PRAISE not in", values, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_COMMENT_PRAISE between", value1, value2, "paperCommentPraise");
            return (Criteria) this;
        }

        public Criteria andPaperCommentPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("PAPER_COMMENT_PRAISE not between", value1, value2, "paperCommentPraise");
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