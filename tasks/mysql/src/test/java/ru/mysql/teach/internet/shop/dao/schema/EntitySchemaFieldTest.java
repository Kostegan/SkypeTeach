package ru.mysql.teach.internet.shop.dao.schema;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class EntitySchemaFieldTest {
    private IEntitySchemaField createEntitySchemaField(){
        return new EntitySchemaField();
    }

    @Test
    public void setAndGetFieldColName(){
        IEntitySchemaField schField = createEntitySchemaField();
        schField.setColumnName("Name");
        assertEquals("Column name is: ", "Name", schField.getColumnName());
        schField.setColumnName("age");
        assertEquals("Column name is: ", "age", schField.getColumnName());
    }

    @Test
    public void setAndGetFieldJavaName(){
        IEntitySchemaField schField = createEntitySchemaField();
        schField.setJavaName("Name");
        assertEquals("Field has name: ", "Name", schField.getJavaName());
        schField.setJavaName("LastName");
        assertEquals("Field has name: ", "LastName", schField.getJavaName());
    }

    @Test
    public void checkPrimaryKeyField(){
        IEntitySchemaField schField = createEntitySchemaField();
        schField.setPrimaryKey(true);
        assertTrue("This field is primary key", schField.isPrimaryKey());
        schField.setPrimaryKey(false);
        assertFalse("This field is not primary key", schField.isPrimaryKey());
    }

}
