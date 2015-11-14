package ru.teach.skype.link;


import org.junit.Test;

/**
 *
 */
public class ManagerFileTest {
    @Test
    public void searchLinksInFile(){
        ManagerFileLinks manager = new ManagerFileLinks();
        String path = "C:\\Users\\home\\IdeaProjects\\work_java\\src\\test\\java\\ru\\teach\\ru.comparables.ru.comparable.skype\\yandexDoc.html";
        manager.readFile(path);
    }

}
