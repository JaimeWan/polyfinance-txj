package com.ptteng.dao;

import com.ptteng.model.UserMessageRead;

public interface UserMessageReadMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserMessageRead record);

    int insertSelective(UserMessageRead record);

    UserMessageRead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMessageRead record);

    int updateByPrimaryKey(UserMessageRead record);
}