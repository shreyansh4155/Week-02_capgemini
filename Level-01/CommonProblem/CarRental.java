public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        double dailyRate = 50.0; // Fixed daily rental cost
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("John Doe", "Tesla Model 3", 5);
        System.out.println("Customer Name: " + rental.customerName);
        System.out.println("Car Model: " + rental.carModel);
        System.out.println("Rental Days: " + rental.rentalDays);
        System.out.println("Total Cost: $" + rental.calculateTotalCost());
    }
}
