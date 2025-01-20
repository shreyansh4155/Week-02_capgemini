public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(){
        this.title = "No title";
        this.author = "No author";
        this.price = 0.0;
    }

    public static void main(String[] args) {
        Book obj1 = new Book();
        Book obj2 = new Book("The Iron man", "shreyansh",50000.00);
        System.out.println(obj1.title);
        System.out.println(obj1.author);
        System.out.println(obj1.price);

        System.out.println(obj2.title);
        System.out.println(obj2.author);
        System.out.println(obj2.price);

    }
}


