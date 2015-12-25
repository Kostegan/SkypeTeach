package ru.test.skype.base.user;

/**
 * Has methods for the create new user. The user must have fields: name, lastName, phone, email, password
 */
public interface IUser {
    void setName(String name);
    String getName();
    void setLastName(String lastName);
    String getLastName();
    void setPhone(int phone);
    int getPhone();
    void setEmail(String email);
    String getEmail();
    void setPassword(String password);
    String getPassword();
}
