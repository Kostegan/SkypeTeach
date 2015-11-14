package ru.book.skype.registration.validation;

import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;

/**
 * Contains all validations in method - validate (Checks name, pass, email).
 */
public class ValidationComposite implements IValidation {
    @Override
    public void validate(IUser user) throws ValidationException {
        IValidation validateName = new ValidationName();
        IValidation validateEmail = new ValidationEmail();
        IValidation validatePass = new ValidationPass();
        validateName.validate(user);
        validateEmail.validate(user);
        validatePass.validate(user);
    }
}
