public class main {

    public static void main(String[] args) {
        int[] ar = new int[3];
        int i;

        for (i = 0; i < ar.length; i++) {
            ar[i] = (int) ((Math.random()*9)+1);
            System.out.print(ar[i] + " ");
        }

        for (i = 0; i < ar.length; i++) {
            if (i > 0 && ar[i-1] >= ar[i]) {
                System.out.println("Последовательность не строго возрастающая");
                break;
            }

            if (i==ar.length-1) System.out.println("Последовательность строго возрастающая");
        }

    }
}
