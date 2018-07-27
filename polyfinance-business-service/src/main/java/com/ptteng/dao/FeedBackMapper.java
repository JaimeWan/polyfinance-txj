package com.ptteng.dao;

import com.ptteng.model.FeedBack;
import org.apache.ibatis.annotations.Mapper;

public interface FeedBackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FeedBack record);

    int insertSelective(FeedBack record);

    FeedBack selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FeedBack record);

    int updateByPrimaryKey(FeedBack record);
}