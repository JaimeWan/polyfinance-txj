package com.ptteng.dao;

import com.ptteng.model.BannerRecommend;
import org.apache.ibatis.annotations.Mapper;

public interface BannerRecommendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BannerRecommend record);

    int insertSelective(BannerRecommend record);

    BannerRecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BannerRecommend record);

    int updateByPrimaryKey(BannerRecommend record);
}