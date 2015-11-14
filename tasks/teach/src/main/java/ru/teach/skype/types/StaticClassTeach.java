package ru.teach.skype.types;

/**
 *
 */
public class StaticClassTeach {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("Petr");

        A a2 = new A();
        a2.setName("Masha");

        System.out.println(A.getObjectsCount()); // 2
        System.out.println(A.count);
        System.out.println(a2.count);

        double x = Math.pow(10, 3);
        System.out.println(x);
    }

    static class A {
        String name;

        static int count = 0;

        public A() {
            count++;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getObjectsCount() {
            return count;
        }
    }

    static class B {
        public static int getObjectsCount() {
            return 0;
        }
    }

}
