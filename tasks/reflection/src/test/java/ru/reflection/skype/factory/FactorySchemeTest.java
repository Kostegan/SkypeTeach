package ru.reflection.skype.factory;

import org.junit.Test;
import ru.reflection.skype.factory.scheme.IScheme;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;

import static org.junit.Assert.*;

/**
 *
 */
public class FactorySchemeTest {
    private IFactoryScheme createFactoryScheme() {
        return new FactoryScheme();
    }

    @Test
    public void parsesCorrectSchemeOnGroup() throws NotCorrectSchemeException {
//        ru.teach.skype.types.reflection.Person=users [name=NAME, age=PERSON_AGE]
        String scheme = "ru.reflection.skype.factory.Factory=user [name=Name,age=Age]";
        IFactoryScheme factory = createFactoryScheme();
        IScheme fullScheme = factory.parseScheme(scheme);
        assertEquals("Class name is: ", "ru.reflection.skype.factory.Factory", fullScheme.getClassName());
        assertEquals("Table name is: ", "user", fullScheme.getTableName());
        assertEquals("First field has the name: ", "name", fullScheme.getFields().get(0).getFieldName());
        assertEquals("First column has the name: ", "Name", fullScheme.getFields().get(0).getColName());
        assertEquals("Second field has the name: ", "age", fullScheme.getFields().get(1).getFieldName());
        assertEquals("First column has the name: ", "Age", fullScheme.getFields().get(1).getColName());
    }

    /**
     * 1. Scheme is not correct, the class name is not indicated.
     */
    @Test(expected = NotCorrectSchemeException.class)
    public void schemeNotHasClassName() throws NotCorrectSchemeException {
        String scheme = "=user [name=Name,age=Age]";
        IFactoryScheme factory = createFactoryScheme();
        factory.parseScheme(scheme);
    }

    /**
     * 2.  Scheme is not correct, the class name has a not correct format.
     */
    @Test(expected = NotCorrectSchemeException.class)
    public void schemeNotCorrectClassName() throws NotCorrectSchemeException {
        String scheme = "=user [name=Name,age=Age]";
        IFactoryScheme factory = createFactoryScheme();
        factory.parseScheme(scheme);
    }

    /**
     * 3. Scheme is not correct, the table name is not indicated.
     */
    @Test(expected = NotCorrectSchemeException.class)
    public void schemeNotHasTableName() throws NotCorrectSchemeException {
        String scheme = "=user [name=Name,age=Age]";
        IFactoryScheme factory = createFactoryScheme();
        factory.parseScheme(scheme);
    }

}
