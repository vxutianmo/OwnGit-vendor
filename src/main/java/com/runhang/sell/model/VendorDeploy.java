package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class VendorDeploy implements Serializable {

    /**复制构造器*/
    public VendorDeploy(com.runhang.base.model.vendormgt.VendorDeploy vendorDeploy){
        this.id = vendorDeploy.getId();
        this.vdId = vendorDeploy.getVdId();
        this.vendorName = vendorDeploy.getVendorName();
        this.status = vendorDeploy.getStatus();
        this.alarmStatus = vendorDeploy.getAlarmStatus();
        this.seriesId = vendorDeploy.getSeriesId();
        this.regionId = vendorDeploy.getRegionId();
        this.address = vendorDeploy.getAddress();
        this.temperature = vendorDeploy.getTemperature();
        this.powerOn = vendorDeploy.getPowerOn();
        this.powerOff = vendorDeploy.getPowerOff();
        this.businessId = vendorDeploy.getBusinessId();
        this.startTime = vendorDeploy.getStartTime();
        this.endTime = vendorDeploy.getEndTime();
        this.description = vendorDeploy.getDescription();
        this.deleted = vendorDeploy.getDeleted();
        this.alarmValue = vendorDeploy.getAlarmValue();
        this.limitValue = vendorDeploy.getLimitValue();
    }
    public VendorDeploy() {
    }

    private Integer id;

    private Integer vdId;

    private Integer status;

    private Integer alarmStatus;

    private Integer seriesId;

    private Integer regionId;

    private String address;

    private Integer temperature;

    private Integer powerOn;

    private Integer powerOff;

    private Integer supplyId;

    private Integer businessId;

    private Date startTime;

    private Date endTime;

    private String description;

    private String pushId;

    private String updatePushId;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String vendorName;

    private Integer alarmValue;

    private Integer limitValue;

    private String longitude;

    private String latitude;

    private String vendorCode;//储存售货机编号

    private String vendorType;//售货机类型

    private static final long serialVersionUID = 1L;

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getPowerOn() {
        return powerOn;
    }

    public void setPowerOn(Integer powerOn) {
        this.powerOn = powerOn;
    }

    public Integer getPowerOff() {
        return powerOff;
    }

    public void setPowerOff(Integer powerOff) {
        this.powerOff = powerOff;
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId == null ? null : pushId.trim();
    }

    public String getUpdatePushId() {
        return updatePushId;
    }

    public void setUpdatePushId(String updatePushId) {
        this.updatePushId = updatePushId == null ? null : updatePushId.trim();
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

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public Integer getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(Integer alarmValue) {
        this.alarmValue = alarmValue;
    }

    public Integer getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Integer limitValue) {
        this.limitValue = limitValue;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }
}