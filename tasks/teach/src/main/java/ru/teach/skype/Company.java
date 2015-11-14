package ru.teach.skype;

import ru.teach.skype.staff.DirectorEmployee;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 */
public class Company extends DirectorEmployee {
    private DirectorEmployee hierarchy;


    public void loadHierarchy()throws Exception {
        DirectorEmployee generalDirector = new DirectorEmployee();
        DirectorEmployee director = null;

        BufferedReader is = null;
        BufferedReader os = null;
        String patchFrom = "C:\\Users\\homek\\IdeaProjects\\work_java\\src\\main\\resources\\Subordinates";
        String patchTo = "C:\\Users\\homek\\IdeaProjects\\work_java\\src\\main\\resources\\Subordinates";
        is = new BufferedReader(new FileReader(patchFrom));
        String line;
        while((line = is.readLine())!= null){
            String[] lineSplits = line.split(",");
            if(lineSplits[1].equals("DirectorEmployee") && lineSplits[4].equals("0")){
                generalDirector.setName(lineSplits[0]);
                int age = Integer.parseInt(lineSplits[2]);
                generalDirector.setAge(age);
                long id = Long.parseLong(lineSplits[3]);
                generalDirector.setId(id);
            }
            if(lineSplits[1].equals("DirectorEmployee") && lineSplits[4].equals("1")){
                director = new DirectorEmployee();
                director.setName(lineSplits[0]);
                int age = Integer.parseInt(lineSplits[2]);
                director.setAge(age);
                long id = Long.parseLong(lineSplits[3]);
                director.setId(id);
                director.setDepartment(lineSplits[5]);
                generalDirector.addSubordinate(director);
            }
            if(lineSplits[1].equals("Employee") && lineSplits[4].equals("1")){
                Employee employee = new Employee();
                employee.setName(lineSplits[0]);
                int age = Integer.parseInt(lineSplits[2]);
                employee.setAge(age);
                long id = Long.parseLong(lineSplits[3]);
                employee.setId(id);
                director.addSubordinate(employee);
            }
        }
        is.close();

        hierarchy = generalDirector;
    }


//    public Company() throws Exception {
//        DirectorEmployee generalDirector = new DirectorEmployee("Maxim_1",58,"General",1500);
//        DirectorEmployee financeDirector = new DirectorEmployee("Marina_2",52,"Finance",1100);
//        generalDirector.addSubordinate(financeDirector);
//        DirectorEmployee productionDirector = new DirectorEmployee("Ekaterina_2",51,"Production",1200);
//        DirectorEmployee developmentDirector = new DirectorEmployee("Leonid_2_2",53,"Development",1220);
//        DirectorEmployee testingDirector = new DirectorEmployee("Viktor_2_3",59,"Testing",1890);
//        DirectorEmployee conveyorDirector = new DirectorEmployee("Kirill_2_3",59,"Conveyor",1530);
//        DirectorEmployee advertisingDirector = new DirectorEmployee("Zina_2",59,"Advertising",1120);
//        Employee accountantEmployee = new Employee("Viktor_2_2",27,13);
//        Employee testingEmployee1 = new Employee("Rita",37,41);
//        Employee testingEmployee2 = new Employee("Vika",33,98);
//        Employee advertisingEmployee1 = new Employee("Max",23,17);
//        Employee advertisingEmployee2 = new Employee("Igor",33,45);
//        Employee resourcesEmployee = new Employee("Marina_2_2",43,11);
//
//        generalDirector.addSubordinate(productionDirector);
//        generalDirector.addSubordinate(advertisingDirector);
//
//
//        financeDirector.addSubordinate(developmentDirector);
//        financeDirector.addSubordinate(accountantEmployee);
//        financeDirector.addSubordinate(resourcesEmployee);
//
//        productionDirector.addSubordinate(testingDirector);
//        productionDirector.addSubordinate(conveyorDirector);
//
//        testingDirector.addSubordinate(testingEmployee1);
//        testingDirector.addSubordinate(testingEmployee2);
//
//        advertisingDirector.addSubordinate(advertisingEmployee1);
//        advertisingDirector.addSubordinate(advertisingEmployee2);
//
//        hierarchy = generalDirector;
//    }

    public DirectorEmployee getHierarchy() {
        return hierarchy;
    }

    public void printHierarchy() {
        System.out.println (toString());

//        DIRECTOR [Maxim] Number of subordinates = 3:
//            DIRECTOR [Marina] Number of subordinates = 3:
//                DIRECTOR [Leonid] Number of subordinates = 0.,
//                [Viktor],
//                [Marina].,
//                DIRECTOR [Ekaterina] Number of subordinates = 2:
//                    DIRECTOR [Viktor] Number of subordinates = 2:
//                        [Rita],
//                        [Vika].,
//                        DIRECTOR [Kirill] Number of subordinates = 0..,
//                        DIRECTOR [Zina] Number of subordinates = 2:
//                            [Max],
//                            [Igor]..

    }



//    @Override
//    public void addSubordinate(IEmployee subordinate)throws Exception{
//        if(subordinate != null){
//            DirectorEmployee director = new DirectorEmployee();
//            IEmployee[] tmp = new IEmployee[director.amountSubordinates()+1];
//            for(int i = 0; i < director.amountSubordinates(); i++){
//                tmp[i] = director.getSubordinates(i);
//            }
//            tmp[director.amountSubordinates()+1] = subordinate;
//
//        } else{
//            throw new IllegalStateException("This subordinate: " + subordinate + "already addEmployee");
//        }
//    }

    private DirectorEmployee addDirector(String[] lineSplit) throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        director.setName(lineSplit[0]);
        director.setDepartment(lineSplit[5]);
        int age = Integer.parseInt(lineSplit[2]);
        director.setAge(age);
        long id = Long.parseLong(lineSplit[3]);
        director.setId(id);
        return hierarchy = director;
    }

    private void addEmployee(String[] string) throws Exception{
        Employee subordinate = new Employee();
        subordinate.setName(string[0]);
        int age = Integer.parseInt(string[2]);
        subordinate.setAge(age);
        hierarchy.addSubordinate(subordinate);
    }



    @Override
    public String toString() {
        return hierarchy.toString();
    }
}
