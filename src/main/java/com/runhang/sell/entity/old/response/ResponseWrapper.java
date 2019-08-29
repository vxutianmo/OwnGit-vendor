package com.runhang.sell.entity.old.response;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @ClassName ResponseWrapper
 * @Description 返回数据统一包装类。(目前先按照我们自己的风格来写，考虑各种情况的各种处理问题)
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/7/24 19:01
 * @Version 1.0
 **/
@Data
public class ResponseWrapper {

    private static final String RESULT_SUCCESS = "success";
    private static final String RESULT_FAIL = "fail";

    /**是否成功*/
    private String result;
    /**返回数据*/
    private Object response;


    /**
     * 自定义返回结果
     * @param response
     * @return
     */
    public static ResponseWrapper markCustom(Object response){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setResult(RESULT_SUCCESS);
        responseWrapper.setResponse(response);
        return responseWrapper;
    }

    /**
     * 参数为空或者参数格式错误
     * @return
     */
    public static ResponseWrapper markParamError(Object response){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setResult(RESULT_FAIL);
        responseWrapper.setResponse(response);
        return responseWrapper;
    }

    /**
     * 查询失败
     * @return
     */
//    public static ResponseWrapper markError(){
//        ResponseWrapper responseWrapper = new ResponseWrapper();
//        responseWrapper.setSuccess(false);
//        responseWrapper.setCode(ReturnCode.FEAILED.getCode());
//        responseWrapper.setMsg(ReturnCode.FEAILED.getMsg());
//        responseWrapper.setData(null);
//        return responseWrapper;
//    }

    /**
     * 查询成功但无数据
     * @return
     */
//    public static ResponseWrapper markSuccessButNoData(){
//        ResponseWrapper responseWrapper  = new ResponseWrapper();
//        responseWrapper.setSuccess(true);
//        responseWrapper.setCode(ReturnCode.NODATA.getCode());
//        responseWrapper.setMsg(ReturnCode.NODATA.getMsg());
//        responseWrapper.setData(null);
//        return responseWrapper;
//    }

    /**
     * 查询成功且有数据
     * @param data
     * @return
     */
//    public static ResponseWrapper markSuccess(Object data){
//        ResponseWrapper responseWrapper = new ResponseWrapper();
//        responseWrapper.setSuccess(true);
//        responseWrapper.setCode(ReturnCode.SUCCESS.getCode());
//        responseWrapper.setMsg(ReturnCode.SUCCESS.getMsg());
//        responseWrapper.setData(data);
//        return  responseWrapper;
//    }

    /**
     * 生成json数据为后续系统间数据对接做数据备份。
     * 系统间所有数据均做保存，后续出现问题方便查找问题根由。
     * 系统间传递数据用pb，但系统间数据备份用json。
     * 同样接收数据也要做存储，方便查找。
     */
    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }

}
