package com.runhang.sell.service;

import com.runhang.sell.entity.old.response.ResponseWrapper;

/**
 * @创建人：zc
 * @时间：2018/9/21 0021
 * @描述：
 */
public interface NoodleService {
    ResponseWrapper add(String noCode, Integer noStatus, String noData1, String noData2, String noData3);
}
