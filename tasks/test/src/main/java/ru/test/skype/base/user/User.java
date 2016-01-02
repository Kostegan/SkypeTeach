package ru.test.skype.base.user;

/**
 *
 */
public class User implements IUser {
    private String name;
    private String lastName;
    private long phone;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String lastName, long phone, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    @Override
    public String printUser() {
        return "User name - " + name + ", lastName - " + lastName + ", phone - " + phone + ", email - " + email + ", password - " + password + ".";
    }

    /**
     * Creates a string with elements name, lastName, email, phone, password all elements  through comma
     */

    public String createAllInfo(){
        return name + "," + lastName + "," + phone + "," + email + "," + password;
    }

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
    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public long getPhone() {
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
