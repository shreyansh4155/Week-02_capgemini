package ECommercePlattform;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    public static void main(String[] args) {
        Electronics phone = new Electronics(1, "iPhone 14", 90000, "Apple");
        Clothing shirt = new Clothing(2, "T-Shirt", 1000, "L");
        Groceries milk = new Groceries(3, "Milk", 50, "Dairy");

        List<Product> products = new ArrayList<>();
        products.add(phone);
        products.add(shirt);
        products.add(milk);

        for (Product product : products) {
            double finalPrice = product.getPrice() +
                    ((product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0) -
                    product.calculateDiscount();
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: " + finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("----------------------");
        }
    }
}
