package com.runhang.sell.model.lipstick;

import lombok.Data;

/**
 * 洪波引入的保存口红机货道部署查询结果的类
 * @author: wt@runhang 
 * @date:   2018年11月26日 下午4:16:32   
 * @Copyright: 2018 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class VendorTrackDeployVo {
    private int id; // 货道部署id
    private String trackNum; // 货道号
    private Integer goodsId; //商品id
    private String goodsName; //商品名称
    private Float salePrice; // 销售价格
    private Float playPrice; // 游戏价格
    private Integer currentCount; //当前数量
}
