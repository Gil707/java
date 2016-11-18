import java.util.Scanner;

public class main {

    public static void main(String[] argh) {

        int a = 1;
        int b = 1;
        int n, i;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите кол-во чисел Фибоначчи : ");
        n = s.nextInt();
        System.out.print("Цикл FOR : " + a + " " + b + " ");
        for (i = 2; i < n; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");

        }
        ;

        System.out.println();

        a = 1;
        b = 1;
        System.out.print("Цикл WHILE : " + a + " " + b);
        sum_fib = 2;
        i = 2;
        while (i < n) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(" " + sum_fib);
            i++;
        }
        ;


        System.out.println(" fib = " + fib(9));


    }

    public static int fib(int n) {
        int res = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            res = (fib(n - 1) + fib(n - 2));
            return res;
        }
    }


}
