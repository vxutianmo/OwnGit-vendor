package com.runhang.sell.service.impl;


import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.mapper.NoodleMapper;
import com.runhang.sell.model.Noodle;
import com.runhang.sell.service.NoodleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @创建人：zc
 * @时间：2018/9/21 0021
 * @描述：
 */
@Slf4j
@Service
public class NoodleServiceImpl implements NoodleService {
    @Resource
    NoodleMapper noodleMapper;
    @Override
    //面条机数据添加
    public ResponseWrapper add(String noCode, Integer noStatus, String noData1, String noData2, String noData3){
        log.error("面机的保存的数据={}={}={}={}={}",noCode,noStatus,noData1,noData2,noData3);
        ResponseWrapper result = new ResponseWrapper();
        Noodle noodle = new Noodle();
        noodle.setNoCode(noCode);
        noodle.setNoStatus(noStatus);
        noodle.setNoData1(noData1);
        noodle.setNoData2(noData2);
        noodle.setNoData3(noData3);
        noodle.setReachTime(new Date());
        Integer ret =  noodleMapper.insert(noodle);
        if("-1".equals(ret)){
            result.setResult("失败");
            return result;
        }else {
            result.setResult("成功");
          return result;
        }
    }
}
