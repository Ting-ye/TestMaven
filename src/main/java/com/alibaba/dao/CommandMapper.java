package com.alibaba.dao;

import com.alibaba.bean.Command;

public interface CommandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Command record);

    int insertSelective(Command record);

    Command selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Command record);

    int updateByPrimaryKey(Command record);
}