package ru.test.skype.my.iterator;

import java.io.IOException;
import java.util.Iterator;

/**
 *
 */
public interface IFileLineReader extends Iterable<String> {
    Iterable<String> readFile(String filename) throws IOException;
}
