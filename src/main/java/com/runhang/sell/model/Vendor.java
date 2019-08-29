package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class Vendor implements Serializable {

    //福袋机
    public static final String LUCKYBAG_MACHINE = "LUCKYBAG_MACHINE";
    //口红机
    public static final String LIPSTICK_MACHINE = "LIPSTICK_MACHINE";
    //综合机
    public static final String COMPLEX_MACHINE = "COMPLEX_MACHINE";
    //饮料机
    public static final String DRINK_MACHINE = "DRINK_MACHINE";

    private Integer id;

    private String vdCode;

    private String vdType;

    private Integer manufacturerId;

    private String productCode;

    private Integer trackNum;

    private Integer lowTemp;

    private Integer highTemp;

    private String vdStatus;

    private Date reachTime;

    private Integer photo;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String vdName;

    private String serialNumber;

    private String sellType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVdCode() {
        return vdCode;
    }

    public void setVdCode(String vdCode) {
        this.vdCode = vdCode == null ? null : vdCode.trim();
    }

    public String getVdType() {
        return vdType;
    }

    public void setVdType(String vdType) {
        this.vdType = vdType == null ? null : vdType.trim();
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public Integer getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(Integer trackNum) {
        this.trackNum = trackNum;
    }

    public Integer getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(Integer lowTemp) {
        this.lowTemp = lowTemp;
    }

    public Integer getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(Integer highTemp) {
        this.highTemp = highTemp;
    }

    public String getVdStatus() {
        return vdStatus;
    }

    public void setVdStatus(String vdStatus) {
        this.vdStatus = vdStatus == null ? null : vdStatus.trim();
    }

    public Date getReachTime() {
        return reachTime;
    }

    public void setReachTime(Date reachTime) {
        this.reachTime = reachTime;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getVdName() {
        return vdName;
    }

    public void setVdName(String vdName) {
        this.vdName = vdName == null ? null : vdName.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getSellType() {
        return sellType;
    }

    public void setSellType(String sellType) {
        this.sellType = sellType == null ? null : sellType.trim();
    }
}