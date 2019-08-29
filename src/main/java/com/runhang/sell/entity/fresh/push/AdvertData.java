package com.runhang.sell.entity.fresh.push;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;

import java.io.Serializable;

/**
 *@Author: fyb
 *@Date 2018/10/31_14:48
 *@Param
 *@Return
 *@Description: 广告类型
 */
@Data
public class AdvertData implements Serializable {

    //@JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="vendorAdvertId")
    //private String vendorAdvertId;
    /**广告安排id -- ? 是编号还是id */
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adSettingId" ,ordinal = 1)
    private String adSettingId;
    /**广告id*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adInfoId" ,ordinal = 2)
    private String adInfoId;
    /**广告类型1 图片 2 视频*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adType" ,ordinal = 3)
    private Integer adType;
    /**图片路径唯一id*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="uniqueId" ,ordinal = 4)
    private Integer uniqueId;
    /**图片地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adInfo" ,ordinal = 5)
    private String adInfo;
    /**广告时长（广告为图片时，该字段为空）*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adTime" ,ordinal = 6)
    private String adTime;
    /**播放方式（1、轮播 2、定时）*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adPlayType" ,ordinal = 7)
    private Integer adPlayType;
    /**播放安排（是轮播为空，是定时，播放时间。定时时该参数为定时时间（str类型））时分秒*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="adPlayData" ,ordinal = 8)
    private String adPlayData;
    /**播放位置（1、首页下面的大广告 2、上面的图片视频混播放）-- 售货机广告位置管理那广告位置为String*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="place" ,ordinal = 9)
    private String place;

    public AdvertData(){

    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
