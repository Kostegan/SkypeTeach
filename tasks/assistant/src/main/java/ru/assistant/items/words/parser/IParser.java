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
public class IParser {
    private ArrayList<String> wordList = new ArrayList<>();
    public static final String SPACE_PATTERN = "(\\s*)";
    public static final String WORD_PATTERN = "([a-zA-Z-]+)";
    public static final String NON_WORD_CHAR_PATTERN = "(\\W*)";
    public static final String PATTERN = SPACE_PATTERN + WORD_PATTERN + NON_WORD_CHAR_PATTERN + SPACE_PATTERN;

    /**
     * Divides text into separate words.
     *
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

//class Main {
//    public static void main(String[] args) {
//        String text = "\n" +
//                "Ever since birth, I have be-en different. \n" +
//                "I have the ability to transform myself, at will, into a dragon. \n" +
//                "I realize this sounds like a blessing - After all who wouldn't mind transforming into a three-story tall, fire-breathing, flying lizard? - But the reality is the exact opposite. It’s a curse. Everyone who knows about \"the dragon\" rejects and hates me, dooming me to a lifetime of distrust and solitude. \n" +
//                "No, this is no blessing. \n" +
//                "For all of my seventeen years, I have thought I was the only one of my kind and the only ones who truly understood me were the moon and the night sky. asd";
////        String text = "asd ddfs";
//        List<String> words = IParser.parseText(text);
//        for (int i = 0; i < words.size(); i++) {
//            System.out.print("line number - " + i + ": ");
//            System.out.println(words.get(i));
//        }
//    }
//}

