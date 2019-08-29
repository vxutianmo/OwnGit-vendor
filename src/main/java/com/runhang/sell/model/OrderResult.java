package com.runhang.sell.model;

import com.runhang.sell.entity.fresh.response.SaleGoodsMessageCallback;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-19
 * Time: 16:18
 * Description:
 */
@Data
public class OrderResult extends Order{

    private List<SaleGoodsMessageCallback> salists;

}