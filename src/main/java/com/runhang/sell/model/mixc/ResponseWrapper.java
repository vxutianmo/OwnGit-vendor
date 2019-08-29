package com.runhang.sell.model.mixc;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 *@Date 2019/3/29_15:59
 *@Description: 返回结果封装类
 */
@Data
public class ResponseWrapper {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    /**返回码*/
    private String code;
    /**是否成功*/
    private String result;
    /**返回数据*/
    private Object response;

    /**
     *@Author: fyb
     *@Date 2019/3/29_15:58
     *@Param [response]
     *@Return ResponseWrapper
     *@Description: 成功
     */
    public static ResponseWrapper markSuccess(Object response){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setCode(ReturnCode.SUCCESS.getCode());
        responseWrapper.setResult(SUCCESS);
        responseWrapper.setResponse(response);
        return responseWrapper;
    }

    /**
     *@Author: fyb
     *@Date 2019/3/29_15:59
     *@Param [returnCode]
     *@Return ResponseWrapper
     *@Description: 失败
     */
    public static ResponseWrapper markFail(ReturnCode returnCode){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setCode(returnCode.getCode());
        responseWrapper.setResult(FAIL);
        responseWrapper.setResponse(returnCode.getMsg());
        return responseWrapper;
    }

    /**
     *@Author: fyb
     *@Date 2019/3/29_15:59
     *@Param [returnCode]
     *@Return ResponseWrapper
     *@Description: 失败，错误信息拼接
     */
    public static ResponseWrapper markFail(ReturnCode returnCode,String msg){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setCode(returnCode.getCode());
        responseWrapper.setResult(FAIL);
        responseWrapper.setResponse(returnCode.getMsg()+msg);
        return responseWrapper;
    }

    /**
     *@Author: fyb
     *@Date 2019/3/29_15:59
     *@Param [returnCode]
     *@Return ResponseWrapper
     *@Description: 失败
     */
    public static ResponseWrapper markFailMsg(String msg){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setCode(ReturnCode.COUTOM_ERROR.getCode());
        responseWrapper.setResult(FAIL);
        responseWrapper.setResponse(msg);
        return responseWrapper;
    }

    /**
     * 自定义返回结果
     */
    public static ResponseWrapper markCustom(String result,String code,Object response){
        ResponseWrapper responseWrapper = new ResponseWrapper();
        responseWrapper.setCode(code);
        responseWrapper.setResult(result);
        responseWrapper.setResponse(response);
        return responseWrapper;
    }

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
