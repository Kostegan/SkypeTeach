package ru.teach.skype;

import java.lang.String;

/**
 * Это сущность которая описывает сотрудников компании.
 * Сотрудник определяется именем, возрастом, id
 * Комбинация имя+возраст+id является уникальной.
 */
public class Employee implements IEmployee {
    private String name;
    private int age;
    private long id;
    private static long sum;


    /**
     * empty constructor
     */
    public Employee() {

    }

    /**
     * конструктор с установленным именем
     *
     * @param name устанавливается имя
     * @throws IllegalArgumentException если name пустая строка
     */
    public Employee(String name) throws IllegalArgumentException {
        setName(name);
    }

    /**
     * конструктор с установленным именем, возрастом и id
     */
    public Employee(String name, int age) throws IllegalArgumentException {
        setName(name);
        setAge(age);
    }


    /**
     * конструктор с установленным именем, возрастом и id
     */
    public Employee(String name, int age, long id) throws IllegalArgumentException {
        setName(name);
        setAge(age);
        setId(id);
    }

    /**
     * @return возраст сотрудника.
     */
    public int getAge() {
        return age;
    }

    /**
     * устанавливает возраст сотрудника.
     *
     * @param age возраст в который устанавливаем
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * устанавливает id сотрудника
     *
     * @param id куда устанавливает
     */
    public void setId(long id) {
        if(id >= 0) {
            Employee.sum = getSumId() - this.id + id;
            this.id = id;
        }
        else {
            throw new IllegalArgumentException("value id < 0 ");
        }
    }

    /**
     * @return id сотрудника
     */
    public long getId() {
        return id;
    }

    /**
     * меняет значение id  function: "+", "-", "/", "*". "%"
     * <p/>
     * 2. Оптимизировать chengeId - вызвать setId только один раз в нем
     * 2.1 Оптимизировать chengeId -  избежать лишних проверок в случ. найденой операции (сейчас постоянно идет проверка по всем if)
     * 2.2 Измен. chengeId - бросить искл. ситуацию UnsupportedOperationException в случ. когда вход операция не соответствует ожидаемой
     * 2.3 Измен. chengeId - обробатывать ситуацию когда входная операция может быть любым объектом (String oper = new String("+"); сейчас работать не будет)
     * 2.4 Добавить тесты chengeId - проверить все операции, ожидаемые и не ожидаемые, проверить деление на ноль
     *
     * @param value на которое меняет
     * @param function "+", "-", "/", "*". "%"
     */
    public void changeId(long value, String function) throws UnsupportedOperationException {
        long a = this.getId();
        long b;

        if(function == null) {
            NullPointerException e = new NullPointerException("Операция не может быть null");
            throw e;
        } else if (function.equals("+")) {
            b = a + value;
        } else if (function.equals("-")) {
            b = a - value;
        } else if (function.equals("/")) {
            if (value == 0  ) {
                b = 0;
            } else {
                b = a / value;
            }
        } else if (function.equals("*")) {
            b = a * value;
        } else if (function.equals("%")) {
            b = a % value;
        } else {
            UnsupportedOperationException e = new UnsupportedOperationException("Не ожидаемая операция: " + function + " Доступные операции +,-,*,/,%");
            throw e;
        }
        this.checkIdAndSetId(b);
    }

    /**
     * overload
     * перестановка входных параметров местами
     */
    public void changeId(String function, long value) throws UnsupportedOperationException  {
        changeId(value, function);
    }

    /**
     * overload
     * в id объекта устанавливается введеное id
     */
    public void changeId(long id) throws UnsupportedOperationException  {
        this.checkIdAndSetId(id);
    }

    /**
     * overload
     * в id передаем String меняем на long
     */

    public void changeId(String id) throws UnsupportedOperationException {
//        long a = Long.parseLong(id);
//        changeId(a);

        try {
            long a = Long.parseLong(id);
            changeId(a);
        } catch (NumberFormatException e) {
            IllegalArgumentException r = new IllegalArgumentException("id = " + id + " ,Id не может текстом");
            throw r;
        }


    }

    /**
     * Id can't be less zero
     * @throws IllegalStateException  when id < 0
     */
    private void checkIdAndSetId(long id) throws IllegalStateException {
        String correct = isIdCorrect(id);
        if (correct != null) {
            IllegalStateException e = new IllegalStateException("id = " +" "+ id +", " + correct);
            throw e;
        } else {
            setId(id);
        }
    }

    protected String isIdCorrect (long id) {
        if (id >= 0){
            return null;
        } else {
            return "Id не может быть меньше нуля.";
        }

    }



    /**
     * меняет значение id  function: "+", "-", "/", "*". "%"
     * @param value    на которое меняет
     * @param function "+", "-", "/", "*". "%"
     */
    public void changeIdSwitch(long value, String function) {
        long a = this.getId();
        long b;
        switch (function) {
            case "+":
                b = a + value;
                break;
            case "-":
                b = a - value;
                break;
            case "*":
                b = a * value;
                break;
            case "/":
                if (value == 0) {
                    b = 0;
                }  else {
                    b = a / value;
                }
                break;
            case "%":
                b = a % value;
                break;
            default:
                UnsupportedOperationException e = new UnsupportedOperationException();
                throw e;
        }
        setId(b);
    }

    public boolean primeNumber(){
        long x;
        x = this.getId();
        if (x == 1) {
            return false;
        }
        long x1 = x/2;
        for (long i = 2; i < x1; i++){
            long j = x % i;
            if (j == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @return имя сотрудникаю.
     */
    public String getName() {
        return name;
    }

    /**
     * устанавливает имя сотрудника.
     *
     * @param name имя в которое устанавливаем
     * @throws IllegalArgumentException если name пустая строка
     */
    @Override
    public void setName(String name) throws IllegalArgumentException {
        if (name == null) {
            this.name = null;

        } else if (name.equals("")) {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        } else {
            this.name = name;
        }

    }

    /**
     *
     */
    @Override
    public String toString(){

        return "[" + getName() + "]";
    }

    public void toStringBuilder(StringBuilder sb, String linePrefix){
        sb.append(linePrefix);
        sb.append("[").append(getName()).append("]");
    }

    /**
     * Два объекта равны если name и age совпадают
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        String name1 = this.getName();
        String name2 = employee.getName();
        // name1 равен null => name2 не равен null  => вернуть false
        // name1 не равен null => name2 равен null  => вернуть false
        // name1 равен null => name2  равен null  => вернуть перейти к следующей проверке(age)
        // оба не равны null и не равны по equals вернуть false
        // оба не равны null и равны по equals  перейти к следующей проверке(age)

        if (name1 == null && name2 != null) {
            return false;
        }
        if (name1 != null && name2 == null) {
            return false;
        }
        if (name1 != null && name2 != null && !(name1.equals(name2))) {
            return false;
        }
        if (this.getAge() != employee.getAge()) {
            return false;
        }

        return true;
    }


    public static long getSumId () {
        return sum;
    }

}


