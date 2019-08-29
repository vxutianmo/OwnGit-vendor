package com.runhang.sell.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by diligentkong  in 14:44 2018/7/23 0023
 */
@Slf4j
public class PostRequest {

    public String postJsonRequest(String jsonReq, String url){
        String repDt = "";

        RequestConfig defaultRequestConfig = RequestConfig.custom()
                .setSocketTimeout(5000)
                .setConnectTimeout(5000)
                .setConnectionRequestTimeout(5000)
                .build();
        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(defaultRequestConfig)
                .build();
        HttpPost post = new HttpPost(url);

        if(jsonReq != null){
            StringEntity se = new StringEntity(jsonReq, Charset.forName("UTF-8"));
            post.setEntity(se);
        }
        post.setHeader("Content-type", "application/json; charset=utf-8");

//        post.s
        try {
            CloseableHttpResponse response = httpClient.execute(post);
            HttpEntity ren = response.getEntity();
            repDt = EntityUtils.toString(ren,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            repDt = "";

        }
        log.info("发送的数据"+jsonReq+"url"+url);
        log.info("返回结果:"+repDt);
        return repDt;
    }


    public String postKvRequest(String url, ArrayList<ReqEntity> reList){

        String repDt = "";

        RequestConfig defaultRequestConfig = RequestConfig.custom()
                .setSocketTimeout(5000)
                .setConnectTimeout(5000)
                .setConnectionRequestTimeout(5000)
                .build();

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(defaultRequestConfig)
                .build();

        ArrayList<NameValuePair> pairs = new ArrayList<NameValuePair>();

        for(int i = 0;i < reList.size();i++){
            pairs.add(new BasicNameValuePair(reList.get(i).getKey(),reList.get(i).getValue()));
        }

        HttpPost post = new HttpPost(url);

        HttpEntity he;
        try {
            he = new UrlEncodedFormEntity(pairs,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            //e.printStackTrace();
            return "";
        }

        post.setHeader("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
        post.setEntity(he);
//        post.setEntity();

        try{
            CloseableHttpResponse response = httpClient.execute(post);

            HttpEntity ren = response.getEntity();

            repDt = EntityUtils.toString(ren,"UTF-8");

        }catch(Exception e){
            //e.printStackTrace();
            repDt = "";
        }

        return repDt;
    }




}
