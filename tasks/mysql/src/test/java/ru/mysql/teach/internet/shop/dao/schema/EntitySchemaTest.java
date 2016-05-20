package ru.mysql.teach.internet.shop.dao.schema;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 */
public class EntitySchemaTest {
    private IEntitySchema createEntitySchema(){
        return new EntitySchema();
    }

    @Test
    public void setAndGetClassName(){
        IEntitySchema entitySchema = createEntitySchema();
        entitySchema.setClassName("Product");
        assertEquals("Class name is: ","Product",entitySchema.getClassName());
        entitySchema.setClassName("Person");
        assertEquals("Class name is: ","Person",entitySchema.getClassName());
    }

    @Test
    public void setAndGetTableName(){
        IEntitySchema entitySchema = createEntitySchema();
        entitySchema.setTableName("Product");
        assertEquals("Table name is: ","Product",entitySchema.getTableName());
        entitySchema.setTableName("Person");
        assertEquals("Table name is: ","Person",entitySchema.getTableName());
    }


    @Test
    public void addAndGetFields(){
        IEntitySchema entitySchema = createEntitySchema();
        IEntitySchemaField field1 = new EntitySchemaField("Name","name",false);
        IEntitySchemaField field2 = new EntitySchemaField("Age","age",false);
        entitySchema.addField(field1);
        entitySchema.addField(field2);
        assertEquals("EntitySchema has a field with column name:", "Name", entitySchema.getFields().get(0).getColumnName());
        assertEquals("EntitySchema has a field with column name:","Age",entitySchema.getFields().get(1).getColumnName());
    }

    @Test
    public void getPrimaryKeyField(){
        IEntitySchema entitySchema = createEntitySchema();
        IEntitySchemaField field1 = new EntitySchemaField("Name","name",false);
        IEntitySchemaField field2 = new EntitySchemaField("Age","age",true);
        entitySchema.addField(field1);
        entitySchema.addField(field2);
        assertEquals("Primary key field is:",field2,entitySchema.getPrimaryKeyField());
    }

    @Test
    public void getNullPrimaryKeyField(){
        IEntitySchema entitySchema = createEntitySchema();
        IEntitySchemaField field1 = new EntitySchemaField("Name","name",false);
        IEntitySchemaField field2 = new EntitySchemaField("Age","age",false);
        entitySchema.addField(field1);
        entitySchema.addField(field2);
        assertEquals("Primary key field is:",null,entitySchema.getPrimaryKeyField());
    }
}
