package ru.teach.skype.types;

/**
 *
 */
public class StringBuilderTeach2 {
    public String str = "Hello";
    public static void main(String[] args){
        StringBuilderTeach2 newStr = new StringBuilderTeach2();
        String lStr;
        lStr = newStr.str;
        lStr = newStr.changeStr(lStr);
        System.out.println("String: " + lStr);

        StringBuilder st = new StringBuilder("Hello");
        newStr.changeStringBuilder(st);
        System.out.println("StringBuilder: " + st);


    }

    public String changeStr(String str){

        return str += " world1";
    }

    public void changeStringBuilder(StringBuilder st){
        st.append("World");

    }




}
