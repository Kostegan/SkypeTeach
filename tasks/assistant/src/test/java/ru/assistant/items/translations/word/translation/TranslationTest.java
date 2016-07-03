package ru.assistant.items.translations.word.translation;

import org.junit.Test;
import ru.assistant.items.translations.exceptions.WordNotFoundException;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;

import static org.junit.Assert.*;

/**
 *
 */
public class TranslationTest {

    @Test
    public void createTranslation() throws WordNotFoundException {
        IWord word = new Word("Sofa");
        ITranslation translation = new Translation(word);
        assertEquals("Translation has a main word: ", "Sofa", translation.getMainWord().getName());
    }


    @Test
    public void addOneTranslation() throws WordNotFoundException {
        IWord word = new Word("Sofa");
        ITranslation translation = new Translation(word);
        String firstTranslation = "Диван";
        translation.addTranslation(firstTranslation);
        assertEquals("Translation has a main word: ", "Sofa", translation.getMainWord().getName());
        assertEquals("The first translation is: ", "Диван", translation.getTranslations().get(0));
    }

    @Test
    public void addTranslations() {
        IWord word = new Word("Sofa");
        ITranslation translation = new Translation(word);
        String firstTranslation = "Диван";
        String nextTranslation = "Кресло";
        translation.addTranslation(firstTranslation);
        translation.addTranslation(nextTranslation);
        assertEquals("The first translation is: ", "Диван", translation.getTranslations().get(0));
        assertEquals("The first translation is: ", "Кресло", translation.getTranslations().get(1));
    }

    @Test
    public void getTranslation() {
        IWord word = new Word("Sofa");
        ITranslation translation = new Translation(word);
        String firstTranslation = "Диван";
        String nextTranslation = "Кресло";
        translation.addTranslation(firstTranslation);
        translation.addTranslation(nextTranslation);
        assertEquals("The first translation is: ", "Диван", translation.getTranslationByIndex(0));
        assertEquals("The second translation is: ", "Кресло", translation.getTranslationByIndex(1));
    }


}
