package com.runhang.sell.mapper;

import com.runhang.sell.model.OrderPayDetail;
import com.runhang.sell.model.OrderPayDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderPayDetailMapper {
    int countByExample(OrderPayDetailExample example);

    int deleteByExample(OrderPayDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderPayDetail record);

    int insertSelective(OrderPayDetail record);

    List<OrderPayDetail> selectByExample(OrderPayDetailExample example);

    OrderPayDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderPayDetail record, @Param("example") OrderPayDetailExample example);

    int updateByExample(@Param("record") OrderPayDetail record, @Param("example") OrderPayDetailExample example);

    int updateByPrimaryKeySelective(OrderPayDetail record);

    int updateByPrimaryKey(OrderPayDetail record);
}