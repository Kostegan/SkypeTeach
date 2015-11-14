package ru.teach.skype.my.list;

import ru.teach.skype.IEmployee;

/**
 * An ordered collection. User of this my has control over each element
 * is insert.In this collection user can find element by integer index, and he
 * can add, delete elements.
 */
public interface IMyList<T extends IEmployee> {
    /**
     * specified element will appended to end list
     * Разреш. добавлять одинаковые элементы. После добав. элемента в список, размер списка увеличивается на 1
     *
     * @param employee object which will be append
     * @throws NullPointerException if append employee is null
     */
    public void addEmployee(T employee) throws NullPointerException;

    /**
     * Delete specified element by index, list is reduced to a single element.
     *
     * @param index of deleted element
     * @throws IllegalArgumentException if value index more or equals size of list or index is negative
     */
    public void deleteEmployeeByIndex(int index);

    /**
     * Delete specified element of list, list size is reduced on one element.
     * If list have several copies element, then delete all copies.   ----      спросить
     * @param employee element which be deleted
     * @return the amount elements were deleted or -1 if an element was not set to list
     */
    public int deleteEmployee(T employee) throws MyListException;

    /**
     * The size of the list (the number of elements it contains).
     * If list empty, then size return 0.
     * @return number element (int)
     */
    public int size();

    /**
     * Find element to list by index.
     *
     * @param index element which must find
     * @return found element
     * @throws IllegalArgumentException if value index more or equals size of list or index is negative
     * @throws MyListException          if index more then size array
     */
    public T getEmployeeByIndex(int index);

    /**
     * Find index element in list by employee  / уточнить должен вернуть ошибку или -1 ,
     * если элемента нет в списке и что делать если есть несколько копий элемента
     * @param employee element by which find index
     * @return -1 if the element is not found or element is null   todo
     */
    public int getIndexByEmployee(T employee);

    /**
     * Find specified element to list.
     * @param employee element which must check
     * @return Return true if list contains this element
     */
    public boolean containsEmployee(T employee);
}
