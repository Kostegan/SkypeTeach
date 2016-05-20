package ru.downloader.skype.engine;

import java.net.URL;

/**
 *
 */
public class TestStaticClass2 {
        public static void del(){

        }
}

class NonStatic<T>{

    public void go(T a, T b){}
}

class Main{
    public static void main(String[] args){
        B b = new B();
        A1 a = new A1();
        TestStaticClass2.del();
        NonStatic<A1> nonStatic = new NonStatic<>();
        nonStatic.go(a,a);
    }
}

class A1{

}

class B{

}
