package Shape_package;
 public abstract class Shapes {
     private String shapeName;
     public Shapes( String shapeName) {
         this.shapeName = shapeName;
     }

     public abstract double area();
        public abstract double perimeter();

        public void print() {
            System.out.println("Area of "+shapeName+" :" + area());
            System.out.println("Perimeter of " +shapeName+": " + perimeter());
        }
}
