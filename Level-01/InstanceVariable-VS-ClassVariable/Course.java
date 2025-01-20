public class Course {

    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 4, 500.00);
        Course course2 = new Course("Data Science", 8, 1200.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("New Institute");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}