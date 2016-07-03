package ru.assistant.items.translations.parser;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class has methods which will be parse html
 */
public class Parser {
//    public static final String PATTERN_PARSE_HTML = "([<][s][p][a][n] [c][l][a][s][s]=\"[t][r][a][n][s][l][a][t][i][o][n]\"[>])(\\P{Alpha}*)([<][/][s][p][a][n][>])";
    public static final String PATTERN_PARSE_HTML = "([<][s][p][a][n] [c][l][a][s][s]=\"[t][r][a][n][s][l][a][t][i][o][n]\"[>])([А-Яа-я]*),*([<][/][s][p][a][n][>])";

    public static String createHtmlRequest(String word) {
        return "http://www.lingvo-online.ru/ru/Translate/en-ru/" + word;
    }

    public static List<String> parseOnTranslations(String htmlResponse) {
        return parseHtml(htmlResponse);
    }

    /**
     * Divides html-code into separate words.
     *
     * @param text that will be divided.
     * @return words list.
     */
    public static List<String> parseHtml(String text) {
        Pattern p = Pattern.compile(PATTERN_PARSE_HTML);
        List<String> list = new ArrayList<>();
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            list.add(matcher.group(2));
        }
        print(list);
        return list;
    }

    private static void print(List<String> items){
        for(String item : items){
            System.out.println(item);
            System.out.println("----------");
        }
    }
}

//class Main {
//    public static void main(String[] args) {
////        String str = "ples\"><span class=\"translation\">разгадывать,</span>sadsdsadples\"><span class=\"translation\">рать</span>sadsdsad<span class=\"translation\">  ,  </span>";
//        String str = "<span class=\"g-icons g-iblock l-article__toggle__icon\"></span>\n" +
//                "\t\t\t\t<span class=\"l-article__expandcollapse js-text\">Развернуть статью</span>\n" +
//                "\t\t\t</a>\n" +
//                "\t\t\t&nbsp;|&nbsp;\n" +
//                "\t\t<a class=\"g-iblock l-article__linkdict js-dictionary-popup-trigger\" data-dictionary-system-name=\"Essential (En-Ru)\" href=\"/ru/LingvoDictionaries/Details?dictionary=Essential%20(En-Ru)\">\n" +
//                "\t\t\t<span class=\"g-icons g-iblock l-article__linkdict__icon\"></span>\n" +
//                "\t\t\tEssential (En-Ru)\n" +
//                "\t\t</a>\n" +
//                "\t</span>\n" +
//                "<p class=\"P\"><span class=\"Bold\">I </span>[<img class=\"l-article__transcription\" alt=\"transcription\" title=\"transcription\" src=\"/transcription.gif?Text=ri%CB%90d\">] </p>\n" +
//                "<p class=\"P\"><span class=\"Bold\">1. </span><span class=\"l-article__comment\"><span class=\"l-article__abbrev\" title=\"\">гл.</span><span class=\"\" style=\"color:#008000\">; </span><span class=\"l-article__abbrev\" title=\"\">прош. вр.</span><span class=\"\" style=\"color:#008000\">, </span><span class=\"l-article__abbrev\" title=\"\">прич.</span> <span class=\"l-article__abbrev\" title=\"\">прош. вр.</span> <span class=\"\" style=\"color:#008000\">- </span><span class=\"\" style=\"color:#008000\">read [red]</span></span></p>\n" +
//                "<p class=\"P1\">1)</p>\n" +
//                "<p class=\"P2\">а) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d1%87%d0%b8%d1%82%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">читать</span></a><span class=\"translation\">, </span><a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%bf%d1%80%d0%be%d1%87%d0%b8%d1%82%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">прочитать</span></a></p>\n" +
//                "<p class=\"P2\">б) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%b7%d0%b0%d1%87%d0%b8%d1%82%d1%8b%d0%b2%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">зачитывать</span></a><span class=\"translation\">, </span><a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%be%d0%b3%d0%bb%d0%b0%d1%88%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">оглашать</span></a></p>\n" +
//                "<p class=\"P1\">2) <span class=\"l-article__comment\"><span class=\"Italic\">понимать, находить объяснение чему-л.</span></span></p>\n" +
//                "<p class=\"P2\">а) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d1%80%d0%b0%d0%b7%d0%b3%d0%b0%d0%b4%d1%8b%d0%b2%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">разгадывать</span></a><span class=\"translation\"> </span><span class=\"l-article__comment\">(<span class=\"Italic\">что-л.</span>)</span></p>\n" +
//                "<p class=\"P2\">б) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%be%d0%b1%d1%8a%d1%8f%d1%81%d0%bd%d1%8f%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">объяснять</span></a><span class=\"translation\">, </span><a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d1%82%d0%be%d0%bb%d0%ba%d0%be%d0%b2%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">толковать</span></a></p>\n" +
//                "<p class=\"P2\">в) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%bf%d1%80%d0%b5%d0%b4%d1%81%d0%ba%d0%b0%d0%b7%d1%8b%d0%b2%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">предсказывать</span></a><span class=\"translation\">, </span><a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%bf%d1%80%d0%be%d0%b3%d0%bd%d0%be%d0%b7%d0%b8%d1%80%d0%be%d0%b2%d0%b0%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">прогнозировать</span></a></p>\n" +
//                "<p class=\"P1\">3) <span class=\"translation\">содержать </span><span class=\"l-article__comment\">(<span class=\"Italic\">какой-л.</span>) </span><span class=\"translation\">смысл, </span><a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=%d0%b3%d0%bb%d0%b0%d1%81%d0%b8%d1%82%d1%8c&amp;srcLang=en&amp;destLang=ru\" title=\"Показать примеры употребления\" class=\"l-article__showExamp js-show-examples\"><span class=\"translation\">гласить</span></a></p>\n" +
//                "<p class=\"P1\">4)</p>\n" +
//                "<p class=\"P2\">а) <a href=\"/ru/Search/Translate/GlossaryItemExtraInfo?text=read&amp;translation=";
//        for(String word : Parser.parseHtml(str)){
//            System.out.println(word);
//        }
//    }
//}
