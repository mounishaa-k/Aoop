package DEMO;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Circle created with radius: " + radius);
    }

    @Override
    public double calculateArea() {
        System.out.println("Calculating area of the circle.");
        return Math.PI * radius * radius;
    }
}

