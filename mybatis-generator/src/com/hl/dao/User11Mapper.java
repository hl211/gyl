package com.hl.dao;

import com.hl.domain.User11;

public interface User11Mapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User11 record);

    int insertSelective(User11 record);

    User11 selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User11 record);

    int updateByPrimaryKey(User11 record);
}