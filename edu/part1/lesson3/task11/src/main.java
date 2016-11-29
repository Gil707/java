import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int a = 0, left = 0, right = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четное число: ");

        if (sc.hasNextInt()) {
            while (a % 2 != 0 || a < 1) // проверять пока число не будет четным
            {
                a = sc.nextInt();
                if (a % 2 != 0 || a < 1) System.out.print("Введите четное число : ");
            }
        }

        int[] ar = new int[a];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 11) - 5;
            if (i <= ar.length / 2 - 1) {
                left += Math.abs(ar[i]);
            } else right += Math.abs(ar[i]);
            System.out.print(ar[i] + " ");
        }

        for (int i = 0; i < ar.length; i++) {


            if (i == ar.length - 1) {
                System.out.println(" ");
                if (left > right) {
                    System.out.println("Сумма модулей левой половины больше, = " + left);
                } else if (right > left) {
                    System.out.println("Сумма модулей правой половины больше, = " + right);
                } else
                    System.out.println("Суммы модулей первой и второй половины равны");
            }
        }

    }
}
