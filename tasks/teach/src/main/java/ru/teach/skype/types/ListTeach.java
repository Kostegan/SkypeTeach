package ru.teach.skype.types;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ListTeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("1");
        list.add("1");

        System.out.println("[1]: " + list.get(1));

        System.out.println("size = " + list.size());

        System.out.println("contains = " + list.contains("3"));

        System.out.println(list.isEmpty());

        list.remove("1");


        System.out.println(list);
    }
}
