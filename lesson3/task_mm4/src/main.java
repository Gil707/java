public class main {

    public static void main(String[] args) {

        int[][] num = new int[6][7];
        int max = 0, temp = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
                System.out.print(num[i][j] + " ");

                if (j == 0) max = num[i][j];
                else {
                    if (max < num[i][j]) {
                        max = num[i][j];
                        temp = j;
                    }
                }
                if (j == num[i].length - 1) {
                    int temp_k = num[i][0];
                    num[i][0] = num[i][temp];
                    num[i][temp] = temp_k;
                }
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}