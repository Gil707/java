/**
 * Created by Gil on 30-Oct-16.
 */
public class main {

    public static void main(String[] args) {

        int i;
        int[] ar1, ar2;

        ar1 = new int[15];
        ar2 = new int[8];

        System.out.print("Массив случайных чисел от 0 до 9 : ");
        for (i = 0; i < ar1.length; i++) {
            ar1[i] = (int) (Math.random()*10);
            System.out.print(ar1[i] + " ");
        }

        System.out.println();
        howmuch(ar1);

        System.out.print("Массив случайных чисел от 1 до 10 : ");
        for (i = 0; i < ar2.length; i++) {
            ar2[i] = (int) (Math.random()*10+1);
            System.out.print(ar2[i] + " ");
        }

        System.out.println();
        changetozero(ar2);

    }

    static void howmuch(int a[]) {
        System.out.print("Нечетные элементы этого массива : ");
        for (int n = 0; n < a.length; n++) {
            if (a[n]%2 != 0) {
                System.out.print(a[n] + " ");
            }
        }
        System.out.println();
    }
    static void changetozero(int a[]) {
        System.out.print("Массив с замененным на 0 нечетными индексами : ");
        for (int n = 0; n < a.length; n++) {
            if (n%2 != 0) {
                a[n] = 0;
            }
                System.out.print(a[n] + " ");
        }
        System.out.println();
    }

}
