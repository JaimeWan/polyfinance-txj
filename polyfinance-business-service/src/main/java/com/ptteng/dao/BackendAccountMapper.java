package com.ptteng.dao;

import com.ptteng.model.BackendAccount;
import org.apache.ibatis.annotations.Mapper;

public interface BackendAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BackendAccount record);

    int insertSelective(BackendAccount record);

    BackendAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BackendAccount record);

    int updateByPrimaryKey(BackendAccount record);
}