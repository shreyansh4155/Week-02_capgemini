import java.util.Scanner;

public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            this.quantity -= quantityToRemove;
        } else {
            System.out.println("Cannot remove more items than available.");
            this.quantity = 0; // Remove all items if removal exceeds availability
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Initial Quantity: ");
        int initialQuantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        CartItem item = new CartItem(itemName, price, initialQuantity);

        System.out.println("\nInitial Cart:");
        item.displayItemDetails();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Items");
            System.out.println("2. Remove Items");
            System.out.println("3. Display Cart");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int addQuantity = scanner.nextInt();
                    item.addItem(addQuantity);
                    break;
                case 2:
                    System.out.print("Enter quantity to remove: ");
                    int removeQuantity = scanner.nextInt();
                    item.removeItem(removeQuantity);
                    break;
                case 3:
                    System.out.println("\nCurrent Cart:");
                    item.displayItemDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}