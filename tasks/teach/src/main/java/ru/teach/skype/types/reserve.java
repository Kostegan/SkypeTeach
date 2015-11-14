package ru.teach.skype.types;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class reserve {

    //    /**
//     * number of employees
//     */
//
//    public int amountSubordinates(){
//        int x = subordinates.length;
//        for (Employee subordinate:subordinates){
//            if(subordinate == null){
//                x -= 1;
//            }
//        }
//        return x;
//    }


//    public boolean checkSubordinate(Employee subordinate){
////        for (Employee employee : subordinates)
//        for (int i = 0; i < subordinates.length; i++) {
//            if(subordinate.equals(subordinates[i])){
//                throw new IllegalStateException("сотрудник " + subordinate +" уже установлен");
//            }
//        }
//        return true;
//    }

    //    /**
//     * устанавливает сотрудника по указанному индексу
//     * @param subordinate которого устанавливает
//     * @param index в который устанавливает
//     * @throws  IllegalArgumentException if value index < 0
//     * @throws  IllegalStateException if this subordinate already added
//     */
//    public void setSubordinate(Employee subordinate, int index) throws Exception {
//        if(searchIndex(subordinate) == -1) {
//            if (index >= 0 && index < subordinates.length) {
//                subordinates[index] = subordinate;
//                return;
//            }
//            throw new IllegalArgumentException("Значение индекса не корректно: " + index + ", должно быть в интервале от 0 до " + subordinates.length + ".");
//        } else if(index < 0) {
//            throw new IllegalStateException("This subordinate: " + subordinate + " already subordinates added");
//        }
//    }


//    /**
//     * Add subordinate dynamic
//     * todo добавить что бы шла проверка, если такой сотрудник уже есть то добавлять не нужно
//     */
//    public Employee getSubordinatesAll(Employee subordinate) {
//        int index = searchIndex(subordinate);
//        if(index != -1){
//            return subordinates[index];
//        }
//        else {
//            throw new IllegalStateException("No such subordinate: " + subordinate);
//        }
//
//    }

//

//    @Test
//    public void amountEmployeeDynamic() throws Exception {
//        DirectorEmployee director = new DirectorEmployee();
//        Employee employee1 = new Employee("Vasia", 29, 22);
//        Employee employee2 = new Employee("Vika", 26, 13);
//        Employee employee3 = new Employee();
//        director.addSubordinateDynamic(employee1);
//        assertEquals("amount employee", 1, director.amountSubordinates());
//        assertEquals("check 1 subordinate", employee1, director.getSubordinates(0));
//        director.addSubordinateDynamic(employee2);
//        assertEquals("amount employee", 2, director.amountSubordinates());
//        assertEquals("check 2 subordinate", employee1, director.getSubordinates(0));
//        assertEquals("check 2 subordinate", employee2, director.getSubordinates(1));
//        director.deleteSubordinateDynamic(employee2);
//        assertEquals("amount employee", 1, director.amountSubordinates());
//        assertEquals("check 1 subordinate", employee1, director.getSubordinates(0));
//        director.deleteSubordinate(employee1);
//        assertEquals("amount employee", 0, director.amountSubordinates());
//        director.addSubordinateDynamic(employee3);
//        director.deleteSubordinateDynamic(employee3);
//        assertEquals("amount employee", 0, director.amountSubordinates());
//    }


//    /**
//     * Add subordinate
//     * @throws  IllegalStateException if no free slot
//     */
//
//    public void addSubordinate(Employee subordinate) throws Exception {
//        int index = searchIndex(null);
//        if(index != -1){
//            setSubordinate(subordinate,index);
//        }
//        else {
//            throw new IllegalStateException("This subordinate: " + subordinate + ", already added.");
//        }
//    }


//    public void replaceSubordinate(Employee oldEmployee, Employee newEmployee)throws IllegalStateException {
//        for (int i = 0; i < subordinates.length; i++) {
//            if (oldEmployee == subordinates[i]) {
//                subordinates[i] = newEmployee;
//                return;
//            }
//        }
//        throw new IllegalStateException("No such subordinate " + oldEmployee.getName());
//    }


//    /**
//     * @param id
//     * @throws UnsupportedOperationException
//     */
//    @Override
//    public void changeId(long id) throws IllegalStateException {
//        super.changeId(id);
//        if (this.getId() < 1000) {
//            IllegalStateException e = new IllegalStateException("Value id > 1000");
//            throw e;
//        }
//    }





    /**
     * Delete subordinate dynamic
     */

//    public void deleteSubordinateDynamic(Employee subordinate) {
//        int index = searchIndex(subordinate);
//        if (index != -1) {
//            Employee[] tmp = new Employee[subordinates.length - 1];
//            for (int i = 0, j = 0; i < subordinates.length; i++) {
//                if (index != i) {
//                    tmp[j] = subordinates[i];
//                    j++;
//                }
//            }
//            subordinates = tmp;
//        }
//    }



//    /**
//     * constructor set number subordinates
//     */
//    public DirectorEmployee(int subordinatesNumber) {
//        subordinates = new Employee[subordinatesNumber];
//    }
}
