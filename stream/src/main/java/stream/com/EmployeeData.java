package stream.com;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData {

    public  static ArrayList<Employee> get(){
        return new ArrayList<Employee>(Arrays.asList(
                new Employee(1, "John", "Doe", "IT", "Developer", 75000, 28),
                new Employee(2, "Jane", "Smith", "HR", "Manager", 85000, 35),
                new Employee(3, "Bob", "Brown", "Finance", "Analyst", 65000, 30),
                new Employee(4, "Alice", "Johnson", "IT", "Tester", 55000, 25),
                new Employee(5, "Tom", "Harris", "Sales", "Sales Manager", 90000, 40),
                new Employee(6, "Emma", "Davis", "Marketing", "Executive", 60000, 27),
                new Employee(7, "Mike", "Wilson", "IT", "DevOps Engineer", 80000, 32),
                new Employee(8, "Olivia", "maylor", "Legal", "Attorney", 95000, 38)
        ));
    }
}
