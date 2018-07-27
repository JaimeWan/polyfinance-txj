package com.ptteng.service.impl;

import com.ptteng.model.UserMessageRead;
import com.ptteng.service.UserMessageReadService;
import org.springframework.stereotype.Service;

@Service
public class UserMessageReadServiceImpl implements UserMessageReadService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserMessageRead record) {
        return 0;
    }

    @Override
    public int insertSelective(UserMessageRead record) {
        return 0;
    }

    @Override
    public UserMessageRead selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserMessageRead record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserMessageRead record) {
        return 0;
    }
}
