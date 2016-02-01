package ru.mysql.teach.internet.shop.users.user.sex;
import static org.junit.Assert.*;
import org.junit.Test;
import ru.mysql.teach.internet.shop.users.user.sex.exception.InvalidSexNameException;

/**
 *
 */
public class SexTest {
    @Test
    public void setSexNameMale() throws InvalidSexNameException {
        ISex sex = new Sex();
        sex.setSexName("male");
        assertEquals("Get the sex-name: male","male",sex.getSexName());
    }

    @Test
    public void setSexNameFemale() throws InvalidSexNameException {
        ISex sex = new Sex();
        sex.setSexName("female");
        assertEquals("Get the sex-name: female","female",sex.getSexName());
    }

    @Test (expected = InvalidSexNameException.class)
    public void setIncorrectSexName() throws InvalidSexNameException {
        ISex sex = new Sex();
        sex.setSexName("asdw22");
        assertEquals("Sex has the incorrect name: asdw22","asdw22",sex.getSexName());
    }

    @Test (expected = InvalidSexNameException.class)
    public void setIncorrectSexNameMaleFemale() throws InvalidSexNameException {
        ISex sex = new Sex();
        sex.setSexName("malefemale");
        assertEquals("Sex has the incorrect name: malefemale","malefemale",sex.getSexName());
    }
}
