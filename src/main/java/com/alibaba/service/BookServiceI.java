package com.alibaba.service;

import com.alibaba.bean.Book;

import java.util.List;

public interface BookServiceI {
    //查询书
    List<Book> getBooks();

}
