package ru.teach.skype.types;

import java.util.Arrays;

/**
 *
 */
public class StringTeach {
    public static final   String LINE_SEPARATOR = " ";

    public static void main(String[] args) {
        String str = "absdefg" + "123";
        str += "32423def,,";

        System.out.println("".isEmpty());
        System.out.println(str.length());

        System.out.println(str.charAt(2));

        char[] ar = str.toCharArray();


        System.out.println("def: " + str.contains("def"));
        System.out.println("def1: " + str.contains("def1"));

        System.out.println("def[i]: " + str.indexOf("def"));
        System.out.println("def1[i]: " + str.indexOf("def1"));

        System.out.println("def[i]: " + str.lastIndexOf("def"));
        System.out.println("def1[i]: " + str.lastIndexOf("def1"));

        System.out.println("abs: " + str.startsWith("abs"));
        System.out.println("#: " + str.startsWith("#"));

        System.out.println("f,,: " + str.endsWith("f,,"));
        System.out.println("#: " + str.endsWith("#"));

        String str2 = str.substring(1);
        System.out.println("substring[1]: " + str2 + " - " + str);

        str2 = str.substring(1, 3);
        System.out.println("substring[1,3]: " + str2);

        str2 = str.substring(1, str.length());
        System.out.println("substring[1,length]: " + str2 + " - " + str);

        String str3 = str.replace("f", "F");
        System.out.println("eplace(\"f\", \"F\"): " + str3 + " - " + str);

        System.out.println("equals: " + str.equals(str3));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str3));

        str += "2a2s2d2f2g2h2j2k2l2p2p2o2i2u2y2t2r2e2w2x2x2x2x2x2x2cv2v2v2b2b2222k2l2";
        String[] splits = str.split("2");
        System.out.println(Arrays.toString(splits));

        splits = str.split("2", 3);
        System.out.println(Arrays.toString(splits));

        splits = str.split("2", -1);
        System.out.println(Arrays.toString(splits));

        final int x = 5;
//        x = 7;

//        str.split(LINE_SEPARATOR);
//
//        final String COMMAND_START_SYMBOL = "$";
//        str.split("#");
//                str.split(COMMAND_START_SYMBOL);

//        String s = null; // ""
//        if (s == null || s.equals("")) {}
//        if (Strings.isNullOrEmpty(s)) {
//
//        }
//        Strings.isNullOrEmpty()

        String filename = "abc.txt.zip";
        int index = filename.lastIndexOf(".");
        System.out.println("i: " + index);
        String ext;
        if (index == -1) {
            ext = "";
        } else {
            ext = filename.substring(index+1);
        }

        System.out.println("extension: " + ext);
    }
}

 class SA1 {
    final void a() {}
}

class SB1 extends SA1 {

//    @Override
//    void a() {};
}
