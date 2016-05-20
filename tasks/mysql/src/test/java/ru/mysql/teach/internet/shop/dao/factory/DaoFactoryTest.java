package ru.mysql.teach.internet.shop.dao.factory;

import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.IDaoUser;

/**
 *
 */
public class DaoFactoryTest {
    @Test
    public void createDaoUser(){
        IDaoDataBase daoDataBase = new DaoDataBase();
//        IDaoUser daoUser = IDaoFactory.getDaoUser(daoDataBase);

    }
}
