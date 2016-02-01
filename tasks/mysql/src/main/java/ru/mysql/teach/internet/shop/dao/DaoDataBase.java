package ru.mysql.teach.internet.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 */
public class DaoDataBase implements IDaoDataBase {
    Connection connection;
    Statement statement;


    public Statement getStatement(){
        return statement;
    }

    public void createConnectionBase()throws SQLException{
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/internet_shop", "root", "root");
        statement = connection.createStatement();
    }
}
