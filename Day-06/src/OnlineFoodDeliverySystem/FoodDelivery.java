package OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class FoodDelivery {
    public static void main(String[] args) {
        VegItem vegItem = new VegItem("Vegetable Biryani", 200, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Tikka Masala", 300, 1);

        List<FoodItem> order = new ArrayList<>();
        order.add(vegItem);
        order.add(nonVegItem);

        double totalAmount = 0.0;
        for (FoodItem item : order) {
            totalAmount += item.calculateTotalPrice();
            if (item instanceof Discountable) {
                double discountedPrice = ((Discountable) item).applyDiscount(10); // 10% discount
                System.out.println("Discounted Price for " + item.getItemName() + ": " + discountedPrice);
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("--------------------");
        }

        System.out.println("Total Order Amount: " + totalAmount);
    }
}