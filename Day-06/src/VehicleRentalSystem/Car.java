package VehicleRentalSystem;

class Car extends Vehicle implements Insurable {
    private String model;

    public Car(String vehicleNumber, String type, double rentalRate, String model) {
        super(vehicleNumber, type, rentalRate);
        this.model = model;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        // Example: 5% of rental cost for insurance
        return calculateRentalCost(1) * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Basic insurance coverage included.";
    }
}
