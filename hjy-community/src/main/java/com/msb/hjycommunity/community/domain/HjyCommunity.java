package com.msb.hjycommunity.community.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.msb.hjycommunity.common.core.domain.BaseEntity;



/**
 * 小区对象
 */
public class HjyCommunity extends BaseEntity {
    private static final long serialVersionUID = -5116423231864830282L;
    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communityId;
    /**
     * 小区名称
     */
    private String communityName;
    /**
     * 小区编码
     */
    private String communityCode;
    /**
     *省区划码
     */
    private String communityProvinceCode;
    /**
     * 市区划码
     */
    private String communityCityCode;
    /**
     * 区县划码
     */
    private String communityTownCode;
    /**
     * 详细地址
     */
    private String communityDetailedAddress;
    /**
     * 经度
     */
    private String communityLongitude;
    /**
     * 维度
     */
    private String communityLatitude;
    /**
     * 物业Id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long deptId;
    /**
     * 排序
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long communitySort;


    public HjyCommunity() {
    }

    public HjyCommunity( Long communityId, String communityName, String communityCode, String communityProvinceCode, String communityCityCode, String communityTownCode, String communityDetailedAddress, String communityLongitude, String communityLatitude, Long deptId, Long communitySort) {

        this.communityId = communityId;
        this.communityName = communityName;
        this.communityCode = communityCode;
        this.communityProvinceCode = communityProvinceCode;
        this.communityCityCode = communityCityCode;
        this.communityTownCode = communityTownCode;
        this.communityDetailedAddress = communityDetailedAddress;
        this.communityLongitude = communityLongitude;
        this.communityLatitude = communityLatitude;
        this.deptId = deptId;
        this.communitySort = communitySort;
    }

    /**
     * 获取
     * @return communityId
     */
    public Long getCommunityId() {
        return communityId;
    }

    /**
     * 设置
     * @param communityId
     */
    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    /**
     * 获取
     * @return communityName
     */
    public String getCommunityName() {
        return communityName;
    }

    /**
     * 设置
     * @param communityName
     */
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    /**
     * 获取
     * @return communityCode
     */
    public String getCommunityCode() {
        return communityCode;
    }

    /**
     * 设置
     * @param communityCode
     */
    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    /**
     * 获取
     * @return communityProvinceCode
     */
    public String getCommunityProvinceCode() {
        return communityProvinceCode;
    }

    /**
     * 设置
     * @param communityProvinceCode
     */
    public void setCommunityProvinceCode(String communityProvinceCode) {
        this.communityProvinceCode = communityProvinceCode;
    }

    /**
     * 获取
     * @return communityCityCode
     */
    public String getCommunityCityCode() {
        return communityCityCode;
    }

    /**
     * 设置
     * @param communityCityCode
     */
    public void setCommunityCityCode(String communityCityCode) {
        this.communityCityCode = communityCityCode;
    }

    /**
     * 获取
     * @return communityTownCode
     */
    public String getCommunityTownCode() {
        return communityTownCode;
    }

    /**
     * 设置
     * @param communityTownCode
     */
    public void setCommunityTownCode(String communityTownCode) {
        this.communityTownCode = communityTownCode;
    }

    /**
     * 获取
     * @return communityDetailedAddress
     */
    public String getCommunityDetailedAddress() {
        return communityDetailedAddress;
    }

    /**
     * 设置
     * @param communityDetailedAddress
     */
    public void setCommunityDetailedAddress(String communityDetailedAddress) {
        this.communityDetailedAddress = communityDetailedAddress;
    }

    /**
     * 获取
     * @return communityLongitude
     */
    public String getCommunityLongitude() {
        return communityLongitude;
    }

    /**
     * 设置
     * @param communityLongitude
     */
    public void setCommunityLongitude(String communityLongitude) {
        this.communityLongitude = communityLongitude;
    }

    /**
     * 获取
     * @return communityLatitude
     */
    public String getCommunityLatitude() {
        return communityLatitude;
    }

    /**
     * 设置
     * @param communityLatitude
     */
    public void setCommunityLatitude(String communityLatitude) {
        this.communityLatitude = communityLatitude;
    }

    /**
     * 获取
     * @return deptId
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * 设置
     * @param deptId
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取
     * @return communitySort
     */
    public Long getCommunitySort() {
        return communitySort;
    }

    /**
     * 设置
     * @param communitySort
     */
    public void setCommunitySort(Long communitySort) {
        this.communitySort = communitySort;
    }

    public String toString() {
        return "HjyCommunity{serialVersionUID = " + serialVersionUID + ", communityId = " + communityId + ", communityName = " + communityName + ", communityCode = " + communityCode + ", communityProvinceCode = " + communityProvinceCode + ", communityCityCode = " + communityCityCode + ", communityTownCode = " + communityTownCode + ", communityDetailedAddress = " + communityDetailedAddress + ", communityLongitude = " + communityLongitude + ", communityLatitude = " + communityLatitude + ", deptId = " + deptId + ", communitySort = " + communitySort + "}";
    }
}
