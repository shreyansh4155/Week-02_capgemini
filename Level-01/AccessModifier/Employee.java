import java.util.Scanner;

public class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department); 
        System.out.println("Salary: $" + getSalary());
        System.out.println("Team: " + team);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Team: ");
        scanner.nextLine(); // Consume newline
        String team = scanner.nextLine();

        Manager manager = new Manager(employeeID, department, salary, team);

        System.out.println("\nManager Details:");
        manager.displayDetails();

        System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();
        manager.setSalary(newSalary);

        System.out.println("\nUpdated Manager Details:");
        manager.displayDetails();

        scanner.close();
    }
}