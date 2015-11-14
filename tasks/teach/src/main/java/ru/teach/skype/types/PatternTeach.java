package ru.teach.skype.types;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class PatternTeach {
    public static void main(String[] args) {
        String str = "abc 123 .";
        String pattern = "^a.*\\.$";

//        Pattern p = Pattern.compile(pattern);
//        Matcher matcher = p.matcher(str);
//        System.out.println(matcher.matches());

        System.out.println(str.matches(pattern));
    }

//    public static void main(String[] args) {
//        String[] testStrings = {
//                "123.25.56.29", "0.1.2.3"
//        };
//
//        String pattern =
//                "^((\\d{1,3})\\.(\\d{1,3}))\\.(\\d{1,3})\\.(\\d{1,3})$";
//        Pattern p = Pattern.compile(pattern);
//
//        for (String str : testStrings) {
//            Matcher matcher = p.matcher(str);
//            if (matcher.find()) {
//                for (int i=1; i<=matcher.groupCount(); i++) {
//                    System.out.print(i + ": " + matcher.group(i) + ", ");
//                }
//                System.out.println();
//            }
//
//        }
//    }

    public static void main2(String[] args) {
        String[] testStrings = {
                "abc,123,bfr0,678,,,9,"
        };

        String pattern =
                "[^a-z][0-9]+";
//                "[^,]+";
//                "^(([^,]*),)*$";
        Pattern p = Pattern.compile(pattern);

        for (String str : testStrings) {
            Matcher matcher = p.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.groupCount() + " - " + matcher.group());

            }

        }
    }

//    public static void main(String[] args) {
//        String[] testStrings = {
//                "ab#", "c1", "45#", "PO", "324"
//        };
//
//        String pattern =
//                "(([a-zA-Z]{2})|(\\d{2}))#";
//        Pattern p = Pattern.compile(pattern);
//
//        for (String str : testStrings) {
//            Matcher matcher = p.matcher(str);
//            if (matcher.matches()) {
//                System.out.println(str);
//            }
//        }
//    }

//    public static void main2(String[] args) {
//        String[] testStrings = {
//                "abc123T", "def29999444999Q", "x4", "7def", "fro5,"
//        };
//        String pattern = "[a-z]{3}\\d+[ATF,]";
//        Pattern p = Pattern.compile(pattern);
//
//        for (String str : testStrings) {
//            Matcher matcher = p.matcher(str);
//            if (matcher.matches()) {
//                System.out.println(str);
//            }
//        }
//
//    }

}
