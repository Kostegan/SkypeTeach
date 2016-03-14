package ru.reflection.skype.factory.scheme.field;

/**
 * Consists of fields for stored a name-field and a  name-column in a base.
 */
public interface ISchemeField {
    String getFieldName();
    String getColName();
    void setColName(String name);
    void setFieldName(String name);

}
