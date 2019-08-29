package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andTrackIdIsNull() {
            addCriterion("track_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackIdIsNotNull() {
            addCriterion("track_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackIdEqualTo(Integer value) {
            addCriterion("track_id =", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotEqualTo(Integer value) {
            addCriterion("track_id <>", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThan(Integer value) {
            addCriterion("track_id >", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("track_id >=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThan(Integer value) {
            addCriterion("track_id <", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThanOrEqualTo(Integer value) {
            addCriterion("track_id <=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdIn(List<Integer> values) {
            addCriterion("track_id in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotIn(List<Integer> values) {
            addCriterion("track_id not in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdBetween(Integer value1, Integer value2) {
            addCriterion("track_id between", value1, value2, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("track_id not between", value1, value2, "trackId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdIsNull() {
            addCriterion("sub_business_id is null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdIsNotNull() {
            addCriterion("sub_business_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdEqualTo(Integer value) {
            addCriterion("sub_business_id =", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdNotEqualTo(Integer value) {
            addCriterion("sub_business_id <>", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdGreaterThan(Integer value) {
            addCriterion("sub_business_id >", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_business_id >=", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdLessThan(Integer value) {
            addCriterion("sub_business_id <", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("sub_business_id <=", value, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdIn(List<Integer> values) {
            addCriterion("sub_business_id in", values, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdNotIn(List<Integer> values) {
            addCriterion("sub_business_id not in", values, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("sub_business_id between", value1, value2, "subBusinessId");
            return (Criteria) this;
        }

        public Criteria andSubBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_business_id not between", value1, value2, "subBusinessId");
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

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIsNull() {
            addCriterion("single_price is null");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIsNotNull() {
            addCriterion("single_price is not null");
            return (Criteria) this;
        }

        public Criteria andSinglePriceEqualTo(Long value) {
            addCriterion("single_price =", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotEqualTo(Long value) {
            addCriterion("single_price <>", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceGreaterThan(Long value) {
            addCriterion("single_price >", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("single_price >=", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceLessThan(Long value) {
            addCriterion("single_price <", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceLessThanOrEqualTo(Long value) {
            addCriterion("single_price <=", value, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceIn(List<Long> values) {
            addCriterion("single_price in", values, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotIn(List<Long> values) {
            addCriterion("single_price not in", values, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceBetween(Long value1, Long value2) {
            addCriterion("single_price between", value1, value2, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andSinglePriceNotBetween(Long value1, Long value2) {
            addCriterion("single_price not between", value1, value2, "singlePrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceIsNull() {
            addCriterion("platform_price is null");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceIsNotNull() {
            addCriterion("platform_price is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceEqualTo(Long value) {
            addCriterion("platform_price =", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceNotEqualTo(Long value) {
            addCriterion("platform_price <>", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceGreaterThan(Long value) {
            addCriterion("platform_price >", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("platform_price >=", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceLessThan(Long value) {
            addCriterion("platform_price <", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceLessThanOrEqualTo(Long value) {
            addCriterion("platform_price <=", value, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceIn(List<Long> values) {
            addCriterion("platform_price in", values, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceNotIn(List<Long> values) {
            addCriterion("platform_price not in", values, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceBetween(Long value1, Long value2) {
            addCriterion("platform_price between", value1, value2, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andPlatformPriceNotBetween(Long value1, Long value2) {
            addCriterion("platform_price not between", value1, value2, "platformPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIsNull() {
            addCriterion("business_price is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIsNotNull() {
            addCriterion("business_price is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceEqualTo(Long value) {
            addCriterion("business_price =", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotEqualTo(Long value) {
            addCriterion("business_price <>", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThan(Long value) {
            addCriterion("business_price >", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("business_price >=", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThan(Long value) {
            addCriterion("business_price <", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceLessThanOrEqualTo(Long value) {
            addCriterion("business_price <=", value, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceIn(List<Long> values) {
            addCriterion("business_price in", values, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotIn(List<Long> values) {
            addCriterion("business_price not in", values, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceBetween(Long value1, Long value2) {
            addCriterion("business_price between", value1, value2, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessPriceNotBetween(Long value1, Long value2) {
            addCriterion("business_price not between", value1, value2, "businessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceIsNull() {
            addCriterion("sub_business_price is null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceIsNotNull() {
            addCriterion("sub_business_price is not null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceEqualTo(Long value) {
            addCriterion("sub_business_price =", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceNotEqualTo(Long value) {
            addCriterion("sub_business_price <>", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceGreaterThan(Long value) {
            addCriterion("sub_business_price >", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sub_business_price >=", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceLessThan(Long value) {
            addCriterion("sub_business_price <", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceLessThanOrEqualTo(Long value) {
            addCriterion("sub_business_price <=", value, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceIn(List<Long> values) {
            addCriterion("sub_business_price in", values, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceNotIn(List<Long> values) {
            addCriterion("sub_business_price not in", values, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceBetween(Long value1, Long value2) {
            addCriterion("sub_business_price between", value1, value2, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessPriceNotBetween(Long value1, Long value2) {
            addCriterion("sub_business_price not between", value1, value2, "subBusinessPrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(Long value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(Long value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(Long value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(Long value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(Long value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<Long> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<Long> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(Long value1, Long value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(Long value1, Long value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceIsNull() {
            addCriterion("business_service_price is null");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceIsNotNull() {
            addCriterion("business_service_price is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceEqualTo(Long value) {
            addCriterion("business_service_price =", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceNotEqualTo(Long value) {
            addCriterion("business_service_price <>", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceGreaterThan(Long value) {
            addCriterion("business_service_price >", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("business_service_price >=", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceLessThan(Long value) {
            addCriterion("business_service_price <", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceLessThanOrEqualTo(Long value) {
            addCriterion("business_service_price <=", value, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceIn(List<Long> values) {
            addCriterion("business_service_price in", values, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceNotIn(List<Long> values) {
            addCriterion("business_service_price not in", values, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceBetween(Long value1, Long value2) {
            addCriterion("business_service_price between", value1, value2, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andBusinessServicePriceNotBetween(Long value1, Long value2) {
            addCriterion("business_service_price not between", value1, value2, "businessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceIsNull() {
            addCriterion("sub_business_service_price is null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceIsNotNull() {
            addCriterion("sub_business_service_price is not null");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceEqualTo(Long value) {
            addCriterion("sub_business_service_price =", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceNotEqualTo(Long value) {
            addCriterion("sub_business_service_price <>", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceGreaterThan(Long value) {
            addCriterion("sub_business_service_price >", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sub_business_service_price >=", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceLessThan(Long value) {
            addCriterion("sub_business_service_price <", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceLessThanOrEqualTo(Long value) {
            addCriterion("sub_business_service_price <=", value, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceIn(List<Long> values) {
            addCriterion("sub_business_service_price in", values, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceNotIn(List<Long> values) {
            addCriterion("sub_business_service_price not in", values, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceBetween(Long value1, Long value2) {
            addCriterion("sub_business_service_price between", value1, value2, "subBusinessServicePrice");
            return (Criteria) this;
        }

        public Criteria andSubBusinessServicePriceNotBetween(Long value1, Long value2) {
            addCriterion("sub_business_service_price not between", value1, value2, "subBusinessServicePrice");
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