package ru.mysql.teach.internet.shop.dao.factory;

import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.IDaoUser;

/**
 *
 */
public class DaoFactory implements IDaoFactory {
    private IDaoDataBase daoDataBase;
    private static IDaoFactory instance = new DaoFactory();

    private DaoFactory(){

    }

    public static IDaoFactory getInstance(){
        return instance;
    }

    @Override
    public IDaoUser getDaoUser() {
        return null;
    }
}

