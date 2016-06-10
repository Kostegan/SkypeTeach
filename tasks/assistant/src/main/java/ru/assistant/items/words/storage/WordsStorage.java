package ru.assistant.items.words.storage;

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
        if (storage.put(key, word) != null) {
            keysList.add(key);
        }
    }

    @Override
    public IWord getWordByKey(int key) {
        return storage.get(key);
    }

    @Override
    public List<IWord> getWords() {
        List<IWord> wordsList;
        if (storage.size() > 0) {
            wordsList = new ArrayList<>();
            for (Integer key : keysList) {
                wordsList.add(storage.get(key));
            }
            return wordsList;
        }
        return null;
    }
}
