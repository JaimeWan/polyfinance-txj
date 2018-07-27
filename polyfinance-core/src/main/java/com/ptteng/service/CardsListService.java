package com.ptteng.service;

import com.ptteng.model.CardsList;

public interface CardsListService {
    int deleteByPrimaryKey(Long id);

    int insert(CardsList record);

    int insertSelective(CardsList record);

    CardsList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CardsList record);

    int updateByPrimaryKey(CardsList record);
}