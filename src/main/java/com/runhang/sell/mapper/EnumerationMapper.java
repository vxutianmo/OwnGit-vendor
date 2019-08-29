package com.runhang.sell.mapper;

import com.runhang.sell.model.Enumeration;
import com.runhang.sell.model.EnumerationExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;


public interface EnumerationMapper {
    int countByExample(EnumerationExample example);

    int deleteByExample(EnumerationExample example);

    int insert(Enumeration record);

    /**
     * 根据code和type去枚举表中查询description的方法
     * @param code,type
     * @return
     */
    String getDescriptionByCode(@Param("code") String code,@Param("type") String type);


    /**根据Description和Type获得code
     * @param description
     * @param type
     * @return
     */
    String getCodeByDescriptionAndType(@Param("description") String description, @Param("type") String type);

    int insertSelective(Enumeration record);

    List<Enumeration> selectByExample(EnumerationExample example);

    int updateByExampleSelective(@Param("record") Enumeration record, @Param("example") EnumerationExample example);

    int updateByExample(@Param("record") Enumeration record, @Param("example") EnumerationExample example);


    /** 根据枚举类型获取售后机类型
     * @param vendType
     * @return
     */
    Set<String> getVdType(String vendType);
}