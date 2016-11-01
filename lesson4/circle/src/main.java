public class main {

    public static void main(String[] args) {
        Circle o1 = new Circle();

        o1.printCircle();
        System.out.println("Площадь круга: " + o1.squareCircle() + " мм2");

        System.out.println("Длина окружности: " + o1.length() + " мм");
        o1.moveCircle();
        System.out.println("\nПосле перемещения: ");
        o1.printCircle();

        Circle o2 = new Circle(5.5, 8, 11);
        System.out.print("\nВторая окружность : ");o2.printCircle();
        System.out.println("Расстояние между центрами окружностей = " + o2.betweenCircles(o1) + " мм");
        if (o1.compareCircles(o2)) {
            System.out.println("Окружности пересекаются");
        } else System.out.println("Окружности не пересекаются");

    }



}
