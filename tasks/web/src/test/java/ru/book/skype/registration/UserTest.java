package ru.book.skype.registration;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class UserTest {

    private IUser createUser() {
        return new User();
    }

    /**
     *   Tests
     *   1. Sets/gets name
     *   2. Sets/get name and email
     *   3. Sets/Gets name, email, pass
     */

    /**
     * 1. Sets/gets name
     */
    @Test
    public void setGetNameToUser() {
        IUser user = createUser();
        user.setName("Ivan");
        assertEquals("User has name: ", "Ivan", user.getName());
    }

    /**
     * 2. Sets/get name and email
     */
    @Test
    public void setGetNameEmailToUser() {
        IUser user = createUser();
        user.setName("Ivan");
        user.setEmail("sdf@mail.ru");
        assertEquals("User has name: ", "Ivan", user.getName());
        assertEquals("User has email: ", "sdf@mail.ru", user.getEmail());
    }

    /**
     * 3. Sets/Gets name, email, pass
     */
    @Test
    public void setGetNameEmailPassToUser() {
        IUser user = createUser();
        user.setName("Ivan");
        user.setEmail("swwdf@mail.ru");
        user.setPass("112sdff");
        assertEquals("User has name: ", "Ivan", user.getName());
        assertEquals("User has email: ", "swwdf@mail.ru", user.getEmail());
        assertEquals("User has password: ", "112sdff", user.getPass());
    }
}
