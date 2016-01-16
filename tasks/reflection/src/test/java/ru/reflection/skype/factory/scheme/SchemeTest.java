package ru.reflection.skype.factory.scheme;
import org.junit.Test;
import ru.reflection.skype.factory.scheme.field.ISchemeField;

import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 *
 */
public class SchemeTest {
    @Test
    public void createScheme(){
        String className = "ru.reflection.skype.factory.scheme.Scheme";
        String tableName = "User";
        String firstFieldName = "name";
        String firstColumnName = "Name";
        String secondFieldName = "age";
        String secondColumnName = "Age";
        IScheme scheme = new Scheme();
        scheme.setClassName(className);
        scheme.setTableName(tableName);
        scheme.setFieldsName(firstFieldName, firstColumnName);
        scheme.setFieldsName(secondFieldName, secondColumnName);
        assertEquals("Class name is: ", className, scheme.getClassName());
        assertEquals("Table name is: ", tableName, scheme.getTableName());
        ArrayList<ISchemeField> fields = scheme.getFields();
        assertEquals("First field name is: ", firstFieldName, fields.get(0).getFieldName());
        assertEquals("First column name is: ", firstColumnName, fields.get(0).getColName());
        assertEquals("Second field name is: ",secondFieldName,fields.get(1).getFieldName());
        assertEquals("Second column name is: ",secondColumnName,fields.get(1).getColName());
    }
}
