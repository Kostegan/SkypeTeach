package ru.teach.skype.types.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class PatternTeach {
    public static void main(String[] args) {

        String[] text = {
                "70,4abc,123,bfr0,678,,,9,8,7"
        };
//        String pattern = "[^a-z,][0-9]+";
        String pattern = "([a-z]^)+";
//          String pattern = "(^\\d+,)|(^\\d+$)|(,\\d+,)|(,\\d+$)";
//        String pattern = "(,|^)[0-9]+($|,)";
//        String pattern = "[^a-z,]+[0-9]{0,3}";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text[0]);
        while (matcher.find()) {

            for(int i = 0;i<=matcher.groupCount();i++){
                System.out.print(i + " - " + matcher.group(i)+"; ");
            }
            System.out.println();
        }
    }
}
