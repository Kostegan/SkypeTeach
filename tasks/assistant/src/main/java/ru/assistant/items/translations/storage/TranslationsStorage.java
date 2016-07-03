package ru.assistant.items.translations.storage;

import ru.assistant.items.translations.word.translation.ITranslation;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class TranslationsStorage implements ITranslationsStorage {
    private Map<String,ITranslation> translations;

    public TranslationsStorage(){
        translations = new HashMap<>();
    }

    @Override
    public void addTranslation(ITranslation translation) {
        translations.put(translation.getMainWord().getName(),translation);
    }

    @Override
    public ITranslation getTranslationByMainWord(String mainWord) {
        return translations.get(mainWord);
    }
}
