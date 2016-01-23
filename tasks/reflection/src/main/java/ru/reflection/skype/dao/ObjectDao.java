package ru.reflection.skype.dao;

import ru.reflection.skype.dao.exception.InappropriateObjectException;
import ru.reflection.skype.factory.FactoryScheme;
import ru.reflection.skype.factory.IFactoryScheme;
import ru.reflection.skype.factory.scheme.IScheme;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 */
public class ObjectDao implements IObjectDao {
    //"INSERT (name, age) VALUES ('Oleg', 25) INTO users"

    @Override
    public void save(Object object, String scheme) throws NotCorrectSchemeException, Exception, InappropriateObjectException {
        IFactoryScheme factory = new FactoryScheme();
        IScheme schemeTemp = factory.parseScheme(scheme);
        StringBuilder sb = new StringBuilder("INSERT (");
        sb.append(schemeTemp.getFields().get(0).getColName());
        sb.append(",");
        sb.append(schemeTemp.getFields().get(1).getColName());
        sb.append(") VALUES (");
        ArrayList<Object> reflectionResult = reflectObject(schemeTemp.getClassName(), object);
        sb.append("'");
        sb.append(reflectionResult.get(0));
        sb.append("',");
        sb.append(reflectionResult.get(1));
        sb.append(") INTO ");
        sb.append(schemeTemp.getTableName());

//        String pattern = "INSERT (%s) VALUES (%s) INTO %s";
//        String sql = String.format(pattern, "name, age", "kolya, 23", "users");

        System.out.println("SQL: " + sb);
    }

    private ArrayList<Object> reflectObject(String className, Object obj) throws Exception, InappropriateObjectException {
        ArrayList<Object> results = new ArrayList<>();
        Class cls = Class.forName(className);

        Field[] fields = cls.getDeclaredFields();
//        Method[] methods = cls.getDeclaredMethods();
        if (fields.length == 2 ) {
            for (int i = 0; i < fields.length; i++) {
                String fieldName = fields[i].getName();
                String getMethodName = "get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
//                checksMethod(cls,getMethodName);
                Method method = cls.getMethod(getMethodName);
                Object result = method.invoke(obj);
                results.add(result);
            }
        } else {
            throw new InappropriateObjectException("Object : " + obj + " is not correct. Object must be has two fields and two methods get/set for this fields.");
        }

        return results;
    }

    private Object getFieldValue(Object object, String fieldName) {
        return null;
    }

//    private Method checksMethod(Class cls, String getMethodName){
//        Method method;
//        return method = cls.getMethod(getMethodName);
//    }
}


