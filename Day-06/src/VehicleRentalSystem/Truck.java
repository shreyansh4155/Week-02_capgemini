package VehicleRentalSystem;

class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String vehicleNumber, String type, double rentalRate, int loadCapacity) {
        super(vehicleNumber, type, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
