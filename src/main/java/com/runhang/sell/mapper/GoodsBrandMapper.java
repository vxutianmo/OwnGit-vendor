package com.runhang.sell.mapper;

import com.runhang.sell.model.GoodsBrand;
import com.runhang.sell.model.GoodsBrandExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsBrandMapper {
    int countByExample(GoodsBrandExample example);

    int deleteByExample(GoodsBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsBrand record);

    int insertSelective(GoodsBrand record);

    List<GoodsBrand> selectByExample(GoodsBrandExample example);

    GoodsBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByExample(@Param("record") GoodsBrand record, @Param("example") GoodsBrandExample example);

    int updateByPrimaryKeySelective(GoodsBrand record);

    int updateByPrimaryKey(GoodsBrand record);

    /** 根据id查询品牌类别
     * @param id
     * @return
     */
    String selectClassById(Integer id);

    /** 根据id查询厂家id
     * @param id
     * @return
     */
    Integer selectMsanufacturerIdById(Integer id);

    /** 根据id获取商品分类和厂商id
     * @param id
     * @return
     */
    GoodsBrand selectGoodsBrandById(Integer id);

    String getBrandNameByGoodsId(Integer goodsId);
}