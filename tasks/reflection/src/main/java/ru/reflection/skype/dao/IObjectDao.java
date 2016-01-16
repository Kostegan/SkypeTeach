package ru.reflection.skype.dao;

import ru.reflection.skype.dao.exception.InappropriateObjectException;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;

/**
 *
 */
public interface IObjectDao {
    void save(Object object, String scheme) throws NotCorrectSchemeException,InappropriateObjectException,Exception;
}
