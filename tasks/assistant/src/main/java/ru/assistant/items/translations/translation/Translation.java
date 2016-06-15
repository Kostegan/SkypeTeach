package ru.assistant.items.translations.translation;

import ru.assistant.items.translations.exceptions.WordNotFoundException;
import ru.assistant.items.translations.translation.part.of.speech.PartOfSpeech;
import ru.assistant.items.words.word.IWord;
import ru.assistant.items.words.word.Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Translation implements ITranslation {
    private IWord mainWord;
    private Map<PartOfSpeech, List<IWord>> translations;
    private List<PartOfSpeech> partOfSpeech;

    public Translation() {
        translations = new HashMap<>();
        partOfSpeech = new ArrayList<>();
    }

    @Override
    public void addMainWord(IWord word) {
        mainWord = word;
    }

    @Override
    public IWord getMainWord() throws WordNotFoundException {
        if (mainWord != null) {
            return mainWord;
        } else {
            throw new WordNotFoundException("Main word is not found.");
        }
    }

    @Override
    public void addPartOfSpeech(PartOfSpeech partOfSpeech) {
        translations.put(partOfSpeech, new ArrayList<>());

        this.partOfSpeech.add(partOfSpeech);
    }

    @Override
    public void addTranslation(PartOfSpeech partOfSpeech, IWord translation) {
        if (translations.containsKey(partOfSpeech)) {
            translations.get(partOfSpeech).add(translation);
        } else {
            addPartOfSpeech(partOfSpeech);
            translations.get(partOfSpeech).add(translation);
        }
    }

    @Override
    public List<IWord> getTranslation(PartOfSpeech partOfSpeech) {
        return translations.get(partOfSpeech);
    }

    @Override
    public List<PartOfSpeech> getTranslationPartOfSpeech() {
        return partOfSpeech;
    }
}

