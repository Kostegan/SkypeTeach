package ru.mysql.teach.internet.shop.dao;

/**
 * Gives common methods for a work with a dao-entity.
 */
public interface IDaoEntity {
    public Object getEntityById(Class cls,int id)throws Exception;
}
