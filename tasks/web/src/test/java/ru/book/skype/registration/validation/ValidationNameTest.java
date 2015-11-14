package ru.book.skype.registration.validation;

import org.junit.Test;
import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;
import ru.book.skype.registration.User;

import static org.junit.Assert.*;

/**
 *
 */
public class ValidationNameTest {
    private IValidation createValidation(){
        return new ValidationName();
    }
    /**
     *
     *    todo как писать тесты на методы которые void
     * 1. Name is not null
     * 2. Name length is less then 6 characters
     * 3. Name length is more then 20 characters.
     * 4. Name consists of invalid characters.
     * 5. Allowable name.
     */

    // 2. Name length is less then 6 characters
    @Test
    public void nameIsLessSixCharacters() throws ValidationException{
        IUser user = new User();
        user.setName("Fedor");
        IValidation validationName = createValidation();
        validationName.validate(user);
    }

    // 3. Name length is more then 20 characters.
    @Test
    public void nameIsMoreTwentyCharacters() throws ValidationException{
        IUser user = new User();
        user.setName("Fedorasdasdasaweererrrrr");
        IValidation validationName = createValidation();
        validationName.validate(user);
    }

    // 4. Name consists of invalid characters.
    @Test
    public void nameHasInvalidCharacters() throws ValidationException{
        IUser user = new User();
        user.setName("Fedosad)()#rrrr");
        IValidation validationName = createValidation();
        validationName.validate(user);
    }

    // 3. Allowable name.
    @Test
    public void nameIsAllowable() throws ValidationException{
        IUser user = new User();
        user.setName("Aleksander");
        IValidation validationName = createValidation();
        validationName.validate(user);
    }
}
