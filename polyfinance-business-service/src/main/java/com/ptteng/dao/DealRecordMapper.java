package com.ptteng.dao;

import com.ptteng.model.DealRecord;
import org.apache.ibatis.annotations.Mapper;

public interface DealRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DealRecord record);

    int insertSelective(DealRecord record);

    DealRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DealRecord record);

    int updateByPrimaryKey(DealRecord record);
}