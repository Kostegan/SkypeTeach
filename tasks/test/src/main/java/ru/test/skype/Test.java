package ru.test.skype;

import java.util.*;

/**
 *
 */
public class Test {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        a.getB();
        a.getC();
        C c = new A();
        Collection<A> listA = new ArrayList<>();
        ArrayList<A> listA2 = new ArrayList<>();
        List<A> listA4;

        D2 d = new D2();
        d.getC();
        D d1 = new D();

        d1.getA();
        IC dId = new D();
        dId.getC();

        Set<B> setB = new HashSet<>();
        setB.add(b);
        setB.add(a);
        System.out.println("The element 'a' is set: "+setB.contains(a));


    }
}

class C{
    public void getC(){
        System.out.println("Method creates in the C class.");
    }
}

class B extends C{
    public void getB(){
        System.out.println("Method creates in the B class.");
    }

}

class A extends B{

}

interface IC{
    public void getC();
}

interface IB extends IC {
    public void getB();
}

interface IA extends IB{
    public void getA();
}


class D implements IA{
    private int a;
    public D(){

    }
    public D(int number){
        a = number;
    }
    public void getA(){

    }

    public void getB(){

    }

    public void getC(){

    }
}


class D2 implements IC{
    @Override
    public void getC() {

    }
}

