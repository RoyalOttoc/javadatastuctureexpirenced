package practise;

import lists.classes.Employee;
import lists.classes.EmployeeLinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        Employee jongKim = new Employee("Jong", "Kim", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addTofront(jongKim);
        list.addTofront(johnDoe);
        list.printList();

    }
}
