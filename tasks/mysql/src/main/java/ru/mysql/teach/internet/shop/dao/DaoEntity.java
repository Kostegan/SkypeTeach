package ru.mysql.teach.internet.shop.dao;

import ru.mysql.teach.internet.shop.users.user.IUser;

/**
 *
 */
public class DaoEntity implements IDaoEntity {
    @Override
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

    private String[] parseSchema(String schema) {
        return null;
    }

    private String[] reflectSpecifiedClass(Class cls) {
        return null;
    }

    private IUser createUser(){
        return null;
    }

    public void getEntityByIdOfStoredProcedure(){

    }


}
