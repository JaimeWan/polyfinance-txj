package com.ptteng.service;

import com.ptteng.model.BannerRecommend;

public interface BannerRecommendService {
    int deleteByPrimaryKey(Long id);

    int insert(BannerRecommend record);

    int insertSelective(BannerRecommend record);

    BannerRecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BannerRecommend record);

    int updateByPrimaryKey(BannerRecommend record);
}