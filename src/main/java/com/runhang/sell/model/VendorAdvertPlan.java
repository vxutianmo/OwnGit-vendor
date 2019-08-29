package com.runhang.sell.model;

public class VendorAdvertPlan extends com.runhang.base.model.marketingmgt.VendorAdvertPlan {
    public static VendorAdvertPlan from(com.runhang.base.model.marketingmgt.VendorAdvertPlan  value) {
        VendorAdvertPlan record = new VendorAdvertPlan();
        record.setId(value.getId());
        record.setVendorAdConfId(value.getVendorAdConfId());
        record.setPollingId(value.getPollingId());
        record.setTimingId(value.getTimingId());
        record.setDefaultAd1(value.getDefaultAd1());
        record.setDefaultAd2(value.getDefaultAd2());
        record.setAdvertisingSwitch(value.getAdvertisingSwitch());
        record.setStartTime(value.getStartTime());
        record.setEndTime(value.getEndTime());
        record.setCreateTime(value.getCreateTime());
        record.setUpdateTime(value.getUpdateTime());
        record.setDeleted(value.getDeleted());
        return record;
    }

    //用于存储售货机广告位置
    private String vendorAdConfig;

    public String getVendorAdConfig() {
        return vendorAdConfig;
    }

    public void setVendorAdConfig(String vendorAdConfig) {
        this.vendorAdConfig = vendorAdConfig;
    }
}