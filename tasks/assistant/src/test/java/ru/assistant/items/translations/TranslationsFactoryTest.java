package ru.assistant.items.translations;

import org.junit.Test;
import ru.assistant.items.translations.storage.ITranslationsStorage;
import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TranslationsFactoryTest {

    @Test
    public void translateTheeWords() {
        IWord firstWord = new Word("Lesson");
        IWord secondWord = new Word("Book");
        IWord thirdWord = new Word("Work");

        List<IWord> words = new ArrayList<>();
        words.add(firstWord);
        words.add(secondWord);
        words.add(thirdWord);

        ITranslationsStorage translations = TranslationsFactory.createWordsTranslation(words);
        ITranslation translation = translations.getTranslationByMainWord("Lesson");
        for(String transl : translation.getTranslations()){
            System.out.println(transl);
        }
    }

    @Test
    public void translateOneWord() {
        IWord firstWord = new Word("Lesson");
        List<IWord> words = new ArrayList<>();
        words.add(firstWord);

        ITranslationsStorage translStorage = TranslationsFactory.createWordsTranslation(words);
        assertEquals("Storage has a one word: ","Lesson",translStorage.getTranslationByMainWord("Lesson").getMainWord().getName());
        assertEquals("Storage has a word translation: ","Урок",translStorage.getTranslationByMainWord("Lesson").getTranslationByIndex(0));

//        ITranslation translation = translStorage.getTranslationByMainWord("Lesson");
//        for(String transl : translation.getTranslations()){
//            System.out.println(transl);
//        }
    }
}
