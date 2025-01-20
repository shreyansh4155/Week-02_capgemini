import java.util.Scanner;

public class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = scanner.nextDouble();

        Student student = new Student(rollNumber, name, CGPA);

        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name); // Accessing protected member
        System.out.println("CGPA: " + student.getCGPA()); 

        scanner.close();
    }
}

class PostgraduateStudent extends Student {

    private String thesisTitle;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA); 
        this.thesisTitle = thesisTitle;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member from subclass
        System.out.println("CGPA: " + getCGPA()); // Using public getter method
        System.out.println("Thesis Title: " + thesisTitle);
    }
}