import java.util.Scanner;

public class MobilePhone {

    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: $"+ price);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Brand of the phone: ");
        String brand = scn.nextLine();

        System.out.println("Enter the Model of the phone: ");
        String model = scn.nextLine();

        System.out.println("Enter the price of the phone: ");
        double price = scn.nextDouble();


        MobilePhone phone = new MobilePhone(brand,model,price);

        System.out.println("Phone 1 Details:");
        phone.displayDetails();


    }
}