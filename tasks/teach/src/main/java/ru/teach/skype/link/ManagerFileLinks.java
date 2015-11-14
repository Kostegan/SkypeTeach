package ru.teach.skype.link;

import java.io.*;

/**
 *
 */
public class ManagerFileLinks implements IManagerFileLinks {

    public void parsingLine(String string) {
        String[] split = string.split(" ");
    }

    public void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            PatternFind pattern = new PatternFind();
            while ((line = reader.readLine()) != null) {
                pattern.parsingToGroup(line);
            }
        } catch (IOException e) {
            System.out.println("Can't read file.");
        }
    }
}
