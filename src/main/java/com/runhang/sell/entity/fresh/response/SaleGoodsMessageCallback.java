package com.runhang.sell.entity.fresh.response;

import com.runhang.sell.entity.old.request.SaleGoodsMessage;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-19
 * Time: 15:25
 * Description:
 */
@Data
public class SaleGoodsMessageCallback extends SaleGoodsMessage {
    private String goodsImage;
}