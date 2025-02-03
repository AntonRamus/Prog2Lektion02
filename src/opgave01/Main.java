package opgave01;

import opgave01.models.Circle;
import opgave01.models.Ellipse;
import opgave01.models.Rectangle;
import opgave01.models.Square;
import opgave01.storage.Storage;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4, 2, 4);
        Storage.addShape(rectangle);
        rectangle.printInfo();
        rectangle.move(4, 6);
        rectangle.printInfo();

        Square square = new Square(0, 0, 10);
        Storage.addShape(square);
        square.printInfo();
        square.move(2, 2);
        square.printInfo();

        Ellipse ellipse = new Ellipse(0, 0, 4, 4);
        Storage.addShape(ellipse);
        ellipse.printInfo();
        ellipse.move(3, 3);
        ellipse.printInfo();

        Circle circle = new Circle(400, 1023, 3);
        Storage.addShape(circle);
        circle.printInfo();
        circle.move(-200, -1000);
        circle.printInfo();
    }
}
