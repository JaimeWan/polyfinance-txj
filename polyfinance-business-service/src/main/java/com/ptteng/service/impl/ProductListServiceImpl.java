package com.ptteng.service.impl;

import com.ptteng.model.ProductList;
import com.ptteng.service.ProductListService;
import org.springframework.stereotype.Service;

@Service
public class ProductListServiceImpl implements ProductListService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(ProductList record) {
        return 0;
    }

    @Override
    public int insertSelective(ProductList record) {
        return 0;
    }

    @Override
    public ProductList selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProductList record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductList record) {
        return 0;
    }
}
