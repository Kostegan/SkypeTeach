package ru.teach.skype.types;

/**
 *
 */
public class TestTeach2 {
    public long generateId(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Str can not be null");
        }
        if (str.equals("")){
            return 0;
        }
        try{
            return Long.parseLong(str);
        } catch (Exception e){
            //&
        }

        return str.hashCode();
    }
}
