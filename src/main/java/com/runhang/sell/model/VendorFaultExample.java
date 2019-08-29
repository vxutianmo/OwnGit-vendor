package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendorFaultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorFaultExample() {
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

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNull() {
            addCriterion("fault_name is null");
            return (Criteria) this;
        }

        public Criteria andFaultNameIsNotNull() {
            addCriterion("fault_name is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNameEqualTo(String value) {
            addCriterion("fault_name =", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotEqualTo(String value) {
            addCriterion("fault_name <>", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThan(String value) {
            addCriterion("fault_name >", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameGreaterThanOrEqualTo(String value) {
            addCriterion("fault_name >=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThan(String value) {
            addCriterion("fault_name <", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLessThanOrEqualTo(String value) {
            addCriterion("fault_name <=", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameLike(String value) {
            addCriterion("fault_name like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotLike(String value) {
            addCriterion("fault_name not like", value, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameIn(List<String> values) {
            addCriterion("fault_name in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotIn(List<String> values) {
            addCriterion("fault_name not in", values, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameBetween(String value1, String value2) {
            addCriterion("fault_name between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultNameNotBetween(String value1, String value2) {
            addCriterion("fault_name not between", value1, value2, "faultName");
            return (Criteria) this;
        }

        public Criteria andFaultReasonIsNull() {
            addCriterion("fault_reason is null");
            return (Criteria) this;
        }

        public Criteria andFaultReasonIsNotNull() {
            addCriterion("fault_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFaultReasonEqualTo(String value) {
            addCriterion("fault_reason =", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonNotEqualTo(String value) {
            addCriterion("fault_reason <>", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonGreaterThan(String value) {
            addCriterion("fault_reason >", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonGreaterThanOrEqualTo(String value) {
            addCriterion("fault_reason >=", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonLessThan(String value) {
            addCriterion("fault_reason <", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonLessThanOrEqualTo(String value) {
            addCriterion("fault_reason <=", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonLike(String value) {
            addCriterion("fault_reason like", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonNotLike(String value) {
            addCriterion("fault_reason not like", value, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonIn(List<String> values) {
            addCriterion("fault_reason in", values, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonNotIn(List<String> values) {
            addCriterion("fault_reason not in", values, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonBetween(String value1, String value2) {
            addCriterion("fault_reason between", value1, value2, "faultReason");
            return (Criteria) this;
        }

        public Criteria andFaultReasonNotBetween(String value1, String value2) {
            addCriterion("fault_reason not between", value1, value2, "faultReason");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingIsNull() {
            addCriterion("trouble_shooting is null");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingIsNotNull() {
            addCriterion("trouble_shooting is not null");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingEqualTo(String value) {
            addCriterion("trouble_shooting =", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingNotEqualTo(String value) {
            addCriterion("trouble_shooting <>", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingGreaterThan(String value) {
            addCriterion("trouble_shooting >", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingGreaterThanOrEqualTo(String value) {
            addCriterion("trouble_shooting >=", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingLessThan(String value) {
            addCriterion("trouble_shooting <", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingLessThanOrEqualTo(String value) {
            addCriterion("trouble_shooting <=", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingLike(String value) {
            addCriterion("trouble_shooting like", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingNotLike(String value) {
            addCriterion("trouble_shooting not like", value, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingIn(List<String> values) {
            addCriterion("trouble_shooting in", values, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingNotIn(List<String> values) {
            addCriterion("trouble_shooting not in", values, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingBetween(String value1, String value2) {
            addCriterion("trouble_shooting between", value1, value2, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andTroubleShootingNotBetween(String value1, String value2) {
            addCriterion("trouble_shooting not between", value1, value2, "troubleShooting");
            return (Criteria) this;
        }

        public Criteria andFaultStatusIsNull() {
            addCriterion("fault_status is null");
            return (Criteria) this;
        }

        public Criteria andFaultStatusIsNotNull() {
            addCriterion("fault_status is not null");
            return (Criteria) this;
        }

        public Criteria andFaultStatusEqualTo(Integer value) {
            addCriterion("fault_status =", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusNotEqualTo(Integer value) {
            addCriterion("fault_status <>", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusGreaterThan(Integer value) {
            addCriterion("fault_status >", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_status >=", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusLessThan(Integer value) {
            addCriterion("fault_status <", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fault_status <=", value, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusIn(List<Integer> values) {
            addCriterion("fault_status in", values, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusNotIn(List<Integer> values) {
            addCriterion("fault_status not in", values, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusBetween(Integer value1, Integer value2) {
            addCriterion("fault_status between", value1, value2, "faultStatus");
            return (Criteria) this;
        }

        public Criteria andFaultStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_status not between", value1, value2, "faultStatus");
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

        public Criteria andFaultPhotoIsNull() {
            addCriterion("fault_photo is null");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoIsNotNull() {
            addCriterion("fault_photo is not null");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoEqualTo(Integer value) {
            addCriterion("fault_photo =", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoNotEqualTo(Integer value) {
            addCriterion("fault_photo <>", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoGreaterThan(Integer value) {
            addCriterion("fault_photo >", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_photo >=", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoLessThan(Integer value) {
            addCriterion("fault_photo <", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("fault_photo <=", value, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoIn(List<Integer> values) {
            addCriterion("fault_photo in", values, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoNotIn(List<Integer> values) {
            addCriterion("fault_photo not in", values, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoBetween(Integer value1, Integer value2) {
            addCriterion("fault_photo between", value1, value2, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_photo not between", value1, value2, "faultPhoto");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIsNull() {
            addCriterion("fault_time is null");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIsNotNull() {
            addCriterion("fault_time is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTimeEqualTo(Date value) {
            addCriterion("fault_time =", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotEqualTo(Date value) {
            addCriterion("fault_time <>", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeGreaterThan(Date value) {
            addCriterion("fault_time >", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fault_time >=", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeLessThan(Date value) {
            addCriterion("fault_time <", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeLessThanOrEqualTo(Date value) {
            addCriterion("fault_time <=", value, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeIn(List<Date> values) {
            addCriterion("fault_time in", values, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotIn(List<Date> values) {
            addCriterion("fault_time not in", values, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeBetween(Date value1, Date value2) {
            addCriterion("fault_time between", value1, value2, "faultTime");
            return (Criteria) this;
        }

        public Criteria andFaultTimeNotBetween(Date value1, Date value2) {
            addCriterion("fault_time not between", value1, value2, "faultTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIsNull() {
            addCriterion("last_heartbeat_time is null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIsNotNull() {
            addCriterion("last_heartbeat_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeEqualTo(Date value) {
            addCriterion("last_heartbeat_time =", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotEqualTo(Date value) {
            addCriterion("last_heartbeat_time <>", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeGreaterThan(Date value) {
            addCriterion("last_heartbeat_time >", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_heartbeat_time >=", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeLessThan(Date value) {
            addCriterion("last_heartbeat_time <", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_heartbeat_time <=", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIn(List<Date> values) {
            addCriterion("last_heartbeat_time in", values, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotIn(List<Date> values) {
            addCriterion("last_heartbeat_time not in", values, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeBetween(Date value1, Date value2) {
            addCriterion("last_heartbeat_time between", value1, value2, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_heartbeat_time not between", value1, value2, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeIsNull() {
            addCriterion("solve_time is null");
            return (Criteria) this;
        }

        public Criteria andSolveTimeIsNotNull() {
            addCriterion("solve_time is not null");
            return (Criteria) this;
        }

        public Criteria andSolveTimeEqualTo(Date value) {
            addCriterion("solve_time =", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeNotEqualTo(Date value) {
            addCriterion("solve_time <>", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeGreaterThan(Date value) {
            addCriterion("solve_time >", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("solve_time >=", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeLessThan(Date value) {
            addCriterion("solve_time <", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeLessThanOrEqualTo(Date value) {
            addCriterion("solve_time <=", value, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeIn(List<Date> values) {
            addCriterion("solve_time in", values, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeNotIn(List<Date> values) {
            addCriterion("solve_time not in", values, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeBetween(Date value1, Date value2) {
            addCriterion("solve_time between", value1, value2, "solveTime");
            return (Criteria) this;
        }

        public Criteria andSolveTimeNotBetween(Date value1, Date value2) {
            addCriterion("solve_time not between", value1, value2, "solveTime");
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