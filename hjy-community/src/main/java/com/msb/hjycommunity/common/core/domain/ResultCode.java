package com.msb.hjycommunity.common.core.domain;
/**
 *响应状态马
 */
public enum ResultCode {
    /**
     * 操作成功
     */
    SUCCESS("200","操作成功"),
    /**
     * 操作失败
     */
    ERROR("500","操作失败");


    private String code;
    private String message;
    private ResultCode(String code,String message){
        this.code=code;
        this.message=message;
    }
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
