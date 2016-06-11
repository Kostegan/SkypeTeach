package ru.assistant.items.translations.translation.part.of.speech;

/**
 *
 */
public enum PartOfSpeech {
    Noun("Noun"),
    Adjective("Adjective"),
    Verb("Verb"),
    Adverb("Adverb"),
    Pretext("Pretext"),
    Union("Union");

    private final String name;

    private PartOfSpeech(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
