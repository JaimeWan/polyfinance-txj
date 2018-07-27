package com.ptteng.service.impl;

import com.ptteng.model.DealRecord;
import com.ptteng.service.DealRecordService;
import org.springframework.stereotype.Service;

@Service
public class DealRecordServiceImpl implements DealRecordService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(DealRecord record) {
        return 0;
    }

    @Override
    public int insertSelective(DealRecord record) {
        return 0;
    }

    @Override
    public DealRecord selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(DealRecord record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(DealRecord record) {
        return 0;
    }
}
