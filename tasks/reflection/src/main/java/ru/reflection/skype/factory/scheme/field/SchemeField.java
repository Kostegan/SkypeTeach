package ru.reflection.skype.factory.scheme.field;

/**
 *
 */
public class SchemeField implements ISchemeField{
    private String nameField;
    private String nameColumn;

    public SchemeField() {
    }

    public SchemeField(String nameField, String nameColumn) {
        this.nameField = nameField;
        this.nameColumn = nameColumn;
    }

    @Override
    public String getFieldName() {
        return nameField;
    }

    @Override
    public String getColName() {
        return nameColumn;
    }

    @Override
    public void setColName(String name) {
        nameColumn = name;
    }

    @Override
    public void setFieldName(String name) {
        nameField = name;
    }
}
