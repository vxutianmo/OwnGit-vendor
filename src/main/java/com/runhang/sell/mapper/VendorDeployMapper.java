package com.runhang.sell.mapper;

import com.runhang.sell.model.OrderDishesGoods;
import com.runhang.sell.model.VendorDeploy;
import com.runhang.sell.model.VendorDeployExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface VendorDeployMapper {
    int countByExample(VendorDeployExample example);

    int deleteByExample(VendorDeployExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorDeploy record);

    int insertSelective(VendorDeploy record);

    List<VendorDeploy> selectByExample(VendorDeployExample example);

    VendorDeploy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorDeploy record, @Param("example") VendorDeployExample example);

    int updateByExample(@Param("record") VendorDeploy record, @Param("example") VendorDeployExample example);

    int updateByPrimaryKeySelective(VendorDeploy record);

    int updateByPrimaryKey(VendorDeploy record);

    /** 根据售货机id获取售货机部署id
     * @param vdId
     * @return
     */
    Integer getIdByVdId(Integer vdId);

    /**
     * @Description 根据售货机id获取售货app极光推送唯一标识
     * @Param [vdId]
     * @return java.lang.String
     * @Author zhangyan
     * @Date 15:46 2018/8/21
     */
    String getPushIdByVdId(Integer vdId);
    /**
     * @Param: [vdId]
     * @return: java.lang.String
     * @Author: zhangyan
     * @Date: 2018/9/11 9:53
     * @Description: 根据售货机id获取updatePushID
     */
    String getUpdatePushIdByVdId(Integer vdId);

    /** 获取所有的售货app极光推送唯一标识
     * @return
     */
    List<String> getPushIdAll();

    /** 根据售货机部署id获得售货机id
     * @param vdId
     * @return
     */
    Integer getvIdByVdId(Integer vdId);
    /** 根据售货机部署id获得商户id
     * @param vdId
     * @return
     */
    Integer getBusin(Integer vdId);

    /**
     * 获取售货机部署基本信息
     *
     * @param deployId 部署ID
     * @return OrderDishesGoods
     */
    List<OrderDishesGoods> selectBasicInfoById(@Param("deployId") Integer deployId);

    List<VendorDeploy> fetchDeployByVdCode(@Param("venCode")String venCode);
    Integer getBusIdByVdCode(String vdCode);
    Map<String,String> getVdInfoByVdId(@Param("vdId")Integer vdId);
    Integer getIdByVdCode(@Param("vdCode") String vdCode);
    String getVdNameById(@Param("id")Integer id);
    String getVdCodeByVdId(@Param("vdId")Integer vdId);
    //根据id获取经度
    String getLongitudeById(@Param("id")Integer id);
    String getLatitudeById(@Param("id")Integer id);
}