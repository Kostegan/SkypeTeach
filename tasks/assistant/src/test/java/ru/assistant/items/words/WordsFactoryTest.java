package ru.assistant.items.words;

import org.junit.Test;
import ru.assistant.items.words.storage.IWordsStorage;
import ru.assistant.items.words.storage.exception.StorageIsEmptyException;

import static org.junit.Assert.*;


/**
 *
 */
public class WordsFactoryTest {

    @Test
    public void recordText()throws StorageIsEmptyException{
        String text = "Set up and use Spark";
        IWordsStorage storage = WordsFactory.parseTextOnIndividualWords(text);
        assertEquals("Storage has a word: ","Set",storage.getWords().get(0).getName());
        assertEquals("Storage has a word: ","up",storage.getWords().get(1).getName());
        assertEquals("Storage has a word: ","and",storage.getWords().get(2).getName());
        assertEquals("Storage has a word: ","use",storage.getWords().get(3).getName());
        assertEquals("Storage has a word: ","Spark",storage.getWords().get(4).getName());
    }
}
