package ru.mysql.teach.internet.shop.dao.schema;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class has a pattern for parsing a schema.
 */
public class SchemaParser implements ISchemaParser {
    final String CLASS_NAME_PATTERN = "[^=]+";
    final String TABLE_NAME_PATTERN = "\\S+";
    final String FIELD_COLUMN_PATTERN = "[^=,]+";
    final String FIELD_JAVA_NAME_PATTERN = "[^,]+";
    final String FIELD_PATTERN = "("+FIELD_COLUMN_PATTERN+")=("+ FIELD_JAVA_NAME_PATTERN +")";
    final String FIELDS_PATTERN = "(("+FIELD_PATTERN+"),?)+";
    final String SCHEMA_PATTERN= "^("+CLASS_NAME_PATTERN+")=("+TABLE_NAME_PATTERN+") \\[("+FIELDS_PATTERN+")\\]";

    Pattern p = Pattern.compile(SCHEMA_PATTERN+"+");
    Pattern fieldsP = Pattern.compile(FIELD_PATTERN);

    public IEntitySchema parseSchema(String schema){
        IEntitySchema entitySchema = new EntitySchema();
        Matcher matcher = p.matcher(schema);
        if(matcher.find()) {
            entitySchema.setClassName(matcher.group(1));
            entitySchema.setTableName(matcher.group(2));
            String fields = matcher.group(3);
            matcher = fieldsP.matcher(fields);
            while (matcher.find()) {
                IEntitySchemaField field = new EntitySchemaField();
                field.setColumnName(matcher.group(1));
                field.setJavaName(matcher.group(2));
                entitySchema.addField(field);
            }
        }
        return entitySchema;
    }
}
