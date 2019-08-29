package com.runhang.sell.model;

import com.runhang.base.model.goods.BaseGoodsQuantityAlarmRecord;

import java.io.Serializable;
import java.util.Date;

public class GoodsQuantityAlarmRecord implements Serializable {
    private Integer id;

    private Integer vdId;

    private Integer rpId;

    private Integer currentQuantity;

    private Date alarmTime;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String vendorName;

    private static final long serialVersionUID = 1L;

    public GoodsQuantityAlarmRecord(BaseGoodsQuantityAlarmRecord base) {
        this.id = base.getId();
        this.vdId = base.getVdId();
        this.rpId = base.getRpId();
        this.currentQuantity = base.getCurrentQuantity();
        this.alarmTime = base.getAlarmTime();
        this.createTime = base.getCreateTime();
        this.updateTime = base.getUpdateTime();
        this.deleted = base.getDeleted();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVdId() {
        return vdId;
    }

    public void setVdId(Integer vdId) {
        this.vdId = vdId;
    }

    public Integer getRpId() {
        return rpId;
    }

    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}