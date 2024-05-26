package com.msb.hjycommunity.community.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.msb.hjycommunity.community.mapper.HjyCommunityMapper;
import com.msb.hjycommunity.community.service.HjyCommunityService;
import com.msb.hjycommunity.system.domain.SysArea;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
@Service
public class HjyCommunityServiceImpl extends ServiceImpl<HjyCommunityMapper,HjyCommunity> implements HjyCommunityService {
    @Resource
    private HjyCommunityMapper communityMapper;
    private static final String CODE_PREFIX="COMMUNITY_";
    @Override
    public List<HjyCommunityDto> selectHjyCommunityList(HjyCommunity hjyCommunity) {
        return communityMapper.queryList(hjyCommunity);
    }

    @Override
    public int insertHjyCommunity(HjyCommunity hjyCommunity) {
        //设置小区编码
        hjyCommunity.setCommunityCode(CODE_PREFIX+ System.currentTimeMillis());
        return communityMapper.insert(hjyCommunity);
    }

    @Override
    public HjyCommunity selectHjyCommunityById(Long communityId) {
        return communityMapper.selectById(communityId);
    }

    @Override
    public int updateHjyCommunity(HjyCommunity hjyCommunity) {
        return communityMapper.updateById(hjyCommunity);
    }

    @Override
    public int deleteHjyCommunityByIds(Long[] communityIds) {
        return communityMapper.deleteBatchIds(Arrays.asList(communityIds));
    }
}
