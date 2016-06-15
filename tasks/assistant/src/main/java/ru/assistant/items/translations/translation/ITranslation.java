package ru.assistant.items.translations.translation;

import ru.assistant.items.translations.exceptions.WordNotFoundException;
import ru.assistant.items.translations.translation.part.of.speech.PartOfSpeech;
import ru.assistant.items.words.word.IWord;

import java.util.List;
import java.util.Map;

/**
 * Has methods for creating translations.
 */
public interface ITranslation {
    /**
     * Added a main word to a translation.
     *
     * @param word that will be added.
     */
    public void addMainWord(IWord word);

    /**
     * @return main word from a translation.
     * @throws WordNotFoundException if a word is not found.
     */
    public IWord getMainWord() throws WordNotFoundException;

    /**
     * Added a part of speech.
     *
     * @param partOfSpeech
     */
    public void addPartOfSpeech(PartOfSpeech partOfSpeech);

    /**
     * Added a translation for a certain part of speech.
     *
     * @param partOfSpeech for which need to add a translation.
     * @param translation  which will be added.
     */
    public void addTranslation(PartOfSpeech partOfSpeech, IWord translation);

    /**
     * @return words list for a specified PartOfSpeech.
     */
    public List<IWord> getTranslation(PartOfSpeech partOfSpeech);

    /**
     * @return a list with all translation part of speech.
     */
    public List<PartOfSpeech> getTranslationPartOfSpeech();
}
