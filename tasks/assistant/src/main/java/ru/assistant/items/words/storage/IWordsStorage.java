package ru.assistant.items.words.storage;

import ru.assistant.items.words.storage.exception.StorageIsEmptyException;
import ru.assistant.items.words.storage.exception.WordKeyInvalidException;
import ru.assistant.items.words.word.IWord;

import java.util.List;

/**
 * Saves all word in a base. Represents methods for adding and getting a word by specified key, or get all words.
 */
public interface IWordsStorage {
    /**
     * Adds a specified word in a base, if the word is added earlier then he will not add to base.
     * @param word - which will be added
     */
    public void addWord(IWord word);

    /**
     * @param key for a word that need find.
     * @return word by key, return null if the key is invalid.
     */
    public IWord getWordByKey(int key) throws WordKeyInvalidException;


    /**
     * @return all words from a storage.
     * @throws StorageIsEmptyException if a storage is empty.
     */
    public List<IWord> getWords() throws StorageIsEmptyException;
}
