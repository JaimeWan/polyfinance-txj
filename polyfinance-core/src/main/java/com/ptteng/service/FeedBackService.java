package com.ptteng.service;

import com.ptteng.model.FeedBack;

public interface FeedBackService {
    int deleteByPrimaryKey(Long id);

    int insert(FeedBack record);

    int insertSelective(FeedBack record);

    FeedBack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FeedBack record);

    int updateByPrimaryKey(FeedBack record);
}