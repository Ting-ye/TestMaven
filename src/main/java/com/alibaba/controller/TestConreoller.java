package com.alibaba.controller;

import com.alibaba.service.BookServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestConreoller {
    @Autowired
    private BookServiceI bookServiceI;
    @RequestMapping("/test")
    public String test(){
        bookServiceI.getBooks();
        return  "123";
    }
}
