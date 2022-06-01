package practise;

import lists.classes.Employee;
import lists.classes.VectorMain;

import java.util.List;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector();
        employeeList.add(new Employee("Jong", "Kim", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));

        System.out.println(employeeList.get(0));
        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println(employeeList.size());

    }
}
