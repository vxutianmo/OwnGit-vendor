package com.runhang.sell.mapper;

import com.runhang.sell.model.ValidDeployGoods;
import com.runhang.sell.model.VendorTrackDeploy;
import com.runhang.sell.model.VendorTrackDeployExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface VendorTrackDeployMapper {
    int countByExample(VendorTrackDeployExample example);

    int deleteByExample(VendorTrackDeployExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VendorTrackDeploy record);

    int insertSelective(VendorTrackDeploy record);

    List<VendorTrackDeploy> selectByExample(VendorTrackDeployExample example);

    VendorTrackDeploy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VendorTrackDeploy record, @Param("example") VendorTrackDeployExample example);

    int updateByExample(@Param("record") VendorTrackDeploy record, @Param("example") VendorTrackDeployExample example);

    int updateByPrimaryKeySelective(VendorTrackDeploy record);

    int updateByPrimaryKey(VendorTrackDeploy record);
    /** 获取所有的货道信息
     * @return
     */
    List<VendorTrackDeploy> selectAll();

    /** 根据售货机部署id和商品不能为null获取货道部署信息
     * @param depId
     * @return
     */
    List<VendorTrackDeploy> selectChannelMessageByDepIdAndGoods(Integer depId);

    /** 根据售货机部署id获取售货机货道部署信息
     * @param depId
     * @return
     */
    List<VendorTrackDeploy> selectByDepId(Integer depId);

    /** 根据货道id删除数据
     * @param tId
     * @return
     */
    int deleteBytId(Integer tId);
    /** 根据商品id查询货道信息
     * @param tId
     * @return
     */
    VendorTrackDeploy selectByPrice(@Param("goodsId") Integer tId,@Param("depId") Integer ret2);

    /**
     * 点餐机商品信息
     *
     * @param deployId 部署ID
     * @return
     */
    List<ValidDeployGoods> selectValidDeployGoods(@Param("deployId") Integer deployId);

    /*
     *@Author: fyb
     *@Date 2018/11/14_11:58
     *@Param [vendorDeployId, trackCode]
     *@Return VendorTrackDeploy
     *@Description: 根据售货机部署id和货道编号查询货道部署信息
     */
    VendorTrackDeploy selectByVdIdAndTrackCode(@Param("vendorDeployId") Integer vendorDeployId,@Param("trackCode") String trackCode,@Param("vendorId") Integer vendorId);

    /**
     * 根据商品id获取售货机编号，用来判断是否可以删除商品
     * @param goodsId
     * @return
     */
    List<String> selectVdCodeByGoodsId(Integer goodsId);

    /**
     *@Author: fyb
     *@Date 2019/3/14_10:07
     *@Param [id]
     *@Return VendorTrackDeploy
     *@Description: 根据货道部署id查询货道部署信息及商品信息
     */
    VendorTrackDeploy selectTrackGoodsByPrimaryKey(Integer id);

    List<VendorTrackDeploy> selectTrackGoodByDeployIdAndGoodsId(@Param("trackStatus")Integer trackStatus,@Param("deployId") Integer deployId,@Param("goodsId") Integer goodsId);
    List<Integer> getGoodsIdsByVdId(@Param("vdId") Integer vdId,@Param("goodsClass") String goodsClass);
    Map<String,Object> getTrackGoodsInfo(@Param("vdId") Integer vdId,@Param("goodsId") Integer goodsId);
    List<Integer> getIdsByVdIdAndGoodsId(@Param("vdId") Integer vdId,@Param("goodsId") Integer goodsId);
    List<String> getGoodsClassByVdId(@Param("vdId") Integer vdId);
}