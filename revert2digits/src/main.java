// Поменять 2 числа местами

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  a, b;
        System.out.print("Введите a: ");
        a = sc.nextInt();
        System.out.print("Введите b: ");
        b = sc.nextInt();

        System.out.println("a = " + a + ", b = " + b);

        a ^= b;
        b ^= a;
        a ^= b;

     /*
        a = a + b;
        b = a - b;
        a = a - b;
     */

        System.out.println("a = " + a + ", b = " + b);
    }
}