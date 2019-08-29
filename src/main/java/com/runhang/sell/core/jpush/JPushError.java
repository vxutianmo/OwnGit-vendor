package com.runhang.sell.core.jpush;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author huhongyuan
 * Date: 2018-09-17
 * Time: 14:25
 * Description: 推送时请求极光服务器返回的错误信息、异常
 */
@Data
public class JPushError {

    /**
     * msg_id : 1885900973
     * error : {"code":1011,"message":"cannot find user by this audience"}
     */

    private String msg_id;
    private ErrorBean error;


    @Data
    public static class ErrorBean {
        /**
         * code : 1011
         * message : cannot find user by this audience
         */

        private int code;
        private String message;
    }
}