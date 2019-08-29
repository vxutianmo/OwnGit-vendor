package com.runhang.sell.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @创建人：zc
 * @时间：2018/9/21 0021
 * @描述：
 */
@Data
public class Noodle {
    private Integer id;
    private String noCode;//机器唯一标识码，汤机前两位为00，面机前两位为01
    private Integer noStatus;//运行状态，0：待机,1：大碗, 2：中碗,3：小碗,4：清洗,16：故障,面机0：待机,1：左,2：右 , 4：停机 ,16：故障
    private String noData1;//汤机：根据运行状态发送大中小碗的数量或故障码，面机：根据运行状态发送左右仓的数量或故障码
    private String noData2;//汤机：开机后浓汤的消耗量，蒸面机：备用 默认null
    private String noData3;//备用
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date reachTime;//接收时间
    private Integer deleted;

}
