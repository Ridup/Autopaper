package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperFavExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperFavExample() {
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

        public Criteria andCollectTimeIsNull() {
            addCriterion("COLLECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("COLLECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("COLLECT_TIME =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("COLLECT_TIME <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("COLLECT_TIME >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COLLECT_TIME >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("COLLECT_TIME <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("COLLECT_TIME <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("COLLECT_TIME in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("COLLECT_TIME not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("COLLECT_TIME between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("COLLECT_TIME not between", value1, value2, "collectTime");
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

        public Criteria andPaperDifficultyEqualTo(Boolean value) {
            addCriterion("PAPER_DIFFICULTY =", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotEqualTo(Boolean value) {
            addCriterion("PAPER_DIFFICULTY <>", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThan(Boolean value) {
            addCriterion("PAPER_DIFFICULTY >", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PAPER_DIFFICULTY >=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThan(Boolean value) {
            addCriterion("PAPER_DIFFICULTY <", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyLessThanOrEqualTo(Boolean value) {
            addCriterion("PAPER_DIFFICULTY <=", value, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyIn(List<Boolean> values) {
            addCriterion("PAPER_DIFFICULTY in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotIn(List<Boolean> values) {
            addCriterion("PAPER_DIFFICULTY not in", values, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyBetween(Boolean value1, Boolean value2) {
            addCriterion("PAPER_DIFFICULTY between", value1, value2, "paperDifficulty");
            return (Criteria) this;
        }

        public Criteria andPaperDifficultyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PAPER_DIFFICULTY not between", value1, value2, "paperDifficulty");
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