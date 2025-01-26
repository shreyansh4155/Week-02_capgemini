package HospitalManagementSystem;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        // Calculate bill based on days admitted and other factors
        double dailyRate = 1000.0; // Example daily rate
        return daysAdmitted * dailyRate;
    }
}
