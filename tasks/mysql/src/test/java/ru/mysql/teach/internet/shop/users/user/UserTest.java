package ru.mysql.teach.internet.shop.users.user;

import static org.junit.Assert.*;

import org.junit.Test;
import ru.mysql.teach.internet.shop.users.user.IUser;
import ru.mysql.teach.internet.shop.users.user.User;
import ru.mysql.teach.internet.shop.users.user.sex.SexEnum;


/**
 *
 */
public class UserTest {
    /**
     * Creates a sex uses a specified sexIndex.
     * SexIndex is: 1 - Male, 2 - Female;
     * @param sexIndex uses for create sex.
     * @return
     */
    private SexEnum createSexEnum(int sexIndex){
        return SexEnum.valueOf(sexIndex);
    }


    @Test
    public void createUserFemale(){
        IUser user = new User("Lena","pperklf","refee@mail.ru",createSexEnum(2));
        assertEquals("User name is: ","Lena",user.getName());
        assertEquals("User password is: ","pperklf",user.getPassword());
        assertEquals("User email is: ","refee@mail.ru",user.getEmail());
        assertEquals("User sex is: ","FEMALE",user.getSex().getSexName());
    }

    @Test
    public void createUserMale(){
        IUser user = new User("Stepan","pwdddddlf","dwddde@mail.ru",createSexEnum(1));
        assertEquals("User name is: ","Stepan",user.getName());
        assertEquals("User password is: ","pwdddddlf",user.getPassword());
        assertEquals("User email is: ","dwddde@mail.ru",user.getEmail());
        assertEquals("User sex is: ","MALE",user.getSex().getSexName());
    }

    @Test
    public void setName(){
        IUser user = new User("Stepan","pwdddddlf","dwddde@mail.ru",createSexEnum(1));
        String name = "Ivan";
        assertEquals("User name is: ","Stepan",user.getName());
        user.setName(name);
        assertEquals("User name is: ","Ivan",user.getName());
    }

    @Test
    public void setEmail(){
        IUser user = new User("Stepan","pwdddddlf","dwddde@mail.ru",createSexEnum(1));
        String email = "rette@gmail.ru";
        assertEquals("User email is: ","dwddde@mail.ru",user.getEmail());
        user.setEmail(email);
        assertEquals("User email is: ","rette@gmail.ru",user.getEmail());
    }

    @Test
    public void setPassword(){
        IUser user = new User("Stepan","pwdddddlf","dwddde@mail.ru",createSexEnum(1));
        String password = "1123ee";
        assertEquals("User password is: ","pwdddddlf",user.getPassword());
        user.setPassword(password);
        assertEquals("User password is: ","1123ee",user.getPassword());
    }

    @Test
    public void setOtherSex(){
        IUser user = new User("Viktor","pperklf","refee@mail.ru",createSexEnum(2));
        assertEquals("User sex is: ","FEMALE",user.getSex().getSexName());
        SexEnum sex = SexEnum.MALE;
        user.setSex(sex);
        assertEquals("User sex is: ","MALE",user.getSex().getSexName());
    }
}
