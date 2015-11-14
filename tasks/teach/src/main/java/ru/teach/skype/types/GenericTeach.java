package ru.teach.skype.types;

/**
 *
 */
public class GenericTeach {
    public static void main(String[] args) {
        TeachList<String, Integer> list = new TeachList<>();
        list.add("a");
        list.add("b");

//        list.add(500);

        String b = list.get(1);

        for (int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}

class TeachList<T, P> {
    int pos = 0;
    T[] elements = (T[]) new Object[10];

    public void add(T e) {
        elements[pos++] = e;
    }

    public T get(int index) {
        return elements[index];
    }

    public int size() {
        return pos;
    }
}
