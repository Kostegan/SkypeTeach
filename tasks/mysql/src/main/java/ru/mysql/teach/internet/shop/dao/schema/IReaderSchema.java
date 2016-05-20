package ru.mysql.teach.internet.shop.dao.schema;

/**
 * Stores a references to all schemas, allows to read schema files.
 */
public interface IReaderSchema {
    /**
     * @param path to a schema which need will be read.
     * @return schema as string.
     */
    String getSchema(String path);
}
