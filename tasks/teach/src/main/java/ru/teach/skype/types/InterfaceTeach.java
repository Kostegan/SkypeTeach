package ru.teach.skype.types;

/**
 *
 */
public class InterfaceTeach {
    public static void move(FileManager fm) {
        // ...
        fm.move("c://1.txt", "d://2.txt");
        // ....
    }

    public static void main(String[] args) {
        move(new LocalFileManager());
    }
}

interface FileManager {
    /**
     *
     * @param from
     * @param to
     */
    void move(String from, String to);

    void copy(String from, String to);

    void delete(String source);
}

class StubFileManager implements FileManager {
    @Override
    public void move(String from, String to) {
        System.out.println("move from ["  +from + "] to [" + to + "]");
    }

    @Override
    public void copy(String from, String to) {

    }

    @Override
    public void delete(String source) {

    }
}

class LocalFileManager implements FileManager {
    @Override
    public void move(String from, String to) {

    }

    @Override
    public void copy(String from, String to) {

    }

    @Override
    public void delete(String source) {

    }
}
