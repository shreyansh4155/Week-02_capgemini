package HospitalManagementSystem;

class PatientRecord implements MedicalRecord {
    private String medicalHistory;

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return medicalHistory;
    }
}