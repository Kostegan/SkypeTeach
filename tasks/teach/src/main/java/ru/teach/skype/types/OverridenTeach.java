package ru.teach.skype.types;

/**
 *
 */
public class OverridenTeach {

    public static void main(String[] args) {
        A a = new A();
        a.goToCity("spb");

        B b = new B();
        b.goToCity("spb");
        b.goToCity(2);

        A c = new B();

        c.goToCity("nnm");
    }


}

class A {
    public void goToCity(String city) {
        System.out.println("calculateAverageQuadraticDeviation: " + city);
    }
}

class B extends A {
//    @Override
    public void goToCity(String city) {
        System.out.println("B: " + city);
    }

    public void goToCity(int city) {
        System.out.println("B: " + city);
    }
}
