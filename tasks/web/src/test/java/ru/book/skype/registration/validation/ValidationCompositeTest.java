package ru.book.skype.registration.validation;

import org.junit.Test;
import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;
import ru.book.skype.registration.User;

import static org.junit.Assert.*;

/**
 *
 */
public class ValidationCompositeTest {

    private IValidation createValidationComposite() {
        return new ValidationComposite();
    }

    /**
     * todo как писать тесты на методы которые void
     * <p>
     * 2. Name Email Pass  -   -   -
     * 3. Name Email Pass  +   -   -
     * 4. Name Email Pass  +   +   -
     * 5. Name Email Pass  +   +   +
     * 6. Name Email Pass  +   -   +
     * 7. Name Email Pass  -   +   +
     * 8. Name Email Pass  -   -   +
     * 9. Name Email Pass  null   +   +      todo - уточнить про null
     */


    // 2. Name Email Pass  -   -   -
    @Test(expected = ValidationException.class)
    public void allArgumentsIsInvalid() throws ValidationException {
        IUser user = new User("Nik", "werrs", "2");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 3. Name Email Pass  +   -   -
    @Test(expected = ValidationException.class)
    public void invalidEmailAndPass() throws ValidationException {
        IUser user = new User("Nikitin", "werrs", "2");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 4. Name Email Pass  +   +   -
    @Test(expected = ValidationException.class)
    public void invalidPass() throws ValidationException {
        IUser user = new User("Nikitin", "sd@mail.ru", "2");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 5. Name Email Pass  +   +   +
    @Test
    public void allArgumentsIsValidate() throws ValidationException {
        IUser user = new User("Nikitin", "sd@mail.ru", "2addadwdddwwdd");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 6. Name Email Pass  +   -   +
    @Test(expected = ValidationException.class)
    public void invalidEmail() throws ValidationException {
        IUser user = new User("Nikitin", "sd@mailru", "2addadwdddwwdd");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 7. Name Email Pass  -   +   +
    @Test(expected = ValidationException.class)
    public void invalidName() throws ValidationException {
        IUser user = new User("Ntin", "sd@mail.ru", "2addadwdddwwdd");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }

    // 8. Name Email Pass  -   -   +
    @Test(expected = ValidationException.class)
    public void invalidNameAndEmail() throws ValidationException {
        IUser user = new User("Ntin", "sd@mailru", "2addadwdddwwdd");
        IValidation validateComposite = createValidationComposite();
        validateComposite.validate(user);
    }
}
