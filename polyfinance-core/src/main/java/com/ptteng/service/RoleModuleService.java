package com.ptteng.service;

import com.ptteng.model.RoleModule;

public interface RoleModuleService {
    int deleteByPrimaryKey(Long id);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    RoleModule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleModule record);

    int updateByPrimaryKey(RoleModule record);
}