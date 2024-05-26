package com.msb.hjycommunity.system.service;

import com.msb.hjycommunity.system.domain.SysArea;
import com.msb.hjycommunity.system.domain.dto.SysAreaDto;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface SysAreaService {
    /**
     * 获取区域数据的完整树
     */
    List<SysAreaDto> findAreaAsTree();

}
