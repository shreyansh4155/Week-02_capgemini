package ECommercePlattform;

class Groceries extends Product {
    private String category;

    public Groceries(int productId, String name, double price, String category) {
        super(productId, name, price);
        this.category = category;
    }

    @Override
    public double calculateDiscount() {
        // Example: No discount on Groceries
        return 0;
    }

    @Override
    public String getTaxDetails() {
        return "";
    }
}
