package com.runhang.sell.model;

import com.runhang.sell.entity.fresh.request.AppAddress;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-11-13
 * Time: 11:35
 * Description:
 */

@Data
public class AppPushBody {
    private String vendorCode;
    private AppAddress addressMessage;


    public AppPushBody(String vendorCode, AppAddress addressMessage) {
        this.vendorCode = vendorCode;
        this.addressMessage = addressMessage;
    }
}