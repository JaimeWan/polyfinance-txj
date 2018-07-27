package com.ptteng.dao;

import com.ptteng.model.CreditorList;
import org.apache.ibatis.annotations.Mapper;

public interface CreditorListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CreditorList record);

    int insertSelective(CreditorList record);

    CreditorList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CreditorList record);

    int updateByPrimaryKey(CreditorList record);
}