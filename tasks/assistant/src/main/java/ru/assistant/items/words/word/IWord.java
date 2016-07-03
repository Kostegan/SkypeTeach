package ru.assistant.items.words.word;

/**
 * Represents a word, has basic fields and methods(get/set).
 */
public interface IWord {

    /**
     * Added a specified name.
     * @param name
     */
    public void setName(String name);

    /**
     * @return name
     */
    public String getName();


//    /**
//     * Delete this method.
//     *
//     *
//     * Set a specified key
//     * @param key
//     */
//    public void setKey(int key);

    /**
     * @return key
     */
    public int getKey();

    /**
     * Generates a key.
     * @return
     */
    public Integer createKey();
}
