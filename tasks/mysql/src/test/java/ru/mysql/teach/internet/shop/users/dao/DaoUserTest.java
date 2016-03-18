package ru.mysql.teach.internet.shop.users.dao;

import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.SexEnum;

import java.sql.SQLException;

/**
 *
 */
public class DaoUserTest {

    @Test
    public void createDaoUser()throws SQLException{
        IDaoDataBase daoDataBase = new DaoDataBase();
        IDaoUser daoUser = new DaoUser(daoDataBase);
        SexEnum sex = SexEnum.MALE;
        IUser user = new User("Filip22","11111","filip@filip.com",sex);
        daoUser.addUser(user);
        System.out.println(daoUser.getUserByNameAndEmail("Filip22","filip@filip.com").getName());

    }

    @Test
    public void getUserById()throws Exception{
        IDaoDataBase daoDataBase = new DaoDataBase();
        IDaoUser daoUser = new DaoUser(daoDataBase);

        daoUser.getUserById(IUser.class,1);
    }
}
