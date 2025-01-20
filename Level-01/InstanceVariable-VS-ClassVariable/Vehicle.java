public class Vehicle {

    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000.00; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("John Doe", "Car");
        Vehicle bike = new Vehicle("Jane Smith", "Motorcycle");

        car.displayVehicleDetails();
        bike.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(1200.00);

        car.displayVehicleDetails();
        bike.displayVehicleDetails(); 
    }
}