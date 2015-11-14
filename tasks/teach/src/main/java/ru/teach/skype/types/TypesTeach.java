package ru.teach.skype.types;

/**
 *
 */
public class TypesTeach {
    public static void main(String[] args) {
        boolean bool = false;
        boolean bool2 = true;
        Boolean bool3 = bool;

        byte b = 10;  // 1 byte - 256 values => [-128 : 127]
        short s = 10; // 2 bytes
        int i = 10;   // 4 bytes
        long l = 100L;  // 8 bytes

        float f = 2.0f; // 4 bytes
        double d = 2.5; // 8 bytes

        Byte b1 = new Byte((byte) 10);
        Short s1 = new Short(s);
        Integer i1 = new Integer(i);

        int i2 = new Integer(10);
        Integer i3 = i;

        int x = 10 + i;

        int x1 = (int) (10 + l);

        long x2 = 10 + i;

        double d1 = 10 + l;


        String str = "12+5";
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == '0') {}
            if (c >= '0' && c <= '9') {}
            if (c == '+') {}

            if (Character.isDigit(c)) {}
        }

        char c = '8';
        System.out.println((c >= '0' && c <= '9'));
    }
}
