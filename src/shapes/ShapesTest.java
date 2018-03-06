package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("The perimeter of a rectangle with a length of " + box1.length + " and a width of " + box1.width + " is " + box1.getPerimeter() + ".");
        System.out.println("The area of a rectangle with a length of " + box1.length + " and a width of " + box1.width + " is " + box1.getArea() + ".");
        Rectangle box2 = new Square(5);
        System.out.println("The perimeter of a rectangle with a length of " + box2.length + " and a width of " + box2.width + " is " + box2.getPerimeter() + ".");
        System.out.println("The area of a rectangle with a length of " + box2.length + " and a width of " + box2.width + " is " + box2.getArea() + ".");
    }
}