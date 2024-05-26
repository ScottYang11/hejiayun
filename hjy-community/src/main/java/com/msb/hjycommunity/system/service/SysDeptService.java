package com.msb.hjycommunity.system.service;

import com.msb.hjycommunity.system.domain.SysDept;

import java.util.List;

public interface SysDeptService {
    /**
     * 查询部分管理数据
     * @param sysdept
     * @return
     */
    public List<SysDept> selectDeptList(SysDept sysdept);
}
