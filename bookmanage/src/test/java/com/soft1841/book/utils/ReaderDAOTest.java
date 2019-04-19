package com.soft1841.book.utils;

import cn.hutool.db.Entity;
import com.soft1841.book.dao.ReaderDAO;
import com.soft1841.book.utils.DAOFactory;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

public class ReaderDAOTest {
private ReaderDAO readerDAO= DAOFactory.getReaderDAOInstance();
    private long id;

    @Test
    public void selectReaders()throws SQLException{
        List <Entity> readerList=readerDAO.selectReaders();
        readerList.forEach(entity ->  System.out.println(entity));
    }
    @Test
    public void deleteById()throws SQLException{
        readerDAO.deleteById(id);
    }
}