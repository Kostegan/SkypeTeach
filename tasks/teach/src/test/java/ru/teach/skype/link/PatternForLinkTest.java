package ru.teach.skype.link;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class PatternForLinkTest {
    @Test
    public void checkPatternOnString(){
        IPatternForLink pattern = new PatternForLink();
        String link = "dsfdsfdfsd";
        assertEquals("Link: http://www.javenue.info/",link,pattern.compareElement(link));
    }

    @Test
    public void checkPatternNotCompare(){
    }
}
