package ru.teach.skype.types;

/**
 *
 */
public class StaticTeach {
    private int i;

    public static int x = 100;

    private static int instancesCount = 0;

    public static final String JANUARY = "January";
    public static final String JUNE = "June";

    public StaticTeach(int i) {
        this.i = i;
        instancesCount++;
    }

    public static void main(String[] args) {
        StaticTeach s1 = new StaticTeach(10);
        s1.i = 10;

        String month = JANUARY;
        if (month == JUNE) {

        }
//        s1.f();
//
//        StaticTeach.x = 3;
//        StaticTeach.printX();
//        StaticTeach.f();



//        s1.printX();

        StaticTeach s2 = new StaticTeach(5);
//        s2.f();
//        s2.printX();

        System.out.println("iNSTANCE COUNT: " + instancesCount);
    }

    public void f() {
        System.out.println(i);
    }

    public static void printX() {
        System.out.println(x);
    }
}
