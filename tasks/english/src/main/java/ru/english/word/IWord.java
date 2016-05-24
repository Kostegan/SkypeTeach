package ru.english.word;

/**
 * Represents an object word. Has methods set/getName, set/getIndex
 */
public interface IWord {
    void setName(String name);
    String getName();
    void setIndex(int index);
    int getIndex();
}
