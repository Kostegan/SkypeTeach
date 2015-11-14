package ru.book.skype.registration;

import ru.book.skype.registration.validation.IValidation;

/**
 *
 */
public class User implements IUser {
    private String name;
    private String email;
    private String pass;

    /**
     * Empty constructor
     */
    public User(){

    }

    /**
     *  Composite constructor, set name, email, pass.
     * @param name will be set to field name
     * @param email will be set to field name
     * @param pass will be set to field name
     */
    public User(String name, String email, String pass){
        this.name = name;
        this.email = email;
        this.pass = pass;
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
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
