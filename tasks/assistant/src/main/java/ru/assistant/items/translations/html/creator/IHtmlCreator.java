package ru.assistant.items.translations.html.creator;

import ru.assistant.items.words.word.IWord;

/**
 * This class has method, which will be create a request and get response with a word translation.
 */
public interface IHtmlCreator {

    /**
     * Sets url by which will be created connection.
     * @return a assembled url
     */
    String setUrl(String url);

    /**
     * @return a established url
     */
    String getUrl();
//
//    /**
//     * @param word which will be unite with url.
//     */
//    void setWord(IWord word);
//
//    /**
//     * @return word which was set for unite with a url
//     */
//    IWord getWord();
//
//
    /**
     * Creates a request to a site, which will be translate a word.
     * @return a unite url with a word name
     */
    void createRequest(IWord word);

    /**
     * @return string with a response
     */
    String getResponse();

}
