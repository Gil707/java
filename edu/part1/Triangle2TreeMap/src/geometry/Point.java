package geometry;

import java.awt.*;

public class Point implements Shape {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ";" + y;
    }

    public int distance(Point p) {
        return (int) Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getCollinear(Point p, Point z) {
        if (((x * p.y + p.x * z.y + z.x * y) - (p.x * y + z.x * p.y + x * z.y))/2 == 0) {
            return true;
        } else return false;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(x, y, 1, 1);
    }
}
