package ru.book.skype.registration;

import ru.book.skype.exception.ValidationException;

/**
 * This class has the method createUser - which do all validation checks.
 */
public interface IRegistration {
    /**
     * Create new user, do all validation checks and add the new user to base.
     * @param user - which creates and add to base.
     * @throws ValidationException if validation is illegal
     */
    public void createUser(IUser user) throws ValidationException;
}
