package Shape_package;

public class Triangle extends Shapes{
    private int side1;
    private int side2;
    private int side3;
    private int parameter = (side1 + side2 + side3) / 2;
    private int underRoot = parameter * (parameter - side1) * (parameter - side2) * (parameter - side3);

    public Triangle(int side1, int side2, int side3) {
        super("Triangle of sides " + side1 + ", " + side2 + ", " + side3 + " is :");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    @Override
    public double area() {
        // Heron's formula
        return Math.sqrt(underRoot);
    }

    @Override
    public double perimeter() {
        return parameter * 2;
    }
}
