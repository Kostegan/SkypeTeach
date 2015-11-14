package ru.teach.skype.types.iterator.my.iterator;

import java.util.*;

/**
 *
 */
public class MyIteratorTeachTest {
    public static void main(String[] args){
        Set<String> setName = new TreeSet<>();
        setName.add("Ivan");
        setName.add("Martin");
        setName.add("Tom");
        System.out.println(setName.toString());
        Iterator<String> itSet = setName.iterator();
        while(itSet.hasNext()){
            String str = itSet.next();
            System.out.println(str);
        }

        System.out.println("-----------------------");



        List<String> listName = new ArrayList<>();
        listName.add("Kostia");
        listName.add("Misha");
        listName.add("Dima");
        for(int i =0; i<listName.size();i++){
            int j = i+1;
            String str = listName.get(i);
            System.out.println("Result "+j+": - "+str);
        }

        Iterator<String> it = listName.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println("Result from iterator: "+str);
        }

    }
}
