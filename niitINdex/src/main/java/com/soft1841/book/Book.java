package com.soft1841.book;
/*
图书实体类
 */
public class Book {
    private  Integer id;
    private  String name;
    private  Double price;

    public Book () {
    }

    public Book (String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getPrice () {
        return price;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return "Book{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}

