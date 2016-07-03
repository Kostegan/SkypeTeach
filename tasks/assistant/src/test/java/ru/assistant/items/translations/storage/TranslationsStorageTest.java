package ru.assistant.items.translations.storage;

import org.junit.Test;
import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.translations.word.translation.Translation;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;

import static org.junit.Assert.*;

/**
 *
 */
public class TranslationsStorageTest {
    @Test
    public void createStorage(){
        TranslationsStorage storage = new TranslationsStorage();
        IWord word = new Word("Read");
        IWord word1 = new Word("Book");
        IWord word2 = new Word("Small");
        ITranslation translation = new Translation(word);
        translation.addTranslation("Читать");
        translation.addTranslation("Прочитал");
        ITranslation translation1 = new Translation(word1);
        ITranslation translation2 = new Translation(word2);
        storage.addTranslation(translation);
        storage.addTranslation(translation1);
        storage.addTranslation(translation2);
        assertEquals("Storage is create: ","Read",storage.getTranslationByMainWord("Read").getMainWord().getName());
        assertEquals("Storage is create: ","Читать",storage.getTranslationByMainWord("Read").getTranslations().get(0));
        assertEquals("Storage is create: ","Прочитал",storage.getTranslationByMainWord("Read").getTranslations().get(1));
        assertEquals("Storage is create: ","Book",storage.getTranslationByMainWord("Book").getMainWord().getName());
        assertEquals("Storage is create: ","Small",storage.getTranslationByMainWord("Small").getMainWord().getName());
    }
}
