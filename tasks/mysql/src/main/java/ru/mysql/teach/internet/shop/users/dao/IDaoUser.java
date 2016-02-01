package ru.mysql.teach.internet.shop.users.dao;

import ru.mysql.teach.internet.shop.users.dao.exception.UserNotExistException;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Creates new users,permits add/delete from dataBase.
 */
public interface IDaoUser {


    public void addUser(IUser user,Statement statement) throws SQLException;

    /**
     * Creates a new user with filled fields from a database.
     * @param index selected user from a database
     * @param statement for a database
     * @return new user with filled fields from a database
     * @throws InvalidSexNameException
     * @throws UserNotExistException if the user with this index does not exist.
     */
    public IUser getUser(int index,Statement statement)throws SQLException,InvalidSexNameException,UserNotExistException;

    /**
     * Gets the list with names for men.
     * @return list with names
     */
    public List<String> getSortNamesByMen(Statement statement) throws SQLException;

    public String countPeopleForEachSex(Statement statement)throws SQLException;
}
