package shapes;

public class Circle {
    private double radius;
    private static int numOfCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
    public static void addACircle() {
        numOfCircles += 1;
    }
    public static int getNumOfCircles(){
        return numOfCircles;
    }
}