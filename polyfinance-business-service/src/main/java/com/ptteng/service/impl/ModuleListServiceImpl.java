package com.ptteng.service.impl;

import com.ptteng.model.ModuleList;
import com.ptteng.service.ModuleListService;
import org.springframework.stereotype.Service;

@Service
public class ModuleListServiceImpl implements ModuleListService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(ModuleList record) {
        return 0;
    }

    @Override
    public int insertSelective(ModuleList record) {
        return 0;
    }

    @Override
    public ModuleList selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ModuleList record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ModuleList record) {
        return 0;
    }
}
