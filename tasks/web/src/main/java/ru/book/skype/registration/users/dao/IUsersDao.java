package ru.book.skype.registration.users.dao;

import ru.book.skype.registration.IUser;

/**
 * Has methods that can control the users in a base.
 * Add user, delete user, find user, counts in base.
 */
public interface IUsersDao {
    public void addUser(IUser user);
    public void deleteUser(String email);
    public long counts();
    public IUser findsByEmail(String email);
}
