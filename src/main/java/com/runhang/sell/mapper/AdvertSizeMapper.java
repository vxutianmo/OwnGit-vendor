package com.runhang.sell.mapper;

import com.runhang.sell.model.AdvertSize;
import com.runhang.sell.model.AdvertSizeExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdvertSizeMapper {
    int countByExample(AdvertSizeExample example);

    int deleteByExample(AdvertSizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdvertSize record);

    int insertSelective(AdvertSize record);

    List<AdvertSize> selectByExample(AdvertSizeExample example);

    AdvertSize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdvertSize record, @Param("example") AdvertSizeExample example);

    int updateByExample(@Param("record") AdvertSize record, @Param("example") AdvertSizeExample example);

    int updateByPrimaryKeySelective(AdvertSize record);

    int updateByPrimaryKey(AdvertSize record);
}