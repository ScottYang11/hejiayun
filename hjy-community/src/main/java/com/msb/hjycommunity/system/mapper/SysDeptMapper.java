package com.msb.hjycommunity.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.hjycommunity.system.domain.SysDept;

import java.util.List;

public interface SysDeptMapper extends BaseMapper<SysDept> {
    /**
     * 查询部门管理数据
     * @param sysdept
     * @return
     */
    public List<SysDept> selectDeptList(SysDept sysdept);
}
