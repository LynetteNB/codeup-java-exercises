package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input scanner = new Input();
        do {
            double radius = scanner.getDouble("What is the radius of the circle? ");
            Circle circle = new Circle(radius);
            Circle.addACircle();
            System.out.printf("The area of a circle with a radius of " + radius + " is %.2f.\n", circle.getArea());
            System.out.printf("The circumference of a circle with a radius of " + radius + " is %.2f.\n", circle.getCircumference());
        } while (scanner.yesNo("Would you like to make another circle? "));
        System.out.print("You made " + Circle.getNumOfCircles() + " circles!");
    }

}