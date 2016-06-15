package ru.assistant.items.translations.html.creator;

import ru.assistant.items.translations.connection.Connection;
import ru.assistant.items.words.word.IWord;

/**
 *
 */
public class HtmlCreator implements IHtmlCreator {
    private String url;
    private String response;

    public HtmlCreator(String url){
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String setUrl(String url) {
        return url;
    }

    @Override
    public void createRequest(IWord word) {
        response = Connection.getHtml(url += word.getName());
    }

    @Override
    public String getResponse() {
        return response;
    }
}

