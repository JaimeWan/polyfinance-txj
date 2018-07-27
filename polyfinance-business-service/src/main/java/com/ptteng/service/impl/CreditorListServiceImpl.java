package com.ptteng.service.impl;

import com.ptteng.model.CreditorList;
import com.ptteng.service.CreditorListService;
import org.springframework.stereotype.Service;

@Service
public class CreditorListServiceImpl implements CreditorListService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(CreditorList record) {
        return 0;
    }

    @Override
    public int insertSelective(CreditorList record) {
        return 0;
    }

    @Override
    public CreditorList selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CreditorList record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CreditorList record) {
        return 0;
    }
}
