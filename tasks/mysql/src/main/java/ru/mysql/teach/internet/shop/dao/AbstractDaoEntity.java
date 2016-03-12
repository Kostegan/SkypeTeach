package ru.mysql.teach.internet.shop.dao;

import ru.mysql.teach.internet.shop.users.user.IUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public abstract class AbstractDaoEntity {
    private IDaoDataBase daoDataBase;

    protected AbstractDaoEntity(IDaoDataBase daoDataBase) {
        this.daoDataBase = daoDataBase;
    }

    protected IDaoDataBase getDaoDataBase() {
        return daoDataBase;
    }


    public Object getEntityById(Class cls, int id) throws Exception {
        if (cls == IUser.class) {
            return getUser(cls, id);
        }
        return null;
    }

    private IUser getUser(Class cls, int id) throws Exception {
        String schema = "C:\\GitHub\\SkypeTeach\\tasks\\mysql\\src\\main\\resources\\SchemaForUser";
        String[] dividedScheme = parseSchema(schema);
        String[] reflectClass = reflectSpecifiedClass(Class.forName(dividedScheme[0]));


        StringBuilder builder = new StringBuilder("SELECT ");
        builder.append(dividedScheme[3]);
        builder.append(",");
        builder.append(dividedScheme[5]);
        builder.append(",");
        builder.append(dividedScheme[7]);
        builder.append(" FROM ");
        builder.append(reflectClass[0]);
        builder.append(" ");
        builder.append("WHERE ");
        builder.append(dividedScheme[2]);
        builder.append("=");
        builder.append(id);
        return createUser();
    }

    public static String[] parseSchema(String schema) {
        final String CLASS_NAME_PATTERN = "[^=]+";
        final String TABLE_NAME_PATTERN = "\\S+";
        final String FIELD_COLUMN_PATTERN = "[^=,]+";
        final String FIELD_OBJECT_PATTERN = "[^,]+";
        final String FIELD_PATTERN = "("+FIELD_COLUMN_PATTERN+")=("+FIELD_OBJECT_PATTERN+")";
        final String FIELDS_PATTERN = "(("+FIELD_PATTERN+"),?)+";
        final String SCHEMA_PATTERN= "^("+CLASS_NAME_PATTERN+")=("+TABLE_NAME_PATTERN+") \\[("+FIELDS_PATTERN+")\\]";

        Pattern p = Pattern.compile(SCHEMA_PATTERN);

        Pattern fieldsP = Pattern.compile(FIELD_PATTERN);


        Matcher matcher = p.matcher(schema);
        if(matcher.find()){
            String className = matcher.group(1);
            String tableName =matcher.group(2);
            String fields = matcher.group(3);
            matcher = fieldsP.matcher(fields);
            while(matcher.find()){
                String f = "";
            }

        }

        return null;
    }

    public static void main(String[] args) {
        String schema = "ru.mysql.teach.internet.shop.users.user.User=users [id=id,name=name,age=age]";
        parseSchema(schema);
    }

    private String[] reflectSpecifiedClass(Class cls) {
        return null;
    }

    private IUser createUser() {
        return null;
    }
}




