package Shape_package;

public class Rectangle extends  Shapes{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        super("Rectangle of length " + length + " and width " + width + " is :");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
}
