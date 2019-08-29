package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendorHeartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorHeartExample() {
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

        public Criteria andHeartTypeIsNull() {
            addCriterion("heart_type is null");
            return (Criteria) this;
        }

        public Criteria andHeartTypeIsNotNull() {
            addCriterion("heart_type is not null");
            return (Criteria) this;
        }

        public Criteria andHeartTypeEqualTo(Integer value) {
            addCriterion("heart_type =", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeNotEqualTo(Integer value) {
            addCriterion("heart_type <>", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeGreaterThan(Integer value) {
            addCriterion("heart_type >", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_type >=", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeLessThan(Integer value) {
            addCriterion("heart_type <", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("heart_type <=", value, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeIn(List<Integer> values) {
            addCriterion("heart_type in", values, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeNotIn(List<Integer> values) {
            addCriterion("heart_type not in", values, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeBetween(Integer value1, Integer value2) {
            addCriterion("heart_type between", value1, value2, "heartType");
            return (Criteria) this;
        }

        public Criteria andHeartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_type not between", value1, value2, "heartType");
            return (Criteria) this;
        }

        public Criteria andSignalIsNull() {
            addCriterion("signal is null");
            return (Criteria) this;
        }

        public Criteria andSignalIsNotNull() {
            addCriterion("signal is not null");
            return (Criteria) this;
        }

        public Criteria andSignalEqualTo(Integer value) {
            addCriterion("signal =", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotEqualTo(Integer value) {
            addCriterion("signal <>", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThan(Integer value) {
            addCriterion("signal >", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalGreaterThanOrEqualTo(Integer value) {
            addCriterion("signal >=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThan(Integer value) {
            addCriterion("signal <", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalLessThanOrEqualTo(Integer value) {
            addCriterion("signal <=", value, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalIn(List<Integer> values) {
            addCriterion("signal in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotIn(List<Integer> values) {
            addCriterion("signal not in", values, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalBetween(Integer value1, Integer value2) {
            addCriterion("signal between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andSignalNotBetween(Integer value1, Integer value2) {
            addCriterion("signal not between", value1, value2, "signal");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNull() {
            addCriterion("app_status is null");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNotNull() {
            addCriterion("app_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppStatusEqualTo(String value) {
            addCriterion("app_status =", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotEqualTo(String value) {
            addCriterion("app_status <>", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThan(String value) {
            addCriterion("app_status >", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThanOrEqualTo(String value) {
            addCriterion("app_status >=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThan(String value) {
            addCriterion("app_status <", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThanOrEqualTo(String value) {
            addCriterion("app_status <=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLike(String value) {
            addCriterion("app_status like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotLike(String value) {
            addCriterion("app_status not like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusIn(List<String> values) {
            addCriterion("app_status in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotIn(List<String> values) {
            addCriterion("app_status not in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusBetween(String value1, String value2) {
            addCriterion("app_status between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotBetween(String value1, String value2) {
            addCriterion("app_status not between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStateIsNull() {
            addCriterion("machine_state is null");
            return (Criteria) this;
        }

        public Criteria andMachineStateIsNotNull() {
            addCriterion("machine_state is not null");
            return (Criteria) this;
        }

        public Criteria andMachineStateEqualTo(String value) {
            addCriterion("machine_state =", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateNotEqualTo(String value) {
            addCriterion("machine_state <>", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateGreaterThan(String value) {
            addCriterion("machine_state >", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateGreaterThanOrEqualTo(String value) {
            addCriterion("machine_state >=", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateLessThan(String value) {
            addCriterion("machine_state <", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateLessThanOrEqualTo(String value) {
            addCriterion("machine_state <=", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateLike(String value) {
            addCriterion("machine_state like", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateNotLike(String value) {
            addCriterion("machine_state not like", value, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateIn(List<String> values) {
            addCriterion("machine_state in", values, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateNotIn(List<String> values) {
            addCriterion("machine_state not in", values, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateBetween(String value1, String value2) {
            addCriterion("machine_state between", value1, value2, "machineState");
            return (Criteria) this;
        }

        public Criteria andMachineStateNotBetween(String value1, String value2) {
            addCriterion("machine_state not between", value1, value2, "machineState");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureIsNull() {
            addCriterion("vmcTemperature is null");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureIsNotNull() {
            addCriterion("vmcTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureEqualTo(String value) {
            addCriterion("vmcTemperature =", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureNotEqualTo(String value) {
            addCriterion("vmcTemperature <>", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureGreaterThan(String value) {
            addCriterion("vmcTemperature >", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("vmcTemperature >=", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureLessThan(String value) {
            addCriterion("vmcTemperature <", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureLessThanOrEqualTo(String value) {
            addCriterion("vmcTemperature <=", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureLike(String value) {
            addCriterion("vmcTemperature like", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureNotLike(String value) {
            addCriterion("vmcTemperature not like", value, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureIn(List<String> values) {
            addCriterion("vmcTemperature in", values, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureNotIn(List<String> values) {
            addCriterion("vmcTemperature not in", values, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureBetween(String value1, String value2) {
            addCriterion("vmcTemperature between", value1, value2, "vmctemperature");
            return (Criteria) this;
        }

        public Criteria andVmctemperatureNotBetween(String value1, String value2) {
            addCriterion("vmcTemperature not between", value1, value2, "vmctemperature");
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