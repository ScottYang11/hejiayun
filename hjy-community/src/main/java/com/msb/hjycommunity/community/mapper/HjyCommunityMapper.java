package com.msb.hjycommunity.community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HjyCommunityMapper extends BaseMapper<HjyCommunity> {
    List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity);
}
