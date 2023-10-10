package Shape_package;

public class Circle extends Shapes{
    private double radius;
    public Circle(double radius) {
        super("Circle with radius " + radius + " is" );
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
