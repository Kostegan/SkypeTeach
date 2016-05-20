package ru.test.skype.my.iterator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 */
public class FileLineReader implements IFileLineReader {
    private String currentLine;
    private String path;
    BufferedReader bufferedReader;

    @Override
    public Iterator<String> iterator() {
        return this;
    }

    public FileLineReader() {

    }

    public FileLineReader(String path) throws IOException {
        bufferedReader = createBufferReader(path);
    }

    public BufferedReader createBufferReader(String path) throws IOException {
        return new BufferedReader(new FileReader(path));
    }

    public void reader() {
        try {
            String line;
            if ((line = bufferedReader.readLine()) != null) {
                currentLine = line;
            } else {
                currentLine = null;
            }
        } catch (IOException e) {

        }
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCurrentLine() {
        return currentLine;
    }


    @Override
    public Iterable<String> readFile(String filename) throws IOException {
        bufferedReader = createBufferReader(filename);
        reader();
        return this;
    }

    @Override
    public boolean hasNext() {
        reader();
        return currentLine != null;
    }

    @Override
    public String next() {
        return currentLine;
    }
}

