package ru.reflection.skype.factory.scheme;

import ru.reflection.skype.factory.scheme.field.ISchemeField;

import java.util.ArrayList;

/**
 * Consists of fields className - name class, tableName - name table, fields.
 * Gives get/set methods for all fields.
 */
public interface IScheme {
    String getClassName();
    void setClassName(String nameClass);
    String getTableName();
    void setTableName(String nameTable);
    ArrayList<ISchemeField> getFields();
    void setFieldsName(String fieldName, String columnName);
}
