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
    private static IWordsStorage wordsStorage;

    /**
     * Creates classes and starts methods that work with words.
     *
     * @param text that will be divided into words.
     */
    public static void recordWordsFromText(String text) {
        List<String> words = IParser.parseText(text);
        createWordStorage();
        recordWords(words);
    }

    public static IWordsStorage getWordsStorage() {
        return wordsStorage;
    }

    /**
     * Records words in a word storage.
     *
     * @param words
     */
    private static void recordWords(List<String> words) {
        for (String item : words) {
            wordsStorage.addWord(createWord(item));
        }
    }

    /**
     * Creates new word with a parameter.
     *
     * @return new word
     */
    private static IWord createWord(String name) {
        return new Word(name);
    }

    /**
     * Creates a word storage
     */
    private static void createWordStorage() {
        wordsStorage = new WordsStorage();
    }
}


class Main {
    public static void main(String[] args) {
        String text = "\n" +
                "Ever since birth, I have be-en different. \n" +
                "I have the ability to transform myself, at will, into a dragon. \n" +
                "I realize this sounds like a blessing - After all who wouldn't mind mind transforming transforming into a three-story tall, fire-breathing, flying lizard? - But the reality is the exact opposite. It’s a curse. Everyone who knows about \"the dragon\" rejects and hates me, dooming me to a lifetime of distrust and solitude. \n" +
                "No, this is no blessing. \n" +
                "For all of my seventeen years, I have thought I was the only one of my kind and the only ones who truly understood me were the moon and the night sky. asd";
        WordsFactory.recordWordsFromText(text);
        List<IWord> words = WordsFactory.getWordsStorage().getWords();
        for (IWord word : words) {
            System.out.println("Word name is: "+word.getName()+", word key is: "+word.getKey());
        }
    }
}