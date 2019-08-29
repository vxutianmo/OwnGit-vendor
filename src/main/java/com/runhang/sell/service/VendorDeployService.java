package com.runhang.sell.service;

import com.runhang.sell.model.AdvertSize;
import com.runhang.sell.model.Goods;
import com.runhang.framework.result.Result;
import com.runhang.sell.model.VendorDeploy;

import java.util.List;

/**
 * @ClassName VendorDeployService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/2 14:03
 * @Version 1.0
 * @Description 售货机部署相关服务。
 **/
public interface VendorDeployService {

    /**
     * 获取所有商品信息。
     */
    public List<Goods> getAllGoods();

    /**
     * 获取所有广告尺寸信息。
     */
    public AdvertSize getAllAdvertSize();

    /**
     * 获取售货机极光推送唯一标识
     * @param vendorCode
     * @return
     */
    //Result<VendorDeploy> selectVendorDeployByVendorCode(String vendorCode);
    /**
     *@Author: fyb
     *@Date 2018/10/15_9:30
     *@Param [vendorCode, status]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description: 根据售货机编号和售货机状态查询售货机部署信息，状态可以为多个
     */
    Result<VendorDeploy> selectVendorDeployByVendorCodeWithStatus(String vendorCode, String status);
    /**
     * 根据售货机部署id获取正常运行的售货机部署信息
     * @param vendorId
     * @return
     */
    Result<VendorDeploy> selectVendorDeployByVendorId(String vendorId);

    /**
     * 获取售货机极光推送唯一标识
     * @param vendorCode
     * @return
     */
    Result<VendorDeploy> selectVendorDeployByVendorCodeNoStatus(String vendorCode);

    /**
     *@Author: fyb
     *@Date 2018/8/16_15:39
     *@Param [vendorDeploy]
     *@Return com.runhang.framework.result.Result<java.lang.Boolean>
     *@Description:
     */
    Result<Boolean> insertVendorDeploy(VendorDeploy vendorDeploy);
    /**
     *@Author: fyb
     *@Date 2018/12/15_11:49
     *@Param [id]
     *@Return com.runhang.framework.result.Result<VendorDeploy>
     *@Description: 根据售货机部署id获取售货机部署信息
     */
    Result<VendorDeploy> selectById(Integer id);
    Result<Boolean> updateVendorDeploy(VendorDeploy vendorDeploy);
    /**
     *@Author: fyb
     *@Date 2018/11/20_20:03
     *@Param [deployId]
     *@Return VendorDeploy
     *@Description: 根据售货机部署id查询售货机部署及售货机编号
     */
    VendorDeploy selectVendorMsg(Integer deployId);

    /**
     *@Author: fyb
     *@Date 2019/2/25_14:36
     *@Param [vdCode]
     *@Return com.runhang.framework.result.Result<java.lang.Integer>
     *@Description: 根据设备编号获取商户id
     */
    Result<Integer> getBusinessId(String vdCode);
}
