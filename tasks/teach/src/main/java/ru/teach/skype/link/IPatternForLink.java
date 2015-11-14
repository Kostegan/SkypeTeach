package ru.teach.skype.link;

/**
 * Defines pattern the link and matches a specified element with pattern.
 */
public interface IPatternForLink {
    /**
     * Compare a element with pattern.
     * @param str element which will be compared
     * @return string if the specified element is matches with the pattern.
     */
    public String compareElement(String str);
}
