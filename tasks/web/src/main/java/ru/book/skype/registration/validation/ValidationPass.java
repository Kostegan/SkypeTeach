package ru.book.skype.registration.validation;

import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checks specified password on a validations. The password must consist of 6-50 characters.
 */
public class ValidationPass implements IValidation {
    private String PATTERN_PASSWORD ="[A-Za-z0-9]{6,50}";

    /**
     * The method check the specified password.
     * @param user - whose password will be checkes.
     * @throws ValidationException if the password is invalidation
     */
    @Override
    public void validate(IUser user)throws ValidationException {
        Pattern p = Pattern.compile(PATTERN_PASSWORD);
        Matcher matcher = p.matcher(user.getPass());
        if(!matcher.matches()){
            throw new ValidationException("Invalid password. Password must be ....");
        }
    }
}
