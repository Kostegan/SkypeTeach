package ru.mysql.teach.internet.shop.users.user.sex.exception;

/**
 * If sex-name is a invalid. The correct sex - name is a male or female.
 */
public class InvalidSexNameException extends Throwable {
    public InvalidSexNameException(String s){
        System.out.println(s);
    }
}
