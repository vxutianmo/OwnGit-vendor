package com.runhang.sell.mapper;

import com.runhang.sell.entity.old.push.ProductionMessage;
import com.runhang.sell.model.Goods;
import com.runhang.sell.model.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    /** 获取所有的商品信息
     * @return
     */
    List<Goods> getAllGoods();
    /** 根据商品名字获取商品信息
     * @return
     */
    int seledtIdByName(String name);

    String getCodeById(Integer id);
    /** 获取所有的商品信息
     * @return
     */
    List<ProductionMessage> getProductionMessageAll();

    List<Goods> selectGoodsByBusIdAndCode(@Param("busId")Integer busId,@Param("code")String code);

    Map<String,Object> getGoodsInfoById(@Param("id")Integer id);

}