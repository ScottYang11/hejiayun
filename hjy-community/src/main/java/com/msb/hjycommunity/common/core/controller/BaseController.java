package com.msb.hjycommunity.common.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.Page.PageDomain;
import com.msb.hjycommunity.common.core.Page.PageResult;
import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.common.utils.ServletUtils;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * 基础控制类
 * BaseController作为所有Controller的基类，提供了一些公共的方法
 * 比如每个模块都有分页查询的业务需求，那么我们就可以将分页查询的处理提取到基类中
 * 所有继承自BaseController的子类不用再进行分页处理
 */
@CrossOrigin
public class BaseController {
    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM="pageNum";
    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE="pageSize";
    /**
     * 分页封装
     */
    public static PageDomain getPageDomain(){
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        return pageDomain;
    }
    /**
     * 调用PageHelper的startPage，设置分页参数
     */
    protected void startPage(){
        PageDomain pageDomain = getPageDomain();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (pageNum!=null && pageSize!=null){
            PageHelper.startPage(pageNum,pageSize);
        }
    }
    /**
     * 响应分页数据
     */
    protected PageResult getDate(List<?> list){
        PageResult pageResult = new PageResult();
        pageResult.setCode(HttpStatus.SUCCESS);
        pageResult.setMsg("查询成功");
        pageResult.setRows(list);
        pageResult.setTotal(new PageInfo(list).getTotal());
        return pageResult;
    }
    /**
     * 响应返回的结果(针对增删改)
     */
    protected BaseResponse toAjax(int rows){
        return rows>0 ? BaseResponse.success(rows):BaseResponse.fail("操作失败");
    }
}
