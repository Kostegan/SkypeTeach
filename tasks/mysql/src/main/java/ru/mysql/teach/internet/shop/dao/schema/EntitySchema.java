package ru.mysql.teach.internet.shop.dao.schema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class EntitySchema implements IEntitySchema {
    private String className;
    private String tableName;
    private final List<IEntitySchemaField> fields = new ArrayList<>();

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

    public void addField(IEntitySchemaField field){
        fields.add(field);
    }

    public List<IEntitySchemaField> getFields() {
        return fields;
    }

    // todo спросить, можно вернуть null ?
    public IEntitySchemaField getPrimaryKeyField(){
        for(IEntitySchemaField field:fields){
            if(field.isPrimaryKey()){
                return field;
            }
        }
        return null;
    }
}
