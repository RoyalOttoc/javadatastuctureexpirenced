package practise;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jong", "Kim", 1111));
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        System.out.println(employeeList.get(1));

        for (Employee view:employeeList){
            System.out.println("Employee ID is " + view.id);
        }

        for (Employee view:employeeList){
            System.out.println(view.getFirstName());
        }

        employeeList.forEach(employee -> {System.out.println(employee);});

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println((employeeList.indexOf(new Employee("Mary", "Smith", 22))));
        employeeList.remove(2);

        employeeList.forEach(employee -> {System.out.println(employee);});



    }
}
