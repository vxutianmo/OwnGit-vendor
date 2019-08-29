package com.runhang.sell.model.pointMagicBoxExchange;

import java.io.Serializable;
import java.util.Date;

public class MemberConsumpRecord implements Serializable {
    //消费状态
    public static final Integer DEDUCTED_NORMAL = 0;       //0-扣除正常
    public static final Integer DEDUCTED_FAILURE = 1;      //1-扣除失败
    public static final Integer REFUND_SUCCESS = 2;        //2-退还成功
    public static final Integer RETURN_THE_FAILURE = 3;    //3-退还失败
    public static final Integer RETURNING = 4;    //4-积分退还中


    private Integer id;

    private Integer integralMemberId;

    private Long preGamePoints;

    private Long consumpIntegral;

    private Integer consumpStatus;

    private Long gameCredits;

    private String flowNo;

    private String refundFlowNo;

    private Integer orderId;

    private String detail;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private Date refundTime;

    private String orderCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIntegralMemberId() {
        return integralMemberId;
    }

    public void setIntegralMemberId(Integer integralMemberId) {
        this.integralMemberId = integralMemberId;
    }

    public Long getPreGamePoints() {
        return preGamePoints;
    }

    public void setPreGamePoints(Long preGamePoints) {
        this.preGamePoints = preGamePoints;
    }

    public Long getConsumpIntegral() {
        return consumpIntegral;
    }

    public void setConsumpIntegral(Long consumpIntegral) {
        this.consumpIntegral = consumpIntegral;
    }

    public Integer getConsumpStatus() {
        return consumpStatus;
    }

    public void setConsumpStatus(Integer consumpStatus) {
        this.consumpStatus = consumpStatus;
    }

    public Long getGameCredits() {
        return gameCredits;
    }

    public void setGameCredits(Long gameCredits) {
        this.gameCredits = gameCredits;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo == null ? null : flowNo.trim();
    }

    public String getRefundFlowNo() {
        return refundFlowNo;
    }

    public void setRefundFlowNo(String refundFlowNo) {
        this.refundFlowNo = refundFlowNo == null ? null : refundFlowNo.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
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

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
}