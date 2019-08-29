package com.runhang.sell.utils;


/**
 * Created by diligentkong  in 15:06 2018/7/23 0023
 */

public class ReqEntity {
    private String key;
    private String value;

    public ReqEntity(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }



    public String getValue() {
        return value;
    }

    public ReqEntity() {
    }
}
