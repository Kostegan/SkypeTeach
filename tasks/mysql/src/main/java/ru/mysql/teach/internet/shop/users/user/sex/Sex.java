package ru.mysql.teach.internet.shop.users.user.sex;

import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

import javax.naming.InvalidNameException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Sex implements ISex {
    private SexEnum sex;
    private String name;

    /**
     * Empty constructor.
     */
    public Sex() {
    }


    /**
     * @param index 1 - male , 2 - female
     */
    public Sex(int index) throws InvalidSexNameException {
        if ((checkIndex(index)) == 1) {
            name = "male";
            sex = SexEnum.MALE;
        } else {
            name = "female";
            sex = SexEnum.FEMALE;
        }
    }


    /**
     * @param name - must be male or female
     */
    public Sex(String name) throws InvalidSexNameException {
        validatesSexName(name);
        this.name = name;
    }

    @Override
    public void setSexName(String s) throws InvalidSexNameException {
        validatesSexName(s);
        name = s;
    }

    @Override
    public String getSexName() {
        return name;
    }


    private void validatesSexName(String s) throws InvalidSexNameException {
        String PATTERN_NAME = "[m][a][l][e]||[f][e][m][a][l][e]";
        Pattern p = Pattern.compile(PATTERN_NAME);
        Matcher matcher = p.matcher(s);
        if (!matcher.matches()) {
            throw new InvalidSexNameException("You set the incorrect name: " + s + ". Name-sex must be male or female.");
        }
    }

    private int checkIndex(int index) throws InvalidSexNameException {
        if (index > 0 || index < 3) {
            if (index == 1) {
                return 1;
            } else {
                return 2;
            }
        }
        throw new InvalidSexNameException("You set index - " + index + ", index  must be 1 or 2.");
    }
}
