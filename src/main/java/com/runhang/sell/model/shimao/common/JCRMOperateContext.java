package com.runhang.sell.model.shimao.common;

import lombok.Data;

/**
 * 世贸专用
 * @author: wt@runhang 
 * @date:   2019年1月11日 下午5:28:58   
 * @Copyright: 2019 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class JCRMOperateContext {
    private String time;             //时间格式: yyyy-MM-dd'T'HH:mm:ss.SSSZ
    private Operator operator;       //操作人信息
    private String terminalId;       //终端标识
    private String store;            //门店标识
}
