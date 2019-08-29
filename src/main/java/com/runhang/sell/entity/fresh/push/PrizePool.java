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
public class PrizePool {
    //大奖详情信息轮询 例：喜异**情深在【世贸广场3楼1号魔盒机】获得IPoneX一部
    private List<String> awardList;
    //大奖统计信息
    private List<PrizePoolStat> poolStatList;

    public static PrizePoolStat convert(AwardRecord award) {
            PrizePoolStat pool = new PrizePoolStat();
            return pool;
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
