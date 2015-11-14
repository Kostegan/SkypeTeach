package ru.teach.skype.types;

/**
 *
 */
public class StringBuilderTeach {
    public static void main(String[] args) {
        String str = "Hello ";
        changeStr(str);
        System.out.println("String: " + str);

        StringBuilder sb = new StringBuilder("Hello ");
        changeStringBuilder(sb);
        System.out.println("StringBuilder: " + sb);
    }

    private static void changeStr(String str) {
        str += "World!";
    }

    private static void changeStringBuilder(StringBuilder sb) {
        sb.append("World!");
    }
}
