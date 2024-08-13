package DEMO;

public class OCPDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Shape circle = new Circle(7);
        System.out.println("Circle area: " + circle.calculateArea());
    }
}

