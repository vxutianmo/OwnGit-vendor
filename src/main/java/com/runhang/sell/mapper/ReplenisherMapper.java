package com.runhang.sell.mapper;

import com.runhang.sell.model.Replenisher;
import com.runhang.sell.model.ReplenisherExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ReplenisherMapper {
    int countByExample(ReplenisherExample example);

    int deleteByExample(ReplenisherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Replenisher record);

    int insertSelective(Replenisher record);

    List<Replenisher> selectByExample(ReplenisherExample example);

    Replenisher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Replenisher record, @Param("example") ReplenisherExample example);

    int updateByExample(@Param("record") Replenisher record, @Param("example") ReplenisherExample example);

    int updateByPrimaryKeySelective(Replenisher record);

    int updateByPrimaryKey(Replenisher record);
    /**
     *@Author: fyb
     *@Date 2019/1/22_17:23
     *@Param [repId]
     *@Return java.util.Map<java.lang.String,java.lang.Object>
     *@Description: 获取补货员信息
     */
    Map<String,Object> getReplenisherMap(@Param("repId") Integer repId);
}