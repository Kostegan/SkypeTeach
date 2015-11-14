package ru.teach.skype.types;

import java.io.IOException;

/**
 *
 */
public class ExceptionTeach {
    public static void main(String[] args) throws Exception {
        Exception e1;


        RuntimeException e;
        IllegalArgumentException e2;
        NullPointerException npe;

        checkedF1();
//        m1();

        System.out.println(1);
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        RuntimeException re = new RuntimeException("message12345");
        throw re;
    }

    public static void checkedF1() throws Exception {
        try {
            checkedF2();
        } catch (IOException | IllegalArgumentException e)  {
            System.out.println("Exception was: " + e);
//            RuntimeException re = new RuntimeException("Caught exception...123", e);
//            throw re;
        } catch (Exception e) {
            System.out.println("LINK checkedF1: " + e.hashCode());
            // dfdf
        }

    }

    public static void checkedF2() throws Exception, IllegalArgumentException, IOException {
        Exception e = new Exception("message12345");
        System.out.println("LINK checkedF2: " + e.hashCode());
        throw e;
    }
}
