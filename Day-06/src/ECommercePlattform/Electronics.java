package ECommercePlattform;

class Electronics extends Product implements Taxable {
    private String brand;

    public Electronics(int productId, String name, double price, String brand) {
        super(productId, name, price);
        this.brand = brand;
    }

    @Override
    public double calculateDiscount() {
        // Example: 10% discount on Electronics
        return price * 0.1;
    }

    @Override
    public double calculateTax() {
        // Example: 18% GST on Electronics
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applicable";
    }
}
