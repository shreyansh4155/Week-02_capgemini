package RideHailingApplication;

class Car extends Vehicle {
    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10.0); // Example rate for Car
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}