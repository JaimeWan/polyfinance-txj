package com.ptteng.dao;

import com.ptteng.model.BackendRole;
import org.apache.ibatis.annotations.Mapper;

public interface BackendRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BackendRole record);

    int insertSelective(BackendRole record);

    BackendRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackendRole record);

    int updateByPrimaryKey(BackendRole record);
}