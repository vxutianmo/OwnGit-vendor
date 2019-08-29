package com.runhang.sell.core.common;

import com.alibaba.fastjson.JSONObject;
import com.runhang.framework.common.annotation.InterfaceLogAnnotation;
import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.model.InterfaceLog;
import com.runhang.sell.service.impl.InterfaceLogServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @ClassName SystemLogInterceptor
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/7 0007 13:11
 * @Version 1.0
 * @Description 自定义接口日志注解。
 **/
@Component
@Aspect
public class SystemLogInterceptor {

    private static Logger log = LoggerFactory.getLogger(SystemLogInterceptor.class);

    @Resource
    private InterfaceLogServiceImpl interfaceLogService;
    @Autowired
    ApplicationContext context;

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/7 0007 13:13
     *@Param [joinPoint]
     *@return java.lang.Object
     *@Description
     **/
    @Around("execution(@com.runhang.framework.common.annotation.InterfaceLogAnnotation * *..*.*(..))")
    public Object saveInterfaceLog(ProceedingJoinPoint joinPoint) throws Throwable {
        Date beginDate = new Date();
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        InterfaceLog interfaceLog = new InterfaceLog();
        InterfaceLogAnnotation interfaceLogAnnotation = getInterfaceLog(joinPoint);
        interfaceLog.setName(request.getMethod());
        interfaceLog.setNote(interfaceLogAnnotation.note());
        interfaceLog.setIp(getIpFromRequest(request));
        interfaceLog.setUrl(request.getRequestURI());
        interfaceLog.setDataType(interfaceLogAnnotation.dataType());
        interfaceLog.setUseType(interfaceLogAnnotation.useType());
        interfaceLog.setBeginTime(beginDate);
        Object[] params = joinPoint.getArgs();
        interfaceLog.setInputData(getInfoFromArgs(params,interfaceLogAnnotation));
        Object data = null;
        StringBuilder stringBuilder = new StringBuilder();
        data = joinPoint.proceed(params);
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
        saveInterfaceLogMessage(interfaceLog,data,stringBuilder.toString(),beginDate);
        return data;
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 14:04
     *@Param [interfaceLogMessage, data, detailMessage, beginDate]
     *@return void
     *@Description 报错接口日志信息。
     **/
    private void saveInterfaceLogMessage(InterfaceLog interfaceLogMessage,Object data,String detailMessage,Date beginDate){
        Date finishedDate = new Date();
        Integer interval = (int) (finishedDate.getTime() - beginDate.getTime());
        interfaceLogMessage.setOutputData(transData(data));
        interfaceLogMessage.setDescription(detailMessage);
        interfaceLogMessage.setFinishTime(finishedDate);
        interfaceLogMessage.setIntervalMsec(interval);
        interfaceLogMessage.setCreateTime(new Date());
        interfaceLogService.insertInterfaceLog(interfaceLogMessage);
    }
    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 10:11
     *@Param [data]
     *@return java.lang.String
     *@Description 数据转换。
     **/
    private String transData(Object data){
        if(data == null){
            return "";
        }
        if(data instanceof String){
            return data.toString();
        }
        if(data instanceof ResponseWrapper){
            return data.toString();
        }
        return "";
    }

    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 10:11
     *@Param [joinPoint]
     *@return com.runhang.framework.common.annotation.InterfaceLogAnnotation
     *@Description 获取注解添加数据。
     **/
    private InterfaceLogAnnotation getInterfaceLog(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class<?>[] classes = method.getParameterTypes();
                if (classes.length == arguments.length) {
                    return method.getAnnotation(InterfaceLogAnnotation.class);
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
    private void getInfoFromRequest(InterfaceLog record) {
        /** step0: 获取request*/
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        /** step1: 获取ip*/
        String ip = getIpFromRequest(request);
        record.setIp(ip);
        /** step2: 获取请求路径*/
        String url = request.getRequestURI();
        record.setUrl(url);
        /** step3: 获取请求method*/
        String method = request.getMethod();
        record.setName(method);
    }


    /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/7 0007 13:38
     *@Description 获取有效的输入数据。
     **/
    private String getInfoFromArgs(Object[] args, InterfaceLogAnnotation info) {
        Map<String,String> paramMap = new HashMap<>();
        if(args == null){
           return null;
        }
        int count = info.argCnt().getCnt();
        for(int i = 0; i < count; i++){
            paramMap.put("args"+i,JSONObject.toJSONString(args[0]));
        }
       return JSONObject.toJSONString(paramMap);
    }
}
