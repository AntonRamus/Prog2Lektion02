package opgave01.models;

public class Ellipse extends Shape{
    public Ellipse(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    void printLocation() {
        System.out.println("Ellipse is located at x: " + x + ", and y: " + y);
    }

    @Override
    void printSize() {
        System.out.println("Ellipse area is: " + calculateArea());
    }

    @Override
    protected double calculateArea() {
        return Math.PI * width * height;
    }
}
