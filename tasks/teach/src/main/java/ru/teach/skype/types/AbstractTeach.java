package ru.teach.skype.types;

/**
 *
 */
public class AbstractTeach {
    public static void main(String[] args) {
        I co = new Co();
        System.out.println(co.calc(1, 2));
        System.out.println(co.getSpecifier());
    }

    public static void printResult(I i) {
        System.out.println(i.calc(1, 2));
        System.out.println(i.getSpecifier());
    }
}

interface I {
    void f1();
    void f2();
    char getSpecifier();
    int calc(int a, int b);
}

abstract class Ab implements I {
    private char specifier;

    public Ab(char specifier) {
        this.specifier = specifier;
    }

    public char getSpecifier() {
        return specifier;
    }

    public abstract int calc(int a, int b);

    public void f1() {
        System.out.println("f1 from Ab");
    }

    public abstract void f3();
}

class Co extends Ab {
    public Co() {
        super('+');
    }

    public int calc(int a, int b) {
        return a + b;
    }

    public void f3() {
        System.out.println("f3 from Co");
    }

    public void f2() {
        System.out.println("f2 from Co");
    }
}
