package ru.mysql.teach.internet.shop.users.user.sex;

/**
 * Creates sex for a UserSchema.
 */
public enum SexEnum {
    MALE(1),
    FEMALE(2);
    private final int value;


    SexEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getSexName() {
        return toString();
    }

    public static SexEnum valueOf(int value) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getValue() == value) {
                return sex;
            }
        }
        throw new IllegalArgumentException("Sex is not found for value: " + value+". Available values: ");
    }

}
