package Shape_package;

public class Square extends Shapes {
    private double side;
    public Square(double side) {
        super("Square of side " + side + " is :");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
