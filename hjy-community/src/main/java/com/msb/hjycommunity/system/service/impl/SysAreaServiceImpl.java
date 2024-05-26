package com.msb.hjycommunity.system.service.impl;

import com.msb.hjycommunity.system.domain.SysArea;
import com.msb.hjycommunity.system.domain.dto.SysAreaDto;
import com.msb.hjycommunity.system.mapper.SysAreaMapper;
import com.msb.hjycommunity.system.service.SysAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SysAreaServiceImpl implements SysAreaService {
    @Resource
    private SysAreaMapper sysAreaMapper;
    @Override
    public List<SysAreaDto> findAreaAsTree() {
        //获取区域表数据
        List<SysArea> list = sysAreaMapper.findAll();
        List<SysAreaDto> collect = list.stream()//把集合转换成流
                .filter(area -> area.getParentCode().equals(0))//筛选pid为0的area跟节点对象
                .map(area -> {//将area进行转换
                    SysAreaDto sysAreaDto = new SysAreaDto();
                    sysAreaDto.setCode(area.getCode());
                    sysAreaDto.setName(area.getName());
                    sysAreaDto.setChildren(getChildrenArea(sysAreaDto, list));
                    return sysAreaDto;
                }).collect(Collectors.toList());

        return collect;
    }

    /**
     * 递归设置区域信息
     * @param sysAreaDto  上级区域信息
     * @param list  所有区域信息
     * @return
     */

    private List<SysAreaDto> getChildrenArea(SysAreaDto sysAreaDto, List<SysArea> list) {
        //获取当前副区域的子节点
        List<SysArea> subAreaList = list.stream().filter(area -> area.getParentCode().equals(sysAreaDto.getCode())).
                //把当前流装换为一个List集合
                        collect(Collectors.toList());
        if (subAreaList!=null&&subAreaList.size()!=0){
            return subAreaList.stream().map(area->{
                SysAreaDto subAreaDto = new SysAreaDto();
                subAreaDto.setName(area.getName());
                subAreaDto.setCode(area.getCode());
                //设置子节点，递归调用直到获取到叶子结点为止
                subAreaDto.setChildren(getChildrenArea(subAreaDto,list));
                return subAreaDto;
            }).collect(Collectors.toList());
        }
        return null;
    }
}
