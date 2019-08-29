package com.runhang.sell.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendorTrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VendorTrackExample() {
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

        public Criteria andTrackCodeIsNull() {
            addCriterion("track_code is null");
            return (Criteria) this;
        }

        public Criteria andTrackCodeIsNotNull() {
            addCriterion("track_code is not null");
            return (Criteria) this;
        }

        public Criteria andTrackCodeEqualTo(String value) {
            addCriterion("track_code =", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeNotEqualTo(String value) {
            addCriterion("track_code <>", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeGreaterThan(String value) {
            addCriterion("track_code >", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeGreaterThanOrEqualTo(String value) {
            addCriterion("track_code >=", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeLessThan(String value) {
            addCriterion("track_code <", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeLessThanOrEqualTo(String value) {
            addCriterion("track_code <=", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeLike(String value) {
            addCriterion("track_code like", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeNotLike(String value) {
            addCriterion("track_code not like", value, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeIn(List<String> values) {
            addCriterion("track_code in", values, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeNotIn(List<String> values) {
            addCriterion("track_code not in", values, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeBetween(String value1, String value2) {
            addCriterion("track_code between", value1, value2, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackCodeNotBetween(String value1, String value2) {
            addCriterion("track_code not between", value1, value2, "trackCode");
            return (Criteria) this;
        }

        public Criteria andTrackTypeIsNull() {
            addCriterion("track_type is null");
            return (Criteria) this;
        }

        public Criteria andTrackTypeIsNotNull() {
            addCriterion("track_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrackTypeEqualTo(String value) {
            addCriterion("track_type =", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeNotEqualTo(String value) {
            addCriterion("track_type <>", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeGreaterThan(String value) {
            addCriterion("track_type >", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("track_type >=", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeLessThan(String value) {
            addCriterion("track_type <", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeLessThanOrEqualTo(String value) {
            addCriterion("track_type <=", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeLike(String value) {
            addCriterion("track_type like", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeNotLike(String value) {
            addCriterion("track_type not like", value, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeIn(List<String> values) {
            addCriterion("track_type in", values, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeNotIn(List<String> values) {
            addCriterion("track_type not in", values, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeBetween(String value1, String value2) {
            addCriterion("track_type between", value1, value2, "trackType");
            return (Criteria) this;
        }

        public Criteria andTrackTypeNotBetween(String value1, String value2) {
            addCriterion("track_type not between", value1, value2, "trackType");
            return (Criteria) this;
        }

        public Criteria andMaxCountIsNull() {
            addCriterion("max_count is null");
            return (Criteria) this;
        }

        public Criteria andMaxCountIsNotNull() {
            addCriterion("max_count is not null");
            return (Criteria) this;
        }

        public Criteria andMaxCountEqualTo(Integer value) {
            addCriterion("max_count =", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountNotEqualTo(Integer value) {
            addCriterion("max_count <>", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountGreaterThan(Integer value) {
            addCriterion("max_count >", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_count >=", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountLessThan(Integer value) {
            addCriterion("max_count <", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("max_count <=", value, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountIn(List<Integer> values) {
            addCriterion("max_count in", values, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountNotIn(List<Integer> values) {
            addCriterion("max_count not in", values, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("max_count between", value1, value2, "maxCount");
            return (Criteria) this;
        }

        public Criteria andMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("max_count not between", value1, value2, "maxCount");
            return (Criteria) this;
        }

        public Criteria andTrackStatusIsNull() {
            addCriterion("track_status is null");
            return (Criteria) this;
        }

        public Criteria andTrackStatusIsNotNull() {
            addCriterion("track_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrackStatusEqualTo(String value) {
            addCriterion("track_status =", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusNotEqualTo(String value) {
            addCriterion("track_status <>", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusGreaterThan(String value) {
            addCriterion("track_status >", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusGreaterThanOrEqualTo(String value) {
            addCriterion("track_status >=", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusLessThan(String value) {
            addCriterion("track_status <", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusLessThanOrEqualTo(String value) {
            addCriterion("track_status <=", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusLike(String value) {
            addCriterion("track_status like", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusNotLike(String value) {
            addCriterion("track_status not like", value, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusIn(List<String> values) {
            addCriterion("track_status in", values, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusNotIn(List<String> values) {
            addCriterion("track_status not in", values, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusBetween(String value1, String value2) {
            addCriterion("track_status between", value1, value2, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andTrackStatusNotBetween(String value1, String value2) {
            addCriterion("track_status not between", value1, value2, "trackStatus");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
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