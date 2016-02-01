package ru.mysql.teach.internet.shop.users.user.sex;

import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

/**
 * Creates sex for a user.
 */
public interface ISex {
    public static final String MALE_NAME = "Male";
    public static final String FEMALE_NAME = "Female";

    /**
     * @param s - the sex-name must be a male or a female;
     */
    public void setSexName(String s) throws InvalidSexNameException;

    public String getSexName();

    /**
     * @return 1 if name is male, 2 if name is female
     */
    public static int defineSex(String name) {
        String nameMale = "male";
        if (nameMale.equals(name)) {
            return 1;
        } else {
            return 2;
        }
    }

    ;
}
