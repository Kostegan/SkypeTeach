package ru.book.skype.registration.validation;

import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class ValidationEmail implements IValidation {
    private String PATTERN_EMAIL = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";

    @Override
    public void validate(IUser user)throws ValidationException {
        Pattern p = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = p.matcher(user.getEmail());
        if(!matcher.matches()){
            throw new ValidationException("User email: "+ user.getEmail() + " - it is invalid. The email must be ...");
        }

    }
}
