package ru.teach.skype.types;

import java.util.Arrays;

/**
 *
 */
public class DynamicArrayTeach {
    private static String[] array = new String[0];

    public static void main(String[] args) {
        add("1");
        print();
        add("2");
        print();
        add("3");
        print();

        delete("2");
        print();
    }

    public static void add(String str) {
        String[] tmp = new String[array.length + 1];
        for (int i=0; i<array.length; i++) {
            tmp[i] = array[i];
        }
        tmp[tmp.length-1] = str;
        array = tmp;
    }

    public static void delete(String str) {
        String[] tmp = new String[array.length - 1];
        for (int i=0, j=0; i< array.length; i++) {
            if (str.equals(array[i])) {
                // not to addEmployee to tmp
            } else {
                tmp[j] = array[i];
                j++;
            }
        }
        array = tmp;
    }

    public static void print() {
        System.out.println(Arrays.toString(array));
    }
}
