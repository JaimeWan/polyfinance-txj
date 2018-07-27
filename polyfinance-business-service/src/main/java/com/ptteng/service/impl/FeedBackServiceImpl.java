package com.ptteng.service.impl;

import com.ptteng.model.FeedBack;
import com.ptteng.service.FeedBackService;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(FeedBack record) {
        return 0;
    }

    @Override
    public int insertSelective(FeedBack record) {
        return 0;
    }

    @Override
    public FeedBack selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(FeedBack record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(FeedBack record) {
        return 0;
    }
}
