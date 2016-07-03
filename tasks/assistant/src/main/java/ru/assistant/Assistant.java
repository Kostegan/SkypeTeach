package ru.assistant;

import ru.assistant.items.texts.text.IText;
import ru.assistant.items.texts.text.Text;
import ru.assistant.items.translations.TranslationsFactory;
import ru.assistant.items.translations.storage.ITranslationsStorage;
import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.translations.word.translation.Translation;
import ru.assistant.items.words.WordsFactory;
import ru.assistant.items.words.storage.IWordsStorage;
import ru.assistant.items.words.storage.exception.StorageIsEmptyException;

import java.util.List;

/**
 *
 */
public class Assistant implements IAssistant {
    private IText mainText;
    private ITranslationsStorage translationsStorage;

    public Assistant(){
    }


    @Override
    public void translate(String text) throws StorageIsEmptyException{
        mainText = createText(text);
        IWordsStorage wordsStorage = WordsFactory.parseTextOnIndividualWords(text);
        translationsStorage = TranslationsFactory.createWordsTranslation(wordsStorage.getWords());
    }

    /**
     * Creates a text from a specified string.
     * @param text from which will be created IText
     * @return a new Text with a "text" in a value.
     */
    private IText createText(String text){
        return new Text(text);
    }

//    @Override
//    public ITranslation getTranslationByWord(String word) {
//        return translationsStorage.getTranslationByMainWord(word);
//    }

    @Override
    public ITranslation getTranslationByWord(String word) {
        return translationsStorage.getTranslationByMainWord(word);
    }
}
