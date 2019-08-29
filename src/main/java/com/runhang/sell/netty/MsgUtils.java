package com.runhang.sell.netty;

import com.runhang.sell.service.NoodleService;
import com.runhang.sell.service.VendorService;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//import site.laoc.net.NetUtils;
//import site.laoc.utils.StaticVar;
@Component
@Slf4j
public class MsgUtils {

    public void dealMsg(String msg, ChannelHandlerContext ctx) {
        //头和尾的检验
        if (msg.length() < 34) {
            log.error("传来的数据的长度不对");
            return;
        }
        String head = msg.substring(0, 2);
        String tail = msg.substring(msg.length() - 2, msg.length());
        log.error("head: " + head + ", tail : " + tail);
        if (!"ff".equals(head) || !"df".equals(tail)) {
            log.error("传来的数据头或尾不对");
            return;
        }
        if (msg != null && !"".equals(msg)) {
            dealState(msg);
        }
    }

    private void dealCom(String msg) {

    }

    @Autowired
    private NoodleService noodleService;
    private static MsgUtils ms;

    @PostConstruct
    public void init() {
        ms = this;
        ms.noodleService = this.noodleService;
    }

    @Autowired
    private VendorService vendorService;
    private static MsgUtils ven;

    @PostConstruct
    public void veninit() {
        ven = this;
        ven.vendorService = this.vendorService;
    }

    /**
     * 数据解析
     */
    private void dealState(String msg) {
        //机器唯一标识码
        String NoCode = msg.substring(4, 16);
        //运行状态
        String NoStatus = msg.substring(22, 24);
        //汤机：根据运行状态发送大中小碗的数量或故障码，面机：根据运行状态发送左右仓的数量或故障码
        String Data1 = msg.substring(24, 26);
        //汤机：开机后浓汤的消耗量，蒸面机：备用 默认null
        String Data2 = msg.substring(26, 28);
        //备用
        String Data3 = msg.substring(28, 30);
        String vendor = ven.vendorService.insertVendorMessageByVendorCode(NoCode);
        if ("0".equals(vendor)) {
            log.error("无此售货机，进行初始化！");
            ven.vendorService.insertVendorMessageByVendor(NoCode);

        } else if ("1".equals(vendor)) {
            log.error("进行更改状态！");
			ven.vendorService.insertVendorMessageByVendorStatus(NoCode,NoStatus,Data1,Data2,Data3);
        }
        ms.noodleService.add(NoCode, Integer.valueOf(NoStatus), Data1, Data2, Data3);//面条机心跳
    }
}
