import java.util.Scanner;

public class Book {
    String title;
    String author;
    Double price;

    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("The author name is " + author + " and the title is " + title + " with its price "+ price);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of the author");
        String author = scn.nextLine();


        System.out.println("Enter the title of the book");
        String title = scn.nextLine();


        System.out.println("Enter the price of the book");
        double price = scn.nextDouble();

        Book obj = new Book(title,author,price);
        obj.display();
    }
}
