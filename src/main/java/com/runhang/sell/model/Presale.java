package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class Presale implements Serializable {
    private Integer id;

    private String presaleOrderNumber;

    private String payOrderCode;

    private String openId;

    private Integer orderId;

    private Integer accountId;

    private Integer vdId;

    private Integer goodsId;

    private Integer goodsNumber;

    private Integer pickedUpNumber;

    private Long totalPrice;

    private Long payMoney;

    private Long discountMoney;

    private Long refundMoney;

    private String pickUpCode;

    private Integer payStatus;

    private Integer pickUpStatus;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPresaleOrderNumber() {
        return presaleOrderNumber;
    }

    public void setPresaleOrderNumber(String presaleOrderNumber) {
        this.presaleOrderNumber = presaleOrderNumber == null ? null : presaleOrderNumber.trim();
    }

    public String getPayOrderCode() {
        return payOrderCode;
    }

    public void setPayOrderCode(String payOrderCode) {
        this.payOrderCode = payOrderCode == null ? null : payOrderCode.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getVdId() {
        return vdId;
    }

    public void setVdId(Integer vdId) {
        this.vdId = vdId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getPickedUpNumber() {
        return pickedUpNumber;
    }

    public void setPickedUpNumber(Integer pickedUpNumber) {
        this.pickedUpNumber = pickedUpNumber;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public Long getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Long discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Long getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public void setPickUpCode(String pickUpCode) {
        this.pickUpCode = pickUpCode == null ? null : pickUpCode.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPickUpStatus() {
        return pickUpStatus;
    }

    public void setPickUpStatus(Integer pickUpStatus) {
        this.pickUpStatus = pickUpStatus;
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