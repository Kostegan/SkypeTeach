package ru.mysql.teach.internet.shop.dao.schema;

import ru.mysql.teach.internet.shop.dao.schema.IEntitySchema;

/**
 * Divides schema on a entity.
 */
public interface ISchemaParser {
    /**
     * Divides a specified schema on separate elements.
     * @param schema which will be parsed
     * @return new object which stores data of schema in fields.
     */
    IEntitySchema parseSchema(String schema);
}
