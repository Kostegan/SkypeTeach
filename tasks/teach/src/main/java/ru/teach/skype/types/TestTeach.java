package ru.teach.skype.types;

/**
 *
 */
public class TestTeach {
    public long generateId(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Str can not be null");
        }
        if ("".equals(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            // ok
        }
        return str.hashCode();
    }
}

