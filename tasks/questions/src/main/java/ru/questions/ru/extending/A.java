package ru.questions.ru.extending;

/**
 *
 */

class main{
    public static void main(String[] args){
        B b = new B();
        C c = new C();

        A b1 = (A) b;
        A c1 = (A) c;

        A a1 = new B();
        A a2 = new C();
        Object obj = new B();

        B b2 = new B();
        Object obj1 = (Object) b2;

        A a3;
        System.out.println(a3 = (A) b2);
        B b3 = (B) a1;
        System.out.println(b3 = (B) a1);

    }
}


public class A  {


}

class B extends A{

}

class C extends A{

}