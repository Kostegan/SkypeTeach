package base.user;

import org.junit.Test;
import ru.test.skype.base.user.IUser;
import ru.test.skype.base.user.User;

import static org.junit.Assert.*;
/**
 *
 */
public class UserTest {
    private IUser createUser(){
        return new User();
    }

    @Test
    public void userAddName(){
        IUser user = createUser();
        user.setName("Ron");
        assertEquals("User has a name: ","Ron",user.getName());
    }
}
