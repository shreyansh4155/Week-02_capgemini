package OnlineFoodDeliverySystem;
class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge = 50; // Example: Extra charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price + extraCharge) * quantity;
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        return calculateTotalPrice() * (1 - (discountPercentage / 100));
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applicable on non-veg items.";
    }

}
