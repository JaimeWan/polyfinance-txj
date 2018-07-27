package com.ptteng.service;

import com.ptteng.model.CreditorList;

public interface CreditorListService {
    int deleteByPrimaryKey(Long id);

    int insert(CreditorList record);

    int insertSelective(CreditorList record);

    CreditorList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CreditorList record);

    int updateByPrimaryKey(CreditorList record);
}