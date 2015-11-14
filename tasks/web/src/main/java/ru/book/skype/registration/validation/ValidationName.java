package ru.book.skype.registration.validation;
import ru.book.skype.exception.ValidationException;
import ru.book.skype.registration.IUser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checks specified name on a validations. The name must consist of 6-20 characters.
 */
public class ValidationName implements IValidation {
    private String PATTERN_NAME = "[A-Za-z0-9]{6,20}";
    // Уточните как написть пояснения какое должно быть имя и нужно вынести правило в отдельный файл?

    /**
     * The method check the specified username.
     * @param user - whose name will be checkes.
     * @throws ValidationException if the username is invalidation
     */
    @Override
    public void validate(IUser user) throws ValidationException {
        Pattern p = Pattern.compile(PATTERN_NAME);
        Matcher matcher =  p.matcher(user.getName());
        if(!matcher.matches()){
            throw new ValidationException("User name: "+ user.getName() + " - it is invalid name. The name must be ...");
        }
    }
}