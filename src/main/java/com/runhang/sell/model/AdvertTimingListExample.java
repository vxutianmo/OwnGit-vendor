package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdvertTimingListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertTimingListExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAtapIdIsNull() {
            addCriterion("atap_id is null");
            return (Criteria) this;
        }

        public Criteria andAtapIdIsNotNull() {
            addCriterion("atap_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtapIdEqualTo(Integer value) {
            addCriterion("atap_id =", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdNotEqualTo(Integer value) {
            addCriterion("atap_id <>", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdGreaterThan(Integer value) {
            addCriterion("atap_id >", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("atap_id >=", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdLessThan(Integer value) {
            addCriterion("atap_id <", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdLessThanOrEqualTo(Integer value) {
            addCriterion("atap_id <=", value, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdIn(List<Integer> values) {
            addCriterion("atap_id in", values, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdNotIn(List<Integer> values) {
            addCriterion("atap_id not in", values, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdBetween(Integer value1, Integer value2) {
            addCriterion("atap_id between", value1, value2, "atapId");
            return (Criteria) this;
        }

        public Criteria andAtapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("atap_id not between", value1, value2, "atapId");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andTimerIsNull() {
            addCriterion("timer is null");
            return (Criteria) this;
        }

        public Criteria andTimerIsNotNull() {
            addCriterion("timer is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEqualTo(Date value) {
            addCriterionForJDBCTime("timer =", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotEqualTo(Date value) {
            addCriterionForJDBCTime("timer <>", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThan(Date value) {
            addCriterionForJDBCTime("timer >", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("timer >=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThan(Date value) {
            addCriterionForJDBCTime("timer <", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("timer <=", value, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerIn(List<Date> values) {
            addCriterionForJDBCTime("timer in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotIn(List<Date> values) {
            addCriterionForJDBCTime("timer not in", values, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("timer between", value1, value2, "timer");
            return (Criteria) this;
        }

        public Criteria andTimerNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("timer not between", value1, value2, "timer");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNull() {
            addCriterion("play_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayCountIsNotNull() {
            addCriterion("play_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCountEqualTo(Integer value) {
            addCriterion("play_count =", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotEqualTo(Integer value) {
            addCriterion("play_count <>", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThan(Integer value) {
            addCriterion("play_count >", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_count >=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThan(Integer value) {
            addCriterion("play_count <", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountLessThanOrEqualTo(Integer value) {
            addCriterion("play_count <=", value, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountIn(List<Integer> values) {
            addCriterion("play_count in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotIn(List<Integer> values) {
            addCriterion("play_count not in", values, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountBetween(Integer value1, Integer value2) {
            addCriterion("play_count between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("play_count not between", value1, value2, "playCount");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayIsNull() {
            addCriterion("play_count_today is null");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayIsNotNull() {
            addCriterion("play_count_today is not null");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayEqualTo(Integer value) {
            addCriterion("play_count_today =", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayNotEqualTo(Integer value) {
            addCriterion("play_count_today <>", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayGreaterThan(Integer value) {
            addCriterion("play_count_today >", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_count_today >=", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayLessThan(Integer value) {
            addCriterion("play_count_today <", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayLessThanOrEqualTo(Integer value) {
            addCriterion("play_count_today <=", value, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayIn(List<Integer> values) {
            addCriterion("play_count_today in", values, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayNotIn(List<Integer> values) {
            addCriterion("play_count_today not in", values, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayBetween(Integer value1, Integer value2) {
            addCriterion("play_count_today between", value1, value2, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andPlayCountTodayNotBetween(Integer value1, Integer value2) {
            addCriterion("play_count_today not between", value1, value2, "playCountToday");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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