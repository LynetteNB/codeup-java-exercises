package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    public double getPerimeter() {
        return 4*width;
    }

    public double getArea() {
        return Math.pow(width, 2);
    }
}