package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class OrderRefund implements Serializable {
    private Integer id;

    private String refundCode;

    private Integer orderId;

    private Long refundAmount;

    private String refundStatus;

    private Integer userId;

    private Integer approvalId;

    private Date checkTime;

    private Date finishedTime;

    private String refundReason;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    public OrderRefund() {

    }

    public OrderRefund(String refundCode, Integer orderId, String refundAmount, String refundStatus, String refundReason) {
        this.refundCode = refundCode;
        this.orderId = orderId;
        this.refundAmount = Long.valueOf(refundAmount);
        this.refundStatus = refundStatus;
        this.checkTime = new Date();
        this.finishedTime = new Date();
        this.refundReason = refundReason;
        this.createTime = new Date();
        this.updateTime = new Date();
        this.deleted = 0;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefundCode() {
        return refundCode;
    }

    public void setRefundCode(String refundCode) {
        this.refundCode = refundCode == null ? null : refundCode.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
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