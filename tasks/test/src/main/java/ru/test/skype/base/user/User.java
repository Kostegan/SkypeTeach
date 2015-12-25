package ru.test.skype.base.user;

/**
 *
 */
public class User implements IUser {
    private String name;
    private String lastName;
    private int phone;
    private String email;
    private String password;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public int getPhone() {
        return phone;
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
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
