package com.runhang.sell.service.pointMagicBoxExchange;

import com.runhang.sell.model.pointMagicBoxExchange.RequestLogRecord;

/**
 * @ClassName InterfaceLogService
 * @Author wangzhaosen@runhangtech.com
 * @Date 2018/9/8 0008 11:16
 * @Version 1.0
 * @Description TODO
 **/
public interface RequestLogRecordService {

   /**
     *@Author wangzhaosen@runhangtech.com
     *@Date 2018/9/8 0008 11:18
     *@Param [interfaceLog]
     *@return void
     *@Description  插入接口日志
     **/
   void addRequestLogRecord(RequestLogRecord requestLogRecord);
}
