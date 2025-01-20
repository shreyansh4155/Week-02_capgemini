import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public void display(){
        System.out.println("Area of the circle is: "+area());
        System.out.println("Circumference of the circle is: "+circumference());
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scn.nextDouble();
        Circle obj = new Circle(radius);
        obj.display();
    }
}
