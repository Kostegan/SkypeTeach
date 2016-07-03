package ru.assistant.items.translations;

import ru.assistant.items.translations.parser.Parser;
import ru.assistant.items.translations.storage.ITranslationsStorage;
import ru.assistant.items.translations.storage.TranslationsStorage;
import ru.assistant.items.translations.translator.Translator;
import ru.assistant.items.translations.word.translation.ITranslation;
import ru.assistant.items.translations.word.translation.Translation;
import ru.assistant.items.words.word.IWord;

import java.util.ArrayList;
import java.util.List;

/**
 * This class gets a set of words, translates this words and saved to a set of translations.
 * Also need create a connection with a site for translation.
 */
public class TranslationsFactory {
    private static TranslationsStorage storage = new TranslationsStorage();;

    public static ITranslationsStorage createWordsTranslation(List<IWord> words) {
        createTranslations(words);
        return storage;
    }

    private static void createTranslations(List<IWord> words) {
//        storage = new TranslationsStorage();
        for (IWord word : words) {
            ITranslation wordTranslation = new Translation(word);
            List<String> temp = translateWords(word.getName());
            for (int i = 0; i < temp.size(); i++) {
                wordTranslation.addTranslation(temp.get(i));
            }
            storage.addTranslation(wordTranslation);
        }
    }

    private static List<String> translateWords(String word) {
        String htmlRequest = Parser.createHtmlRequest(word);
        System.out.println(htmlRequest);
        String htmlResponse = Translator.getHtml(htmlRequest);
//        System.out.println(htmlResponse);
        return Parser.parseOnTranslations(htmlResponse);
    }

//    private static List<String> translateWords(String word) {
//        List<String> wordTranslations =  new ArrayList<>();
//        wordTranslations.add(word + " Перевод один");
//        wordTranslations.add("Перевод два");
//        return wordTranslations;
//    }
}