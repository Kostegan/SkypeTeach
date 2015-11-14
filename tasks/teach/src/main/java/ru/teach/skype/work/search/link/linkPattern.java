package ru.teach.skype.work.search.link;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class linkPattern {
    private String pattern = "";

    public String compareElement(String link){
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(link);
        if(matcher.matches()){
            return link;
        } else {
            return "String not matches to a pattern.";
        }
    }
}
