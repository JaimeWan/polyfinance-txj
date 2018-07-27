package com.ptteng.service;

import com.ptteng.model.ContractList;

public interface ContractListService {
    int deleteByPrimaryKey(Long id);

    int insert(ContractList record);

    int insertSelective(ContractList record);

    ContractList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractList record);

    int updateByPrimaryKey(ContractList record);
}