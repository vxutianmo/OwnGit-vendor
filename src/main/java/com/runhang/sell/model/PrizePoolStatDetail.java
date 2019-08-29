package com.runhang.sell.model;

import com.runhang.sell.entity.fresh.push.PrizePoolStat;
import lombok.Data;

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
public class PrizePoolStatDetail {
    //用来储存商品id
    private Integer id;
    //大奖类型 一等奖-0；二等奖-1；三等奖-2
    private String type;
    //大奖名称
    private String awardName;
    //大奖图片地址
    private String awardUrl;
    //已中出大奖数量 例：已中出45件
    private String awardCounts;

    public PrizePoolStatDetail() {
    }

    public static PrizePoolStat getPrizePoolStat(PrizePoolStatDetail detail) {
        PrizePoolStat poolStat = new PrizePoolStat();
        poolStat.setType(detail.getType());
        poolStat.setAwardName(detail.getAwardName());
        poolStat.setAwardUrl(detail.getAwardUrl());
        poolStat.setAwardCounts(detail.getAwardCounts());
        return poolStat;
    }
}
