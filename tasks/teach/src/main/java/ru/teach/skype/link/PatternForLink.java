package ru.teach.skype.link;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents pattern for a search.
 */
public class PatternForLink implements IPatternForLink {
    private String pattern = "^http[s]?://(www.)?[a-zA-z]*.[a-z]*/";

    public String compareElement(String str) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(str);
        if (matcher.matches()) {
            return str;
        } else {
            return "String not matches to a pattern.";
        }
    }
}
