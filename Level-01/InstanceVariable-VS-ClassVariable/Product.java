import java.util.Scanner;

public class Product {

    private String productName;
    private double price;
    private static int totalProducts;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            products[i] = new Product(name, price);
        }

        scanner.close();

        System.out.println("\nProduct Details:");
        for (Product product : products) {
            product.displayProductDetails();
            System.out.println("--------------------");
        }

        System.out.println("\nTotal Products Created: " + Product.getTotalProducts());
    }
}