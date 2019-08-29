package com.runhang.sell.model.pointMagicBoxExchange;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberConsumpRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberConsumpRecordExample() {
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

        public Criteria andIntegralMemberIdIsNull() {
            addCriterion("integral_member_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdIsNotNull() {
            addCriterion("integral_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdEqualTo(Integer value) {
            addCriterion("integral_member_id =", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdNotEqualTo(Integer value) {
            addCriterion("integral_member_id <>", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdGreaterThan(Integer value) {
            addCriterion("integral_member_id >", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_member_id >=", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdLessThan(Integer value) {
            addCriterion("integral_member_id <", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("integral_member_id <=", value, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdIn(List<Integer> values) {
            addCriterion("integral_member_id in", values, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdNotIn(List<Integer> values) {
            addCriterion("integral_member_id not in", values, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("integral_member_id between", value1, value2, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andIntegralMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_member_id not between", value1, value2, "integralMemberId");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsIsNull() {
            addCriterion("pre_game_points is null");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsIsNotNull() {
            addCriterion("pre_game_points is not null");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsEqualTo(Long value) {
            addCriterion("pre_game_points =", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsNotEqualTo(Long value) {
            addCriterion("pre_game_points <>", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsGreaterThan(Long value) {
            addCriterion("pre_game_points >", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_game_points >=", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsLessThan(Long value) {
            addCriterion("pre_game_points <", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsLessThanOrEqualTo(Long value) {
            addCriterion("pre_game_points <=", value, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsIn(List<Long> values) {
            addCriterion("pre_game_points in", values, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsNotIn(List<Long> values) {
            addCriterion("pre_game_points not in", values, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsBetween(Long value1, Long value2) {
            addCriterion("pre_game_points between", value1, value2, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andPreGamePointsNotBetween(Long value1, Long value2) {
            addCriterion("pre_game_points not between", value1, value2, "preGamePoints");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralIsNull() {
            addCriterion("consump_integral is null");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralIsNotNull() {
            addCriterion("consump_integral is not null");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralEqualTo(Long value) {
            addCriterion("consump_integral =", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralNotEqualTo(Long value) {
            addCriterion("consump_integral <>", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralGreaterThan(Long value) {
            addCriterion("consump_integral >", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralGreaterThanOrEqualTo(Long value) {
            addCriterion("consump_integral >=", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralLessThan(Long value) {
            addCriterion("consump_integral <", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralLessThanOrEqualTo(Long value) {
            addCriterion("consump_integral <=", value, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralIn(List<Long> values) {
            addCriterion("consump_integral in", values, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralNotIn(List<Long> values) {
            addCriterion("consump_integral not in", values, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralBetween(Long value1, Long value2) {
            addCriterion("consump_integral between", value1, value2, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpIntegralNotBetween(Long value1, Long value2) {
            addCriterion("consump_integral not between", value1, value2, "consumpIntegral");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusIsNull() {
            addCriterion("consump_status is null");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusIsNotNull() {
            addCriterion("consump_status is not null");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusEqualTo(Integer value) {
            addCriterion("consump_status =", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusNotEqualTo(Integer value) {
            addCriterion("consump_status <>", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusGreaterThan(Integer value) {
            addCriterion("consump_status >", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("consump_status >=", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusLessThan(Integer value) {
            addCriterion("consump_status <", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("consump_status <=", value, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusIn(List<Integer> values) {
            addCriterion("consump_status in", values, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusNotIn(List<Integer> values) {
            addCriterion("consump_status not in", values, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusBetween(Integer value1, Integer value2) {
            addCriterion("consump_status between", value1, value2, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andConsumpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("consump_status not between", value1, value2, "consumpStatus");
            return (Criteria) this;
        }

        public Criteria andGameCreditsIsNull() {
            addCriterion("game_credits is null");
            return (Criteria) this;
        }

        public Criteria andGameCreditsIsNotNull() {
            addCriterion("game_credits is not null");
            return (Criteria) this;
        }

        public Criteria andGameCreditsEqualTo(Long value) {
            addCriterion("game_credits =", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsNotEqualTo(Long value) {
            addCriterion("game_credits <>", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsGreaterThan(Long value) {
            addCriterion("game_credits >", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsGreaterThanOrEqualTo(Long value) {
            addCriterion("game_credits >=", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsLessThan(Long value) {
            addCriterion("game_credits <", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsLessThanOrEqualTo(Long value) {
            addCriterion("game_credits <=", value, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsIn(List<Long> values) {
            addCriterion("game_credits in", values, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsNotIn(List<Long> values) {
            addCriterion("game_credits not in", values, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsBetween(Long value1, Long value2) {
            addCriterion("game_credits between", value1, value2, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andGameCreditsNotBetween(Long value1, Long value2) {
            addCriterion("game_credits not between", value1, value2, "gameCredits");
            return (Criteria) this;
        }

        public Criteria andFlowNoIsNull() {
            addCriterion("flow_no is null");
            return (Criteria) this;
        }

        public Criteria andFlowNoIsNotNull() {
            addCriterion("flow_no is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNoEqualTo(String value) {
            addCriterion("flow_no =", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoNotEqualTo(String value) {
            addCriterion("flow_no <>", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoGreaterThan(String value) {
            addCriterion("flow_no >", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("flow_no >=", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoLessThan(String value) {
            addCriterion("flow_no <", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoLessThanOrEqualTo(String value) {
            addCriterion("flow_no <=", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoLike(String value) {
            addCriterion("flow_no like", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoNotLike(String value) {
            addCriterion("flow_no not like", value, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoIn(List<String> values) {
            addCriterion("flow_no in", values, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoNotIn(List<String> values) {
            addCriterion("flow_no not in", values, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoBetween(String value1, String value2) {
            addCriterion("flow_no between", value1, value2, "flowNo");
            return (Criteria) this;
        }

        public Criteria andFlowNoNotBetween(String value1, String value2) {
            addCriterion("flow_no not between", value1, value2, "flowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoIsNull() {
            addCriterion("refund_flow_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoIsNotNull() {
            addCriterion("refund_flow_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoEqualTo(String value) {
            addCriterion("refund_flow_no =", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoNotEqualTo(String value) {
            addCriterion("refund_flow_no <>", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoGreaterThan(String value) {
            addCriterion("refund_flow_no >", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_flow_no >=", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoLessThan(String value) {
            addCriterion("refund_flow_no <", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoLessThanOrEqualTo(String value) {
            addCriterion("refund_flow_no <=", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoLike(String value) {
            addCriterion("refund_flow_no like", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoNotLike(String value) {
            addCriterion("refund_flow_no not like", value, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoIn(List<String> values) {
            addCriterion("refund_flow_no in", values, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoNotIn(List<String> values) {
            addCriterion("refund_flow_no not in", values, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoBetween(String value1, String value2) {
            addCriterion("refund_flow_no between", value1, value2, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andRefundFlowNoNotBetween(String value1, String value2) {
            addCriterion("refund_flow_no not between", value1, value2, "refundFlowNo");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
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