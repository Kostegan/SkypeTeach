package ru.assistant.items.words;

import ru.assistant.items.words.parser.IParser;
import ru.assistant.items.words.storage.IWordsStorage;
import ru.assistant.items.words.storage.WordsStorage;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates objects for a work with words. Launches methods from classes.
 */
public abstract class WordsFactory {
    private IWordsStorage wordsStorage;

    /**
     * Creates classes and starts methods that work with words.
     * @param text that will be divided into words.
     */
    public void recordWordsFromText(String text){
        List<String> words = IParser.parseText(text);
        createWordStorage();
        recordWords(words);
    }

    /**
     * Records words in a word storage.
     * @param words
     */
    private void recordWords(List<String> words){
        for(String item : words){
            wordsStorage.addWord(createWord(item));
        }
    }

    /**
     * Creates new word with a parameter.
     * @return new word
     */
    private IWord createWord(String name){
        return new Word(name);
    }

    /**
     * Creates a word storage
     */
    private void createWordStorage(){
        wordsStorage = new WordsStorage();
    }
}
