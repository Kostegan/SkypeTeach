package base.user;
import org.junit.Test;
import ru.test.skype.base.user.Base;
import ru.test.skype.base.user.IBase;
import ru.test.skype.base.user.IUser;
import ru.test.skype.base.user.User;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 */
public class BaseTest {
    private IBase createBase(){
        return new Base();
    }

    private IUser createUser(){
        return null;
    }

    @Test
    public void addOneUserToBase() throws IOException{
        IBase base = createBase();
        base.getBase();
        base.printBase();
        IUser user1 = new User("Dima","Lopwer",3442122,"ew@gmail.com","Verreew1");
        IUser user2 = new User("Ilia","Sechen",4323122,"sdwdd@gmail.com","asddd1");
        IUser user3 = new User("Marina","Firol",11442122,"Marina@gmail.com","Veww1");
        IUser user4 = new User("Gorton","Susanin",2122662,"Fertew@gmail.com","13e44w1");
        base.addUser(user1);
        base.addUser(user2);
        base.addUser(user3);
        base.addUser(user4);
        base.updateBase();
        System.out.println("========================");
        base.printBase();
    }

    @Test
    public void addSeveralUsersToBase() throws IOException{
        IBase base = createBase();
        base.getBase();
        base.printBase();
        IUser user1 = new User("Irina","Tolov",352122,"7ew@gmail.com","Vesrreew1");
        IUser user2 = new User("Elena","Mour",4323166,"Ysdwdd@gmail.com","asdddd1");
        IUser user3 = new User("Varvara","Cter",1144,"Marsdina@gmail.com","Vewfw1");
        IUser user4 = new User("Maxim","Kapov",0122612,"Ftew@gmail.com","13e4f4w1");
        base.addUser(user1);
        base.addUser(user2);
        base.addUser(user3);
        base.addUser(user4);
        base.updateBase();
        System.out.println("========================");
        base.printBase();
    }
}
