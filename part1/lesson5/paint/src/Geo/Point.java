package Geo;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите Х: ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите Y: ");
            if (scanner.hasNextDouble()) {
                y = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(toString());
    }

    public void move(double a, double b) {
        x += a;
        y += b;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Point) && ((Point) obj).x == x && ((Point) obj).y == y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(", ").append(y).append(")");
        return sb.toString();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void getFourth() {
        if (x > 0 && y > 0) System.out.println("Точка в I четверти");
        else if (x < 0 && y > 0) System.out.println("Точка в II четверти");
        else if (x < 0 && y < 0) System.out.println("Точка в III четверти");
        else if (x > 0 && y < 0) System.out.println("Точка в IV четверти");
    }                                   // Зад. №1 определение четверти точки

    public boolean getSymmetric(Point p) {
        if (p.x == -x && p.y == -y) {
            return true;
        } else return false;
    }                       // Зад. № 2 Определение симметричности точек

    public boolean getCollinear(Point p, Point z) {
        if (((x * p.y + p.x * z.y + z.x * y) - (p.x * y + z.x * p.y + x * z.y))/2 == 0) {
            return true;
        } else return false;
    }               // Зад. № 4 определение коллинеарности точек
}
