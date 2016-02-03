package ru.mysql.teach.internet.shop.users.dao;

import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.exception.UserNotExistException;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.ISex;
import ru.mysql.teach.internet.shop.users.user.sex.Sex;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 */
public class DaoUser implements IDaoUser {
    private IDaoDataBase daoDataBase;
    private Statement statement;

    /**
     * Constructor creates connection to database, creates statement to database and writings to fields(connections and statements).
     * The data of this fields you can get through methods getConnection and getStatement.
     */
    public DaoUser() {
        daoDataBase = new DaoDataBase();
        statement = daoDataBase.getStatement();
    }

    /**
     * Constructor with parameters. If a connection and statement to database already created, then should adds as argument.
     *
     * @param daoDataBase - created connection
     * @param statement - created statement
     */
    public DaoUser(IDaoDataBase daoDataBase, Statement statement) {
        this.daoDataBase = daoDataBase;
        this.statement = statement;
    }


    @Override
    public IDaoDataBase getConnection() {
        return daoDataBase;
    }

    @Override
    public Statement getStatement() {
        return statement;
    }

    @Override
    public void addUser(IUser user) throws SQLException {
        String userName = user.getName();
        String userPassword = user.getPassword();
        String userEmail = user.getEmail();
        int indexSex = ISex.defineSex(user.getSex());
        statement.execute("INSERT INTO users(name,password,email,sex) VALUE('" + userName + "','" + userPassword + "','" + userEmail + "','" + indexSex + "');");
    }

    @Override
    public IUser getUser(int index) throws SQLException, InvalidSexNameException, UserNotExistException {
        IUser user;
        ISex sex;
        ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE id = '" + index + "'");
        while (rs.next()) {
            String name = rs.getString("name");
            String password = rs.getString("password");
            String email = rs.getString("email");
            sex = new Sex(rs.getInt("sex"));
            user = new User(name, password, email, sex);
            return user;
        }
        throw new UserNotExistException("User with - " + index + " not exists.");
    }

    @Override
    public List<String> getSortNamesByMen(Statement statement) throws SQLException {
        List<String> sortNames = new ArrayList<>();
        ;
        ResultSet rs = statement.executeQuery("SELECT name FROM users WHERE sex = 1 ORDER BY name");
        while (rs.next()) {
            sortNames.add(rs.getString("name"));
        }
        return sortNames;
    }

    @Override
    public String countPeopleForEachSex(Statement statement) throws SQLException {
        String result;
        ResultSet rs = statement.executeQuery("SELECT sex, COUNT(*) users_count FROM users GROUP BY sex ");
        StringBuilder temp = new StringBuilder();
        while (rs.next()) {
            temp.append("The sex: " + rs.getInt("sex") + " has: " + rs.getInt("users_count") + " people ");
        }
        result = temp.toString();
        return result;
    }
}

