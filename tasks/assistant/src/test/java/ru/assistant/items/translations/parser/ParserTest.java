package ru.assistant.items.translations.parser;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class ParserTest {
    @Test
    public void parseHtml(){
        String str = "ples\"><span class=\"translation\">разгадывать,</span>sadsdsadples\"><span class=\"translation\">рать</span>sadsdsad<span class=\"translation\">  ,  </span>";
        List<String> words = Parser.parseHtml(str);
        assertEquals("Result one: ","разгадывать",words.get(0));
        assertEquals("Result two: ","рать",words.get(1));
    }
}
