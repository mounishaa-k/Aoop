package DEMO;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Rectangle created with width: " + width + " and height: " + height);
    }

    @Override
    public double calculateArea() {
        System.out.println("Calculating area of the rectangle.");
        return width * height;
    }
}

