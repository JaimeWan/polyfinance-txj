package com.ptteng.service;

import com.ptteng.model.ProductList;

public interface ProductListService {
    int deleteByPrimaryKey(Long id);

    int insert(ProductList record);

    int insertSelective(ProductList record);

    ProductList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductList record);

    int updateByPrimaryKey(ProductList record);
}