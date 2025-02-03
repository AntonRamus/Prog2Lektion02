package opgave01.models;

public class Square extends Rectangle{

    public Square(int x, int y, int s1) {
        super(x, y, s1, s1);
    }

    @Override
    void printLocation() {
        System.out.println("Square is located at x: " + x + ", and y: " + y);
    }

    @Override
    public void printSize() {
        System.out.println("Square area is: " + calculateArea());
    }
}
