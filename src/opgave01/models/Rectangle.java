package opgave01.models;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int s1, int s2) {
        this.x = x;
        this.y = y;
        this.width = s1;
        this.height = s2;
    }

    @Override
    void printLocation() {
        System.out.println("Rectangle is located at x: " + x + ", and y: " + y);
    }

    @Override
    public void printSize() {
        System.out.println("Rectangle area is: " + calculateArea());
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }
}
