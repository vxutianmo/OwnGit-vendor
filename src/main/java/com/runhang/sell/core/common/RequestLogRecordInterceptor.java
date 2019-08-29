package com.runhang.sell.core.common;

import com.alibaba.fastjson.JSONObject;
import com.runhang.framework.common.annotation.RequestLogRecordAnnotation;
import com.runhang.framework.result.Result;
import com.runhang.sell.model.pointMagicBoxExchange.RequestLogRecord;
import com.runhang.sell.model.shimao.mbr.RsMemberResponse;
import com.runhang.sell.service.pointMagicBoxExchange.RequestLogRecordService;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 请求接口的日志注解
 * @author: wangyuxin
 * @date: 2019/1/16 15:08
 **/
@Component
@Aspect
public class RequestLogRecordInterceptor {
    private static Logger log = LoggerFactory.getLogger(RequestLogRecordInterceptor.class);

    @Value("${shimao.url:http://116.236.192.38:8080/jcrm-server-card/rest}")
    private String UrlPrefix;

    @Resource
    private RequestLogRecordService requestLogRecordService;
    @Autowired
    ApplicationContext context;

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/7 0007 13:13
     *@Param [joinPoint]
     *@return java.lang.Object
     *@Description
     **/
    @Around("execution(@com.runhang.framework.common.annotation.RequestLogRecordAnnotation * *..*.*(..))")
    public Object saveInterfaceLog(ProceedingJoinPoint joinPoint) throws Throwable {
        Date beginDate = new Date();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        RequestLogRecord requestLogRecord = new RequestLogRecord();
        RequestLogRecordAnnotation requestLogRecordAnnotation = getInterfaceLog(joinPoint);
        requestLogRecord.setBusType(requestLogRecordAnnotation.busType());
        requestLogRecord.setInterfaceType(requestLogRecordAnnotation.interfaceType());
        requestLogRecord.setUrl(requestLogRecordAnnotation.url());
        Object[] params = joinPoint.getArgs();
        requestLogRecord.setInParam(getInfoFromArgs(params,requestLogRecordAnnotation));
        Result data = null;
//        StringBuilder stringBuilder = new StringBuilder();
        data = (Result) joinPoint.proceed(params);
//        try {
//             data = joinPoint.proceed(params);
//        }catch (IllegalArgumentException iae) {// 捕获参数异常
//            saveInterfaceLogMessage(interfaceLog,data,stringBuilder.append(iae).toString(),beginDate);
//            throw new Exception(iae);
//        }catch (ConcurrencyFailureException cfe) {// 捕获数据并发异常
//            saveInterfaceLogMessage(interfaceLog,data,stringBuilder.append(cfe).toString(),beginDate);
//            throw new Exception(cfe);
//        }catch (DataAccessException dae) {// 捕获其他数据访问异常，此处如需细化需参考spring
//            saveInterfaceLogMessage(interfaceLog,data,stringBuilder.append(dae).toString(),beginDate);
//            throw new Exception(dae);
//        }catch (Exception e){
//            saveInterfaceLogMessage(interfaceLog,data,stringBuilder.append(e).toString(),beginDate);
//            throw new Exception(e);
//        }
        saveInterfaceLogMessage(requestLogRecord,data,beginDate);
        return data;
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 14:04
     *@Param [interfaceLogMessage, data, detailMessage, beginDate]
     *@return void
     *@Description 报错接口日志信息。
     **/
    private void saveInterfaceLogMessage(RequestLogRecord requestLogRecordMessage,Result data,Date beginDate){
        Date finishedDate = new Date();
        Integer interval = (int) (finishedDate.getTime() - beginDate.getTime());
        requestLogRecordMessage.setOutParam(transData(data));
        requestLogRecordMessage.setCreateTime(new Date());
        requestLogRecordMessage.setIntervalMsec(interval);
        requestLogRecordService.addRequestLogRecord(requestLogRecordMessage);
    }
    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 10:11
     *@Param [data]
     *@return java.lang.String
     *@Description 数据转换。
     **/
    private String transData(Result data){
        if(data.msg() == null){
            return data.value().toString();
        }
        return data.msg();
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 10:11
     *@Param [joinPoint]
     *@return com.runhang.framework.common.annotation.InterfaceLogAnnotation
     *@Description 获取注解添加数据。
     **/
    private RequestLogRecordAnnotation getInterfaceLog(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class<?>[] classes = method.getParameterTypes();
                if (classes.length == arguments.length) {
                    return method.getAnnotation(RequestLogRecordAnnotation.class);
                }
            }
        }
        return null;
    }

    /**
     * 从Request中获取IP
     * @param request
     * @return
     */
    private String getIpFromRequest(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(!StringUtils.isEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }

    /**
     * 从Request中获取记录API日志所需的各种信息
     */
    private void getInfoFromRequest(RequestLogRecord record) {
        /** step0: 获取request*/
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        /** step1: 获取ip*/
        String ip = getIpFromRequest(request);
//        record.setIp(ip);
        /** step2: 获取请求路径*/
        String url = request.getRequestURI();
//        record.setUrl(url);
        /** step3: 获取请求method*/
        String method = request.getMethod();
//        record.setName(method);
    }


    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/7 0007 13:38
     *@Description 获取有效的输入数据。
     **/
    private String getInfoFromArgs(Object[] args, RequestLogRecordAnnotation info) {
        Map<String,String> paramMap = new HashMap<>();
        if(args == null){
            return null;
        }
        int count = info.argCnt().getCnt();
        for(int i = 0; i < count; i++){
            paramMap.put("args"+i,JSONObject.toJSONString(args[i]));
        }
        return JSONObject.toJSONString(paramMap);
    }
}
