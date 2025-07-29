package Super_keyword;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("Circle Information:");
        System.out.println("Color: " + getColor());
        System.out.println("Filled: " + isFilled());
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius: " + radius;
    }

    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(5, "blue", true);
        System.out.println(circle);
    }
}
