package ru.mysql.teach.internet.shop.dao.schema;

import org.junit.Test;
import ru.mysql.teach.internet.shop.dao.schema.*;

import java.util.List;

import static org.junit.Assert.*;
/**
 *
 */
public class SchemaParserTest {

    /**
     * @return create a new object SchemaParser.
     */
    private ISchemaParser createSchemaParser(){
        return new SchemaParser();
    }

    /**
     * @return schema as string.
     */
    private String createSchemaAsString(){
        ReaderSchema readerSchema = new ReaderSchema();
        return readerSchema.getSchema("C:\\GitHub\\SkypeTeach\\tasks\\mysql\\src\\main\\resources\\SchemaForUser");
    }



    @Test
    public void parseUserSchemaFindClassName(){
        ISchemaParser schemaParser = createSchemaParser();
        IEntitySchema entitySchema = schemaParser.parseSchema(createSchemaAsString());
        assertEquals("Class name is: ", "ru.mysql.teach.internet.shop.users.UserSchema.User", entitySchema.getClassName());
    }

    @Test
    public void parseUserSchemaFindTableName(){
        ISchemaParser schemaParser = createSchemaParser();
        IEntitySchema entitySchema = schemaParser.parseSchema(createSchemaAsString());
        assertEquals("Table name is: ", "users", entitySchema.getTableName());
    }

    @Test
    public void parseUserSchemaFindFields(){
        ISchemaParser schemaParser = createSchemaParser();
        IEntitySchema entitySchema = schemaParser.parseSchema(createSchemaAsString());
        List<IEntitySchemaField> fields = entitySchema.getFields();
        assertEquals("Column name is: ", "id", fields.get(0).getColumnName());
        assertEquals("Field name is: ", "id", fields.get(0).getJavaName());
        assertEquals("Column name is: ", "name", fields.get(1).getColumnName());
        assertEquals("Field name is: ", "name", fields.get(1).getJavaName());
        assertEquals("Column name is: ", "age", fields.get(2).getColumnName());
        assertEquals("Field name is: ", "age", fields.get(2).getJavaName());
    }

    @Test
    public void parseProductSchemaFindTableName(){
        ISchemaParser schemaParser = createSchemaParser();
        ReaderSchema readerSchema = new ReaderSchema();
        String productSchema = readerSchema.getSchema("C:\\GitHub\\SkypeTeach\\tasks\\mysql\\src\\main\\resources\\SchemaForUser");
        IEntitySchema entitySchema = schemaParser.parseSchema(productSchema);
        assertEquals("Table name is: ", "product", entitySchema.getTableName());
        assertEquals("Class name is: ", "ru.mysql.teach.internet.shop.product.Product", entitySchema.getClassName());

    }
}
