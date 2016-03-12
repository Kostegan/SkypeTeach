package ru.mysql.teach.internet.shop.users.user;

import ru.mysql.teach.internet.shop.entity.IIdEntity;
import ru.mysql.teach.internet.shop.users.user.sex.SexEnum;

/**
 * Class has methods and fields for creating and operating with new user.
 */
public interface IUser extends IIdEntity {
    /**
     * Accepts a name from argument.
     * @param name witch will be add.
     */
    public void setName(String name);

    /**
     * @return name
     */
    public String getName();

    /**
     * Accepts a password from argument.
     * @param password witch will be add.
     */
    public void setPassword(String password);

    /**
     * @return password
     */
    public String getPassword();

    /**
     * Accepts a email from argument.
     * @param email witch will be add.
     */
    public void setEmail(String email);

    /**
     * @return email
     */
    public String getEmail();

    /**
     * Accepts a specified sex from a argument.
     * @param sex will be set.
     */
    public void setSex(SexEnum sex);

    /**
     * @return sex
     */
    public SexEnum getSex();
}
