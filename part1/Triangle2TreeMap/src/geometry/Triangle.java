package geometry;

import java.awt.*;

public class Triangle implements Shape{

    private Point pntA, pntB, pntC;
    private boolean col;

    public Point getPntA() {
        return pntA;
    }

    public Point getPntB() {
        return pntB;
    }

    public Point getPntC() {
        return pntC;
    }


    public Triangle(Point a, Point b, Point c ) {
        if (a.getCollinear(b, c) != true) {
            pntA = a;
            pntB = b;
            pntC = c;
        } else {
            System.out.println("Точки коллинеарны! Треугольник не создан");
            col = true;
        }
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Треугольник с вершинами ").append("{").append(pntA).append(", ").append(pntB).append(", ").append(pntC).append("}");
        return res.toString();
    }

    public double getSq() {
        if (!col) {
            return Math.abs((pntA.getX() - pntB.getX()) * (pntC.getY() - pntB.getY()) - (pntA.getY() - pntB.getY()) * (pntC.getX() - pntB.getX())) / 2;
        } else return 0;
    }                       // площадь треугольника
    public double perimeter() {
        if (!col) {
            return (pntA.distance(pntB) + pntB.distance(pntC) + pntC.distance(pntA));
        } else return 0;
    }                   // периметр треугольника

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(pntA.getX(), pntA.getY(), pntB.getX(), pntB.getY());
        g.drawLine(pntB.getX(), pntB.getY(), pntC.getX(), pntC.getY());
        g.drawLine(pntC.getX(), pntC.getY(), pntA.getX(), pntA.getY());
    }

    /*
    public void rotateTr(double angle) {
        if (!col) {
            angle *= Math.PI/180;                                       // переводим в радианы (если угол положительный - поворот против часовой)
            double cx = (pntA.getX() + pntB.getX() + pntC.getX()) / 3;
            double cy = (pntA.getY() + pntB.getY() + pntC.getY()) / 3;
            // определеяем точку - центр тяжести треугольника
            pntA.setPoint((cx + (pntA.getX() - cx) * Math.cos(angle) - (pntA.getY() - cy) * Math.sin(angle)), (cy + (pntA.getY() - cy) * Math.cos(angle) + (pntA.getX() - cx) * Math.sin(angle)));
            pntB.setPoint((cx + (pntB.getX() - cx) * Math.cos(angle) - (pntB.getY() - cy) * Math.sin(angle)), (cy + (pntB.getY() - cy) * Math.cos(angle) + (pntB.getX() - cx) * Math.sin(angle)));
            pntC.setPoint((cx + (pntC.getX() - cx) * Math.cos(angle) - (pntC.getY() - cy) * Math.sin(angle)), (cy + (pntC.getY() - cy) * Math.cos(angle) + (pntC.getX() - cx) * Math.sin(angle)));
            // определяем новые координаты для каждой точки
        }
    }   // поворот треугольника вокруг центра тяжести
*/
}