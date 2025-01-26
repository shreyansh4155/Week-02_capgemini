package RideHailingApplication;

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "John Doe");
        Vehicle bike = new Bike("B001", "Jane Smith");
        Vehicle auto = new Auto("A001", "David Lee");

        double distance = 10.0;

        System.out.println(car.getVehicleDetails() + ", Fare: $" + car.calculateFare(distance));
        System.out.println(bike.getVehicleDetails() + ", Fare: $" + bike.calculateFare(distance));
        System.out.println(auto.getVehicleDetails() + ", Fare: $" + auto.calculateFare(distance));
    }
}
