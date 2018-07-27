package com.ptteng.service;

import com.ptteng.model.UserMessageRead;

public interface UserMessageReadService {
    int deleteByPrimaryKey(Long id);

    int insert(UserMessageRead record);

    int insertSelective(UserMessageRead record);

    UserMessageRead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMessageRead record);

    int updateByPrimaryKey(UserMessageRead record);
}