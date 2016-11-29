public class arrays {

    public static void main(String[] args) {
        int[] ar = new int[10];

        for (int i = 0, n = 2; i < ar.length; i++, n += 2) {
            ar[i] = n;
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
