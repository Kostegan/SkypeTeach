package base.user;
import org.junit.Test;
import ru.test.skype.base.user.IBase;
import ru.test.skype.base.user.IUser;

import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class BaseTest {
    private IBase createBase(){
        return null;
    }

    private IUser createUser(){
        return null;
    }

    @Test
    public void addOneUserToBase(){
        IBase base = createBase();
        IUser user = createUser();
        base.addUser(user);
        List<String> resultBase = base.getBase();
        assertEquals("The user:"+user.getName()+" is set to base.",user.getName(),resultBase.get(0));
    }
}
