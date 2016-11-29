package Geo;

public class Circle extends Shape {

    private double r;

    public Circle(double x, double y, double r) {
        super(new Point(x, y));
        this.r = r;
    }

    public Circle(Point center, double r) {
        super(center);
        this.r = r;
    }

    public void move(double a, double b){
        this.center.move(a, b);
    }
}
