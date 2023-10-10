package Shape_package;

public class Main {
    public static void main(String[] args) {
      Shapes[] shapes = new Shapes[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(5, 10);
        for (Shapes shape : shapes) {
            shape.print();
        }
    }
}
