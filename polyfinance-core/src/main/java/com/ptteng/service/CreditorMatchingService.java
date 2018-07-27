package com.ptteng.service;

import com.ptteng.model.CreditorMatching;

public interface CreditorMatchingService {
    int deleteByPrimaryKey(Long id);

    int insert(CreditorMatching record);

    int insertSelective(CreditorMatching record);

    CreditorMatching selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CreditorMatching record);

    int updateByPrimaryKey(CreditorMatching record);
}