package com.runhang.sell.service.impl;

import cn.jpush.api.push.PushResult;

import com.runhang.base.model.core.PushRecord;
import com.runhang.base.model.core.PushTarget;
import com.runhang.base.model.vendormgt.VendorDeploy;
import com.runhang.base.model.vendormgt.VendorDeployExample;
import com.runhang.framework.result.Result;
import com.runhang.sell.core.jpush.JPushError;
import com.runhang.sell.push.JPushService;

import org.apache.ibatis.exceptions.PersistenceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-09-17
 * Time: 15:53
 * Description:
 */

@Service
public class PushResultService {


    private static final Logger log = LoggerFactory.getLogger(PushResultService.class);

    @Autowired
    VendorDeployServiceImpl deployService;

    @Autowired
    private PushRecordServiceImpl recordService;

    @Autowired
    private PushTargetServiceImpl targetService;

    /**
     * 请求极光服务器成功，并且极光成功创建推送记录
     *
     * @param param
     * @param result
     */
    public void savePushRecord(Map<String, Object> param, PushResult result) {
        int responseCode = result.getResponseCode();
        // 极光返回200 一定是正确。所有异常都不使用 200 返回码
        long msg_id = result.msg_id;
        String content = (String) param.get("msg");
        PushRecord pushRecord = makePushRecord(param);
        pushRecord.setContent(content);
        pushRecord.setResponseCode(responseCode);
        pushRecord.setMsgId(String.valueOf(msg_id));
        List<PushTarget> targetList = makePushTarget(param);
        persistence(pushRecord, targetList);

    }

    /**
     * 请求极光服务器成功，但是发生了错误，如推送目标不存在
     *
     * @param param
     * @param pushError
     */
    public void savePushRecord(Map<String, Object> param, JPushError pushError) {
        int code = pushError.getError().getCode();
        String msg_id = pushError.getMsg_id();
        String content = (String) param.get("msg");
        PushRecord pushRecord = makePushRecord(param);
        pushRecord.setContent(content);
        pushRecord.setResponseCode(code);
        pushRecord.setResponseMsg(pushError.getError().getMessage());
        pushRecord.setMsgId(String.valueOf(msg_id));
        List<PushTarget> targetList = makePushTarget(param);
        persistence(pushRecord, targetList);
    }

    @Transactional(rollbackFor = PersistenceException.class)
    public void persistence(PushRecord record, List<PushTarget> targetList) {
        Result<Integer> recordResult = recordService.create(record);
        if (!recordResult.success()) {
            throw new PersistenceException();
        }
        Integer recordId = record.getId();
        for (PushTarget target : targetList) {
            target.setPushId(recordId);
            Result<Integer> targetResult = targetService.create(target);
            if (!targetResult.success()) {
                throw new PersistenceException();
            }
        }

    }


    private PushRecord makePushRecord(Map<String, Object> param) {
        PushRecord pushRecord = new PushRecord();
        pushRecord.setContent((String) param.get("msg"));
        pushRecord.setPushType(((JPushService.TYPE) param.get("type")).getType());
        pushRecord.setPushMode("JPUSH");
        Object registrationId = param.get("registrationId");
        if (null != registrationId) {
            List<String> ids = (List<String>) registrationId;
            pushRecord.setTotal(ids.size());
        } else {
            VendorDeployExample example = new VendorDeployExample();
            example.createCriteria().andDeletedEqualTo(0).andUpdatePushIdIsNotNull().andPushIdIsNotNull();
            Result<List<VendorDeploy>> result = deployService.findByExample(example);
            if (result.success()) {
                List<VendorDeploy> deployList = result.value();
                pushRecord.setTotal(deployList.size());
            } else {
                log.error("查询售货机部署失败：" + result.msg());
            }
        }
        return pushRecord;
    }

    private List<PushTarget> makePushTarget(Map<String, Object> param) {
        List<PushTarget> targetList = new ArrayList<>();
        Object registrationId = param.get("registrationId");
        List<String> idList = new ArrayList<>();
        /**
         * 如果registrationId不等于空，说明这是一个单设备推送
         * 否则为多设备推送，则查询所有的售货机部署
         * TODO 实际上不能查询所有售货机部署，以后售货机种类可能很多，每个种类应该属于一个alias，所以应该是查出一个种类的售货机部署
         */
        if (registrationId != null) {
            idList = (List<String>) registrationId;
        } else {
            VendorDeployExample example = new VendorDeployExample();
            //TODO 查询条件优化，应该是正在运营的售货机
            example.createCriteria().andDeletedEqualTo(0).andPushIdIsNotNull().andUpdatePushIdIsNotNull();
            Result<List<VendorDeploy>> result = deployService.findByExample(example);
            if (result.success()) {
                List<VendorDeploy> value = result.value();
                JPushService.TYPE type = (JPushService.TYPE) param.get("type");
                for (VendorDeploy deploy : value) {
                    if (type.equals(JPushService.TYPE.DEFAULT)) {
                        //应该查询的是push_id
                        idList.add(deploy.getPushId());
                    } else {
                        //应该查询的是update_push_id
                        idList.add(deploy.getUpdatePushId());
                    }
                }
            }
        }
        if (!idList.isEmpty()) {
            idList.forEach(id -> {
                PushTarget target = new PushTarget();
                target.setRegistrationId(id);
                target.setStatus(1);
                targetList.add(target);
            });
        }
        return targetList;
    }
}