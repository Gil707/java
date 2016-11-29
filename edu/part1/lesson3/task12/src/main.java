/**
 * Created by Gil on 30-Oct-16.
 */
public class main {

    public static void main(String[] args) {

        int[] ar = new int[12];
        int d1 = 0, d2 = 0, mr = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 21) - 10;
            if (ar[i] < 0) d1++;
            if (ar[i] > 0) d2++;
            if (ar[i] == 0 || d1 > d2 + 1 || d2 > d1 + 1) {
                i--;
                if (d1 > d2 + 1) d1--;
                if (d2 > d1 + 1) d2--;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\n Отрицательных значений : " + d1 + ", положительных : " + d2);
    }
}
