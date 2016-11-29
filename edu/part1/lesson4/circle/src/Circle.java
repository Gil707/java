import java.util.Scanner;

public class Circle {

    public double x; // абсцисса
    public double y; // ордината
    public double r; // радиус

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r + " мм");
    }

    public double length() {
        return Math.round((2 * Math.PI * r) * 100.00) / 100.00;
    }

    public void moveCircle() {
        x = (double) Math.round(((Math.random() * 200) - 10) * 100.00) / 100.00;
        y = (double) Math.round(((Math.random() * 200) - 10) * 100.00) / 100.00;
    }

    public double squareCircle() {                      // площадь круга
        double s = Math.round((Math.PI * r * r) * 100.00) / 100.00;
        return s;
    }

    public double betweenCircles(Circle c) {
        double dim_x = Math.abs(this.x - c.x);
        double dim_y = Math.abs(this.y - c.y);
        double dim = Math.sqrt(dim_x * dim_x + dim_y * dim_y);
        System.out.println();
        return Math.round((dim) * 100.00) / 100.00;
    }

    public boolean compareCircles(Circle c) {
        if (this.betweenCircles(c) == (double) (this.r + c.r) || this.betweenCircles(c) == (double) (this.r - c.r)) {
            if (this.x != c.x || this.y != c.y || this.r != c.r) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Circle() {
        System.out.print("Введите Х: ");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            x = sc1.nextInt();
        }
        System.out.print("Введите Y: ");
        Scanner sc2 = new Scanner(System.in);
        if (sc2.hasNextInt()) {
            y = sc2.nextInt();
        }
        System.out.print("Введите R: ");
        Scanner sc3 = new Scanner(System.in);
        if (sc3.hasNextInt()) {
            r = sc3.nextInt();
        }
    }

    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }

}
