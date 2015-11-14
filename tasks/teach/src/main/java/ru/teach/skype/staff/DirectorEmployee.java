package ru.teach.skype.staff;

import ru.teach.skype.Employee;
import ru.teach.skype.IEmployee;

import java.lang.String;


/**
 * Директор это один из сотрудников компании который имеет
 * дополнительные возможности (отделы ,проверка отчетности, определяет повышение зарплаты, контролирует сотрудников ).
 */
public class DirectorEmployee extends Employee implements IDirectorEmployee {
    private String department;
    private IEmployee[] subordinates = new IEmployee[0];

    /**
     * empty constructor
     */
    public DirectorEmployee() {

    }



    /**
     * конструктор с установленным именем, возрастом и отделом
     */

    public DirectorEmployee(String name, int age, String department) throws IllegalArgumentException {
        super(name, age);
        setDepartment(department);
    }


    /**
     * конструктор с установленным именем, возрастом, id и отделом
     */

    public DirectorEmployee(String name, int age, String department, long id) throws IllegalArgumentException {
        super(name, age, id);
        setDepartment(department);
    }

    /**
     * number of employees
     */

    public int amountSubordinates() {
        int x = subordinates.length;
        return x;
    }

    /**
     * устанавливает сотрудника по указанному индексу
     *
     * @param subordinate которого устанавливает
     * @param index       в который устанавливает
     * @throws IllegalArgumentException if value index < 0
     * @throws IllegalStateException    if this subordinate already added
     */
    public void setSubordinate(IEmployee subordinate, int index) throws Exception {
        double amount = amountSubordinates();
        if(amount == 0){
            throw new IllegalStateException("У директора нет подчиненых");
        } else if(index < 0 ){
            throw new IllegalArgumentException("Индекс не может быть меньше нуля");
        } else if(index >= amount){
            throw new IllegalArgumentException("Значение индекса больше количества сотрудников");
        } else if(subordinate == null){
            throw new IllegalStateException("Сотрудник не может быть null: " + subordinate);
        } else if(subordinate.getName() == null || subordinate.getId() == 0 || subordinate.getAge() == 0){
            throw new IllegalArgumentException("У сотрудника должны быть заполнены все поля." );
        }
        subordinates[index] = subordinate;
    }


    /**
     * @return сотрудника
     */
    public IEmployee getSubordinates(int index) {
        return subordinates[index];
    }


    /**
     * Add subordinate
     *
     * @throws IllegalStateException if no free slot
     */
    @Override
    public void addSubordinate(IEmployee subordinate) throws IllegalArgumentException {
        int index = searchIndex(subordinate);
        if (index == -1 && checkSubordinateNotEmpty(subordinate)) {
            IEmployee[] tmp = new Employee[subordinates.length + 1];
            for (int i = 0; i < subordinates.length; i++) {
                tmp[i] = subordinates[i];
            }
            tmp[tmp.length - 1] = subordinate;
            subordinates = tmp;
        } else {
            throw new IllegalStateException("Not possible to addEmployee: " + subordinate + " subordinate");
        }
    }

    private boolean checkSubordinateNotEmpty(IEmployee subordinate){
        return subordinate != null && subordinate.getName() != null && subordinate.getAge() != 0 && subordinate.getId() >= 0;
    }


    /**
     * Search subordinate.
     *
     * @return index subordinate
     */
    private int searchIndex(IEmployee subordinate) throws IllegalStateException {
        for (int i = 0; i < subordinates.length; i++) {
            if(subordinates[i] == subordinate){
                return -1;
            }
            if (subordinates[i] == subordinate || subordinate != null && subordinate.equals(subordinates[i])) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Delete subordinate, set to slot null.
     *
     * @throws IllegalStateException no such subordinate
     */

    public void deleteSubordinate(IEmployee subordinate) throws IllegalStateException {
        int index = searchIndex(subordinate);
        if (index != -1) {
            IEmployee[] tmp = new Employee[subordinates.length - 1];
            for (int i = 0, j = 0; i < subordinates.length; i++) {
                if (index != i) {
                    tmp[j] = subordinates[i];
                    j++;
                }
            }
            subordinates = tmp;
        } else {
            throw new IllegalStateException("No such subordinate: " + subordinate);
        }
    }

    /**
     * Replacement subordinate to another subordinate
     *
     * @throws IllegalStateException if no such subordinate
     */

    public void replaceSubordinate(IEmployee oldSubordinate, IEmployee newSubordinate) throws Exception {
        int index = searchIndex(oldSubordinate);
        if (index != -1) {
            setSubordinate(newSubordinate, index);
        } else {
            throw new IllegalStateException("No such subordinate :" + oldSubordinate + ".");
        }
    }


    /**
     * @return название отдела
     */
    public String getDepartment() {
        return department;
    }


    /**
     * Проверяет является ли DirectorEmployee старым админ. возраст и отдел
     * старый это значит что возраст больше 50
     * а администратом значит что его отдел IT
     */
    public boolean isOldAdministrator() {
        String a = this.getDepartment();

        if (a != null && this.getAge() > 50 && (a == "IT" || a.equals("IT"))) {
            return true;
        }
        return false;
    }

    /**
     * устанавливает отдел
     *
     * @param name в которое устанавливает название отдела
     */
    public void setDepartment(String name) {
        this.department = name;
    }


    /**
     * @return "DIRECTOR [name] number subordinates = [actual size]: Marina, Petor, Ivan ..."
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringBuilder(sb, "");
        return sb.toString()+".";
    }

    /**
     * addEmployee hierarchy in method toString, every director and subordinate set with new line and indent
     */


    @Override
    public void toStringBuilder(StringBuilder sb, String linePrefix) {
        sb.append(linePrefix);
        sb.append("DIRECTOR [").append(getName()).append("]").append(" ").append("Number of subordinates = ").append(this.amountSubordinates());
        int subordinatesCount = amountSubordinates();
        if (subordinatesCount != 0) {
            sb.append(":");
            for (IEmployee subordinate : subordinates) {
                if (subordinate != null) {
                    sb.append("\n");
                    subordinate.toStringBuilder(sb,linePrefix +"\t");
                    subordinatesCount--;
                    if (subordinatesCount != 0) {
                        sb.append( ", ");
                    }
                }
            }
        }
    }



    /**
     * Два объекта равны если name age и department совпадают
     */

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj))) {
            return false;
        }
        DirectorEmployee department = (DirectorEmployee) obj;
        String department1 = this.getDepartment();
        String department2 = department.getDepartment();
        if (department1 == null && department2 != null) {
            return false;
        }
        if (department1 != null && department2 == null) {
            return false;
        }
        if (department1 != null && department2 != null && !(department1.equals(department2))) {
            return false;
        }
        return true;
    }

    @Override
    protected String isIdCorrect(long id) {
        if (id > 1000) {
            return null;
        } else {
            return "значение id не может быть меньше 1000";
        }
    }



    public double calculateAverageQuadraticDeviation() throws Exception {
        if (amountSubordinates() <= 1){
                throw new IllegalStateException("Сотрудников должно быть больше одного");
        }
        double a = 0;
        for (IEmployee employee : subordinates) {
            long id = employee.getId();
            if(id != 0){
                a += id;
            } else {
                throw  new IllegalArgumentException("Заполните поле id у сотрудника: " + employee.getName());
            }
        }
        a = a / amountSubordinates();
        double sum = 0;
        for (IEmployee employee : subordinates) {
            double sumI = employee.getId() - a;
            sum += Math.pow(sumI, 2);
        }
        double result = sum / amountSubordinates();
        result = Math.sqrt(result);
        return result;
    }
}
