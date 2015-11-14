package ru.teach.skype.types;

import java.util.Date;

/**
 *
 */
public class OverloadTeach {

    // overload

    public void goToCity(String city) {
        
    }

    public void goToCity(String city, Date when) {

    }

    public boolean goToCity(String city, Date when, int count) {
        return false;
    }

}
