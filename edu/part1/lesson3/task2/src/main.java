import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int[] ar;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите нижнюю границу : ");  // первая цифра
        int a = sc.nextInt();
        System.out.print("Введите верхнюю границу : "); // последняя цифра, максимальная
        int b = sc.nextInt();

        for (int c = a; c <= b; c++) {                   // пределяем количество нечетных чисел
            if(c%2!=0) {
                cnt++;
            }
        }

        System.out.println("Массив из " + cnt + " чисел");

        ar = new int[cnt];

        for (int i = 0, n = a; i < ar.length; i++, n += 2) {   // выводим в строчку
            ar[i] = n;
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        for (int i = ar.length-1; i >= 0; i--) {                   // в обратном порядке
            System.out.print(ar[i] + " ");
        }
    }
}

