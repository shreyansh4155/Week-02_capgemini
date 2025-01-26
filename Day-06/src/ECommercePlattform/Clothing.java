package ECommercePlattform;

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        // Example: 5% discount on Clothing
        return price * 0.05;
    }

    @Override
    public double calculateTax() {
        // Example: 5% GST on Clothing
        return price * 0.05;
    }


    @Override
    public String getTaxDetails() {
        return "5% GST applicable";
    }
}