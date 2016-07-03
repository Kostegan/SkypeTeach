package ru.assistant;

import org.junit.Test;
import ru.assistant.items.words.exception.WordNotExistException;

import static org.junit.Assert.*;

/**
 *
 */
public class MessengerTest {
    private IMessenger createMessenger(){
        return null;
    }


    @Test
    public void sendSmallText()throws WordNotExistException{
        IMessenger messenger = createMessenger();
        messenger.send("Dart is an open source, scalable programming language. ");
        assertEquals("Word has a translation: ","home", messenger.getTranslation("Dart")); //todo write all options a translation.
    }

    @Test (expected = WordNotExistException.class)
    public void getTranslationOnNotExistedWord()throws WordNotExistException{
        IMessenger messenger = createMessenger();
        messenger.send("Dart is an open source, scalable programming language. ");
        messenger.getTranslation("home");
    }
}
