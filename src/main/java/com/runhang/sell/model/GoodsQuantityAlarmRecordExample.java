package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsQuantityAlarmRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsQuantityAlarmRecordExample() {
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

        public Criteria andVdIdIsNull() {
            addCriterion("vd_id is null");
            return (Criteria) this;
        }

        public Criteria andVdIdIsNotNull() {
            addCriterion("vd_id is not null");
            return (Criteria) this;
        }

        public Criteria andVdIdEqualTo(Integer value) {
            addCriterion("vd_id =", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotEqualTo(Integer value) {
            addCriterion("vd_id <>", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThan(Integer value) {
            addCriterion("vd_id >", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vd_id >=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThan(Integer value) {
            addCriterion("vd_id <", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThanOrEqualTo(Integer value) {
            addCriterion("vd_id <=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdIn(List<Integer> values) {
            addCriterion("vd_id in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotIn(List<Integer> values) {
            addCriterion("vd_id not in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdBetween(Integer value1, Integer value2) {
            addCriterion("vd_id between", value1, value2, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vd_id not between", value1, value2, "vdId");
            return (Criteria) this;
        }

        public Criteria andRpIdIsNull() {
            addCriterion("rp_id is null");
            return (Criteria) this;
        }

        public Criteria andRpIdIsNotNull() {
            addCriterion("rp_id is not null");
            return (Criteria) this;
        }

        public Criteria andRpIdEqualTo(Integer value) {
            addCriterion("rp_id =", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotEqualTo(Integer value) {
            addCriterion("rp_id <>", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThan(Integer value) {
            addCriterion("rp_id >", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rp_id >=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThan(Integer value) {
            addCriterion("rp_id <", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThanOrEqualTo(Integer value) {
            addCriterion("rp_id <=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdIn(List<Integer> values) {
            addCriterion("rp_id in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotIn(List<Integer> values) {
            addCriterion("rp_id not in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdBetween(Integer value1, Integer value2) {
            addCriterion("rp_id between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rp_id not between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityIsNull() {
            addCriterion("current_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityIsNotNull() {
            addCriterion("current_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityEqualTo(Integer value) {
            addCriterion("current_quantity =", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityNotEqualTo(Integer value) {
            addCriterion("current_quantity <>", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityGreaterThan(Integer value) {
            addCriterion("current_quantity >", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_quantity >=", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityLessThan(Integer value) {
            addCriterion("current_quantity <", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("current_quantity <=", value, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityIn(List<Integer> values) {
            addCriterion("current_quantity in", values, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityNotIn(List<Integer> values) {
            addCriterion("current_quantity not in", values, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityBetween(Integer value1, Integer value2) {
            addCriterion("current_quantity between", value1, value2, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andCurrentQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("current_quantity not between", value1, value2, "currentQuantity");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("alarm_time is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("alarm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("alarm_time =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("alarm_time <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("alarm_time >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_time >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("alarm_time <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_time <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("alarm_time in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("alarm_time not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("alarm_time between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_time not between", value1, value2, "alarmTime");
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