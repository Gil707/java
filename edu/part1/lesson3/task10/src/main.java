/**
 * Created by Gil on 30-Oct-16.
 */
public class main {

    public static void main(String[] args) {

        int[] ar = new int[11];
        int a = 0, a0 = 0, a1 = 0;

        for (int i = 0; i < 11; i++) {
            ar[i] = (int) (Math.random() * 3) - 1;
            System.out.print(ar[i] + " ");
            switch (ar[i]) {
                case -1:
                    a++;
                    break;
                case 0:
                    a0++;
                    break;
                case 1:
                    a1++;
                    break;
            }
        }

        if (a > a0 && a > a1) {
            System.out.println("\nБольше всего встречается -1, : " + a);
        } else if (a0 > a && a0 > a1) {
            System.out.println("\nБольше всего встречается 0, : " + a0);
        } else if (a1 > a && a1 > a0) {
            System.out.println("\nБольше всего встречается 1, : " + a1);
        }
    }
}
