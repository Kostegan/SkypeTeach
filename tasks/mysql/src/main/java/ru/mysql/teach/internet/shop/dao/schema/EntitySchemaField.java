package ru.mysql.teach.internet.shop.dao.schema;

/**
 *
 */
public class EntitySchemaField implements IEntitySchemaField {
    private String columnName;
    private String javaName;
    private boolean primaryKey;

    public EntitySchemaField() {
    }

    public EntitySchemaField(String columnName, String javaName, boolean primaryKey) {
        this.columnName = columnName;
        this.javaName = javaName;
        this.primaryKey = primaryKey;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getJavaName() {
        return javaName;
    }

    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }
}
