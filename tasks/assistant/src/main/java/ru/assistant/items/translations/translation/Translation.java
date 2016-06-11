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
    private Map<PartOfSpeech, Map<Integer, IWord>> translations;
    private List<Integer> keysWord;

    public Translation() {
        translations = new HashMap<>();
        keysWord = new ArrayList<>();

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
        translations.put(partOfSpeech, new HashMap<>());
    }

    @Override
    public void addTranslation(PartOfSpeech partOfSpeech, IWord translation) {
        Integer key = translation.getKey();
        Map<Integer, IWord> temp = translations.get(partOfSpeech);
        if (temp.put(key, translation) == null) {
            keysWord.add(key);
        }
    }

    @Override
    public Map<Integer, IWord> getTranslation(PartOfSpeech partOfSpeech) {
        return translations.get(partOfSpeech);
    }

    @Override
    public List<Integer> getKeys() {
        return keysWord;
    }
}

class Main {
    public static void main(String[] args) throws WordNotFoundException {
        IWord mainWord = new Word("Work");
        Translation t = new Translation();
        t.addMainWord(mainWord);

        System.out.println("The base word is: " + t.getMainWord().getName());
        System.out.println("==================");
        IWord translation1 = new Word("Работа");
        IWord translation2 = new Word("Работать");
        IWord translation3 = new Word("Заработок");
        IWord translation4 = new Word("Заработать");
        IWord translation5 = new Word("Заработать");

        PartOfSpeech verb = PartOfSpeech.Verb;
        PartOfSpeech adjective = PartOfSpeech.Adjective;

        t.addPartOfSpeech(verb);
        t.addPartOfSpeech(adjective);

        t.addTranslation(verb, translation2);
        t.addTranslation(verb, translation4);
        t.addTranslation(verb, translation5);

        t.addTranslation(adjective, translation1);
        t.addTranslation(adjective, translation3);


        for (Integer key : t.getKeys()) {
            System.out.println("Translation is: " + t.getTranslation(adjective).get(key).getName());
        }
    }
}
