package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/22 10:34
 * @Version 1.0
 * @Description 核销返回参数
 **/
@Data
public class CouponReturn {

    /**未使用*/
    public static final String UNUSED = "1";
    /**已使用*/
    public static final String USED = "2";

    /**商品Id*/
    private String id;
    /**核销码*/
    private String couponNo;
    /**归属商场*/
    private String mallCode;
    /**核销开始日期yyyy-MM-dd HH:mm:ss*/
    private String beginTime;
    /**核销截至日期yyyy-MM-dd HH:mm:ss*/
    private String endTime;
    /**可核销数量*/
    private Integer count;
    /**核销状态（1-未使用、2-已使用）*/
    private String status;
    /**
     * 核销时间yyyy-MM-dd HH:mm:ss
     *
     * 查询核销返回没有此参数
     * */
    private String useTime;

    /**一些有用信息，但万象城文档未给出*/
//    private String title;
//
//    private String merchantName;
//
//    private String merchantCode;
//
//    private String participant;
//
//    private String participantMobileNo;

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
