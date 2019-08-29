package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;

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
public class SyncGoodsData {

    public static final String GOODS_BRAND = "福袋大奖";
    public static final String MANUFACTURER = "网红商城";
    public static final String GOODS_TYPE = "OTHER";
    public static final String PACK = "BOX";

    /**商品编号*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="code")
    private String code;
    /**商品名称*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="name")
    private String name;
    /**大奖类型*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="type")
    private String type;
    /**条形码*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="barCode")
    private String bar_code;
    /**商品图片地址*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="imgUrl")
    private String img_url;
    /**商品价格*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="price")
    private String price;
    /**商户id*/
    @JSONField(serialzeFeatures=SerializerFeature.WriteMapNullValue ,name="businessId")
    private String businessId;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}
