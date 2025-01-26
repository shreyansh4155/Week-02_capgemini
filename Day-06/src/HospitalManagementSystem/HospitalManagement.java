package HospitalManagementSystem;

public class HospitalManagement {
    public static void main(String[] args) {
        Patient inPatient = new InPatient(1, "John Doe", 30, 5);
        Patient outPatient = new OutPatient(2, "Jane Smith", 25, 500.0);

        System.out.println(inPatient.getPatientDetails());
        System.out.println("In-patient Bill: $" + inPatient.calculateBill());

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Out-patient Bill: $" + outPatient.calculateBill());
    }
}
