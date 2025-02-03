package opgave01.models;

public class Circle extends Ellipse {
    public Circle(int x, int y, int radius) {
        super(x, y, radius, radius);
    }

    @Override
    void printLocation() {
        System.out.println("Circle is located at x: " + x + ", and y: " + y);
    }

    @Override
    void printSize() {
        System.out.println("Circle area is: " + calculateArea());
    }
}
