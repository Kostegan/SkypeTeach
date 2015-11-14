package ru.teach.skype.link;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents pattern for a search through a method find.
 * "asddasd  asd ads  asd as d<h2 class=\"serp-item__title\"><a cl href=\"https://docs.html\" onmousedown=\"rc(this, '//yandex.ru/clck/jsredir?";
 * "<h2 class="serp-item__title"><a class="link link_cropped_no serp-item__title-link" target="_blank" href="http://www.javenue.info/post/43"
 * https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html    -------
 * http://www.javenue.info/post/43  ---
 * http://www.journaldev.com/1827/java-design-patterns-example-tutorial
 * http://base.vingrad.ru/view/2832-Patternyi-v-Java-i-C
 * https://ru.wikibooks.org/wiki/Java/%D0%9F%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD%D1%8B
 * http://www.quizful.net/post/Java-RegExp
 * http://javist.ru/category/java-util-regex/
 * http://initialize.ru/regular-expressions-in-java
 * http://www.tutorialspoint.com/design_pattern/
 * http://tutorials.jenkov.com/java-regex/pattern.html
 * http://ucancode.ru
 * http://geekbrains.ru
 * http://ibm.com
 * http://ad.atdmt.com
 * http://www.javenue.info/post/43
 * <p>
 * http://geekbrains.ru
 * http://ibm.com
 * http://ad.atdmt.com/eeeasdwd
 */
public class PatternFind {
    public static final String DOMAIN_ITEM = "[A-Za-z0-9_-]+";
    public static final String DOMAIN = "(" + DOMAIN_ITEM + "\\.)+" + DOMAIN_ITEM;
    public static final String PATH_ITEM = "[%A-Za-z0-9_\\-\\.]+";
    public static final String PATH = "(/" + PATH_ITEM + ")*/?";
    public static final String URL = "http[s]?://" + DOMAIN + PATH;
    public static final String PATTERN_LINK = "<h2 class=\"serp-item__title\"><a class=\"link link_cropped_no serp-item__title-link\" target=\"_blank\" href=\"("+URL+")\"";
    //    public static final String URL = "(http[s]?://([\\w]+)?[\\.]?[\\w]+[.]+[\\w]+(([\\/][\\w[\\-]?[\\/]?([\\.][\\w+])?]*)*)?)";
    public static final String PATTERNTOLINKH2 = "([\\<][h][2].*[h][r][e][f][\\=][\"])";
    public static final String PATTERNTOLINKOVER = ".*[\\/][h][2][>]";
    public static final String PATTERNTOLINKALL = PATTERNTOLINKH2 + "(" + URL + ")" + PATTERNTOLINKOVER;


    /**
     * Parsing string on two groups. Group(1) - all text, and group(2) - links.
     */
    public void parsingToGroup(String text) {
        Pattern pattern = Pattern.compile(PATTERN_LINK);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.groupCount() + "----" + matcher.group(1));
        }
    }
}
