package ru.teach.skype.types.internal.classses;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class ComparatorInternalTeach {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("masha", "ivan", "nik", "stepa");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });
    }
}
