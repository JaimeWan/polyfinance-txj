package com.ptteng.dao;

import com.ptteng.model.CardsList;
import org.apache.ibatis.annotations.Mapper;

public interface CardsListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CardsList record);

    int insertSelective(CardsList record);

    CardsList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CardsList record);

    int updateByPrimaryKey(CardsList record);
}