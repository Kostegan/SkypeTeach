package ru.assistant.items.words.storage;

import org.junit.Test;
import ru.assistant.items.words.storage.exception.StorageIsEmptyException;
import ru.assistant.items.words.storage.exception.WordKeyInvalidException;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;

import java.util.List;

import static org.junit.Assert.*;


/**
 *
 */
public class WordsStorageTest {

    @Test
    public void addWords() throws WordKeyInvalidException{
        IWord firstWord = new Word("Pen");
        IWord secondWord = new Word("Pencil");

        IWordsStorage storage = new WordsStorage();
        storage.addWord(firstWord);
        storage.addWord(secondWord);
        assertEquals("The base has name: ", "Pen", storage.getWordByKey(firstWord.getKey()).getName());
        assertEquals("The base has name: ","Pencil",storage.getWordByKey(secondWord.getKey()).getName());
    }

    @Test
    public void getWordsByValidKey()throws WordKeyInvalidException{
        IWord firstWord = new Word("Pen");
        IWord secondWord = new Word("Pencil");

        IWordsStorage storage = new WordsStorage();
        storage.addWord(firstWord);
        storage.addWord(secondWord);
        assertEquals("The base has name: ","Pen",storage.getWordByKey(firstWord.getKey()).getName());
        assertEquals("The base has name: ","Pencil",storage.getWordByKey(secondWord.getKey()).getName());
    }

    @Test (expected = WordKeyInvalidException.class)
    public void getWordsByInvalidKey()throws WordKeyInvalidException{
        IWord firstWord = new Word("Pen");
        IWord secondWord = new Word("Pencil");

        IWordsStorage storage = new WordsStorage();
        storage.addWord(firstWord);
        storage.addWord(secondWord);
        assertEquals("The base has name: ","Pen",storage.getWordByKey(11).getName());
        assertEquals("The base has name: ","Pencil",storage.getWordByKey(22).getName());
    }


    @Test
    public void getWords()throws StorageIsEmptyException{
        IWord firstWord = new Word("Pen");
        IWord secondWord = new Word("Pencil");
        IWord thirdWord = new Word("Dog");
        IWord fourthWord = new Word("Cat");

        IWordsStorage storage = new WordsStorage();
        storage.addWord(firstWord);
        storage.addWord(secondWord);
        storage.addWord(thirdWord);
        storage.addWord(fourthWord);
        List<IWord> words = storage.getWords();
//        assertEquals("Word list: ","Pen",words);
    }



}
