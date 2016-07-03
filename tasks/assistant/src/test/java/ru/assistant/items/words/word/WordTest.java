package ru.assistant.items.words.word;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {


    @Test
    public void checkSetGetWordName(){
        IWord word = new Word();
        word.setName("Read");
        assertEquals("Word has a name: ","Read",word.getName());
    }

    @Test
    public void checkConstructorWithParameter(){
        IWord word = new Word("Book");
        assertEquals("Word has a name: ","Book",word.getName());
    }


    @Test
    public void equalsTwoSameWords(){
        IWord word = new Word("Read");
        IWord nextWord = new Word("Read");
        assertTrue("The same words",word.equals(nextWord));
    }

    @Test
    public void equalsTwoDifferentWords(){
        IWord word = new Word("Read");
        IWord nextWord = new Word("Book");
        assertFalse("The same words",word.equals(nextWord));
    }

    //todo change methods on a upper and lower register
    @Test
    public void equalsTwoSameWordsLowerRegisters(){
        IWord word = new Word("read");
        IWord nextWord = new Word("Read");
        assertTrue("The same words",word.equals(nextWord));
    }

    @Test
    public void equalsTwoSameWordsUpperRegisters(){
        IWord word = new Word("READ");
        IWord nextWord = new Word("Read");
        assertTrue("The same words",word.equals(nextWord));
    }
}
