package com.msb.hjycommunity.web.controller.System;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.msb.hjycommunity.common.core.controller.BaseController;
import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.system.domain.SysDept;
import com.msb.hjycommunity.system.service.SysDeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/system/dept")
public class SysDeptController extends BaseController {
    @Resource
    private SysDeptService deptService;

    /**
     * 获取部分列表
     * @param sysDept
     * @return
     */
    @GetMapping("/list")
    public BaseResponse findDeptList(SysDept sysDept){
        List<SysDept> sysDepts = deptService.selectDeptList(sysDept);
        return BaseResponse.success(sysDepts);
    }
}
