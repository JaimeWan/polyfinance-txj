package com.ptteng.service;

import com.ptteng.model.BackendRole;

public interface BackendRoleService {
    int deleteByPrimaryKey(Long id);

    int insert(BackendRole record);

    int insertSelective(BackendRole record);

    BackendRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackendRole record);

    int updateByPrimaryKey(BackendRole record);
}