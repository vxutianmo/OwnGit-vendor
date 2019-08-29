package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private Integer id;

    private Integer goodsId;

    private Integer trackId;

    private Integer businessId;

    private Integer subBusinessId;

    private Integer orderId;

    private Integer goodsNumber;

    private Long singlePrice;

    private Long totalPrice;

    private Long platformPrice;

    private Long businessPrice;

    private Long subBusinessPrice;

    private Long servicePrice;

    private Long businessServicePrice;

    private Long subBusinessServicePrice;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    /**货道编号*/
    private String trackCode;
    /**商品编号*/
    private String goodsCode;
    /**商品名称*/
    private String goodsName;
    /**储存货道商品图片地址*/
    private String goodsUrl;

    private static final long serialVersionUID = 1L;

    public String getTrackCode() {
        return trackCode;
    }

    public void setTrackCode(String trackCode) {
        this.trackCode = trackCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getSubBusinessId() {
        return subBusinessId;
    }

    public void setSubBusinessId(Integer subBusinessId) {
        this.subBusinessId = subBusinessId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Long getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(Long singlePrice) {
        this.singlePrice = singlePrice;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getPlatformPrice() {
        return platformPrice;
    }

    public void setPlatformPrice(Long platformPrice) {
        this.platformPrice = platformPrice;
    }

    public Long getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(Long businessPrice) {
        this.businessPrice = businessPrice;
    }

    public Long getSubBusinessPrice() {
        return subBusinessPrice;
    }

    public void setSubBusinessPrice(Long subBusinessPrice) {
        this.subBusinessPrice = subBusinessPrice;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Long getBusinessServicePrice() {
        return businessServicePrice;
    }

    public void setBusinessServicePrice(Long businessServicePrice) {
        this.businessServicePrice = businessServicePrice;
    }

    public Long getSubBusinessServicePrice() {
        return subBusinessServicePrice;
    }

    public void setSubBusinessServicePrice(Long subBusinessServicePrice) {
        this.subBusinessServicePrice = subBusinessServicePrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}