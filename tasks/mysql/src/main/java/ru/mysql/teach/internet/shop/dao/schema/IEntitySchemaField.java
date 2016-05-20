package ru.mysql.teach.internet.shop.dao.schema;

/**
 * Keeps a data about schema fields.
 */
public interface IEntitySchemaField {
    /**
     * @return column name as a string.
     */
    public String getColumnName();

    /**
     * @param columnName saves to a field.
     */
    public void setColumnName(String columnName);

    /**
     * @return a name field in a java file.
     */
    public String getJavaName();

    /**
     * @param javaName save to a field.
     */
    public void setJavaName(String javaName);

    /**
     * @return true if a field is PrimaryKey
     */
    public boolean isPrimaryKey();

    /**
     * @param primaryKey save to a field.
     */
    public void setPrimaryKey(boolean primaryKey);
}
