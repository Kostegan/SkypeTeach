package ru.book.skype.registration;

/**
 * It interface contents  methods for represented a user in the UserDao. User fields -  name, email, password.
 */
public interface IUser {

    public void setName(String name);
    public String getName();
    public void setPass(String pass);
    public String getPass();
    public void setEmail(String email);
    public String getEmail();
}
