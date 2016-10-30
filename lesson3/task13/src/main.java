import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int a = 0, i, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число больше 3 : ");

        if (sc.hasNextInt()) {
            while (a < 3) // проверять пока число не будет четным
            {
                a = sc.nextInt();
                if (a < 3) System.out.print("Введите число больше 3 : ");
            }
        }

        int[] ar = new int[a];

        for (i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (a + 1));
            if (ar[i] % 2 == 0) c++;
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        if (c > 0) {
            int[] ar2 = new int[c];
            int b = 0;
            for (i = 0; i < ar.length; i++) {
                if (ar[i] % 2 == 0 && ar[i] != 0) {
                          ar2[b] = ar[i];
                    System.out.print(ar2[b] + " ");
                    b++;
                }
            }
        }

    }

}