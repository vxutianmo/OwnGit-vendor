package com.runhang.sell.entity.fresh.response;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-17
 * Time: 11:51
 * Description: 支付系统返回数据
 */

@Data
public class PayServiceResponse<T> {
    private String code;
    private String result;
    private T response;
}