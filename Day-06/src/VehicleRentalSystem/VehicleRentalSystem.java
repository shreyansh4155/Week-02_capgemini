package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("MH12AB1234", "Sedan", 500, "Honda City");
        Bike bike = new Bike("MH12CD4321", "Sports", 200, "Royal Enfield");
        Truck truck = new Truck("MH12EF5678", "Lorry", 1000, 10000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println("--------------------");
        }
    }
}