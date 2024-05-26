package com.msb.hjycommunity.system.domain.dto;


import java.io.Serializable;
import java.util.List;

/**
 * 区域层级模型--树结构
 */
public class SysAreaDto implements Serializable {

    private static final long serialVersionUID = 1779696542237696852L;
    //区划码
    private Integer code;

    //区划名称
    private String name;

    //子区划
    private List<SysAreaDto> children;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SysAreaDto> getChildren() {
        return children;
    }

    public void setChildren(List<SysAreaDto> children) {
        this.children = children;
    }
}
