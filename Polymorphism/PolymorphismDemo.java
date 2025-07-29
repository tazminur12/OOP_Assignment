package Polymorphism;

import GeometricObject.CircleFromSimpleGeometricObject;
import GeometricObject.RectangleFromSimpleGeometricObject;
import GeometricObject.SimpleGeometricObject;

public class PolymorphismDemo {

    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(2, 3, "blue", true));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
