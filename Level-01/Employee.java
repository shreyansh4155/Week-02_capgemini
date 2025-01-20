public class Employee {

    int id;
    String name;
    double salary;

    // Constructor to initialize the Employee object
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display the details
    public void display() {
        System.out.println("ID of the employee is: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee obj1 = new Employee(1, "Aman", 500000.0);

        // Displaying the details of the Employee
        obj1.display();
    }
}
