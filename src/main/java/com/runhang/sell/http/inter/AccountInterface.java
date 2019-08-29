package com.runhang.sell.http.inter;

import com.runhang.sell.http.config.FeignConfig;
import com.runhang.sell.http.hystrix.AccountHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AccountInterface
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:02
 * @Version 1.0
 * @Description 分账接口。
 **/
@FeignClient(value = "account-service",configuration= FeignConfig.class,fallback=AccountHystrix.class)
public interface AccountInterface {

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/17 0017 15:13
     *@Param orderCode ：订单编号
     *@return java.lang.String
     *@Description 订单分账。
     **/
    @RequestMapping(value = "/account/sale_account/",method = RequestMethod.POST)
    public String saleAccount(@RequestParam(name = "orderCode",required = true) String orderCode);

}
