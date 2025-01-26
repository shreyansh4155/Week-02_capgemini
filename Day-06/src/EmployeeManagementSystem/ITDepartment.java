package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

class ITDepartment implements Department {
    private String departmentName = "IT";
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void assignDepartment(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String getDepartmentDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department: ").append(departmentName).append("\n");
        for (Employee employee : employees) {
            sb.append("Employee ID: ").append(employee.getEmployeeId()).append(", Name: ").append(employee.getName()).append("\n");
        }
        return sb.toString();
    }
}