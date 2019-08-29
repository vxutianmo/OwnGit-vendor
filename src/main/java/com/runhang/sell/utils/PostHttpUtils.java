package com.runhang.sell.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

public class PostHttpUtils {
    String postData=null;
    public String postData(HttpServletRequest servletRequest){
        try{
            //获取头部参数信息
            BufferedReader bufferReader = servletRequest.getReader();
            StringBuffer buffer = new StringBuffer();
            String line = " ";
            while ((line = bufferReader.readLine()) != null) {
                buffer.append(line);
            }
            postData = buffer.toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return postData;
    }
}
