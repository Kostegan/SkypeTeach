package ru.book.skype.registration;
import org.junit.Assert.*;
import org.junit.Test;
import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.users.dao.IUsersDao;
import ru.book.skype.registration.users.dao.UsersDao;
import static org.junit.Assert.*;
/**
 *
 */
public class RegistrationTest {

    private IRegistration createRegistration(){
        return null;
    }
    // 1. Adds new user to empty UsersDao
    // 2. Adds new user to UsersDao
    // 3. Add user with identical email.

    @Test
    public  void addNewUser() throws ValidationException{
        IRegistration registration = createRegistration();
        IUsersDao usersDao =new UsersDao();
        IUser user = new User("Teador","grewd@nuk.com","89iu76yyhtt");
        registration.createUser(user);
//        assertEquals();
    }
}
