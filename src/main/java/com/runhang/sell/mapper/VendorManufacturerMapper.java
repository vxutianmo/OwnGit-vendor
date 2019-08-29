package com.runhang.sell.mapper;

import com.runhang.sell.model.VendorManufacturer;
import com.runhang.sell.model.VendorManufacturerExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VendorManufacturerMapper {
    int countByExample(VendorManufacturerExample example);

    int deleteByExample(VendorManufacturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorManufacturer record);

    int insertSelective(VendorManufacturer record);

    List<VendorManufacturer> selectByExample(VendorManufacturerExample example);

    VendorManufacturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorManufacturer record, @Param("example") VendorManufacturerExample example);

    int updateByExample(@Param("record") VendorManufacturer record, @Param("example") VendorManufacturerExample example);

    int updateByPrimaryKeySelective(VendorManufacturer record);

    int updateByPrimaryKey(VendorManufacturer record);

    /** 获取所有的厂商信息
     * @return
     */
    List<VendorManufacturer> selectAll();

    /** 根据厂商名称获得id
     * @param name
     * @return
     */
    Integer getIdByName(String name);
}