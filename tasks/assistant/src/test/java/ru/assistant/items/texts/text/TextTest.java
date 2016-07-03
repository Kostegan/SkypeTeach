package ru.assistant.items.texts.text;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class TextTest {

    @Test
    public void createTextEmptyConstructor(){
        IText text = new Text();
        String sentence = "It has robust libraries.";
        text.setText(sentence);
        assertEquals("Text: ","It has robust libraries.",text.getText());
    }

    @Test
    public void createTextNotEmptyConstructor(){
        IText text = new Text("It has robust libraries.");
        assertEquals("Text: ","It has robust libraries.",text.getText());
    }

}
