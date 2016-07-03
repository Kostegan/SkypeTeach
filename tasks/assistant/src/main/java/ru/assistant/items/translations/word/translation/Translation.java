package ru.assistant.items.translations.word.translation;

import ru.assistant.items.translations.exceptions.WordNotFoundException;
import ru.assistant.items.words.word.IWord;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Translation implements ITranslation {
    private IWord mainWord;
    private List<String> translations;

    public Translation(IWord mainWord){
        this.mainWord = mainWord;
        translations = new ArrayList<>();
    }

    @Override
    public IWord getMainWord(){
        return mainWord;
    }

    @Override
    public void addTranslation(String translation) {
        this.translations.add(translation);
    }

    @Override
    public List<String> getTranslations() {
        return translations;
    }

    @Override
    public String getTranslationByIndex(int index) {
        return translations.get(index);
    }
}
