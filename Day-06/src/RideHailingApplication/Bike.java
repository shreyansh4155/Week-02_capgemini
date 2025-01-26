package RideHailingApplication;

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 5.0); // Example rate for Bike
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
