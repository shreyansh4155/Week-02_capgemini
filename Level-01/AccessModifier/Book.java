import java.util.Scanner;

public class Book {

    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        Book book = new Book(isbn, title, author);

        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + book.ISBN);
        System.out.println("Title: " + book.title); 
        System.out.println("Author: " + book.getAuthor());

        scanner.close();
    }
}

class EBook extends Book {

    private String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author); 
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Using public getter method
        System.out.println("Format: " + format);
    }
}