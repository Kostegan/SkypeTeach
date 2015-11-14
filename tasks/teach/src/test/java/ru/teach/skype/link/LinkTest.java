package ru.teach.skype.link;

import org.junit.Test;

/**
 * https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
 * href="https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html"
 */
public class LinkTest {

    @Test
    public void parsing(){
        PatternFind pattern = new PatternFind();
        String link = "";
        pattern.parsingToGroup(link);
    }
}
