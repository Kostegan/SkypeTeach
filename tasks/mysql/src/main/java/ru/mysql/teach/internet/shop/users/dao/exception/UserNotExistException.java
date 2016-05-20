package ru.mysql.teach.internet.shop.users.dao.exception;

/**
 *
 */
public class UserNotExistException extends Throwable {
    public UserNotExistException(String s){
        System.out.println(s);
    }
}
