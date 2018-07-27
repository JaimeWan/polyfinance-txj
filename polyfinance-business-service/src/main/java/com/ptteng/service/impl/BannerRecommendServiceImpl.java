package com.ptteng.service.impl;

import com.ptteng.model.BannerRecommend;
import com.ptteng.service.BannerRecommendService;
import org.springframework.stereotype.Service;

@Service
public class BannerRecommendServiceImpl implements BannerRecommendService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(BannerRecommend record) {
        return 0;
    }

    @Override
    public int insertSelective(BannerRecommend record) {
        return 0;
    }

    @Override
    public BannerRecommend selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BannerRecommend record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BannerRecommend record) {
        return 0;
    }
}
