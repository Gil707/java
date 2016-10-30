import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нижнюю границу : ");  // первая цифра
        int a = sc.nextInt();
        System.out.println("Введите верхнюю границу : "); // последняя цифра, максимальная
        int b = sc.nextInt();

        for (int c = a; a < b; c++) {
            
        }



        int[] ar = new int[];

        for (int i = 0, n = 1; i < ar.length; i++, n += 2) {
            ar[i] = n;
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
