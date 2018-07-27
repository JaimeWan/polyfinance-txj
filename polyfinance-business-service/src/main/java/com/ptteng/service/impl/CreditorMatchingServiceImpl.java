package com.ptteng.service.impl;

import com.ptteng.model.CreditorMatching;
import com.ptteng.service.CreditorMatchingService;
import org.springframework.stereotype.Service;

@Service
public class CreditorMatchingServiceImpl implements CreditorMatchingService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(CreditorMatching record) {
        return 0;
    }

    @Override
    public int insertSelective(CreditorMatching record) {
        return 0;
    }

    @Override
    public CreditorMatching selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CreditorMatching record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CreditorMatching record) {
        return 0;
    }
}
