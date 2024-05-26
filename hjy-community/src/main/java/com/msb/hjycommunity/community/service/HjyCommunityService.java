package com.msb.hjycommunity.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;

import java.util.List;

public interface HjyCommunityService extends IService<HjyCommunity> {
    /**
     * 查询小区信息列表
     * @param HjyCommunity
     * @return
     */
    List<HjyCommunityDto> selectHjyCommunityList(HjyCommunity HjyCommunity);
    /**
     * 新增小区
     */
    int insertHjyCommunity(HjyCommunity hjyCommunity);

    /**
     * 获取小区详细信息
     * @param communityId
     * @return
     */
    HjyCommunity selectHjyCommunityById(Long communityId);
    /**
     * 修改小区
     */
    int updateHjyCommunity(HjyCommunity hjyCommunity);

    /**
     * 删除小区
     * @param communityIds
     * @return
     */
    int deleteHjyCommunityByIds(Long[] communityIds);

}
