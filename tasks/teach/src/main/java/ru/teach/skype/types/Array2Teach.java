package ru.teach.skype.types;

/**
 *
 */
public class Array2Teach {
    public static void main(String[] args) {
        Ar1[] array = new Ar1[3];

        array[0] = new Br1();
        array[1] = new Cr1();
        array[2] = new Br2();




    }
}


interface Ar1 {

}

class Br1 implements Ar1 {

}

class Br2 implements Ar1 {

}

class Cr1 extends Br1 {

}
