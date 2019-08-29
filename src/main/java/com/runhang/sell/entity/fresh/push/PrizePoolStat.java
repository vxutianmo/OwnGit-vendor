package com.runhang.sell.entity.fresh.push;

import com.alibaba.fastjson.JSONObject;
import com.runhang.sell.model.AwardRecord;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/1 15:26
 * @Version 1.0
 * @Description
 **/
@Data
public class PrizePoolStat {
    //大奖类型 一等奖-0；二等奖-1；三等奖-2
    private String type;
    //大奖名称
    private String awardName;
    //大奖图片地址
    private String awardUrl;
    //已中出大奖数量 例：已中出45件
    private String awardCounts;

//    @Override
//    public String toString() {
//        return JSONObject.toJSONString(this);
//    }
}
