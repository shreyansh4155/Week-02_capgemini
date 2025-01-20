public class BookSystem {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public static void main(String[] args) {
        BookSystem book = new BookSystem("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println("Book availability: " + book.isAvailable());

        boolean borrowed = book.borrowBook();
        System.out.println("Borrowing the book: " + (borrowed ? "Success" : "Failed"));
        System.out.println("Book availability after borrowing: " + book.isAvailable());
    }

    public BookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public boolean isAvailable() {
        return availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            return true;
        } else {
            return false;
        }
    }
}
