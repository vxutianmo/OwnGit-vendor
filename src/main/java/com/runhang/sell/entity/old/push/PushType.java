package com.runhang.sell.entity.old.push;

/**
 * @ClassName PushType
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 15:46
 * @Version 1.0
 * @Description 推送数据类型。
 **/
public class PushType {

    /**
     *补货推送
     **/
    public static final int NOTICE_TYPE_REPLENISHMENT = 0;

    /**
     *更新APP推送
     **/
    public static final int NOTICE_TYPE_UPDATE_APP = 1;

    /**
     *广告推送
     **/
    public static final int NOTICE_TYPE_AD = 3;

    /**
     *截屏推送
     **/
    public static final int NOTICE_TYPE_SCREEN_SHOT = 4;

    /**
     * 请求日志
     */
    public static final int NOTICE_TYPE_REQUEST_LOG = 3;

    /**
     * 请求售后机数据库
     */
    public static final int NOTICE_TYPE_REQUEST_DB = 2;

    /**
     *售货机货道推送
     **/
    public static final int NOTICE_TYPE_VENDOR_TRACK = 5;

    /**
     *商品推送
     **/
    public static final int NOTICE_TYPE_GOODS = 6;

    /**
     * 售货机温控信息推送
     **/
    public static final int NOTICE_TYPE_VENDOR_TEMP_CONTROL = 8;

    /**
     * 售货机公告推送
     **/
    public static final int NOTICE_TYPE_VENDOR_NOTICE = 9;
    /**
     * 设备编号推送
     */
    public static final int NOTICE_TYPE_DEVICE_NUMBER = 10;

    /**
     * 预售商品推送
     */
    public static final int NOTICE_TYPE_PRESALE_GOODS = 13;

    /**
     * 获取售货机日志
     **/
    public static final int TYPE_LOG = 0;

    /**
     * 获取售货机截屏
     **/
    public static final int TYPE_SCREEN_SHOT = 4;

    /**
     *广告新增
     **/
    public static final int TYPE_AD_ADD = 1;

    /**
     *广告删除
     **/
    public static final int TYPE_AD_DELETE = 2;

    /**
     *广告更新
     **/
    public static final int TYPE_AD_UPDATE = 3;

    /**
     *售货机货道新增
     **/
    public static final int TYPE_VENDOR_TRACK_ADD = 1;

    /**
     *售货机货道删除
     **/
    public static final int TYPE_VENDOR_TRACK_DELETE = 2;

    /**
     *售货机货道更新
     **/
    public static final int TYPE_VENDOR_TRACK_UPDATE = 3;

    /**
     *商品新增
     **/
    public static final int TYPE_GOODS_ADD = 1;

    /**
     *商品删除
     **/
    public static final int TYPE_GOODS_DELETE = 2;

    /**
     *商品更新
     **/
    public static final int TYPE_GOODS_UPDATE = 3;

    /**
     *APP更新
     **/
    public static final int TYPE_APP_UPDATE = 1;

}
