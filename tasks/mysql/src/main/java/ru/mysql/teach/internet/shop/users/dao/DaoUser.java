package ru.mysql.teach.internet.shop.users.dao;

import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.exception.UserNotExistException;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.ISex;
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

    @Override
    public void addUser(IUser user, Statement statement) throws SQLException {
        String userName = user.getName();
        String userPassword = user.getPassword();
        String userEmail = user.getEmail();
        int indexSex = ISex.defineSex(user.getSex());
        statement.execute("INSERT INTO users(name,password,email,sex) VALUE('" + userName + "','" + userPassword + "','" + userEmail + "','" + indexSex + "');");
    }

    @Override
    public IUser getUser(int index, Statement statement) throws SQLException, InvalidSexNameException, UserNotExistException {
        IUser user;
        ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE id = '" + index + "'");
        while (rs.next()) {
            String name = rs.getString("name");
            String password = rs.getString("password");
            String email = rs.getString("email");
            int sex = rs.getInt("sex");
            user = new User(name, password, email, sex);
            return user;
        }
        throw new UserNotExistException("User with - " + index + " not exists.");
    }

    @Override
    public List<String> getSortNamesByMen(Statement statement) throws SQLException {
        List<String> sortNames = new ArrayList<>();;
        ResultSet rs = statement.executeQuery("SELECT name FROM users WHERE sex = 1 ORDER BY name");
        while (rs.next()) {
            sortNames.add(rs.getString("name"));
        }
        return sortNames;
    }

    @Override
    public String countPeopleForEachSex(Statement statement) throws SQLException{
        String result;
        ResultSet rs = statement.executeQuery("SELECT sex, COUNT(*) users_count FROM users GROUP BY sex ");
        StringBuilder temp = new StringBuilder();
        while(rs.next()){
            temp.append("The sex: " +rs.getInt("sex")+" has: "+rs.getInt("users_count")+" people ");
        }
        result = temp.toString();
        return result;
    }
}

