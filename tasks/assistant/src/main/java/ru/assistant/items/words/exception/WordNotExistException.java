package ru.assistant.items.words.exception;

import ru.assistant.items.translations.exceptions.WordNotFoundException;

/**
 *
 */
public class WordNotExistException extends Exception {

    public WordNotExistException(String message){
        super(message);
    }
}
