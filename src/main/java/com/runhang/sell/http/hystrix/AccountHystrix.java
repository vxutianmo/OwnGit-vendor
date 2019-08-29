package com.runhang.sell.http.hystrix;

import com.runhang.sell.http.inter.AccountInterface;
import org.springframework.stereotype.Component;

/**
 * @ClassName AccountHystrix
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:15
 * @Version 1.0
 * @Description 分账熔断处理。
 **/
@Component
public class AccountHystrix implements AccountInterface {

    @Override
    public String saleAccount(String orderCode) {
        return null;
    }
}
