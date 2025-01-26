package RideHailingApplication;

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 8.0); // Example rate for Auto
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
