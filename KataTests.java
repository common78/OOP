import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract double getArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

class Calculator {
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

// Unit tests
public class KataTests {
    public static void main(String[] args) {
        // Square: side = 5
        // Rectangle: length = 4, width = 6
        // Circle: radius = 3
        // Triangle: base = 5, height = 2
        Shape[] shapes = new Shape[] {
                new Square(5),
                new Rectangle(4, 6),
                new Circle(3),
                new Triangle(5, 2)
        };

        double totalArea = Calculator.getTotalArea(shapes);
        System.out.println("Total Area: " + totalArea);

        // Expected total area: 70.83
    }
}
