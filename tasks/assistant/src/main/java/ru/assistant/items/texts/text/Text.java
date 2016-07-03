package ru.assistant.items.texts.text;

/**
 *
 */
public class Text implements IText {
    private String text;

    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
