import java.util.Scanner;

public class fibonachi {

    public static void main(String[] argh) {

        int n, i;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите кол-во чисел Фибоначчи : ");
        n = s.nextInt();

        int[] ar = new int[n];
        ar[0] = 1;
        ar[1] = 1;

        System.out.print("Числа Фибоначчи : " + ar[0] + " " + ar[1] + " ");
        for (i = 2; i < n; i++) {
            ar[i] = ar[i - 1] + ar[i - 2];
            System.out.print(ar[i] + " ");
        }

    }
}