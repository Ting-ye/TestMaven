package com.alibaba.bean;

public class Book {
    private Integer id;

    private String bookname;

    private String author;

    private String publishhouse;

    private Float price;

    private Integer repertory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublishhouse() {
        return publishhouse;
    }

    public void setPublishhouse(String publishhouse) {
        this.publishhouse = publishhouse == null ? null : publishhouse.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
}