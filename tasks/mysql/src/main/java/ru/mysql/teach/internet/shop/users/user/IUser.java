package ru.mysql.teach.internet.shop.users.user;

import ru.mysql.teach.internet.shop.users.user.sex.ISex;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

/**
 * Represents all methods each users. Get/set - name, password, sex.
 */
public interface IUser {
    public void setName(String name);
    public String getName();
    public void setPassword(String password);
    public String getPassword();
    public void setEmail(String email);
    public String getEmail();
    public void setSex(String sex) throws InvalidSexNameException;
    public String getSex();
}
