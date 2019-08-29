package com.runhang.sell.schedule.presale;

import com.runhang.framework.result.Result;
import com.runhang.sell.service.presale.PresaleService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create with IDEA
 *
 * @Author: zhangyan
 * @Date: 2019/5/21
 * @Time: 13:14
 * @Description: 定时检查取货码状态
 */
@Slf4j
public class AutomaticRefundJob implements Job {

    @Autowired
    private PresaleService presaleService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        log.info("预售-定时检测取货码有效期开始");
        Result result = presaleService.checkThePickUpCodeRegularly();
        if(!result.success()){
            log.error("预售-定时检测取货码有效期出现异常-"+result.msg());
            return;
        }
        log.info("预售-定时检测取货码有效期结束");
    }
}
