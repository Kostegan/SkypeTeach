package ru.mysql.teach.internet.shop.dao.schema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class EntitySchema {
    private String className;
    private String tableName;
    private final List<EntitySchemaField> fields = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void addField(EntitySchemaField field){
        fields.add(field);
    }

    public List<EntitySchemaField> getFields() {
        return fields;
    }

    public EntitySchemaField getPrimaryKeyField(){
        return null;
    }
}
