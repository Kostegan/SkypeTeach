package ru.mysql.teach.internet.shop.users.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.DaoUser;
import ru.mysql.teach.internet.shop.users.dao.IDaoUser;
import ru.mysql.teach.internet.shop.users.dao.exception.UserNotExistException;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.ISex;
import ru.mysql.teach.internet.shop.users.user.sex.Sex;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

import java.sql.SQLException;
import java.util.List;

/**
 *
 */
public class UserTest {
    @Test
    public void addUser() throws SQLException,InvalidSexNameException,UserNotExistException{
//        IDaoDataBase daoDataBase = new DaoDataBase();
//        daoDataBase.createConnectionBase();
        IDaoUser daoUser = new DaoUser();
        ISex sex = new Sex("male");

        IUser user = new User("Misha","l2asll","perewer@gmail.com",sex);
        daoUser.addUser(user);
        IUser newUser = daoUser.getUser(19);
        assertEquals("Username is: ","Misha",newUser.getName());
        assertEquals("User password is: ","l2asll",newUser.getPassword());
        assertEquals("User email is: ","perewer@gmail.com",newUser.getEmail());
        assertEquals("User sex is: ","male",newUser.getSex());
    }


    @Test
    public void getUser() throws SQLException,InvalidSexNameException,UserNotExistException{
        IDaoUser daoUser = new DaoUser();
        IUser user = daoUser.getUser(15);
        assertEquals("Username is: ","Maxim",user.getName());
        assertEquals("User password is: ","r12t12",user.getPassword());
        assertEquals("User email is: ","maxim@Gmail.com",user.getEmail());
        assertEquals("User sex is: ","male",user.getSex());
    }

    @Test
    public void getSortNamesForMan()throws SQLException{
        IDaoUser daoUser = new DaoUser();
        List<String> listSortNamesForMan = daoUser.getSortNamesByMen(daoUser.getStatement());
        assertEquals("Name is: ","Kirill",listSortNamesForMan.get(0));
        assertEquals("Name is: ","Maxim",listSortNamesForMan.get(1));
        assertEquals("Name is: ","Misha",listSortNamesForMan.get(2));
        assertEquals("Name is: ","Misha",listSortNamesForMan.get(3));
        assertEquals("Name is: ","Misha",listSortNamesForMan.get(4));
    }

    @Test
    public void getCountPeopleForEachSex()throws SQLException{
        IDaoDataBase daoDataBase = new DaoDataBase();
        daoDataBase.createConnectionBase();
        IDaoUser daoUser = new DaoUser();
        String result = "The sex: 1 has: 8 people The sex: 2 has: 4 people ";
        assertEquals("The sex: 2 has: 4 people.",result,daoUser.countPeopleForEachSex(daoDataBase.getStatement()));
    }
}
