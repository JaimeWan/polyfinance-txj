package com.ptteng.dao;

import com.ptteng.model.ModuleList;

public interface ModuleListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ModuleList record);

    int insertSelective(ModuleList record);

    ModuleList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModuleList record);

    int updateByPrimaryKey(ModuleList record);
}