package ru.test.skype.pattern;

import java.util.regex.Pattern;

/**
 *
 */
public abstract class PatternExample2 {
    String schema = "ru.mysql.teach.internet.shop.users.user.User=users [id=id,name=name,age=age]";

    /**
     * Accepts a scheme and divides her to String elements.
     * @param schema which will be divided.
     * @return strings array
     */
    public static String[] parse(String schema){

        return null;
    }



}


class SchemaPattern{
    final String CLASS_NAME_PATTERN = "[^=]+";
    final String TABLE_NAME_PATTERN = "\\S+";
    final String FIELD_COLUMN_PATTERN = "[^=,]+";
    final String FIELD_OBJECT_PATTERN = "[^,]+";
    final String FIELD_PATTERN = "("+FIELD_COLUMN_PATTERN+")=("+FIELD_OBJECT_PATTERN+")";
    final String FIELDS_PATTERN = "(("+FIELD_PATTERN+"),?)+";
    final String SCHEMA_PATTERN= "^("+CLASS_NAME_PATTERN+")=("+TABLE_NAME_PATTERN+") \\[("+FIELDS_PATTERN+")\\]";

    Pattern p = Pattern.compile(SCHEMA_PATTERN);

    Pattern fieldsP = Pattern.compile(FIELD_PATTERN);
}