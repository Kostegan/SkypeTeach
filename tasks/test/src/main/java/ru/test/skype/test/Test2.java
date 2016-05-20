package ru.test.skype.test;

/**
 *
 */
public class Test2 {
    String[] str = new String[3];
    String[][] str2 = new String[3][];

    public Test2() {
    }

    public Test2(String str1, String str2, String str3) {
        str[0] = str1;
        str[1] = str2;
        str[2] = str3;
    }

    public Test2(String[] str1, String[] str2, String[] str3) {
        this.str2[0] = str1;
        this.str2[1] = str2;
        this.str2[2] = str3;
    }
}

class Check {
    public boolean isFull(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (String s : str[i]) {
                if (s == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
//
//    class Main {
//        public static void main(String[] args) {
//            Test2 test1 = new Test2("Oleg", "Roman", "Pavel");
//            Test2 test2 = new Test2();
//            test2.str[0] = "Max";
//            Check check = new Check();
//            System.out.println(check.isFull(test1.str));
//            System.out.println(check.isFull(test2.str));
//
//        }
//    }

class Main2 {
    public static void main(String[] args) {
        String[] people1 = new String[3];
        people1[0] = "Roma";
        people1[1] = "Filip";
        people1[2] = "Ilia";
        String[] people2 = new String[3];
        people2[0] = "Roma";
        people2[2] = "Ilia";
        String[] people3 = new String[3];
        Test2 test2 = new Test2(people1, people2, people3);
        people3[0] = "Roma";
        people3[1] = "Filip";
        people3[2] = "Ilia";
        Check check = new Check();
        if (check.isFull(test2.str2)) {
            System.out.println("Array is full");
        } else {
            System.out.println("Array is not full");
        }
    }
}
