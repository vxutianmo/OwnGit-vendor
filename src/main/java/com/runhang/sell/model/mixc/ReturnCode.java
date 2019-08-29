package com.runhang.sell.model.mixc;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/29 15:52
 * @Version 1.0
 * @Description 返回码及信息
 **/
public enum ReturnCode {
    SUCCESS("0000","查询成功"),
    CODE_INVALID("5001","核销码无效,请使用有效核销码"),
    VERIFY_TIMEOUT("5002","验证超时,请重新验证"),
    AISLE_LOCK("5003","货道已锁,商品无法出货,请联系客服"),
    UNDER_STOCK("5004","抱歉，该机器商品库存不足，请移至其他机器取货，如有疑问请联系客服"),
    UNDELIVERED("5005","抱歉,该商品未在机器中投放,请核对兑换地点,如有疑问请联系客服"),
    UNUSED_CODE("5006","核销码未到使用时间,无法进行兑换,请核对使用时间,如有疑问请联系客服"),
    OVERDUE_CODE("5007","核销码已过期,无法兑换商品"),
    USERD_CODE("5008","核销码已使用"),
    MULTIPLE_NOT_SUPPORT("5009","当前设备只允许一次兑换一个,不支持多个兑换"),

    COUTOM_ERROR("9998",""),
    SYSTEM_ERROR("9999", "系统异常");

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
