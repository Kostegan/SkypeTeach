package ru.mysql.teach.internet.shop.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class DaoDataBase implements IDaoDataBase {
    private Connection connection;
    private Statement statement;
    private ResultSet rs;
    private CallableStatement cs;

    public DaoDataBase() {
        try {
            createConnectionBase();
        } catch (SQLException e) {
            System.out.println("Database is not connection: " + e);
        }
    }


    private void createConnectionBase() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/internet_shop", "root", "root");
    }

    public List<Object> executeCallableStatement(int id) throws SQLException{
        String storedProcedure ="{call getUserById (?,?,?)}";
        return createCallableStatement(storedProcedure,id);
    }


    @Override
    public void executeToInsert(String sql) throws SQLException {
        createStatement();
        statement.execute(sql);
        closeStatement();
    }

    @Override
    public ResultSet executeToSelect(String sql) throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery(sql);
        return rs;
    }

    private void createStatement() throws SQLException{
        statement = connection.createStatement();
    }

    // Уточнить как делать много Stored Procedure? или для каждой свой метод? и этот метод должен быть в DaoEntity?
    private List<Object> createCallableStatement(String sql,int id) throws SQLException{
        List<Object> result = new ArrayList<>();
        cs = connection.prepareCall(sql);
        cs.setInt(1,id);
        cs.registerOutParameter(2, java.sql.Types.VARCHAR);
        cs.registerOutParameter(3, java.sql.Types.INTEGER);
        cs.execute();
        result.add(cs.getString(2));
        result.add(cs.getInt(3));
        cs.close();
        return result;
    }


    private void closeStatement() throws SQLException{
        statement.close();
    }

    /**
     * Converted the rs to Map-object, where the key is a type,  value is a value from a rs.
     * @return
     */
    private Map<String,Object> convertResultSetToObject()throws SQLException{
        while(rs.next()){

        }
        return null;
    }

//    public void execute(String sql) throws SQLException {
//        statement = connection.createStatement();
////        rs = statement.executeQuery(sql);
//    }

    //    private Connection connection;
//    private Statement statement;
//    private ResultSet rs;
//
//    public DaoDataBase() {
//        try {
//            createConnectionBase();
//        } catch (SQLException e) {
//            System.out.println("Database is not connection: " + e);
//        }
//    }
//
//    /**
//     * Executes a sql-query
//     * @param sql - which will be executed
//     * @throws SQLException
//     */
//    @Override
//    public void execute(String sql) throws SQLException {
//        rs = statement.executeQuery(sql);
//        while (rs.next()) {
//
//        }
//    }
//
//    @Override
//    public ResultSet executeSelect(String sql) {
//        return null;
//    }
//
//    private void closeStatement()throws SQLException {
//        statement.close();
//    }
//
//    @Override
//    public void closeConnection()throws SQLException {
//        rs.close();
//        statement.close();
//        connection.close();
//    }
//
//
//    @Override
//    public void generateInsertQuery(String[] data) {
//
//    }
//
//    @Override
//    public String[] generateQueryToSelect(String[] data) {
//        for(String temp:data){
////        String userName = UserSchema.getName();
////        String userPassword = UserSchema.getPassword();
////        String userEmail = UserSchema.getEmail();
////        int indexSex = (UserSchema.getSex().getValue());
////        statement.execute("INSERT INTO users(name,password,email,sex) VALUE('" + userName + "','" + userPassword + "','" + userEmail + "','" + indexSex + "');");
//        }
//        return new String[0];
//    }
//
//    public Statement getStatement() {
//        return statement;
//    }
//
//
//
//    public void createConnectionBase() throws SQLException {
//        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/internet_shop", "root", "root");
//        statement = connection.createStatement();
//    }
//
//    @Override
//    public ResultSet getResult() {
//        return rs;
//    }
}
