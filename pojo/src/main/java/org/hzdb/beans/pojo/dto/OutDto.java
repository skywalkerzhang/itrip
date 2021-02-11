package org.hzdb.beans.pojo.dto;

import java.io.Serializable;

public class OutDto implements Serializable {
        /**
         * 前端响应的数据
         */
        private Object data;
        /**
         * 错误编码
         */
        private String errorCode;
        /**
         * 响应消息
         */
        private String msg;
        /**
         *  成功与否标识
         */
        private String success;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
