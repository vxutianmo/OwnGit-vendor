package com.runhang.sell.utils;

import java.util.Base64;

/**
 * Create with IDEA
 *
 * @ClassName
 * @Author fangyueben
 * @Date 2019/3/21 17:36
 * @Version 1.0
 * @Description
 * Base64可以将二进制转码成可见字符方便进行http传输，
 * 但是base64转码时会生成“+”，“/”，“=”这些被URL进行转码的特殊字符，
 * 导致两方面数据不一致。
 * URLSafeBase64是在发送前将“+”，“/”，“=”替换成URL不会转码的字符，
 * 接收到数据后，再将这些字符替换回去，再进行解码。
 **/
public class URLSafeBase64 {

    public static void main(String[] args){
        try {
            String params1 = "{\"userName\":\"13700000000\",\"password\":\"123456\"}";
            String params2 = "eyJ1c2VyTmFtZSI6IjEzNzAwMDAwMDAwIiwicGFzc3dvcmQiOiIxMjM0NTYifQ==";
            //加密
            System.out.println(safeUrlBase64Encode(params1));
            //解码
            System.out.println(safeUrlBase64Decode(params2));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     *@Author: fyb
     *@Date 2019/3/21_17:38
     *@Param [params]
     *@Return java.lang.String
     *@Description: 转码
     *
     */
    public static String safeUrlBase64Encode(String params){
        try {
            return new String(Base64.getUrlEncoder().encode(params.getBytes("UTF-8")));
        }catch (Exception e){
            e.printStackTrace();
            return "safeUrlBase64Encode error:"+e.getMessage();
        }
    }
    /**
     *@Author: fyb
     *@Date 2019/3/22_14:26
     *@Param [params]
     *@Return java.lang.String
     *@Description: 解码
     */
    public static String safeUrlBase64Decode(String params){
        try {
            return new String(Base64.getUrlDecoder().decode(params.getBytes("UTF-8")));
        }catch (Exception e){
            e.printStackTrace();
            return "safeUrlBase64Decode error:"+e.getMessage();
        }
    }
}
