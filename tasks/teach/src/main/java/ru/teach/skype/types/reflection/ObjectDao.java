package ru.teach.skype.types.reflection;

import java.util.Map;

/**
 *
 */
public class ObjectDao {
    public void save(Object object, String scheme) {
        String sql = "INSERT (name, age) VALUES ('Oleg', 25) INTO users";

        String tableName = null;// from scheme: ..
        Map<String, String> fields = null;// from scheme: <object_field_name>:<db_column_name>

        StringBuilder sb = new StringBuilder("INSERT (");
        // from fields
        sb.append(") VALUES (");
        // reflection from object
        sb.append(") INTO ");
        sb.append(tableName);

        System.out.println("SQL: " + sb);

    }
}
