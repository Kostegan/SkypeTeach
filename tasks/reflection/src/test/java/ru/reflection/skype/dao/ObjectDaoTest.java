package ru.reflection.skype.dao;

import org.junit.Test;
import ru.reflection.skype.dao.exception.InappropriateObjectException;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;
import ru.reflection.skype.person.Person;

import static org.junit.Assert.*;

/**
 *
 */
public class ObjectDaoTest {
    private IObjectDao createObjectDao(){
        return new ObjectDao();
    }

    @Test
    public void savePerson() throws Exception,NotCorrectSchemeException,InappropriateObjectException{
        String scheme = "ru.reflection.skype.person.Person=users [name=NAME, age=PERSON_AGE]";
        Person person = new Person("Viktor",39);
        IObjectDao dao = createObjectDao();
        dao.save(person,scheme);
    }

}
