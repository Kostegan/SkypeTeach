package ru.teach.skype.types.reflection;

import java.util.Map;

/**
 *
 */
public class ObjectDao {
        //ClassName=TableName [nameField=TableName,nameField=TableName]
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

    /**
     * Divides a specified string and writes to array.
     * index 0 - className, 1 - TableName, 2 - nameField1, 3 - TableField1, 4 - nameField2, 5 - TableField2
     * @param scheme - the string which will be divided
     */
    public void parseScheme(String scheme){
        String str = scheme;
        String[] items = new String[6];
        int temp = str.indexOf(61);
        items[0] = str.substring(0,temp);
        str = str.substring(temp+1);
        temp = str.indexOf(32);
        items[1] = str.substring(0,temp);
    }
}
