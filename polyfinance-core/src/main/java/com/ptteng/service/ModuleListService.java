package com.ptteng.service;

import com.ptteng.model.ModuleList;

public interface ModuleListService {
    int deleteByPrimaryKey(Long id);

    int insert(ModuleList record);

    int insertSelective(ModuleList record);

    ModuleList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModuleList record);

    int updateByPrimaryKey(ModuleList record);
}