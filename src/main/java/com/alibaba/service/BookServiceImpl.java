package com.alibaba.service;

import com.alibaba.bean.Book;
import com.alibaba.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookServiceI {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getBooks() {
        //List<Book> books= bookMapper.selectAll();
        if(bookMapper==null)
            System.out.println("11111111111");
        if(bookMapper!=null)
            System.out.println("222222222222222");
//        for (Book book:
//             books) {
//            System.out.println(book.getBookname());
//        }
        return null;
    }
}
