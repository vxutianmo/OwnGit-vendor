package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorDeployProperties;
import com.runhang.sell.model.VendorDeployPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VendorDeployPropertiesMapper {
    int countByExample(VendorDeployPropertiesExample example);

    int deleteByExample(VendorDeployPropertiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorDeployProperties record);

    int insertSelective(VendorDeployProperties record);

    List<VendorDeployProperties> selectByExample(VendorDeployPropertiesExample example);

    VendorDeployProperties selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorDeployProperties record, @Param("example") VendorDeployPropertiesExample example);

    int updateByExample(@Param("record") VendorDeployProperties record, @Param("example") VendorDeployPropertiesExample example);

    int updateByPrimaryKeySelective(VendorDeployProperties record);

    int updateByPrimaryKey(VendorDeployProperties record);
    //根据设备部署id获取设备经度信息
    String selectLongitudeByVdId(@Param("vdId") Integer vdId);
    //根据设备部署id获取设备纬度信息
    String selectLatitudeByVdId(@Param("vdId") Integer vdId);
}