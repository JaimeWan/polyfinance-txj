package com.ptteng.service.impl;

import com.ptteng.model.CardsList;
import com.ptteng.service.CardsListService;
import org.springframework.stereotype.Service;

@Service
public class CardsListServiceImpl implements CardsListService {
    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(CardsList record) {
        return 0;
    }

    @Override
    public int insertSelective(CardsList record) {
        return 0;
    }

    @Override
    public CardsList selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CardsList record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CardsList record) {
        return 0;
    }
}
