package ru.assistant.items.words.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *  Has methods for separating a words on separate objects.
 */
public class IParser {
    private ArrayList<String> wordList = new ArrayList<>();
    public static final String PATTERN = "[a-z]*";

    /**
     * Divides text into separate words.
     * @param text that will be divided.
     * @return string list.
     */
    public static List<String> parseText(String text){
        Pattern p = Pattern.compile(PATTERN);
//        for()
        return null;
    }

    public static List<String> parseToLine(String text){
        List<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new StringReader(text))){
            String line = reader.readLine();
            while(line!=null){
                lines.add(line);
                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }
}

