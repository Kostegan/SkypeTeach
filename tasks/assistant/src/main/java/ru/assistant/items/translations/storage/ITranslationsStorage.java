package ru.assistant.items.translations.storage;

import ru.assistant.items.translations.word.translation.ITranslation;

/**
 * Storage for translations.
 */
public interface ITranslationsStorage {

    /**
     * adds a specified translation to a storage.
     * @param translation
     */
    void addTranslation(ITranslation translation);

    ITranslation getTranslationByMainWord(String mainWord);

}
