package com.ptteng.service;

import com.ptteng.model.DealRecord;

public interface DealRecordService {
    int deleteByPrimaryKey(Long id);

    int insert(DealRecord record);

    int insertSelective(DealRecord record);

    DealRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DealRecord record);

    int updateByPrimaryKey(DealRecord record);
}