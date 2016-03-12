package ru.mysql.teach.internet.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Connects and operates with database.
 */
public interface IDaoDataBase {

    /**
     * Uses for a adding, updating  into a database.
     * @param sql - which will be executed
     */
    public void executeToInsert(String sql) throws SQLException;

    /**
     * Executes a specified  sql-selection
     * @param sql which will be executed
     * @return list with result.
     * @throws SQLException if a dataBase is not available.
     */
    public ResultSet executeToSelect(String sql)throws SQLException;


    /**
     * Executes the callableStatement with a stored procedure for  products..
     * @param id a needed product
     */
    public List<Object> executeCallableStatement(int id) throws SQLException;
//    /**
//     * Creates a select-request to a database.
//     * @param sql - request to database.
//     * @return result from sql-query.
//     */
//    public ResultSet executeSelect(String sql);
//
//
//    /**
//     * Closes a connection to base.
//     */
//    public void closeConnection() throws SQLException;
//
//    /**
//     * Gets data from argument and creates a sql-query for inserting.
//     * @param data where gets the data for created sql-query.
//    */
//    public void generateInsertQuery(String[] data);
//
//    /**
//     * Gets data from arguments and creates a sql-query for selecting.
//     * @param data where gets the data for created sql-query.
//     * @return result of sql-query as String[].
//     */
//    public Object generateQueryToSelect(String[] data);
//
//
//    public ResultSet getResult();

}
