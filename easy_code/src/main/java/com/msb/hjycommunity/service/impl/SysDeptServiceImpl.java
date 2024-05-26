package com.msb.hjycommunity.service.impl;

import com.msb.hjycommunity.entity.SysDept;
import com.msb.hjycommunity.dao.SysDeptDao;
import com.msb.hjycommunity.service.SysDeptService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 部门表(SysDept)表服务实现类
 *
 * @author makejava
 * @since 2024-05-15 17:21:44
 */
@Service("sysDeptService")
public class SysDeptServiceImpl implements SysDeptService {
    @Resource
    private SysDeptDao sysDeptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptId 主键
     * @return 实例对象
     */
    @Override
    public SysDept queryById(Long deptId) {
        return this.sysDeptDao.queryById(deptId);
    }

    /**
     * 分页查询
     *
     * @param sysDept 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysDept> queryByPage(SysDept sysDept, PageRequest pageRequest) {
        long total = this.sysDeptDao.count(sysDept);
        return new PageImpl<>(this.sysDeptDao.queryAllByLimit(sysDept, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysDept 实例对象
     * @return 实例对象
     */
    @Override
    public SysDept insert(SysDept sysDept) {
        this.sysDeptDao.insert(sysDept);
        return sysDept;
    }

    /**
     * 修改数据
     *
     * @param sysDept 实例对象
     * @return 实例对象
     */
    @Override
    public SysDept update(SysDept sysDept) {
        this.sysDeptDao.update(sysDept);
        return this.queryById(sysDept.getDeptId());
    }

    /**
     * 通过主键删除数据
     *
     * @param deptId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long deptId) {
        return this.sysDeptDao.deleteById(deptId) > 0;
    }
}
