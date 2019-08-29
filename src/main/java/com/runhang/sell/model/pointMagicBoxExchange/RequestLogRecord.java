package com.runhang.sell.model.pointMagicBoxExchange;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.Date;

public class RequestLogRecord implements Serializable {

//    @Value("${shimao.url:http://116.236.192.38:8080/jcrm-server-card/rest}")
//    private static String UrlPrefix;
//
//    @Value("${mixc.url:http://test.mixcapp.com/merchant/gateway}")
//    //@Value("${mixc.url:https://app.mixcapp.com/merchant/gateway}")
//    private static String MixcUrl;

    public static final String GetByMBRByMobileNumUrl = "/mbr/getByMobileNum/";

    public static final String CheckAccountUrl = "/account/check";

    public static final String AddConsumeScoreUrl = "/score/addConsumeScore";

    public static final String AdjustScoreUrl = "/score/adjustScore";

    public static final String MixcLoginUrl = "/mixc.merchantapp.login";

    public static final String MixcGetCouponUrl = "/mixc.merchantapp.getCoupon";

    public static final String MixcUseCouponUrl = "/mixc.merchantapp.useCoupon";

    private Integer id;

    private String busType;

    private String interfaceType;

    private String url;

    private String inParam;

    private String outParam;

    private Date createTime;

    private Date updateTime;

    private Integer intervalMsec;

    private Integer deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getInParam() {
        return inParam;
    }

    public void setInParam(String inParam) {
        this.inParam = inParam == null ? null : inParam.trim();
    }

    public String getOutParam() {
        return outParam;
    }

    public void setOutParam(String outParam) {
        this.outParam = outParam == null ? null : outParam.trim();
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

    public Integer getIntervalMsec() {
        return intervalMsec;
    }

    public void setIntervalMsec(Integer intervalMsec) {
        this.intervalMsec = intervalMsec;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}