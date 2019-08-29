package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendorAdvertPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorAdvertPlanExample() {
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

        public Criteria andVendorAdConfIdIsNull() {
            addCriterion("vendor_ad_conf_id is null");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdIsNotNull() {
            addCriterion("vendor_ad_conf_id is not null");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdEqualTo(Integer value) {
            addCriterion("vendor_ad_conf_id =", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdNotEqualTo(Integer value) {
            addCriterion("vendor_ad_conf_id <>", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdGreaterThan(Integer value) {
            addCriterion("vendor_ad_conf_id >", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vendor_ad_conf_id >=", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdLessThan(Integer value) {
            addCriterion("vendor_ad_conf_id <", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdLessThanOrEqualTo(Integer value) {
            addCriterion("vendor_ad_conf_id <=", value, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdIn(List<Integer> values) {
            addCriterion("vendor_ad_conf_id in", values, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdNotIn(List<Integer> values) {
            addCriterion("vendor_ad_conf_id not in", values, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdBetween(Integer value1, Integer value2) {
            addCriterion("vendor_ad_conf_id between", value1, value2, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andVendorAdConfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vendor_ad_conf_id not between", value1, value2, "vendorAdConfId");
            return (Criteria) this;
        }

        public Criteria andPollingIdIsNull() {
            addCriterion("polling_id is null");
            return (Criteria) this;
        }

        public Criteria andPollingIdIsNotNull() {
            addCriterion("polling_id is not null");
            return (Criteria) this;
        }

        public Criteria andPollingIdEqualTo(Integer value) {
            addCriterion("polling_id =", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdNotEqualTo(Integer value) {
            addCriterion("polling_id <>", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdGreaterThan(Integer value) {
            addCriterion("polling_id >", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("polling_id >=", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdLessThan(Integer value) {
            addCriterion("polling_id <", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdLessThanOrEqualTo(Integer value) {
            addCriterion("polling_id <=", value, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdIn(List<Integer> values) {
            addCriterion("polling_id in", values, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdNotIn(List<Integer> values) {
            addCriterion("polling_id not in", values, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdBetween(Integer value1, Integer value2) {
            addCriterion("polling_id between", value1, value2, "pollingId");
            return (Criteria) this;
        }

        public Criteria andPollingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("polling_id not between", value1, value2, "pollingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdIsNull() {
            addCriterion("timing_id is null");
            return (Criteria) this;
        }

        public Criteria andTimingIdIsNotNull() {
            addCriterion("timing_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimingIdEqualTo(Integer value) {
            addCriterion("timing_id =", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdNotEqualTo(Integer value) {
            addCriterion("timing_id <>", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdGreaterThan(Integer value) {
            addCriterion("timing_id >", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timing_id >=", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdLessThan(Integer value) {
            addCriterion("timing_id <", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdLessThanOrEqualTo(Integer value) {
            addCriterion("timing_id <=", value, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdIn(List<Integer> values) {
            addCriterion("timing_id in", values, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdNotIn(List<Integer> values) {
            addCriterion("timing_id not in", values, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdBetween(Integer value1, Integer value2) {
            addCriterion("timing_id between", value1, value2, "timingId");
            return (Criteria) this;
        }

        public Criteria andTimingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timing_id not between", value1, value2, "timingId");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1IsNull() {
            addCriterion("default_AD1 is null");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1IsNotNull() {
            addCriterion("default_AD1 is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1EqualTo(Integer value) {
            addCriterion("default_AD1 =", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1NotEqualTo(Integer value) {
            addCriterion("default_AD1 <>", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1GreaterThan(Integer value) {
            addCriterion("default_AD1 >", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1GreaterThanOrEqualTo(Integer value) {
            addCriterion("default_AD1 >=", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1LessThan(Integer value) {
            addCriterion("default_AD1 <", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1LessThanOrEqualTo(Integer value) {
            addCriterion("default_AD1 <=", value, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1In(List<Integer> values) {
            addCriterion("default_AD1 in", values, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1NotIn(List<Integer> values) {
            addCriterion("default_AD1 not in", values, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1Between(Integer value1, Integer value2) {
            addCriterion("default_AD1 between", value1, value2, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd1NotBetween(Integer value1, Integer value2) {
            addCriterion("default_AD1 not between", value1, value2, "defaultAd1");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2IsNull() {
            addCriterion("default_AD2 is null");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2IsNotNull() {
            addCriterion("default_AD2 is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2EqualTo(Integer value) {
            addCriterion("default_AD2 =", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2NotEqualTo(Integer value) {
            addCriterion("default_AD2 <>", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2GreaterThan(Integer value) {
            addCriterion("default_AD2 >", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2GreaterThanOrEqualTo(Integer value) {
            addCriterion("default_AD2 >=", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2LessThan(Integer value) {
            addCriterion("default_AD2 <", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2LessThanOrEqualTo(Integer value) {
            addCriterion("default_AD2 <=", value, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2In(List<Integer> values) {
            addCriterion("default_AD2 in", values, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2NotIn(List<Integer> values) {
            addCriterion("default_AD2 not in", values, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2Between(Integer value1, Integer value2) {
            addCriterion("default_AD2 between", value1, value2, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andDefaultAd2NotBetween(Integer value1, Integer value2) {
            addCriterion("default_AD2 not between", value1, value2, "defaultAd2");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchIsNull() {
            addCriterion("advertising_switch is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchIsNotNull() {
            addCriterion("advertising_switch is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchEqualTo(Integer value) {
            addCriterion("advertising_switch =", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchNotEqualTo(Integer value) {
            addCriterion("advertising_switch <>", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchGreaterThan(Integer value) {
            addCriterion("advertising_switch >", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertising_switch >=", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchLessThan(Integer value) {
            addCriterion("advertising_switch <", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("advertising_switch <=", value, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchIn(List<Integer> values) {
            addCriterion("advertising_switch in", values, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchNotIn(List<Integer> values) {
            addCriterion("advertising_switch not in", values, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchBetween(Integer value1, Integer value2) {
            addCriterion("advertising_switch between", value1, value2, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andAdvertisingSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("advertising_switch not between", value1, value2, "advertisingSwitch");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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