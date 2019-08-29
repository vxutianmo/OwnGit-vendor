package com.runhang.sell.mapper;

import com.runhang.sell.model.GoodsCompleted;
import com.runhang.sell.model.OrderResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-19
 * Time: 14:41
 * Description:
 */
public interface WechatJsOrderMapper {
    /**
     * 根据用户open_id和商户ID获取订单
     *
     * @param openId     微信用户open_id
     * @param businessId 商户ID
     * @return List<OrderResult>
     */
    List<OrderResult> selectOrderByOpenId(@Param("openId") String openId, @Param("businessId") Integer businessId,
                                          @Param("deployId")Integer deployId);

    /**
     * 查询商品的完整信息，图片，TODO 品牌，分类
     *
     * @param id 商品ID
     * @return GoodsCompleted
     */
    GoodsCompleted selectGoodsComplete(@Param("id") String id);
}
