package ru.assistant.items.words.storage;

import ru.assistant.items.words.storage.exception.StorageIsEmptyException;
import ru.assistant.items.words.storage.exception.WordKeyInvalidException;
import ru.assistant.items.words.word.IWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class WordsStorage implements IWordsStorage {
    private Map<Integer, IWord> storage;
    private List<Integer> keysList;

    public WordsStorage() {
        storage = new HashMap<>();
        keysList = new ArrayList<>();
    }
    @Override
    public void addWord(IWord word) {
        Integer key = word.getKey();
        if (storage.put(key, word) == null) {
            keysList.add(key);
        }
    }
    @Override
    public IWord getWordByKey(int key) throws WordKeyInvalidException {
        if (storage.containsKey(key)) {
            return storage.get(key);
        } else {
            throw new WordKeyInvalidException("Key: " + key + " is invalid.");
        }
    }

    @Override
    public List<IWord> getWords() throws StorageIsEmptyException {
        List<IWord> wordsList;
        if (!storage.isEmpty()) {
            wordsList = new ArrayList<>();
            for (Integer key : keysList) {
                wordsList.add(storage.get(key));
            }
            return wordsList;
        }
        throw new StorageIsEmptyException("Storage is empty.");
    }
}

