package com.runhang.sell.entity.old.request;

import java.io.Serializable;

/**
 * @ClassName VendorMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/10 0010 10:41
 * @Version 1.0
 * @Description 初始化售货机信息。
 **/
public class VendorMessage implements Serializable {

    /**售货机ID*/
    public static final String ATTR_VEN_ID = "Venid";
    /**售货机名称*/
    public static final String ATTR_VEN_NAME = "VenName";
    /**售货机类型*/
    public static final String ATTR_VEN_TYPE = "Ventype";
    /**销售类型*/
    public static final String ATTR_SELL_TYPE = "Selltype";
    /**厂家名*/
    public static final String ATTR_VENDER = "Vender";
    /**地址*/
    public static final String ATTR_ADDRESS = "Addres";
    /**推送ID*/
    public static final String ATTR_PUSH_ID = "Push_id";
    /**序列号*/
    public static final String ATTR_SERIAL_NUMBER = "Serial_number";
    /**彩票机信息*/
    public static final String ATTR_LOTTERY_CONTENT = "Lottery_content";
    /**拍照信息*/
    public static final String ATTR_CAMERA_CONTENT = "Camera_content";
    /**拍照信息*/
    public static final String ATTR_MERCHANT = "business_id";
}
