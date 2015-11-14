package ru.book.skype.registration.users.dao;

import ru.book.skype.registration.IUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class UsersDao implements IUsersDao {
    private Map<String,IUser> usersDao;

    public UsersDao(){
        usersDao = new HashMap<>();
    }
    @Override
    public void addUser(IUser user) {
        usersDao.put(user.getEmail(),user);
    }

    @Override
    public void deleteUser(String email) {
        usersDao.remove(email);
    }

    @Override
    public long counts() {
        return usersDao.size();
    }

    @Override
    public IUser findsByEmail(String email) {
        return usersDao.get(email);
    }
}
