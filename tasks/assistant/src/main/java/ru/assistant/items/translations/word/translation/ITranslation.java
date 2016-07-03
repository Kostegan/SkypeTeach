package ru.assistant.items.translations.word.translation;

import ru.assistant.items.words.word.IWord;

import java.util.List;

/**
 * Has methods for creating translations.
 */
public interface ITranslation {

    /**
     * @return main word from a translation.
     */
    IWord getMainWord();

    /**
     * Added a word translation.
     *
     * @param translation  which will be added.
     */
    void addTranslation(String translation);

    /**
     * @return list of translations.
     */
    List<String> getTranslations();

    /**
     * @return a translation by a specified index.
     */
    String getTranslationByIndex(int index);

}
