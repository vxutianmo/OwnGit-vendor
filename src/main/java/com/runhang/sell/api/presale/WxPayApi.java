package com.runhang.sell.api.presale;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.utils.StringUtils;
import com.runhang.sell.entity.old.response.ResponseWrapper;
import com.runhang.sell.utils.AESUtils;
import com.runhang.sell.utils.PostRequest;
import com.runhang.sell.utils.ReqEntity;
import com.runhang.sell.utils.StaticVar;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@ApiIgnore
@Controller
@RequestMapping("sell/wxpay")
public class WxPayApi {
    //private final static Logger log= LoggerFactory.getLogger(WxPayController.class);

    @Autowired
    private WxMpService wxMpService;


    /**
     * 微信支付生成订单
     * @param outTradeNum
     * @param returnUrl
     * @param openid
     * @param price
     * @param infors
     * @param cancleUrl
     * @param failUrl
     * @return
     */
    @ApiOperation(value = "微信支付生成订单", notes = "微信支付生成订单")
    @RequestMapping(value = "/wp_sale")
    @ResponseBody
    public String wpsale(@RequestParam(name = "outTradeNum") String outTradeNum,
                      @RequestParam(name = "returnUrl") String returnUrl,
                      @RequestParam(name = "openid") String openid,
                      @RequestParam(name = "price") String price,
                      @RequestParam(name = "infors") String infors,
                      @RequestParam(name = "cancleUrl") String cancleUrl,
                      @RequestParam(name = "failUrl") String failUrl){
        log.info("WxPayApi wpsale---");

        log.info("支付金额："+price);
        log.info("openid："+openid);

        PostRequest postRequest = new PostRequest();
        JSONObject jo = new JSONObject();
        jo.put("outTradeNum",outTradeNum);
        jo.put("openid",openid);
        jo.put("infors",infors);

        //TODO 金额
        jo.put("price",price);

        jo.put("returnUrl",returnUrl);//支付回调url
        jo.put("cancleUrl",cancleUrl);//支付取消跳转url
        jo.put("failUrl",failUrl);//支付失败url

        String str =  JSONObject.toJSONString(jo);

        log.info("加密前的数据---"+str);
        String content = AESUtils.encrypt(str, StaticVar.KEY, StaticVar.IV);
        log.info("加密后的数据---"+content);

        //传输加密后的list
        ArrayList<ReqEntity> reqList = new ArrayList<>();
        reqList.add(new ReqEntity("content",content));

        String result =postRequest.postKvRequest(StaticVar.PAY_SERVER+"/rhpay/wpsale",reqList);

        log.info("支付服务器返回数据："+result);

        return result;
    }


    /**
     * 微信code获取用户信息
     * @param code
     * @param state
     * @return
     */
    @ApiOperation(value = "code获取用户信息", notes = "code获取用户信息")
    @RequestMapping(value = "/user_info")
    @ResponseBody
    public ResponseWrapper userInfo(@RequestParam(name = "code",required = true) String code,
                                    @RequestParam(name = "state",required = true) String state){
        log.info("WxPayApi userInfo---");
        log.info("code获取用户信息-请求参数-code-->" + code+",state-->"+state);

        ResponseWrapper responseWrapper = new ResponseWrapper();
        List<Map<String,Object>> retMapList = new ArrayList<>();

        /** 参数非空判断 */
        if(StringUtils.isEmpty(code)){
            responseWrapper.setResult("fail");
            responseWrapper.setResponse("参数不全");
            log.info("验证code，返回数据---"+responseWrapper);
            return responseWrapper;
        }

        Map<String,Object> map = new HashMap<>();
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        WxMpUser wxMpUser = new WxMpUser();
        String uId="";
        try {
            //获取access token
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
            wxMpUser = wxMpService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
            log.info(JSON.toJSONString("获取到的用户信息--"+wxMpUser));
        } catch (Exception e) {
            log.info("微信网页授权--", e);
        }
        //我们是为了网页支付，而网页支付主要是要openid
        String openId = wxMpOAuth2AccessToken.getOpenId();
        log.info("openId--"+openId);

        if("".equals(openId) || null==openId){
            map.put("flag",false);
            map.put("openId",null);
        }else{
            map.put("flag",true);

            map.put("openId",openId);
            map.put("nickname",wxMpUser.getNickname());
            map.put("sex",wxMpUser.getSex());
            map.put("language",wxMpUser.getLanguage());
            map.put("city",wxMpUser.getCity());
            map.put("province",wxMpUser.getProvince());
            map.put("country",wxMpUser.getCountry());
            map.put("headImgUrl",wxMpUser.getHeadImgUrl());
            map.put("sexId",wxMpUser.getSexId());

        }

        retMapList.add(map);

        responseWrapper.setResponse(retMapList);
        log.info("code获取用户信息-返回数据-->"+responseWrapper);
        return responseWrapper;
    }


    @ApiOperation(value = "微信支付回调", notes = "微信支付回调")
    @RequestMapping(value = "/wx_return_url")
    @ResponseBody
    public Map<String,Object> wxReturnUrl(@RequestParam(name = "outTradeNum") String outTradeNum,
                                       @RequestParam(name = "payCode") String payCode,
                                       @RequestParam(name = "payAmount") Long payAmount){
        log.info("WxPayApi wxReturnUrl---");

        log.info("订单号："+outTradeNum+"---流水号："+payCode+"---金额："+payAmount);

        Map<String,Object> map = new HashMap<>();
        map.put("flag","true");
        map.put("test","test");

        log.info("微信回调返回数据："+JSON.toJSONString(map));
        return map;
    }

    @ApiOperation(value = "test测试", notes = "test测试")
    @RequestMapping(value = "/test")
    @ResponseBody
    public ResponseWrapper test(@RequestParam(name = "test",required = true) String test){
        log.info("请求参数-test-->" + test);
        ResponseWrapper responseWrapper = new ResponseWrapper();
        List<Map<String,Object>> retMapList = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("flag","true");
        map.put("test","test");

        retMapList.add(map);

        responseWrapper.setResponse(retMapList);
        log.info("返回数据-->"+responseWrapper);
        return responseWrapper;
    }
}
