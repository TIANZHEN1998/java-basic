package com.soft1841.book;
import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/*
图书类的数据访问对象
Book Date access object
用来定义增删改查操作CRUD
 */
public interface BookDAO {
    /**
     * 查询所有图书信息
    @return
     */
    List<Entity> getAllBooks()throws SQLException;

    /**
     * 新增图书，如果成功返回1，否则返回0
     * @param book
     * @return
     * @throws SQLException
     */
    int insert(Book book) throws  SQLException;

    /**
     * 删除图书
     * @param id
     * @return
     * @throws SQLException
     */
    int delete(int id ) throws  SQLException;

    /**
     * 修改图书信息
     * @param book
     * @return
     * @throws SQLException
     */
    int update(Book book)throws  SQLException;
}
