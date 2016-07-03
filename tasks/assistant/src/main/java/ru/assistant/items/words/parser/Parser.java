package ru.assistant.items.words.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Has methods for separating a words on separate objects.
 */
public class Parser {
    public static final String SPACE_PATTERN = "(\\s*)";
    public static final String WORD_PATTERN = "([a-zA-Z-]+)";
    public static final String NON_WORD_CHAR_PATTERN = "(\\W*)";
    public static final String PATTERN = SPACE_PATTERN + WORD_PATTERN + NON_WORD_CHAR_PATTERN + SPACE_PATTERN;
    /**
     * Divides text into separate words.
     * @param text that will be divided.
     * @return words list.
     */
    public static List<String> parseText(String text) {
        Pattern p = Pattern.compile(PATTERN);
        List<String> list = new ArrayList<>();
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            list.add(matcher.group(2));
        }
        return list;
    }
}

class Main{
    public static void main(String[] args) {
        String text = "Here's a method taken from a Java class I wrote that shows how to open and read a file using Java and the Java FileReader class. This uses the most recent Java 5 syntax and classes";
        for(String word : Parser.parseText(text)){
            System.out.println(word);
        }
    }
}

