package ru.mysql.teach.internet.shop.users.user;

import ru.mysql.teach.internet.shop.users.user.sex.ISex;
import ru.mysql.teach.internet.shop.users.user.sex.Sex;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

/**
 *
 */
public class User implements IUser {
    private String name;
    private String password;
    private String email;
    private ISex sex;
    public User(){
    }

    public User(String name, String password,String email,String sex) throws InvalidSexNameException{
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = new Sex(sex);
    }

    public User(String name, String password,String email,int index) throws InvalidSexNameException{
        this.name = name;
        this.password = password;
        this.email = email;
        this.sex = new Sex(index);
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
    public void setSex(String sex) throws InvalidSexNameException {
        this.sex.setSexName(sex);
    }

    @Override
    public String getSex() {
        return sex.getSexName();
    }

    private void checkEmail(String email){

    }
}
