// Квадратное уравнение

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double  a, b, c;
        System.out.print("Введите a: ");
        a = sc.nextDouble();
        System.out.print("Введите b: ");
        b = sc.nextDouble();
        System.out.print("Введите c: ");
        c = sc.nextDouble();

        double d = b*b - 4*a*c;
        System.out.println("D = " + d);

        getx(a,b,c,d);
    }

    static void getx(double a, double b, double c, double d) {

        if (d > 0) {
            System.out.println("x1 = " + Math.round(((-b+Math.sqrt(d))/(2*a))*100.00)/100.00 + ", x2 = " + Math.round(((-b-Math.sqrt(d))/(2*a))*100.00)/100.00);
        } else if (d == 0) {
            System.out.println("x1 = " + Math.round(((-b+Math.sqrt(d))/(2*a))*100.00)/100.0);
        } else {
            System.out.println("Корней нет");
        }
    }

}