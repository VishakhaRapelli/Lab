package Abstraction;
abstract class Shape2 {
    abstract double calculateArea();
}

class Circle extends Shape2 {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle2 extends Shape2 {
    double width, height;

    Rectangle2(double w, double h) {
        width = w;
        height = h;
    }

    double calculateArea() {
        return width * height;
    }
}
public class Question1 {
	public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle is: " + circle.calculateArea());

        Rectangle2 rectangle = new Rectangle2(10.0, 20.0);
        System.out.println("Area of the rectangle is: " + rectangle.calculateArea());
    }


}
