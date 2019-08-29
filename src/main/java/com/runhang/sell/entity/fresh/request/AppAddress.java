package com.runhang.sell.entity.fresh.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName AddressMessage
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/8/11 0011 15:19
 * @Version 1.0
 * @Description 各个APP地址信息。
 **/
@Data
public class AppAddress implements Serializable {
        /**dbApp地址*/
        private String dbAddress;
        /**cloudApp地址*/
        private String cloudAddress;
        /**uiApp地址*/
        private String uiAddress;
        /**hwApp地址*/
        private String hwAddress;
        /**upApp地址*/
        private String updateAddress;
        /**dmApp地址*/
        private String dmAddress;
        /**需要更新APP的数量*/
        private Integer upNotice;

}
