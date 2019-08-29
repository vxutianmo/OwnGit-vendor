package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class InterfaceLog implements Serializable {
    /**数据类型：推送or请求*/
    public static final String DATA_TYPE_PUSH = "PUSH";
    public static final String DATA_TYPE_REQUEST = "REQUEST";
    /**应用类型：售货机APP接口or商户APP接口or补货APP接口*/
    public static final String USE_TYPE_BUSINESS = "BUSINESS";
    public static final String USER_TYPE_VENDOR = "VENDOR";
    public static final String USER_TYPE_REPLENISH = "REPLENISH";

    /**ID号*/
    private Integer id;

    /**方法名*/
    private String name;

    /**功能说明*/
    private String note;

    /**请求地址*/
    private String ip;

    /**请求URL*/
    private String url;

    /**数据类型:推送数据or请求数据*/
    private String dataType;

    /**接口类型:售货机接口or商户APP接口or补货APP接口*/
    private String useType;

    /**输入数据*/
    private String inputData;

    /**输出数据*/
    private String outputData;

    /**接口描述*/
    private String description;

    /**开始时间*/
    private Date beginTime;

    /**完成时间*/
    private Date finishTime;

    /**时间长度*/
    private Integer intervalMsec;

    /**创建时间*/
    private Date createTime;


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData == null ? null : inputData.trim();
    }

    public String getOutputData() {
        return outputData;
    }

    public void setOutputData(String outputData) {
        this.outputData = outputData == null ? null : outputData.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getIntervalMsec() {
        return intervalMsec;
    }

    public void setIntervalMsec(Integer intervalMsec) {
        this.intervalMsec = intervalMsec;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}