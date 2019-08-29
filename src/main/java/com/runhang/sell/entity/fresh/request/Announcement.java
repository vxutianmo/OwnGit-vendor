package com.runhang.sell.entity.fresh.request;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @Author: zhangyan
 * @Date: 2018-11-03
 * @Time: 14:51
 * @Description: 公告实体类
 */
@Data
public class Announcement {
    //公告状态 1-有效，0-无效
    private Integer status;
    //公告内容
    private String content;
    //售货机唯一编号
    private String venCode;

    public Announcement(){}
    public Announcement(Integer status,String content,String venCode){
        this.status = status;
        this.content = content;
        this.venCode = venCode;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
