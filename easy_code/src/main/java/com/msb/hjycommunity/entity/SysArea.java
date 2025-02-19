package com.msb.hjycommunity.entity;

import java.io.Serializable;

/**
 * 区域表(SysArea)实体类
 *
 * @author makejava
 * @since 2024-05-14 10:45:33
 */
public class SysArea implements Serializable {
    private static final long serialVersionUID = -79379146267927676L;
/**
     * 唯一主键
     */
    private Integer id;
/**
     * 城市编码
     */
    private Integer code;
/**
     * 城市名称
     */
    private String name;
/**
     * 城市父ID
     */
    private Integer parentid;
/**
     * 城市等级(0:省,1:市,2:县)
     */
    private Integer level;
/**
     * 功能类型(1:角色认证地点开通;0:未开通)
     */
    private Integer type;
/**
     * 服务状态
     */
    private Integer servicestate;
/**
     * 逻辑删除 0正常 1 删除
     */
    private Integer deleteFlag;
/**
     * 地区范围
     */
    private Integer region;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getServicestate() {
        return servicestate;
    }

    public void setServicestate(Integer servicestate) {
        this.servicestate = servicestate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

}

