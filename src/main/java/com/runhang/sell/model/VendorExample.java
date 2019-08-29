package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VendorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVdCodeIsNull() {
            addCriterion("vd_code is null");
            return (Criteria) this;
        }

        public Criteria andVdCodeIsNotNull() {
            addCriterion("vd_code is not null");
            return (Criteria) this;
        }

        public Criteria andVdCodeEqualTo(String value) {
            addCriterion("vd_code =", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeNotEqualTo(String value) {
            addCriterion("vd_code <>", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeGreaterThan(String value) {
            addCriterion("vd_code >", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vd_code >=", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeLessThan(String value) {
            addCriterion("vd_code <", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeLessThanOrEqualTo(String value) {
            addCriterion("vd_code <=", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeLike(String value) {
            addCriterion("vd_code like", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeNotLike(String value) {
            addCriterion("vd_code not like", value, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeIn(List<String> values) {
            addCriterion("vd_code in", values, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeNotIn(List<String> values) {
            addCriterion("vd_code not in", values, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeBetween(String value1, String value2) {
            addCriterion("vd_code between", value1, value2, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdCodeNotBetween(String value1, String value2) {
            addCriterion("vd_code not between", value1, value2, "vdCode");
            return (Criteria) this;
        }

        public Criteria andVdTypeIsNull() {
            addCriterion("vd_type is null");
            return (Criteria) this;
        }

        public Criteria andVdTypeIsNotNull() {
            addCriterion("vd_type is not null");
            return (Criteria) this;
        }

        public Criteria andVdTypeEqualTo(String value) {
            addCriterion("vd_type =", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeNotEqualTo(String value) {
            addCriterion("vd_type <>", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeGreaterThan(String value) {
            addCriterion("vd_type >", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vd_type >=", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeLessThan(String value) {
            addCriterion("vd_type <", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeLessThanOrEqualTo(String value) {
            addCriterion("vd_type <=", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeLike(String value) {
            addCriterion("vd_type like", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeNotLike(String value) {
            addCriterion("vd_type not like", value, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeIn(List<String> values) {
            addCriterion("vd_type in", values, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeNotIn(List<String> values) {
            addCriterion("vd_type not in", values, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeBetween(String value1, String value2) {
            addCriterion("vd_type between", value1, value2, "vdType");
            return (Criteria) this;
        }

        public Criteria andVdTypeNotBetween(String value1, String value2) {
            addCriterion("vd_type not between", value1, value2, "vdType");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNull() {
            addCriterion("manufacturer_id is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIsNotNull() {
            addCriterion("manufacturer_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdEqualTo(Integer value) {
            addCriterion("manufacturer_id =", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotEqualTo(Integer value) {
            addCriterion("manufacturer_id <>", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThan(Integer value) {
            addCriterion("manufacturer_id >", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id >=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThan(Integer value) {
            addCriterion("manufacturer_id <", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacturer_id <=", value, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdIn(List<Integer> values) {
            addCriterion("manufacturer_id in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotIn(List<Integer> values) {
            addCriterion("manufacturer_id not in", values, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andManufacturerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacturer_id not between", value1, value2, "manufacturerId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andTrackNumIsNull() {
            addCriterion("track_num is null");
            return (Criteria) this;
        }

        public Criteria andTrackNumIsNotNull() {
            addCriterion("track_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrackNumEqualTo(Integer value) {
            addCriterion("track_num =", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumNotEqualTo(Integer value) {
            addCriterion("track_num <>", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumGreaterThan(Integer value) {
            addCriterion("track_num >", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("track_num >=", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumLessThan(Integer value) {
            addCriterion("track_num <", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumLessThanOrEqualTo(Integer value) {
            addCriterion("track_num <=", value, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumIn(List<Integer> values) {
            addCriterion("track_num in", values, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumNotIn(List<Integer> values) {
            addCriterion("track_num not in", values, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumBetween(Integer value1, Integer value2) {
            addCriterion("track_num between", value1, value2, "trackNum");
            return (Criteria) this;
        }

        public Criteria andTrackNumNotBetween(Integer value1, Integer value2) {
            addCriterion("track_num not between", value1, value2, "trackNum");
            return (Criteria) this;
        }

        public Criteria andLowTempIsNull() {
            addCriterion("low_temp is null");
            return (Criteria) this;
        }

        public Criteria andLowTempIsNotNull() {
            addCriterion("low_temp is not null");
            return (Criteria) this;
        }

        public Criteria andLowTempEqualTo(Integer value) {
            addCriterion("low_temp =", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempNotEqualTo(Integer value) {
            addCriterion("low_temp <>", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempGreaterThan(Integer value) {
            addCriterion("low_temp >", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_temp >=", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempLessThan(Integer value) {
            addCriterion("low_temp <", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempLessThanOrEqualTo(Integer value) {
            addCriterion("low_temp <=", value, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempIn(List<Integer> values) {
            addCriterion("low_temp in", values, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempNotIn(List<Integer> values) {
            addCriterion("low_temp not in", values, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempBetween(Integer value1, Integer value2) {
            addCriterion("low_temp between", value1, value2, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andLowTempNotBetween(Integer value1, Integer value2) {
            addCriterion("low_temp not between", value1, value2, "lowTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempIsNull() {
            addCriterion("high_temp is null");
            return (Criteria) this;
        }

        public Criteria andHighTempIsNotNull() {
            addCriterion("high_temp is not null");
            return (Criteria) this;
        }

        public Criteria andHighTempEqualTo(Integer value) {
            addCriterion("high_temp =", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempNotEqualTo(Integer value) {
            addCriterion("high_temp <>", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempGreaterThan(Integer value) {
            addCriterion("high_temp >", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempGreaterThanOrEqualTo(Integer value) {
            addCriterion("high_temp >=", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempLessThan(Integer value) {
            addCriterion("high_temp <", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempLessThanOrEqualTo(Integer value) {
            addCriterion("high_temp <=", value, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempIn(List<Integer> values) {
            addCriterion("high_temp in", values, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempNotIn(List<Integer> values) {
            addCriterion("high_temp not in", values, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempBetween(Integer value1, Integer value2) {
            addCriterion("high_temp between", value1, value2, "highTemp");
            return (Criteria) this;
        }

        public Criteria andHighTempNotBetween(Integer value1, Integer value2) {
            addCriterion("high_temp not between", value1, value2, "highTemp");
            return (Criteria) this;
        }

        public Criteria andVdStatusIsNull() {
            addCriterion("vd_status is null");
            return (Criteria) this;
        }

        public Criteria andVdStatusIsNotNull() {
            addCriterion("vd_status is not null");
            return (Criteria) this;
        }

        public Criteria andVdStatusEqualTo(String value) {
            addCriterion("vd_status =", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusNotEqualTo(String value) {
            addCriterion("vd_status <>", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusGreaterThan(String value) {
            addCriterion("vd_status >", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("vd_status >=", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusLessThan(String value) {
            addCriterion("vd_status <", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusLessThanOrEqualTo(String value) {
            addCriterion("vd_status <=", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusLike(String value) {
            addCriterion("vd_status like", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusNotLike(String value) {
            addCriterion("vd_status not like", value, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusIn(List<String> values) {
            addCriterion("vd_status in", values, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusNotIn(List<String> values) {
            addCriterion("vd_status not in", values, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusBetween(String value1, String value2) {
            addCriterion("vd_status between", value1, value2, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andVdStatusNotBetween(String value1, String value2) {
            addCriterion("vd_status not between", value1, value2, "vdStatus");
            return (Criteria) this;
        }

        public Criteria andReachTimeIsNull() {
            addCriterion("reach_time is null");
            return (Criteria) this;
        }

        public Criteria andReachTimeIsNotNull() {
            addCriterion("reach_time is not null");
            return (Criteria) this;
        }

        public Criteria andReachTimeEqualTo(Date value) {
            addCriterionForJDBCDate("reach_time =", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("reach_time <>", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("reach_time >", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reach_time >=", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeLessThan(Date value) {
            addCriterionForJDBCDate("reach_time <", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reach_time <=", value, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeIn(List<Date> values) {
            addCriterionForJDBCDate("reach_time in", values, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("reach_time not in", values, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reach_time between", value1, value2, "reachTime");
            return (Criteria) this;
        }

        public Criteria andReachTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reach_time not between", value1, value2, "reachTime");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(Integer value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(Integer value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(Integer value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(Integer value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<Integer> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<Integer> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(Integer value1, Integer value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("photo not between", value1, value2, "photo");
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

        public Criteria andVdNameIsNull() {
            addCriterion("vd_name is null");
            return (Criteria) this;
        }

        public Criteria andVdNameIsNotNull() {
            addCriterion("vd_name is not null");
            return (Criteria) this;
        }

        public Criteria andVdNameEqualTo(String value) {
            addCriterion("vd_name =", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameNotEqualTo(String value) {
            addCriterion("vd_name <>", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameGreaterThan(String value) {
            addCriterion("vd_name >", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameGreaterThanOrEqualTo(String value) {
            addCriterion("vd_name >=", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameLessThan(String value) {
            addCriterion("vd_name <", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameLessThanOrEqualTo(String value) {
            addCriterion("vd_name <=", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameLike(String value) {
            addCriterion("vd_name like", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameNotLike(String value) {
            addCriterion("vd_name not like", value, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameIn(List<String> values) {
            addCriterion("vd_name in", values, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameNotIn(List<String> values) {
            addCriterion("vd_name not in", values, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameBetween(String value1, String value2) {
            addCriterion("vd_name between", value1, value2, "vdName");
            return (Criteria) this;
        }

        public Criteria andVdNameNotBetween(String value1, String value2) {
            addCriterion("vd_name not between", value1, value2, "vdName");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSellTypeIsNull() {
            addCriterion("sell_type is null");
            return (Criteria) this;
        }

        public Criteria andSellTypeIsNotNull() {
            addCriterion("sell_type is not null");
            return (Criteria) this;
        }

        public Criteria andSellTypeEqualTo(String value) {
            addCriterion("sell_type =", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotEqualTo(String value) {
            addCriterion("sell_type <>", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeGreaterThan(String value) {
            addCriterion("sell_type >", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_type >=", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLessThan(String value) {
            addCriterion("sell_type <", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLessThanOrEqualTo(String value) {
            addCriterion("sell_type <=", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeLike(String value) {
            addCriterion("sell_type like", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotLike(String value) {
            addCriterion("sell_type not like", value, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeIn(List<String> values) {
            addCriterion("sell_type in", values, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotIn(List<String> values) {
            addCriterion("sell_type not in", values, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeBetween(String value1, String value2) {
            addCriterion("sell_type between", value1, value2, "sellType");
            return (Criteria) this;
        }

        public Criteria andSellTypeNotBetween(String value1, String value2) {
            addCriterion("sell_type not between", value1, value2, "sellType");
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