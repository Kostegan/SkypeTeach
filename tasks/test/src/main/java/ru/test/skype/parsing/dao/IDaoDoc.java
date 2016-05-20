package ru.test.skype.parsing.dao;

/**
 * Connects to specified document and creates input and output stream.
 */
public interface IDaoDoc {
    public void connectToFile(String path);
}
