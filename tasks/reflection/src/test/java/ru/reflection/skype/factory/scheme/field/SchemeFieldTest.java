package ru.reflection.skype.factory.scheme.field;
import org.junit.Test;
import ru.reflection.skype.factory.scheme.IScheme;

import static org.junit.Assert.*;
/**
 *
 */
public class SchemeFieldTest {
    private ISchemeField createSchemeField(){
        return new SchemeField();
    }

    @Test
    public void parseScheme(){
        String nameField = "name";
        String nameColumn ="Name";
        ISchemeField scheme = createSchemeField();
        scheme.setColName(nameColumn);
        scheme.setFieldName(nameField);
        assertEquals("Field name is: ","name",scheme.getFieldName());
        assertEquals("Column name is: ","Name",scheme.getColName());
    }
}
