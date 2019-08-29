package com.runhang.sell.entity.fresh.push;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName ReplenishmentInfo
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/25 0025 16:51
 * @Version 1.0
 * @Description 补货信息。noticeType=0
 **/
@Data
public class ReplenishmentInfo {

     /**
      *@Description TODO
      * dictmsg["proid"]=venpro.pro.ProID;
      * 				dictmsg["ChId"]=venpro.trackNum
      * 				dictmsg["name"]=venpro.pro.ProName
      * 				dictmsg["count"]=venpro.proCount
      * 				dictmsg["current"]=venpro.proNum
      **/

     /**
      *商品ID
      **/
     private String goodsId;

    /**
     *货道编号
     **/
     private String trackNum;

    /**
     *商品名称
     **/
     private String goodsName;

    /**
     *货道存放商品总数量
     **/
     private String totalCount;

    /**
     *货道存放商品当前数量
     **/
     private String currentCount;

    @Override
     public String toString(){
         return JSONObject.toJSONString(this);
     }
}
