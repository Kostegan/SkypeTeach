package ru.test.skype.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class PatternExample1 {


    public static void main(String[] args) {
        String schema = "ru.test.skype.MyPattern=MyPattern [id=id,name=name,age=age]";
        // ([^=]+)=(\\S+) (\\[[\\w,=]\\])
//        String schema = "id=id,name=name,age=age";
//        String schema = "package ru.test.skype.MyPttern=abc aasd sddfas";
        MyPattern.parsing(schema);
    }
}

class MyPattern {

    final private static String CLASS_NAME_PATTERN = "[^=]+";
    //    final private static String TABLE_NAME_PATTERN = "\\S+";
    final private static String TABLE_NAME_PATTERN = "\\S+";
    final private static String FIELD_COLUMN_PATTERN = "[^=]+";
    final private static String FIELD_OBJECT_PATTERN = "[^,]+";
    final private static String FIELD_PATTERN = "(" + FIELD_COLUMN_PATTERN + ")=(" + FIELD_OBJECT_PATTERN + ")";
    final private static String FIELDS_PATTERN = "";
    final private static String testSchema = "([^=]+)=(\\S+) (\\[((\\w+=\\w+),?)+\\])";

//    private static String allSchema = "^(" + CLASS_NAME_PATTERN + ")=(" + TABLE_NAME_PATTERN + ") \\[("+FIELD_PATTERN+")\\]";
//    private static String allSchema = "^("+CLASS_NAME_PATTERN+")=("+TABLE_NAME_PATTERN+") \\["+FIELD_PATTERN+"\\]";
//    private static String allSchema = "^(("+FIELD_PATTERN+"),?)+";
//    private static String allSchema = testSchema;

    public static void parsing(String string) {
        java.util.regex.Pattern p = Pattern.compile(testSchema);
        Matcher matcher = p.matcher(string);
        if (matcher.find()) {
            System.out.println();
        }
    }
}
