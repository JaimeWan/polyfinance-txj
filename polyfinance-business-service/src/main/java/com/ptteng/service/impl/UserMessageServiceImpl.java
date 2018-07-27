package com.ptteng.service.impl;

import com.ptteng.model.UserMessage;
import com.ptteng.service.UserMessageService;
import org.springframework.stereotype.Service;

@Service
public class UserMessageServiceImpl implements UserMessageService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserMessage record) {
        return 0;
    }

    @Override
    public int insertSelective(UserMessage record) {
        return 0;
    }

    @Override
    public UserMessage selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserMessage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserMessage record) {
        return 0;
    }
}
