package ru.book.skype.registration.validation;

import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;

import javax.naming.InvalidNameException;

/**
 *
 */
public interface IValidation{
    public void validate(IUser user) throws ValidationException;
}
