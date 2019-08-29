package com.runhang.sell.mapper;

import com.runhang.sell.model.Manufacturer;
import com.runhang.sell.model.ManufacturerExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {
    int countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    List<Manufacturer> selectByExample(ManufacturerExample example);

    Manufacturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);

    /** 根据id查询厂家名称
     * @param id
     * @return
     */
    String selectNameById(Integer id);
    /** 根据厂家名称查询id
     * @param name
     * @return
     */
    int selectIdByName(String name);
}