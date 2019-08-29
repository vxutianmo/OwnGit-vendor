package com.runhang.sell.schedule.presale;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;

/**
 * Create with IDEA
 *
 * @Author: zhangyan
 * @Date: 2019/5/21
 * @Time: 13:14
 * @Description: 定时检查取货码有效期
 */
@Component
public class AutomaticRefund {

    @Bean
    public JobDetail automaticRefundJob() {
        return JobBuilder.newJob(AutomaticRefundJob.class)
                .withIdentity("automaticRefundJob", "presale")
                .storeDurably()
                .build();
    }
    @Bean
    public Trigger automaticRefundJobTrigger() {
        JobKey key = new JobKey("automaticRefundJob", "presale");
        return TriggerBuilder.newTrigger()
                .withIdentity("automaticRefundJobTrigger", "presale")
                //
                .withSchedule(cronSchedule("0 5 0 1/1 * ? *"))
                .forJob(key)
                .build();
    }

}
