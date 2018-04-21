package ncu.study.autopaper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperTestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("TEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("TEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("TEST_ID =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("TEST_ID <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("TEST_ID >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_ID >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("TEST_ID <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_ID <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("TEST_ID in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("TEST_ID not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("TEST_ID between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_ID not between", value1, value2, "testId");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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

        public Criteria andWrongQuestionsIsNull() {
            addCriterion("WRONG_QUESTIONS is null");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsIsNotNull() {
            addCriterion("WRONG_QUESTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsEqualTo(String value) {
            addCriterion("WRONG_QUESTIONS =", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsNotEqualTo(String value) {
            addCriterion("WRONG_QUESTIONS <>", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsGreaterThan(String value) {
            addCriterion("WRONG_QUESTIONS >", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsGreaterThanOrEqualTo(String value) {
            addCriterion("WRONG_QUESTIONS >=", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsLessThan(String value) {
            addCriterion("WRONG_QUESTIONS <", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsLessThanOrEqualTo(String value) {
            addCriterion("WRONG_QUESTIONS <=", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsLike(String value) {
            addCriterion("WRONG_QUESTIONS like", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsNotLike(String value) {
            addCriterion("WRONG_QUESTIONS not like", value, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsIn(List<String> values) {
            addCriterion("WRONG_QUESTIONS in", values, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsNotIn(List<String> values) {
            addCriterion("WRONG_QUESTIONS not in", values, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsBetween(String value1, String value2) {
            addCriterion("WRONG_QUESTIONS between", value1, value2, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionsNotBetween(String value1, String value2) {
            addCriterion("WRONG_QUESTIONS not between", value1, value2, "wrongQuestions");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("ANSWER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("ANSWER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(Integer value) {
            addCriterion("ANSWER_TIME =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(Integer value) {
            addCriterion("ANSWER_TIME <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(Integer value) {
            addCriterion("ANSWER_TIME >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ANSWER_TIME >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(Integer value) {
            addCriterion("ANSWER_TIME <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ANSWER_TIME <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<Integer> values) {
            addCriterion("ANSWER_TIME in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<Integer> values) {
            addCriterion("ANSWER_TIME not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(Integer value1, Integer value2) {
            addCriterion("ANSWER_TIME between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ANSWER_TIME not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("TEST_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("TEST_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Integer value) {
            addCriterion("TEST_SCORE =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Integer value) {
            addCriterion("TEST_SCORE <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Integer value) {
            addCriterion("TEST_SCORE >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_SCORE >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Integer value) {
            addCriterion("TEST_SCORE <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_SCORE <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Integer> values) {
            addCriterion("TEST_SCORE in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Integer> values) {
            addCriterion("TEST_SCORE not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Integer value1, Integer value2) {
            addCriterion("TEST_SCORE between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_SCORE not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNull() {
            addCriterion("COST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNotNull() {
            addCriterion("COST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCostTimeEqualTo(Integer value) {
            addCriterion("COST_TIME =", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotEqualTo(Integer value) {
            addCriterion("COST_TIME <>", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThan(Integer value) {
            addCriterion("COST_TIME >", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_TIME >=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThan(Integer value) {
            addCriterion("COST_TIME <", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThanOrEqualTo(Integer value) {
            addCriterion("COST_TIME <=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeIn(List<Integer> values) {
            addCriterion("COST_TIME in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotIn(List<Integer> values) {
            addCriterion("COST_TIME not in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeBetween(Integer value1, Integer value2) {
            addCriterion("COST_TIME between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_TIME not between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andTestAnswerIsNull() {
            addCriterion("TEST_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andTestAnswerIsNotNull() {
            addCriterion("TEST_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andTestAnswerEqualTo(String value) {
            addCriterion("TEST_ANSWER =", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerNotEqualTo(String value) {
            addCriterion("TEST_ANSWER <>", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerGreaterThan(String value) {
            addCriterion("TEST_ANSWER >", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_ANSWER >=", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerLessThan(String value) {
            addCriterion("TEST_ANSWER <", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerLessThanOrEqualTo(String value) {
            addCriterion("TEST_ANSWER <=", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerLike(String value) {
            addCriterion("TEST_ANSWER like", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerNotLike(String value) {
            addCriterion("TEST_ANSWER not like", value, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerIn(List<String> values) {
            addCriterion("TEST_ANSWER in", values, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerNotIn(List<String> values) {
            addCriterion("TEST_ANSWER not in", values, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerBetween(String value1, String value2) {
            addCriterion("TEST_ANSWER between", value1, value2, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andTestAnswerNotBetween(String value1, String value2) {
            addCriterion("TEST_ANSWER not between", value1, value2, "testAnswer");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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