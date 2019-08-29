package com.runhang.sell.http.service;

import com.runhang.sell.http.inter.AccountInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AccountService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/17 0017 15:03
 * @Version 1.0
 * @Description 分账接口服务类。
 **/
@Service
public class AccountService {

    @Autowired
    AccountInterface accountInterface;

    public String saleAccount(String orderCode){
        return accountInterface.saleAccount(orderCode);
    }
}
