public class array1 {

    public static void main(String[] args) {
        int[][] num;

        num = new int[8][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();

        }
    }
}
