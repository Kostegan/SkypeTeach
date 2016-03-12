package ru.mysql.teach.internet.shop.users.user.sex;

/**
 * Creates sex for a user.
 */
public enum SexEnum1 {
    MALE(1),
    FEMALE(2);
    private final int value;


    SexEnum1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSexName() {
        return toString();
    }

    public static SexEnum1 valueOf(int value) {
        for (SexEnum1 sex : SexEnum1.values()) {
            if (sex.getValue() == value) {
                return sex;
            }
        }
        throw new IllegalArgumentException("Sex is not found for value: " + value+". Available values: ");
    }

}
