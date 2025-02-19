package com.msb.hjycommunity.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 部门表(SysDept)实体类
 *
 * @author makejava
 * @since 2024-05-15 17:15:26
 */
public class SysDept implements Serializable {
    private static final long serialVersionUID = -29649095058907035L;
/**
     * 部门id
     */
    private Long deptId;
/**
     * 父部门id
     */
    private Long parentId;
/**
     * 祖级列表
     */
    private String ancestors;
/**
     * 部门名称
     */
    private String deptName;
/**
     * 显示顺序
     */
    private Integer orderNum;
/**
     * 负责人
     */
    private String leader;
/**
     * 联系电话
     */
    private String phone;
/**
     * 邮箱
     */
    private String email;
/**
     * 部门状态（0正常 1停用）
     */
    private String status;
/**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;
/**
     * 创建者
     */
    private String createBy;
/**
     * 创建时间
     */
    private Date createTime;
/**
     * 更新者
     */
    private String updateBy;
/**
     * 更新时间
     */
    private Date updateTime;


    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

