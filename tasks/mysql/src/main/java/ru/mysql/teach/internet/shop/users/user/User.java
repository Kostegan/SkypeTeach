package ru.mysql.teach.internet.shop.users.user;

import ru.mysql.teach.internet.shop.entity.IdEntity;
import ru.mysql.teach.internet.shop.users.user.sex.SexEnum1;

/**
 * Class has methods and fields for creating and operating with new user.
 */
public class User extends IdEntity implements IUser {
    private String name;
    private String password;
    private String email;
    private SexEnum1 sex;

    public User() {
    }

    public User(String name, String password, String email, SexEnum1 sex) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = sex;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setSex(SexEnum1 sex) {
        this.sex = sex;
    }

    @Override
    public SexEnum1 getSex() {
        return sex;
    }

}
