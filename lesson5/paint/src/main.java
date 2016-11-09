import Geo.Point;
import Geo.Triangle;

import java.util.Scanner;

/**
 * Created by Gil on 02-Nov-16.
 */
public class main {

    public static void main(String[] args) {

        double angl = 0;

        System.out.println("Введите точку 1: ");
        Point p1 = new Point();

        p1.print();

        p1.getFourth();

        System.out.println("Введите точку 2: ");
        Point p2 = new Point();

        p2.print();

        if (p1.getSymmetric(p2)) System.out.println("Точки симметричны"); else System.out.println("Точки не симметричны");

        System.out.println("Введите точку 3: ");
        Point p3 = new Point();

        p3.print();

        if (p1.getCollinear(p2, p3)) {
            System.out.println("Точки коллинеарны");
        } else System.out.println("Точки не коллинеарны");

        System.out.println();

        Triangle tr1 = new Triangle(p1, p2, p3);                        // выводим треугольник
            tr1.print();
            System.out.println("Площадь треугольника = " + Math.round((tr1.getSq())*100.00)/100.00);
            System.out.println("Периметр треугольника = " + Math.round((tr1.perimeter())*100.00)/100.00);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите угол поворота: ");
            if (scanner.hasNextDouble()) {
                angl = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }
            tr1.rotateTr(angl);
        System.out.println("После преобразования :");
            tr1.print();


   }

}
