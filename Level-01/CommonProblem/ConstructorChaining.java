public class ConstructorChaining {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle parameterizedCircle = new Circle(5.5);

        System.out.println("Default Circle Radius: " + defaultCircle.radius);
        System.out.println("Parameterized Circle Radius: " + parameterizedCircle.radius);
    }
}

class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
