package ru.teach.skype.types;

/**
 *
 */
public class OperatorTeach {
    public static void main(String[] args) {
        // numbers

        int x = 10;
        int y = 4;

        int z = x + y;
        System.out.println("x + y: " + z);

        z = x - y;
        System.out.println("x - y: " + z);

        z = x / y;
        System.out.println("x / y: " + z);

        z = x * y;
        System.out.println("x * y: " + z);

        z = x % y;
        System.out.println("x % y: " + z);


        double d = x / y;
        System.out.println("double (x / y): " + d);

        double d1 = (double) x;
        System.out.println("d1: " + d1);

        d = d1 / y;
        System.out.println("double (d1 / y): " + d);

        int i = 5;
        i++;
        System.out.println("i++:" + i);

        ++i;
        System.out.println("++i:" + i);

        i--;
        System.out.println("i--:" + i);

        int k = 0;
        int k1 = ++k;
        System.out.println("k = " + k + ", k1 = " + k1);


        // conditions

        boolean b = x < y;
        System.out.println("x < y: " + b);

        b = x <= y;
        System.out.println("x <= y: " + b);

        b = x > y;
        System.out.println("x > y: " + b);

        b = x >= y;
        System.out.println("x >= y: " + b);

        b = !(x >= y); // ~ x < y
        System.out.println("!(x >= y): " + b);

        b = x == y; // ~ x < y
        System.out.println("x == y: " + b);

        b = x != y; // ~ x < y
        System.out.println("x == y: " + b);

        int minXY;
        if (x < y) {
            minXY = x;
        } else {
            minXY = y;
        }
        System.out.println("Min X-Y: " + minXY);

//        minXY = <Condition> ? expression_if_condition_true : expression_else;
        minXY = (x < y) ? x : y;
        System.out.println("Min X-Y (2): " + minXY);


        // strings
        System.out.println("STRINGS:");

        String s1 = "abc";
        String s2 = "def";
        String s = s1 + s2;
        System.out.println("s1 + s2: " + s);

        // set values

        int r = 10;
        int r2 = 8;
        r = r + r2;
        System.out.println("r = r + r2: " + r);

        r = 10;
        r += r2; // r = r + r2;
        System.out.println("r += r2: " + r);

        r = 10;
        r -= r2; // r = r - r2;
        System.out.println("r -= r2: " + r);

        String str1 = "a";
        str1 = str1 + "b";
        System.out.println("str1 + b: " + str1);

        str1 = "a";
        str1 += "b";
        System.out.println("+= b: " + str1);

        int a = 10;
        int c = a / 100;
        System.out.println("a / 100: " + c);
    }
}
