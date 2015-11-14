package ru.teach.skype.types.iterator.my.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class MyIterator implements Iterator {
    List<String> list;
    public MyIterator(List<String> list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
