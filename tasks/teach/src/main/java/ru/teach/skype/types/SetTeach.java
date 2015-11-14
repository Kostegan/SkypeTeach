package ru.teach.skype.types;

import java.util.*;

/**
 *
 */
public class SetTeach {
    public static void main(String[] args) {
        {
            List<String> products = new ArrayList<>();
            products.add("PC");
            products.add("car");
            products.add("book");
            products.add("car");

            System.out.println("LIST: " + products);

            System.out.println(products.contains("book"));
        }

        {
            Set<String> products = new TreeSet<>();



            // Set on List
            // List<String>(s1, s2, s3, s4, s5, s6, s7, s8, s9)
            // s9?

            // Set on hash (HashSet<String>)
            //  (SA)Array<List<String>> [
            //     0 -> List<String>(s1, s2, s3)
            //     1 -> List<String>(s4, s5, s6)
            //     2 -> List<String>(s7, s8, s9)
            //  ]
            //
            // set.add(s9):
            // 1. int hash = s9.hashCode()
            // 2. int saIndex = hash % SA.length
            // 3. List<String> list = SA[saIndex]
            // 4. if (!list.contains(s9)) { list.add(s9) }
            //
            // set.contains(s9):
            // 1. int hash = s9.hashCode()
            // 2. int saIndex = hash % SA.length
            // 3. List<String> list = SA[saIndex]
            // 4. return list.contains(s9)

            products.add("PC");
            products.add("book");
            products.add("123");
            products.add("car");

            products.add("car");

            System.out.println("SET: " + products);

            System.out.println(products.contains("book"));
        }
    }

}
