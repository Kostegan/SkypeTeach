package ru.mysql.teach.internet.shop.users.user.sex;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 */
public class SexTest {
    private SexEnum1 sex;

    /**
     * Creates and writes a new sex to field sex. The sex is gets from a specified sexIndex.
     * SexIndex: 1 - Male, 2 - Female
     * @param sexIndex witch will be set.
     */
    private void createSex(int sexIndex){
        sex = SexEnum1.valueOf(sexIndex);
    }

    @Test
    public void getMaleValue(){
        createSex(1);
        assertEquals("Male value is: ",1,sex.getValue());
    }

    @Test
    public void getFemaleValue(){
        createSex(2);
        assertEquals("Female value is: ",2,sex.getValue());
    }

    @Test
    public void getSexName(){
        createSex(1);
        assertEquals("Sex-name is: ","MALE",sex.getSexName());
    }

    @Test
    public void checkMaleValueOf(){
        int index = 1;
        assertEquals("This index belongs to: ","MALE", SexEnum1.valueOf(index).getSexName());
    }

    @Test
    public void checkFemaleValueOf(){
        int index = 2;
        assertEquals("This index belongs to: ", SexEnum1.FEMALE, SexEnum1.valueOf(index));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIncompatibleValueOf(){
        int index = 4;
        assertEquals("This index belongs to: ","FEMALE", SexEnum1.valueOf(index).getSexName());
    }
}
