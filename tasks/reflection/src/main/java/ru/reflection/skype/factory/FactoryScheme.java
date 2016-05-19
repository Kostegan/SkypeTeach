package ru.reflection.skype.factory;

import ru.reflection.skype.factory.scheme.IScheme;
import ru.reflection.skype.factory.scheme.Scheme;
import ru.reflection.skype.factory.scheme.exception.NotCorrectSchemeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class FactoryScheme implements IFactoryScheme {


    /**
     * Separates a specified string by groups and creates new Scheme object, filled all fields.
     * 1 - nameField     2 - TableColName     3 - nameField
     * 4 - TableColName  5 - nameField        6 - TableColName
     *
     * @param scheme - which will be separated.
     * @return  new Scheme object.
     */
    @Override
    public IScheme parseScheme(String scheme) throws NotCorrectSchemeException {
        IScheme schemeTemp = new Scheme();
        String classNamePattern = "([A-Za-z.]+)";
        String tableNamePattern = "([a-z]+)";
        String pattern = classNamePattern + "=" + tableNamePattern + "\\W\\[([a-zA-Z]+)=([a-zA-Z]+),\\W*([a-zA-Z]+)=([a-zA-Z_]+)\\]";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(scheme);
        if (matcher.find()) {
                for (int i = 0; i <= matcher.groupCount(); i++) {
                    schemeTemp.setClassName(matcher.group(1));
                    schemeTemp.setTableName(matcher.group(2));
                    schemeTemp.setFieldName(matcher.group(3), matcher.group(4));
                    schemeTemp.setFieldName(matcher.group(5), matcher.group(6));
            }
        } else {
            throw new NotCorrectSchemeException("Specified scheme is not correct. Correct format a scheme is: ClassName=TableName [nameField=TableColName,nameField=TableColName]");
        }
        return schemeTemp;
    }
}

//class Main {
//    public static void main(String[] args) throws NotCorrectSchemeException {
//        String schemeString = "ru.teach.skype.types.reflection.Person=users [name=NAME, age=PERSON_AGE]";
//        FactoryScheme factory = new FactoryScheme();
//        IScheme scheme = factory.parseScheme(schemeString);
//        System.out.println("Class name: " + scheme.getClassName() + ";\n" +
//                        " Table name is: " + scheme.getTableName() + ";\n" +
//                        " First field name is: " + scheme.getFields().get(0).getFieldName() + ";\n" +
//                        " First column name is: " + scheme.getFields().get(0).getColName() + ";\n" +
//                        " Second field name is: " + scheme.getFields().get(1).getFieldName() + ";\n" +
//                        " Second column name is: " + scheme.getFields().get(1).getColName() + "."
//        );
//
//    }
//}
