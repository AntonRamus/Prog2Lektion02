package opgave01.storage;

import opgave01.models.Shape;

import java.util.ArrayList;

public class Storage {
    public static ArrayList<Shape> shapes = new ArrayList<>();

    public static void addShape(Shape shape) {
        if (!shapes.contains(shape)) {
            shapes.add(shape);
        }
    }
}
