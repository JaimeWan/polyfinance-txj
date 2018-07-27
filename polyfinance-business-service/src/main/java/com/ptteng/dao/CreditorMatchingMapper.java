package com.ptteng.dao;

import com.ptteng.model.CreditorMatching;
import org.apache.ibatis.annotations.Mapper;

public interface CreditorMatchingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CreditorMatching record);

    int insertSelective(CreditorMatching record);

    CreditorMatching selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CreditorMatching record);

    int updateByPrimaryKey(CreditorMatching record);
}