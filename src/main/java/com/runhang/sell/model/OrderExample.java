package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andPayOrderCodeIsNull() {
            addCriterion("pay_order_code is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeIsNotNull() {
            addCriterion("pay_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeEqualTo(String value) {
            addCriterion("pay_order_code =", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotEqualTo(String value) {
            addCriterion("pay_order_code <>", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeGreaterThan(String value) {
            addCriterion("pay_order_code >", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_code >=", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLessThan(String value) {
            addCriterion("pay_order_code <", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_order_code <=", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeLike(String value) {
            addCriterion("pay_order_code like", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotLike(String value) {
            addCriterion("pay_order_code not like", value, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeIn(List<String> values) {
            addCriterion("pay_order_code in", values, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotIn(List<String> values) {
            addCriterion("pay_order_code not in", values, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeBetween(String value1, String value2) {
            addCriterion("pay_order_code between", value1, value2, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andPayOrderCodeNotBetween(String value1, String value2) {
            addCriterion("pay_order_code not between", value1, value2, "payOrderCode");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNull() {
            addCriterion("order_start_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIsNotNull() {
            addCriterion("order_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeEqualTo(Date value) {
            addCriterion("order_start_time =", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotEqualTo(Date value) {
            addCriterion("order_start_time <>", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThan(Date value) {
            addCriterion("order_start_time >", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_start_time >=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThan(Date value) {
            addCriterion("order_start_time <", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_start_time <=", value, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeIn(List<Date> values) {
            addCriterion("order_start_time in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotIn(List<Date> values) {
            addCriterion("order_start_time not in", values, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeBetween(Date value1, Date value2) {
            addCriterion("order_start_time between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_start_time not between", value1, value2, "orderStartTime");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIsNull() {
            addCriterion("order_detail is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIsNotNull() {
            addCriterion("order_detail is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailEqualTo(String value) {
            addCriterion("order_detail =", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailNotEqualTo(String value) {
            addCriterion("order_detail <>", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailGreaterThan(String value) {
            addCriterion("order_detail >", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailGreaterThanOrEqualTo(String value) {
            addCriterion("order_detail >=", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailLessThan(String value) {
            addCriterion("order_detail <", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailLessThanOrEqualTo(String value) {
            addCriterion("order_detail <=", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailLike(String value) {
            addCriterion("order_detail like", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailNotLike(String value) {
            addCriterion("order_detail not like", value, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIn(List<String> values) {
            addCriterion("order_detail in", values, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailNotIn(List<String> values) {
            addCriterion("order_detail not in", values, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailBetween(String value1, String value2) {
            addCriterion("order_detail between", value1, value2, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andOrderDetailNotBetween(String value1, String value2) {
            addCriterion("order_detail not between", value1, value2, "orderDetail");
            return (Criteria) this;
        }

        public Criteria andCoinTotalIsNull() {
            addCriterion("coin_total is null");
            return (Criteria) this;
        }

        public Criteria andCoinTotalIsNotNull() {
            addCriterion("coin_total is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTotalEqualTo(Long value) {
            addCriterion("coin_total =", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalNotEqualTo(Long value) {
            addCriterion("coin_total <>", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalGreaterThan(Long value) {
            addCriterion("coin_total >", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("coin_total >=", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalLessThan(Long value) {
            addCriterion("coin_total <", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalLessThanOrEqualTo(Long value) {
            addCriterion("coin_total <=", value, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalIn(List<Long> values) {
            addCriterion("coin_total in", values, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalNotIn(List<Long> values) {
            addCriterion("coin_total not in", values, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalBetween(Long value1, Long value2) {
            addCriterion("coin_total between", value1, value2, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andCoinTotalNotBetween(Long value1, Long value2) {
            addCriterion("coin_total not between", value1, value2, "coinTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIsNull() {
            addCriterion("order_total is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIsNotNull() {
            addCriterion("order_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalEqualTo(Long value) {
            addCriterion("order_total =", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotEqualTo(Long value) {
            addCriterion("order_total <>", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalGreaterThan(Long value) {
            addCriterion("order_total >", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("order_total >=", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalLessThan(Long value) {
            addCriterion("order_total <", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalLessThanOrEqualTo(Long value) {
            addCriterion("order_total <=", value, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalIn(List<Long> values) {
            addCriterion("order_total in", values, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotIn(List<Long> values) {
            addCriterion("order_total not in", values, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalBetween(Long value1, Long value2) {
            addCriterion("order_total between", value1, value2, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andOrderTotalNotBetween(Long value1, Long value2) {
            addCriterion("order_total not between", value1, value2, "orderTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(Long value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(Long value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(Long value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(Long value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(Long value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<Long> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<Long> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(Long value1, Long value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(Long value1, Long value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(Long value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(Long value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(Long value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(Long value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(Long value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<Long> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<Long> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(Long value1, Long value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(Long value1, Long value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeIsNull() {
            addCriterion("pay_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeIsNotNull() {
            addCriterion("pay_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeEqualTo(Date value) {
            addCriterion("pay_start_time =", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeNotEqualTo(Date value) {
            addCriterion("pay_start_time <>", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeGreaterThan(Date value) {
            addCriterion("pay_start_time >", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_start_time >=", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeLessThan(Date value) {
            addCriterion("pay_start_time <", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_start_time <=", value, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeIn(List<Date> values) {
            addCriterion("pay_start_time in", values, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeNotIn(List<Date> values) {
            addCriterion("pay_start_time not in", values, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeBetween(Date value1, Date value2) {
            addCriterion("pay_start_time between", value1, value2, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_start_time not between", value1, value2, "payStartTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIsNull() {
            addCriterion("pay_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIsNotNull() {
            addCriterion("pay_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeEqualTo(Date value) {
            addCriterion("pay_end_time =", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotEqualTo(Date value) {
            addCriterion("pay_end_time <>", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeGreaterThan(Date value) {
            addCriterion("pay_end_time >", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_end_time >=", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeLessThan(Date value) {
            addCriterion("pay_end_time <", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_end_time <=", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIn(List<Date> values) {
            addCriterion("pay_end_time in", values, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotIn(List<Date> values) {
            addCriterion("pay_end_time not in", values, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeBetween(Date value1, Date value2) {
            addCriterion("pay_end_time between", value1, value2, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_end_time not between", value1, value2, "payEndTime");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIsNull() {
            addCriterion("pickup_code is null");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIsNotNull() {
            addCriterion("pickup_code is not null");
            return (Criteria) this;
        }

        public Criteria andPickupCodeEqualTo(String value) {
            addCriterion("pickup_code =", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotEqualTo(String value) {
            addCriterion("pickup_code <>", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeGreaterThan(String value) {
            addCriterion("pickup_code >", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_code >=", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLessThan(String value) {
            addCriterion("pickup_code <", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLessThanOrEqualTo(String value) {
            addCriterion("pickup_code <=", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLike(String value) {
            addCriterion("pickup_code like", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotLike(String value) {
            addCriterion("pickup_code not like", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIn(List<String> values) {
            addCriterion("pickup_code in", values, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotIn(List<String> values) {
            addCriterion("pickup_code not in", values, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeBetween(String value1, String value2) {
            addCriterion("pickup_code between", value1, value2, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotBetween(String value1, String value2) {
            addCriterion("pickup_code not between", value1, value2, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andAddPointsIsNull() {
            addCriterion("add_points is null");
            return (Criteria) this;
        }

        public Criteria andAddPointsIsNotNull() {
            addCriterion("add_points is not null");
            return (Criteria) this;
        }

        public Criteria andAddPointsEqualTo(Integer value) {
            addCriterion("add_points =", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsNotEqualTo(Integer value) {
            addCriterion("add_points <>", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsGreaterThan(Integer value) {
            addCriterion("add_points >", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_points >=", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsLessThan(Integer value) {
            addCriterion("add_points <", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsLessThanOrEqualTo(Integer value) {
            addCriterion("add_points <=", value, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsIn(List<Integer> values) {
            addCriterion("add_points in", values, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsNotIn(List<Integer> values) {
            addCriterion("add_points not in", values, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsBetween(Integer value1, Integer value2) {
            addCriterion("add_points between", value1, value2, "addPoints");
            return (Criteria) this;
        }

        public Criteria andAddPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("add_points not between", value1, value2, "addPoints");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andMsIdIsNull() {
            addCriterion("ms_id is null");
            return (Criteria) this;
        }

        public Criteria andMsIdIsNotNull() {
            addCriterion("ms_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsIdEqualTo(Integer value) {
            addCriterion("ms_id =", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotEqualTo(Integer value) {
            addCriterion("ms_id <>", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdGreaterThan(Integer value) {
            addCriterion("ms_id >", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ms_id >=", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdLessThan(Integer value) {
            addCriterion("ms_id <", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ms_id <=", value, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdIn(List<Integer> values) {
            addCriterion("ms_id in", values, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotIn(List<Integer> values) {
            addCriterion("ms_id not in", values, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdBetween(Integer value1, Integer value2) {
            addCriterion("ms_id between", value1, value2, "msId");
            return (Criteria) this;
        }

        public Criteria andMsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ms_id not between", value1, value2, "msId");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIsNull() {
            addCriterion("is_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIsNotNull() {
            addCriterion("is_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationEqualTo(Integer value) {
            addCriterion("is_evaluation =", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotEqualTo(Integer value) {
            addCriterion("is_evaluation <>", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationGreaterThan(Integer value) {
            addCriterion("is_evaluation >", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_evaluation >=", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationLessThan(Integer value) {
            addCriterion("is_evaluation <", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationLessThanOrEqualTo(Integer value) {
            addCriterion("is_evaluation <=", value, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationIn(List<Integer> values) {
            addCriterion("is_evaluation in", values, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotIn(List<Integer> values) {
            addCriterion("is_evaluation not in", values, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationBetween(Integer value1, Integer value2) {
            addCriterion("is_evaluation between", value1, value2, "isEvaluation");
            return (Criteria) this;
        }

        public Criteria andIsEvaluationNotBetween(Integer value1, Integer value2) {
            addCriterion("is_evaluation not between", value1, value2, "isEvaluation");
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

        public Criteria andOrderEndTimeIsNull() {
            addCriterion("order_end_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIsNotNull() {
            addCriterion("order_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeEqualTo(Date value) {
            addCriterion("order_end_time =", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotEqualTo(Date value) {
            addCriterion("order_end_time <>", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThan(Date value) {
            addCriterion("order_end_time >", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_end_time >=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThan(Date value) {
            addCriterion("order_end_time <", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_end_time <=", value, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeIn(List<Date> values) {
            addCriterion("order_end_time in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotIn(List<Date> values) {
            addCriterion("order_end_time not in", values, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeBetween(Date value1, Date value2) {
            addCriterion("order_end_time between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andOrderEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_end_time not between", value1, value2, "orderEndTime");
            return (Criteria) this;
        }

        public Criteria andGamestateIsNull() {
            addCriterion("gameState is null");
            return (Criteria) this;
        }

        public Criteria andGamestateIsNotNull() {
            addCriterion("gameState is not null");
            return (Criteria) this;
        }

        public Criteria andGamestateEqualTo(Integer value) {
            addCriterion("gameState =", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotEqualTo(Integer value) {
            addCriterion("gameState <>", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateGreaterThan(Integer value) {
            addCriterion("gameState >", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("gameState >=", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateLessThan(Integer value) {
            addCriterion("gameState <", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateLessThanOrEqualTo(Integer value) {
            addCriterion("gameState <=", value, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateIn(List<Integer> values) {
            addCriterion("gameState in", values, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotIn(List<Integer> values) {
            addCriterion("gameState not in", values, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateBetween(Integer value1, Integer value2) {
            addCriterion("gameState between", value1, value2, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGamestateNotBetween(Integer value1, Integer value2) {
            addCriterion("gameState not between", value1, value2, "gamestate");
            return (Criteria) this;
        }

        public Criteria andGameLevelIsNull() {
            addCriterion("game_level is null");
            return (Criteria) this;
        }

        public Criteria andGameLevelIsNotNull() {
            addCriterion("game_level is not null");
            return (Criteria) this;
        }

        public Criteria andGameLevelEqualTo(Integer value) {
            addCriterion("game_level =", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelNotEqualTo(Integer value) {
            addCriterion("game_level <>", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelGreaterThan(Integer value) {
            addCriterion("game_level >", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_level >=", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelLessThan(Integer value) {
            addCriterion("game_level <", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelLessThanOrEqualTo(Integer value) {
            addCriterion("game_level <=", value, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelIn(List<Integer> values) {
            addCriterion("game_level in", values, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelNotIn(List<Integer> values) {
            addCriterion("game_level not in", values, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelBetween(Integer value1, Integer value2) {
            addCriterion("game_level between", value1, value2, "gameLevel");
            return (Criteria) this;
        }

        public Criteria andGameLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("game_level not between", value1, value2, "gameLevel");
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
