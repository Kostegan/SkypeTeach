package ru.teach.skype.types;

/**
 *
 */
public class ConditionsTeach {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        if (x == y) { // true

        }

        if (x != y) { // false

        }

        if (x > y) { // false

        }

        if (x < y) { // false

        }

        if (x >= y) { // true

        }

        if (x <= y) { // true

        }

        int z = 1;

        if (x == y && z == 1) { // true

        }

        if (x != y || z == 1) { // true

        }

        if ((x == y && z == 2) || (z == 1)) { // true

        }

        Object o = null;

        boolean bool = o != null && o.hashCode() == 10;
        if (bool) {

        }
    }
}
