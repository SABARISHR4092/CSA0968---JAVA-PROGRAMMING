abstract class Shape {

    // Abstract method
    abstract double area();

    // Common method
    void display() {
        System.out.println("Area = " + area());
    }
}

// Circle class
class Circle extends Shape {

    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area()
    @Override
    double area() {

        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {

    double length;
    double breadth;

    // Constructor
    Rectangle(double length,
              double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    // Overriding area()
    @Override
    double area() {

        return length * breadth;
    }
}

// Triangle class
class Triangle extends Shape {

    double base;
    double height;

    // Constructor
    Triangle(double base,
             double height) {

        this.base = base;
        this.height = height;
    }

    // Overriding area()
    @Override
    double area() {

        return 0.5 * base * height;
    }
}

// Main class
public class Question5 {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Shape s;

        // Circle object
        s = new Circle(5);

        System.out.println("===== Circle =====");

        s.display();

        System.out.println();

        // Rectangle object
        s = new Rectangle(10, 5);

        System.out.println("===== Rectangle =====");

        s.display();

        System.out.println();

        // Triangle object
        s = new Triangle(8, 4);

        System.out.println("===== Triangle =====");

        s.display();
    }
}