package com.alibaba.dao;

import com.alibaba.bean.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    List<Book> selectAll();

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}