package ru.reflection.skype.factory.scheme;

import ru.reflection.skype.factory.scheme.IScheme;
import ru.reflection.skype.factory.scheme.field.ISchemeField;
import ru.reflection.skype.factory.scheme.field.SchemeField;

import java.util.ArrayList;

/**
 *
 */
public class Scheme implements IScheme {
    private String className;
    private String tableName;
    private ArrayList<ISchemeField> fields = new ArrayList<>();

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    @Override
    public ArrayList<ISchemeField> getFields() {
        return fields;
    }

    @Override
    public void setFieldName(String fieldName, String columnName) {
        ISchemeField field = new SchemeField(fieldName,columnName);
        fields.add(field);
    }
}
