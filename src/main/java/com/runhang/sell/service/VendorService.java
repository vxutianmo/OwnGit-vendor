package com.runhang.sell.service;

import com.runhang.sell.model.Vendor;
import com.runhang.framework.result.Result;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2018/8/16 17:54
 * @Version 1.0
 * @Description
 **/
public interface VendorService {
    /**
     *@Author: fyb
     *@Date 2018/8/16_17:55
     *@Param [vendorCode]
     *@Return Vendor
     *@Description:
     */
    Result<Vendor> selectVendorMessageByVendorCode(String vendorCode);
    String insertVendorMessageByVendorCode(String vendorCode);//判断是否存在该售货机
    String insertVendorMessageByVendor(String vdCode);//面条机插入数据库
    String insertVendorMessageByVendorStatus(String vendorCode, String vdStatus, String Data1, String Data2, String Data3);//面条机更新状态
    String insertVendorMessageByOrder(String vdCode, String vdStatus, Integer Data1);//面条机生成订单

    /**
     *@Author: fyb
     *@Date 2019/4/25_13:56
     *@Param [code]
     *@Return java.lang.String
     *@Description:
     */
    String getDeviceNumber(String code);
}
