package com.runhang.sell.entity.fresh.push;

/**
 * @ClassName PushType
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 15:46
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
     *更新APP推送
     **/
    public static final int NOTICE_TYPE_LOG = 2;

    /**
     *广告推送
     **/
    public static final int NOTICE_TYPE_AD = 3;

    /**
     *截屏推送
     **/
    public static final int NOTICE_TYPE_SCREEN_SHOT = 4;

    /**
     *售货机货道推送
     **/
    public static final int NOTICE_TYPE_VENDOR_TRACK = 5;

    /**
     *商品推送
     **/
    public static final int NOTICE_TYPE_GOODS = 6;

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

}
