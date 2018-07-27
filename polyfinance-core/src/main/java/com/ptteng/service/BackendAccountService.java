package com.ptteng.service;

import com.ptteng.model.BackendAccount;

public interface BackendAccountService {
    int deleteByPrimaryKey(Long id);

    int insert(BackendAccount record);

    int insertSelective(BackendAccount record);

    BackendAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackendAccount record);

    int updateByPrimaryKey(BackendAccount record);
}