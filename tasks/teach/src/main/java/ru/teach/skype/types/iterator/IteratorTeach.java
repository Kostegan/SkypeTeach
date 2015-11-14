package ru.teach.skype.types.iterator;

import java.util.*;

/**
 *
 */
public class IteratorTeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("abc");
        list.add("c");

        Iterator<String> it0 = new MyIterator(list);
        while (it0.hasNext()) {
            String str = it0.next();
            System.out.println(str);

        }
        System.out.println("----");

        MyCollection myCollection = new MyCollection(list);
        for (String str : myCollection) {
            System.out.println(str);
        }
        System.out.println("----");


        /*for (int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }*/

        for (String str : list) {
            System.out.println(str);
        }

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            if ("abc".equals(str)) {
                it.remove();
//                list.remove(str);
            }
        }

        System.out.println("After deletion");
        it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);

        }

        Map<String, Integer> map = new TreeMap<>();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it2 = entries.iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Integer> entry = it2.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}

class MyIterator implements Iterator<String> {
    private List<String> list;
    private int index;

    public MyIterator(List<String> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public String next() {
        String str = list.get(index);
        index++;
        return str;
    }
}

class MyCollection implements Iterable<String> {
    private List<String> list;

    public MyCollection(List<String> list) {
        this.list = list;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator(list);
    }
}
