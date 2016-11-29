package Geo;

public class Rectangle extends Shape {

    private Point start;
    private Point end;

    public Rectangle(Point start, Point end) {
        super(start);
        this.start = start;
        this.end = end;
    }

    public double square() {
        double sideTop = start.distance(new Point(end.getX(), start.getY()));
        double sideLeft = end.distance(new Point(start.getX(), end.getY()));
        return sideTop * sideLeft;
    }
}
