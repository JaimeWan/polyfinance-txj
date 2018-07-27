package com.ptteng.service.impl;

import com.ptteng.model.BackendRole;
import com.ptteng.service.BackendRoleService;
import org.springframework.stereotype.Service;

@Service
public class BackendRoleServiceImpl implements BackendRoleService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(BackendRole record) {
        return 0;
    }

    @Override
    public int insertSelective(BackendRole record) {
        return 0;
    }

    @Override
    public BackendRole selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BackendRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BackendRole record) {
        return 0;
    }
}
