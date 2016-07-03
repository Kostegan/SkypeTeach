package ru.assistant;

import org.junit.Test;
import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.words.storage.exception.StorageIsEmptyException;

import static org.junit.Assert.*;
/**
 *
 */
public class AssistantTest {
    @Test
    public void translateSmallText()throws StorageIsEmptyException{
        IAssistant assistant = new Assistant();
        assistant.translate("In the");
        ITranslation translation = assistant.getTranslationByWord("In");
        translation.getTranslationByIndex(0);
//        assertEquals("word - following - translation - ", "последователи", translation.getTranslations().get(0));
    }
}
