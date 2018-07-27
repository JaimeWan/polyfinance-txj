package com.ptteng.dao;

import com.ptteng.model.ContractList;
import org.apache.ibatis.annotations.Mapper;

public interface ContractListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContractList record);

    int insertSelective(ContractList record);

    ContractList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContractList record);

    int updateByPrimaryKey(ContractList record);
}