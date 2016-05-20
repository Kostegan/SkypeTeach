package ru.mysql.teach.internet.shop.dao.factory;

import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.DaoDataBase;

import java.sql.SQLException;

import static org.junit.Assert.*;
/**
 *
 */
public class DaoDataBaseTest {
    private String tempSql = "SELECT * FROM users";

//    @Test
//    public void connectToDataBase()throws SQLException {
//        DaoDataBase database = new DaoDataBase();
//        database.execute(tempSql);
//        assertTrue("Connection to dataBase is done.", database.getResult() != null);
//    }
//
//    @Test   // todo уточнить как проверить что connection close
//    public void closeDataBaseConnection()throws SQLException{
//        DaoDataBase database = new DaoDataBase();
//        database.execute(tempSql);
//        assertTrue("Connection to dataBase is done.",database.getResult()!=null);
//        database.closeConnection();
////        assertNull("DataBase connection is close and return null.",database.);
//    }
//
//    @Test
//    public void createStatement(){
//        DaoDataBase database = new DaoDataBase();
//        assertNotNull("Connection to dataBase is done.", database.getStatement() != null);
//    }
//
//    @Test
//    public void statementIsClose()throws SQLException{
//        DaoDataBase database = new DaoDataBase();
//        assertNotNull("Statement is done.", database.getStatement() != null);
//        database.closeStatement();
//        assertNull("Statement is close",database.getStatement());
//    }
}
