package VehicleRentalSystem;

class Bike extends Vehicle implements Insurable {
    private String brand;

    public Bike(String vehicleNumber, String type, double rentalRate, String brand) {
        super(vehicleNumber, type, rentalRate);
        this.brand = brand;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        // Example: 2% of rental cost for insurance
        return calculateRentalCost(1) * 0.02;
    }

    @Override
    public String getInsuranceDetails() {
        return "Basic insurance coverage included.";
    }
}