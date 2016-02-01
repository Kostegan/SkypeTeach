package ru.mysql.teach.internet.shop.dao;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Connects to database.
 */
public interface IDaoDataBase {
    public Statement getStatement();
    public void createConnectionBase()throws SQLException;
}
