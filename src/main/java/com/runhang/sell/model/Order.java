package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    /**
     * 订单与流水号分隔符
     * 例：20180907132300228T1 其中de T 表示 使用的普通的售卖流程
     * */
    public static final String T = "T";    //普通的售卖流程
    public static final String F = "F";    //魔盒的售卖流程
    public static final String D = "D";    //积分的售卖流程
    public static final String M = "M";    //万象城的售卖流程
    public static final String L = "L";    //建行支付的售卖流程

    /**订单类型*/
    public static final String ORDER_TYPE = "0";    //0-无人售货机下单
    public static final String couponOrder = "5";    //5-核销订单

    //支付类型
    public static final String Alipay = "1";        //支付宝
    public static final String WeChat = "2";        //微信
    public static final String EC_karte = "3";      //会员卡
    public static final String RHB = "4";           //润航币 -- 不确定
    public static final String integral = "5";      //积分

    public static final String dragon = "6";      //建行龙支付
    public static final String dragonZFB = "7";      //建行支付宝
    public static final String dragonWX = "8";      //建行微信
    public static final String dragonUnion = "9";      //建行云闪付

    public static final String couponNo = "10";      //核销码


    /**支付状态*/
    public static final String IS_PAY = "0";        //0-正在支付
    public static final String PAID = "1";          //1-已支付
    public static final String UNPAID = "3";        //3-未支付

    /**订单状态 //,1-用户已支付，,3-订单异常,4-用户取消订单，5-超时，6-退款,8-已下单，未支付(临时状态),9-自动退款,10-取消订单已支付未退款,11-取消订单已支付已退款*/
    public static final String ORDER_PLACED_NOT_PAID = "0";//0-用于已下单，未支付
    public static final String USER_PAID = "1";//1-用户已支付
    public static final String ORDER_COMPLETED = "2";//2-订单已完成
    public static final String ABNORMAL_ORDERS = "3";//3-订单异常
    public static final String CANCELS_ORDER = "4";//4-用户取消订单
    public static final String TIMEOUT = "5";//5-超时
    public static final String REFUND = "6";//6-退款
    public static final String AUTOMATIC_REFUND = "9";//9-自动退款
    public static final String CANCELLED_ORDER_PAID_WITHOUT_REFUND = "10";//10-已支付未退款Cancelled order paid without refund
    public static final String CANCELLED_ORDER_PAID_AND_REFUNDED= "11";//11-已支付已退款Cancelled order paid and refunded

    public Order() {
    }

    public Order(String billId, VendorDeploy vendorDeploy, String jsonStr, String orderTotal, String regionName) {
        this.orderCode = billId;
        this.orderStartTime = new Date();
        this.orderDetail = jsonStr;
        this.orderTotal = Long.parseLong(orderTotal);
        this.orderStatus = Order.ORDER_PLACED_NOT_PAID;//0-用于已下单，未支付
        this.payStatus = Order.UNPAID;//3-未支付
        this.vdId = vendorDeploy.getId();
        this.orderType = Order.ORDER_TYPE;
        this.isEvaluation = 0;
        this.vendorName = vendorDeploy.getVendorName();
        this.regionName = regionName;
    }
//------------------------------------------------------------------------------------
    private Integer id;

    private String orderCode;

    private String payOrderCode;

    private Date orderStartTime;

    private Date orderEndTime;

    private String orderDetail;

    private Long orderTotal;

    private Long discountAmount;

    private String orderStatus;

    private Long payAmount;

    private String payStatus;

    private String payType;

    private Date payStartTime;

    private Date payEndTime;

    private Integer vdId;

    private String description;

    private String pickupCode;

    private Integer addPoints;

    private String orderType;

    private Integer msId;

    private Integer isEvaluation;

    private Integer gameState;

    private Integer gameLevel; //新增 by 陈洪波

   private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String vendorName;

    private String regionName;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getPayOrderCode() {
        return payOrderCode;
    }

    public void setPayOrderCode(String payOrderCode) {
        this.payOrderCode = payOrderCode == null ? null : payOrderCode.trim();
    }

    public Date getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Date orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Date getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Date orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail == null ? null : orderDetail.trim();
    }

    public Long getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Long orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Date getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public Integer getVdId() {
        return vdId;
    }

    public void setVdId(Integer vdId) {
        this.vdId = vdId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPickupCode() {
        return pickupCode;
    }

    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode == null ? null : pickupCode.trim();
    }

    public Integer getAddPoints() {
        return addPoints;
    }

    public void setAddPoints(Integer addPoints) {
        this.addPoints = addPoints;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Integer getMsId() {
        return msId;
    }

    public void setMsId(Integer msId) {
        this.msId = msId;
    }

    public Integer getIsEvaluation() {
        return isEvaluation;
    }

    public void setIsEvaluation(Integer isEvaluation) {
        this.isEvaluation = isEvaluation;
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

    public Integer getGameState() {
        return gameState;
    }

    public void setGameState(Integer gameState) {
        this.gameState = gameState;
    }


    public Integer getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(Integer gameLevel) {
        this.gameLevel = gameLevel;
    }
}