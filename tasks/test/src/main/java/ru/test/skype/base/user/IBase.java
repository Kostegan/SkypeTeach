package ru.test.skype.base.user;

import java.io.IOException;
import java.util.List;

/**
 * Has methods for a work with a user base. Tha base methods: addUser, removeUser, changeUser, getBase.
 */
public interface IBase {
    // add user to base
    void addUser(IUser user);
    //remove a user from base. If the base has not this user, returns false.
    boolean removeUser(IUser user);
    //change user from a base. If the base has not this user, returns false.
    boolean changeUser(IUser user);
    //retrieves a base from disc, creates list with all users.
    void getBase() throws IOException;
    //prints users from base
    void printBase();
    //Updates base - writes all users of local base to a file in a disc.
    void updateBase() throws IOException;
}
