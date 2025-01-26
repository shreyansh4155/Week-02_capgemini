package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee(1, "John Doe", 50000);
        PartTimeEmployee partTime = new PartTimeEmployee(2, "Jane Smith", 20000, 15, 80);

        Department itDepartment = new ITDepartment();
        itDepartment.assignDepartment(fullTime);
        itDepartment.assignDepartment(partTime);

        List<Employee> employees = new ArrayList<>();
        employees.add(fullTime);
        employees.add(partTime);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }

        System.out.println(itDepartment.getDepartmentDetails());
    }
}
