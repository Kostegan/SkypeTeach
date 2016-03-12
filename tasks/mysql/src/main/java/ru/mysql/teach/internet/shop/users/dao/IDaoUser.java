package ru.mysql.teach.internet.shop.users.dao;

import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.exception.UserNotExistException;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Has methods for a work with users in database.
 */
public interface IDaoUser {
    final static String TABLE_NAME = "users";

    /**
     * Adds new user to a base.
     * @param user which will be add.
     */
    public void addUser(IUser user) throws SQLException;

    public IUser getUserByNameAndEmail(String name,String email) throws SQLException;

    /**
     * @param id the user in base.
     * @return user by specified index.
     * @throws IllegalArgumentException - if the database has not a user with this index.
     */
    public IUser getUserById(int id) throws IllegalArgumentException, Exception;

    /**
     * Allows to change specified user in a database.
     */
    public void updateUser(IUser user);


//    public IDaoDataBase getConnection();
//    public Statement getStatement();
//
////    public void addUser(IUser user) throws SQLException;
//
//    /**
//     * Creates a new user with filled fields from a database.
//     * @param index selected user from a database
//     * @return new user with filled fields from a database
//     * @throws InvalidSexNameException
//     * @throws UserNotExistException if the user with this index does not exist.
//     */
////    public IUser getUserById(int index)throws SQLException,InvalidSexNameException,UserNotExistException;
//
//    /**
//     * Gets the list with names for men.
//     * @return list with names
//     */
//    public List<String> getSortNamesByMen() throws SQLException;
//
//    public String countPeopleForEachSex()throws SQLException;
//
//    public void execute(String string);
}
