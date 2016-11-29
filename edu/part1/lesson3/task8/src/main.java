public class main {

    public static void main(String[] args) {

        int[] ar = new int[12];
        int max = 0, cnt = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) ((Math.random()*31)-15);
            System.out.print(ar[i] + " ");
            if (i!=0 && ar[i] >= max)  {
                max = ar[i];
                cnt = i+1;
            }
        }
        System.out.println("\nЭлемент № ["+ cnt + "] = " + max);
    }
}
