package ru.mysql.teach.internet.shop.dao.factory;

import ru.mysql.teach.internet.shop.dao.DaoDataBase;
import ru.mysql.teach.internet.shop.dao.IDaoDataBase;
import ru.mysql.teach.internet.shop.users.dao.DaoUser;
import ru.mysql.teach.internet.shop.users.dao.IDaoUser;

import java.sql.SQLException;

/**
 * Creates dao-entities.
 */
public interface IDaoFactory {
    public IDaoUser getDaoUser();
}
