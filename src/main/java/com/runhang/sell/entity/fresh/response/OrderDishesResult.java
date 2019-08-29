package com.runhang.sell.entity.fresh.response;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-17
 * Time: 13:07
 * Description: 返回给点餐机的数据
 */
@Data
public class OrderDishesResult<T> {
    /**
     * 0 成功，非0失败
     */
    private int code;
    private String message;
    private T body;

    public static <T> OrderDishesResult<T> returnSuccess(T body) {
        OrderDishesResult<T> result = new OrderDishesResult<>();
        result.setCode(0);
        result.setMessage("success");
        result.setBody(body);
        return result;
    }

    public static <T> OrderDishesResult<T> returnError(int code,String message) {
        OrderDishesResult<T> result = new OrderDishesResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}