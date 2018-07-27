package com.ptteng.service.impl;

import com.ptteng.model.ContractList;
import com.ptteng.service.ContractListService;
import org.springframework.stereotype.Service;

@Service
public class ContractListServiceImpl implements ContractListService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(ContractList record) {
        return 0;
    }

    @Override
    public int insertSelective(ContractList record) {
        return 0;
    }

    @Override
    public ContractList selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ContractList record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ContractList record) {
        return 0;
    }
}
