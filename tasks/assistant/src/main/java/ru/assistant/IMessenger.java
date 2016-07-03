package ru.assistant;

import ru.assistant.items.words.exception.WordNotExistException;

/**
 * Represented methods for adding texts and getting word translations.
 */
public interface IMessenger {
    /**
     * @param text sent to translation and storage to a base.
     */
    void send(String text);

    /**
     * Translates a specified word.
     * @param word which will be translated.
     * @return a translation for a word.
     * @throws WordNotExistException if a specified word was not added to base with translations.
     */
    String getTranslation(String word) throws WordNotExistException;
}
