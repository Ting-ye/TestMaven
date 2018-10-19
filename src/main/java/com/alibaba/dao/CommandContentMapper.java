package com.alibaba.dao;

import com.alibaba.bean.CommandContent;

public interface CommandContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommandContent record);

    int insertSelective(CommandContent record);

    CommandContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommandContent record);

    int updateByPrimaryKey(CommandContent record);
}