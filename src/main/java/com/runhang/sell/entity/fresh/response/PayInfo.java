package com.runhang.sell.entity.fresh.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-19
 * Time: 9:46
 * Description:
 */
public class PayInfo {
    /**
     * appId : 11111
     * timeStamp : 1542432617114
     * status : 0
     * signType : MD5
     * package : prepay_id=wx17133017073026829630704d3429210049
     * callback_url : 11111
     * nonceStr : 1542432617114
     * paySign : 191BB1C332D77FE46AD9C18821C63FBE
     */

    private String appId;
    private String timeStamp;
    private String status;
    private String signType;
    @SerializedName("package")
    private String packageX;
    @SerializedName("callback_url")
    private String callbackUrl;
    private String nonceStr;
    private String paySign;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPackageX() {
        return packageX;
    }

    public void setPackageX(String packageX) {
        this.packageX = packageX;
    }

    public String getCallback_url() {
        return callbackUrl;
    }

    public void setCallback_url(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }
}