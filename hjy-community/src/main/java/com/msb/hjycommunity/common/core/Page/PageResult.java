package com.msb.hjycommunity.common.core.Page;


import java.io.Serializable;
import java.util.List;

/**
 * 分页数据统一封装成响应对象
 */
public class PageResult implements Serializable {
    private static final long serialVersionUID = 5673226264227470939L;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 列表数据
     */
    private List<?> rows;
    /**
     * 消息状态码
     */
    private int code;
    /**
     * 消息内容
     */
    private String msg;

    public PageResult(){};

    public long getTotal() {
        return total;
    }
    public PageResult(Long total ,List<?> rows){
        this.total=total;
        this.rows=rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
