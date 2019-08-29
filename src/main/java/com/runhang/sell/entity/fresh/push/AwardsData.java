package com.runhang.sell.entity.fresh.push;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/11/14 10:37
 * @Version 1.0
 * @Description
 **/
@Data
public class AwardsData {
    @JSONField(serialzeFeatures =SerializerFeature.WriteMapNullValue,name = "tradeNum")
    private String tradenum;
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="url")
    private String url;
//    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="openId")
//    private String openId;
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="businessId")
    private String businessId;
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="businessName")
    private String businessName;
    /**售货机编号*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="vendorId")
    private String vendorId;
    /**售货机名称*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="vendorName")
    private String vendorName;
    /**商品编号*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="goodsId")
    private String goodsId;
    /**商品名称*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="goodsName")
    private String goodsName;
    /**点位名称*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="regionMsg")
    private String regionMsg;
    /**商品类别 一二三等奖*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="goodsType")
    private String goodsType;
    /**商品图片地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="goodsUrl")
    private String goodsUrl;
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}
