package ru.assistant.items.words.word;

/**
 *
 */
public class Word implements IWord {
    private String name;
    private Integer key;

    public Word() {
    }

    public Word(String name) {
        this.name = name;
        this.key = createKey();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public int getKey() {
        return key;
    }

    @Override
    public Integer createKey() {
        return hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (key != null ? !key.equals(word.key) : word.key != null) return false;
        if (name != null ? !name.equals(word.name) : word.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }
}
