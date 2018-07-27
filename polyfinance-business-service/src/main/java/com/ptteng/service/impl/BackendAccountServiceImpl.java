package com.ptteng.service.impl;

import com.ptteng.model.BackendAccount;
import com.ptteng.service.BackendAccountService;
import org.springframework.stereotype.Service;

@Service
public class BackendAccountServiceImpl implements BackendAccountService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(BackendAccount record) {
        return 0;
    }

    @Override
    public int insertSelective(BackendAccount record) {
        return 0;
    }

    @Override
    public BackendAccount selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BackendAccount record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BackendAccount record) {
        return 0;
    }
}
