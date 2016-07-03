package ru.assistant;

import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.words.storage.exception.StorageIsEmptyException;

import java.util.List;

/**
 * Has base methods for creating texts, words and translations.
 */
public interface IAssistant {
//    /**
//     * Creates a IText object.
//     * @param string which will be saved to IText
//     */
//    void createText(String string);
//

    /**
     * Translates a specified text.
     * @param text which will be translated.
     */
    void translate(String text) throws StorageIsEmptyException;


    ITranslation getTranslationByWord(String word);
}
