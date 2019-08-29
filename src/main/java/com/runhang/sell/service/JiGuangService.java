package com.runhang.sell.service;

public interface JiGuangService {

    /**
     * @Param: [vdCode]
     * @return: java.lang.String
     * @Author: zhangyan
     * @Date: 2018/9/11 9:47
     * @Description: 根据售货机编号获取pushId
     */
    String getPushIdByVendCode(String vdCode);
    /**
     * @Param: [vdCode]
     * @return: java.lang.String
     * @Author: zhangyan
     * @Date: 2018/9/11 9:47
     * @Description: 根据售货机编号获取updatePushId
     */
    String getUpdatePushIdByVenCode(String vdCode);


}
