package ru.book.skype.registration.users.dao;

import org.junit.Test;
import ru.book.skype.registration.IUser;
import ru.book.skype.registration.User;

import static org.junit.Assert.*;

/**
 *
 */
public class UsersDaoTest {
    private IUsersDao createUsersDao(){
        return new UsersDao();
    }

    /**
     * 1. Adds new user to an empty base.
     * 2. Add new user.
     * 3. Adds several new users.
     * 4. Add two equals users.
     * 5. Deletes one user of base.
     * 6. Deletes several users of base.
     * 7. Deletes all users from base.
     * 8. Deletes specified user which not added to base.
     * 9. Deletes from a empty base.
     * 10. Finds specified user in base.
     * 11. Search in an empty base.
     * 12. Search specified user which not added to base.
     * 13. Counts users in base.
     * 14. Counts in empty base.
     */

    //==============================================


    // 1. Adds new user to an empty base.
    @Test
    public void addUserInEmptyBase(){
        IUsersDao usersDao = createUsersDao();
        IUser user = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user);
        assertEquals("Counts users in usersDao is: ", 1, usersDao.counts());
        IUser checkUser = usersDao.findsByEmail("45ii@gmail.com");   // todo  точнить нужно в этом тесте проверять name, email, pass
        assertEquals("Nameuser: ","Nikolay",checkUser.getName());
        assertEquals("User email: ","45ii@gmail.com",checkUser.getEmail());
        assertEquals("Nameuser: ", "2344sswqq", checkUser.getPass());
    }

    // 2. Add new user.
    // 3. Adds several new users.

    @Test
    public void addNewUser(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid","sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        IUser user3 = new User("Viktor","mela@gmail.com","dd2sad4sswqq");
        usersDao.addUser(user1);
        assertEquals("Counts users in usersDao is: ", 1, usersDao.counts());
        IUser checkUser1 = usersDao.findsByEmail("sdwii@mail.com");   // todo точнить нужно в этом тесте проверять name, email, pass
        assertEquals("Nameuser: ", "Leonid", checkUser1.getName());
        assertEquals("User email: ", "sdwii@mail.com", checkUser1.getEmail());
        assertEquals("Nameuser: ", "aaa344sddwddqq", checkUser1.getPass());
        usersDao.addUser(user2);
        assertEquals("Counts users in usersDao is: ", 2, usersDao.counts());
        IUser checkUser2 = usersDao.findsByEmail("45ii@gmail.com");
        assertEquals("Nameuser: ", "Nikolay", checkUser2.getName());
        assertEquals("User email: ", "45ii@gmail.com", checkUser2.getEmail());
        assertEquals("Nameuser: ", "2344sswqq", checkUser2.getPass());
        usersDao.addUser(user3);
        assertEquals("Counts users in usersDao is: ", 3, usersDao.counts());
        IUser checkUser3 = usersDao.findsByEmail("mela@gmail.com");
        assertEquals("Nameuser: ", "Viktor", checkUser3.getName());
        assertEquals("User email: ", "mela@gmail.com", checkUser3.getEmail());
        assertEquals("Nameuser: ", "dd2sad4sswqq", checkUser3.getPass());
    }

    // 4. Add two identical users.
    @Test
    public void addTwoIdenticalUsers(){
        IUsersDao usersDao = createUsersDao();
        IUser user = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user);
        usersDao.addUser(user);
    }

    // 4.2 Add two users with identical email.
    @Test
    public void addTwoUsersWithIdenticalEmail(){
        IUsersDao usersDao = createUsersDao();
        IUser user = new User("Nikolay","45ii@gmail.com","2344sswqq");
        IUser user1 = new User("Genadiy","45ii@gmail.com","dwd2dw3dwdsdwd");
        usersDao.addUser(user);
        usersDao.addUser(user1);
    }

    // 5. Deletes one user of base.
    @Test
    public void deleteUser(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid", "sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        IUser user3 = new User("Viktor","mela@gmail.com","dd2sad4sswqq");
        usersDao.addUser(user1);
        usersDao.addUser(user2);
        usersDao.addUser(user3);
        assertEquals("UsersDao has 3 users.", 3, usersDao.counts());
        usersDao.deleteUser("sdwii@mail.com");
        assertEquals("UsersDao has 2 users.", 2, usersDao.counts());
    }

    // 6. Deletes several users of base.
    // 7. Deletes all users from base.
    @Test
    public void deleteSeveralUsers(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid", "sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        IUser user3 = new User("Viktor","mela@gmail.com","dd2sad4sswqq");
        usersDao.addUser(user1);
        usersDao.addUser(user2);
        usersDao.addUser(user3);
        assertEquals("UsersDao has 3 users.", 3, usersDao.counts());
        usersDao.deleteUser("sdwii@mail.com");
        assertEquals("UsersDao has 2 users.", 2, usersDao.counts());
        usersDao.deleteUser("45ii@gmail.com");
        assertEquals("UsersDao has 1 users.", 1, usersDao.counts());
        usersDao.deleteUser("mela@gmail.com");
        assertEquals("UsersDao has 0 users.", 0, usersDao.counts());
    }

    // 8. Deletes specified user which not added to base.
    @Test
    public void deleteNotAddUser(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid", "sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user1);
        assertEquals("UsersDao has 1 users.", 1, usersDao.counts());
        usersDao.deleteUser("45ii@gmail.com");
        assertEquals("UsersDao has 1 users.", 1, usersDao.counts());
    }

    // 9. Deletes from an empty base.
    @Test
    public void deleteFromEmptyUsersDao(){
        IUsersDao usersDao = createUsersDao();
        IUser user = new User("Nikolay","45ii@gmail.com","2344sswqq");
        assertEquals("UsersDao is empty", 0, usersDao.counts());
        usersDao.deleteUser("45ii@gmail.com");
        assertEquals("UsersDao is empty", 0, usersDao.counts());
    }

    // 10. Finds specified user in base
    @Test
    public void findUserInUsersDao(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid","sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user1);
        assertEquals("Number users in usersDao: ", 1, usersDao.counts());
        assertEquals("User is adds to usersDao.", user1, usersDao.findsByEmail("sdwii@mail.com"));
        usersDao.addUser(user2);
        assertEquals("Number users in usersDao: ", 2, usersDao.counts());
        assertEquals("User is adds to usersDao.",user2,usersDao.findsByEmail("45ii@gmail.com"));
    }

    // 11. Search in an empty base.


    @Test
    public void searchInEmptyUsersDao(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid","sdwii@mail.com","aaa344sddwddqq");
        assertEquals("Number users in usersDao: ", 0, usersDao.counts());
        assertEquals("User is adds to usersDao.", user1, usersDao.findsByEmail("sdwii@mail.com"));
    }

    // 12. Search specified user which not added to base.

    @Test
    public void searchUserWhichIsNotAdd(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid","sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user1);
        assertEquals("Number users in usersDao: ", 1, usersDao.counts());
        assertEquals("User is adds to usersDao.",user2,usersDao.findsByEmail("45ii@gmail.com"));
    }

    // 13. Counts users in base.
    // 14. Counts in empty base.
    @Test
    public void countsUsers(){
        IUsersDao usersDao = createUsersDao();
        IUser user1 = new User("Leonid","sdwii@mail.com","aaa344sddwddqq");
        IUser user2 = new User("Nikolay","45ii@gmail.com","2344sswqq");
        usersDao.addUser(user1);
        assertEquals("Number users in usersDao: ", 1, usersDao.counts());
        usersDao.addUser(user2);
        assertEquals("Number users in usersDao: ", 2, usersDao.counts());
        usersDao.deleteUser("sdwii@mail.com");
        usersDao.deleteUser("45ii@gmail.com");
        assertEquals("Number users in usersDao: ", 0, usersDao.counts());
    }
}
