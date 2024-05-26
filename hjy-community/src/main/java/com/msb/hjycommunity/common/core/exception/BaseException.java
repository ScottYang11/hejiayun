package com.msb.hjycommunity.common.core.exception;

/**
 * 自定义异常类
 */
public class BaseException extends RuntimeException{
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误消息
     */
    private String defaultMessage;
    public BaseException(){};
    public BaseException(String code,String defalutMessage){
        this.code=code;
        this.defaultMessage=defalutMessage;
    }
    public String getCode(){
        return code;
    }
    public String getDefaultMessage(){
        return defaultMessage;
    }
}
