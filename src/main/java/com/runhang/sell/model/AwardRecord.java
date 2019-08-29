package com.runhang.sell.model;

import com.runhang.base.model.ordermgt.BaseAwardRecord;
import com.runhang.sell.entity.fresh.push.AwardsData;
import lombok.Data;

@Data
public class AwardRecord extends BaseAwardRecord {
    public static BaseAwardRecord createAwardRecord(Order order,AwardsData award,VendorTrackDeploy trackDeploy) {
        BaseAwardRecord base = new BaseAwardRecord();
        base.setOrderCode(award.getTradenum());
        base.setPayOrderCode(order.getPayOrderCode());
        base.setOrderTime(order.getOrderStartTime());
        base.setGoodsName(award.getGoodsName());
        base.setGoodsType(trackDeploy.getGoodsType());
        base.setGoodsPrice(trackDeploy.getSalePrice().longValue());
        base.setGoodsUrl(trackDeploy.getGoodsUrl());
        base.setVendorName(award.getVendorName());
        base.setTrackCode(trackDeploy.getTrackCode());
        base.setRegionName(award.getRegionMsg());
//        base.setWinnerCode("");
//        base.setWinnerName("");
//        base.setWinnerPhone("");
//        base.setRemark("");
        base.setBusId(Integer.parseInt(award.getBusinessId()));
        base.setOrderId(order.getId());
        base.setGoodsId(trackDeploy.getGoodsId());
        base.setVdId(order.getVdId());
        base.setChangeState(0);
        return base;
    }
    private String awardCounts;
}