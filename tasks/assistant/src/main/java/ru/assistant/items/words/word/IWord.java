package ru.assistant.items.words.word;

/**
 * Represents a word, has basic fields and methods(get/set).
 */
public interface IWord {
    public void setName(String name);
    public String getName();

    public void setKey(int key);
    public int getKey();
}
