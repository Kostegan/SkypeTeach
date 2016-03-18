package ru.mysql.teach.internet.shop.dao.schema;

import java.util.List;

/**
 * Keeps all parsed elements from a schema.
 */
public interface IEntitySchema {

    /**
     * @return ClassName as a string
     */
    public String getClassName();

    /**
     * @param className saves to a field
     */
    public void setClassName(String className);

    /**
     * @return tableName as a string
     */
    public String getTableName();

    /**
     * @param tableName saves to a field
     */
    public void setTableName(String tableName);

    /**
     * Adds a specified field from schema to a field list.
     * @param field which will be added
     */
    public void addField(IEntitySchemaField field);

    /**
     * @return list of fields from a schema
     */
    public List<IEntitySchemaField> getFields();

    /**
     * @return field with primary key, or null if this field not exist.
     */
    public IEntitySchemaField getPrimaryKeyField();
}
