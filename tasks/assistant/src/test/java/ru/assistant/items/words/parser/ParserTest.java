package ru.assistant.items.words.parser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class ParserTest {
    @Test
    public void parseSmallText(){
        String text = "The Closure tools help developers to build.";
        List<String> words = Parser.parseText(text);
        assertEquals("The word is: ","The",words.get(0));
        assertEquals("The word is: ","Closure",words.get(1));
        assertEquals("The word is: ","tools",words.get(2));
        assertEquals("The word is: ","help",words.get(3));
        assertEquals("The word is: ","developers",words.get(4));
        assertEquals("The word is: ","to",words.get(5));
        assertEquals("The word is: ","build",words.get(6));
    }

    //todo чтобы тест проходил
    @Test
    public void parseEmptyText(){
        String text = "";
        List<String> words = Parser.parseText(text);
        assertEquals("The word is: ","The",words.get(0));
    }
}
