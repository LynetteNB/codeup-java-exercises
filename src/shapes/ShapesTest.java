package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral box1 = new Rectangle(5, 4);
        System.out.println("The perimeter of a rectangle with a length of " + box1.length + " and a width of " + box1.width + " is " + box1.getPerimeter() + ".");
        System.out.println("The area of a rectangle with a length of " + box1.length + " and a width of " + box1.width + " is " + box1.getArea() + ".");
        Quadrilateral box2 = new Square(5);
        System.out.println("The perimeter of a square with a side of " + box2.length + " is " + box2.getPerimeter() + ".");
        System.out.println("The area of a square with a side of " + box2.length + " is " + box2.getArea() + ".");

        Measurable myShape = new Square(2.5);
        //myShape.getLength(), setLength(), setWidth() and myShape.getWidth() do not work on a measurable object. Must be class or subclass of Quadrilateral object
        System.out.println("Area = " + myShape.getArea());
        System.out.println("Perimeter = " + myShape.getPerimeter());
        myShape = new Rectangle(2.5, 5);
        System.out.println("Area = " + myShape.getArea());
        System.out.println("Perimeter = " + myShape.getPerimeter());
    }
}