package com.soft1841.book;
import cn.hutool.db.Entity;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class BookDAOTest {
    //通过接口通道回调，创建一个bookDAO的实例，用来做CRUD操作
    private BookDAO bookDAO = new BookDAOImpl();

    @Test
    //通过bookDAO接口调用查询所有图书的方法，得到一个集合
    public void getAllBooks () throws SQLException {
        //通过Lambda表达式遍历集合，输出结果
        List <Entity> bookList = bookDAO.getAllBooks();
        bookList.forEach(entity -> System.out.println(entity.get("name") + "," + entity.get("price")));

    }
    @Test
    public void insert () throws  SQLException {
      Book book =new Book("高数",18.6);
        int n =bookDAO.insert(book);
        assertEquals(1,n);
    }

    @Test
    public void delete () throws SQLException {

        int n=bookDAO.delete(11);
        assertEquals(1,n);
    }

    @Test
    public void update() throws SQLException{
        Book book = new Book();
        book.setPrice(78.8);
        book.setId(2);
        int n = bookDAO.update(book);
        assertEquals(1,n);


    }
}
