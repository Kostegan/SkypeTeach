package ru.teach.skype;

import org.junit.Test;
import ru.teach.skype.staff.DirectorEmployee;

import static org.junit.Assert.*;

/**
 *
 */
public class CompanyTest {

    @Test
    public void printHierarchy() throws Exception{
        Company company = new Company();
        company.loadHierarchy();
        company.printHierarchy();
    }

    /**
     * General director have not subordinate
     */
    @Test
    public void hierarchyGeneralDirectorHaveNot() throws Exception{
        DirectorEmployee generalDirector = new DirectorEmployee("Dmitriy",58,"GeneralDirector");
        Company company = new Company();
        String expected = "DIRECTOR [Dmitriy] Number of subordinates = 0.";
        assertEquals("IResult method toString for general director",expected,generalDirector.toString());
    }


    /**
     * General director have subordinate finance director and finance director have subordinate production director
     */
    @Test
    public void hierarchyGeneralDirectorOneSubordinate() throws Exception{
        DirectorEmployee generalDirector = new DirectorEmployee("Dmitriy",58,"GeneralDirector");
        DirectorEmployee financeDirector = new DirectorEmployee("Irina",68,"Finance");
        DirectorEmployee productionDirector = new DirectorEmployee("Rita",58,"Production");
        generalDirector.addSubordinate(financeDirector);
        financeDirector.addSubordinate(productionDirector);
        String expected = "DIRECTOR [Dmitriy] Number of subordinates = 1:\n" + "\tDIRECTOR [Irina] Number of subordinates = 1:\n" + "\t\tDIRECTOR [Rita] Number of subordinates = 0.";
        assertEquals("IResult method toString for general director",expected,generalDirector.toString());
    }

    /**
     * General director have subordinate finance director, finance director
     */
    @Test
    public void hierarchyGeneralDirectorTwoSubordinateы() throws Exception{
        DirectorEmployee generalDirector = new DirectorEmployee("Dmitriy",58,"GeneralDirector");
        DirectorEmployee financeDirector = new DirectorEmployee("Irina",68,"Finance");
        DirectorEmployee productionDirector = new DirectorEmployee("Rita",58,"Production");
        generalDirector.addSubordinate(financeDirector);
        generalDirector.addSubordinate(productionDirector);
        String expected = "DIRECTOR [Dmitriy] Number of subordinates = 2:\n" + "\tDIRECTOR [Irina] Number of subordinates = 0, \n" + "\tDIRECTOR [Rita] Number of subordinates = 0.";
        assertEquals("IResult method toString for general director",expected,generalDirector.toString());
    }

    /**
     * General director have subordinate directors, and directors have subordinates
     */
    @Test
    public void hierarchyGeneralDirectorMoreSubordinates() throws Exception{
        DirectorEmployee generalDirector = new DirectorEmployee("Maxim_1",58,"General",1500);
        DirectorEmployee financeDirector = new DirectorEmployee("Marina_2",52,"Finance",1100);
        generalDirector.addSubordinate(financeDirector);
        DirectorEmployee productionDirector = new DirectorEmployee("Ekaterina_2",51,"Production",1200);
        DirectorEmployee developmentDirector = new DirectorEmployee("Leonid_2_2",53,"Development",1220);
        DirectorEmployee testingDirector = new DirectorEmployee("Viktor_2_3",59,"Testing",1890);
        DirectorEmployee conveyorDirector = new DirectorEmployee("Kirill_2_3",59,"Conveyor",1530);
        DirectorEmployee advertisingDirector = new DirectorEmployee("Zina_2",59,"Advertising",1120);
        Employee accountantEmployee = new Employee("Viktor_2_2",27,13);
        Employee testingEmployee1 = new Employee("Rita",37,41);
        Employee testingEmployee2 = new Employee("Vika",33,98);
        Employee advertisingEmployee1 = new Employee("Max",23,17);
        Employee advertisingEmployee2 = new Employee("Igor",33,45);
        Employee resourcesEmployee = new Employee("Marina_2_2",43,11);

        generalDirector.addSubordinate(productionDirector);
        generalDirector.addSubordinate(advertisingDirector);


        financeDirector.addSubordinate(developmentDirector);
        financeDirector.addSubordinate(accountantEmployee);
        financeDirector.addSubordinate(resourcesEmployee);

        productionDirector.addSubordinate(testingDirector);
        productionDirector.addSubordinate(conveyorDirector);

        testingDirector.addSubordinate(testingEmployee1);
        testingDirector.addSubordinate(testingEmployee2);

        advertisingDirector.addSubordinate(advertisingEmployee1);
        advertisingDirector.addSubordinate(advertisingEmployee2);
        String expected = "DIRECTOR [Maxim_1] Number of subordinates = 3:\n" +
                "\tDIRECTOR [Marina_2] Number of subordinates = 3:\n" +
                "\t\tDIRECTOR [Leonid_2_2] Number of subordinates = 0, \n" +
                "\t\t[Viktor_2_2], \n" +
                "\t\t[Marina_2_2], \n" +
                "\tDIRECTOR [Ekaterina_2] Number of subordinates = 2:\n" +
                "\t\tDIRECTOR [Viktor_2_3] Number of subordinates = 2:\n" +
                "\t\t\t[Rita], \n" +
                "\t\t\t[Vika], \n" +
                "\t\tDIRECTOR [Kirill_2_3] Number of subordinates = 0, \n" +
                "\tDIRECTOR [Zina_2] Number of subordinates = 2:\n" +
                "\t\t[Max], \n" +
                "\t\t[Igor].";
        assertEquals("IResult method toString for general director",expected,generalDirector.toString());
    }
}
