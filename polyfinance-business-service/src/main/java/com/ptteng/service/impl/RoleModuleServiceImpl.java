package com.ptteng.service.impl;

import com.ptteng.model.RoleModule;
import com.ptteng.service.RoleModuleService;
import org.springframework.stereotype.Service;

@Service
public class RoleModuleServiceImpl implements RoleModuleService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(RoleModule record) {
        return 0;
    }

    @Override
    public int insertSelective(RoleModule record) {
        return 0;
    }

    @Override
    public RoleModule selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(RoleModule record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(RoleModule record) {
        return 0;
    }
}
