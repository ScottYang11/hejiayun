package com.msb.hjycommunity.web.controller.community;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.hjycommunity.common.core.Page.PageResult;
import com.msb.hjycommunity.common.constant.HttpStatus;
import com.msb.hjycommunity.common.core.controller.BaseController;
import com.msb.hjycommunity.common.core.domain.BaseResponse;
import com.msb.hjycommunity.common.utils.ServletUtils;
import com.msb.hjycommunity.community.domain.HjyCommunity;
import com.msb.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.msb.hjycommunity.community.service.HjyCommunityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/community")
public class HjyCommunityController extends BaseController{
    @Resource
    private HjyCommunityService hjyCommunityService;

    @GetMapping("/list")
    public PageResult list(HjyCommunity hjyCommunity){
        startPage();
        List<HjyCommunityDto> list = hjyCommunityService.selectHjyCommunityList(hjyCommunity);
        //响应数据
        return getDate(list);
    }

    /**
     * 新增小区
     * @param hjyCommunity
     * @return
     */
    @PostMapping
    public BaseResponse add(@RequestBody HjyCommunity hjyCommunity){
        return toAjax(hjyCommunityService.insertHjyCommunity(hjyCommunity));
    }

    /**
     * 根据id查询小区信息
     * @param communityId
     * @return
     */
    @GetMapping(value = "/{communityId}")
    public BaseResponse getInfo(@PathVariable("communityId") Long communityId){
        return BaseResponse.success(hjyCommunityService.selectHjyCommunityById(communityId));
    }

    /**
     * 修改小区
     * @param hjyCommunity
     * @return
     */
   @PutMapping
    public BaseResponse edit(@RequestBody HjyCommunity hjyCommunity){
        return toAjax(hjyCommunityService.updateHjyCommunity(hjyCommunity));
   }
   @DeleteMapping(value = "/{communityIds}")
    public BaseResponse remover(@PathVariable("communityIds")Long[] communityIds){
       return toAjax(hjyCommunityService.deleteHjyCommunityByIds(communityIds));
   }
}
