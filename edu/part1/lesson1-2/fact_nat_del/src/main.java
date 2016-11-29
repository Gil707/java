// факториал, положительные делители, проверка на простое число

import java.util.Scanner;

public class main {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();

        System.out.println("Факториал : " + fact(a));
        if (simple(a)) {                                    // простое или составное
            System.out.println("Число простое, делители : ");
        } else {
            System.out.println("Число составное, делители : ");
        }
        delit(a);                                           // натуральные делители

    }

    static int fact(int n) {
        int res;

        if (n == 1 || n == 0) return 1;
        res = fact(n - 1) * n;
        return res;
    }

    static void delit(int d) {
        for(int i = 1; i <= d; i++) {
            if ((d % i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean simple(int s) {
        if (s < 2) return false;
        for (int i = 2; i*i <= s; i++)
            if (s%i == 0) return false;
        return true;
    }
}