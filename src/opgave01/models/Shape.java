package opgave01.models;

public abstract class Shape {
    protected int x, y, width, height;
    abstract void printLocation();
    abstract void printSize();
    protected abstract double calculateArea();

    public void printInfo() {
        printLocation();
        printSize();
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
