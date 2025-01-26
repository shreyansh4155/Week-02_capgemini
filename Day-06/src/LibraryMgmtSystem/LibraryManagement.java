package LibraryMgmtSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book("B001", "The Lord of the Rings", "J.R.R. Tolkien");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        DVD dvd = new DVD("D001", "The Shawshank Redemption", "Frank Darabont");

        List<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("----------------------");
        }
    }
}