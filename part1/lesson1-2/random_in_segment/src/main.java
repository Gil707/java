// случайное число в отрезке

import java.util.Scanner;

public class main {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите нижнюю границу отрезка: ");
        int a = in.nextInt();
        System.out.print("Введите верхнюю границу отрезка: ");
        int b = in.nextInt();

        double i = (Math.random()*155+5);

        if ((int)i > a && (int)i < b) {
            System.out.println("Число " + (int)i + " содержится в диапазоне (" + a + ";" + b + ")");
        } else {
            System.out.println("Число " + (int)i + " не содержится в диапазоне (" + a + ";" + b + ")");
        }

    }
}

