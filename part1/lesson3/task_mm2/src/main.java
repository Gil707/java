public class main {

    public static void main(String[] args) {
        int[][] num;

        num = new int[5][8];
        int max = 0, min = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 199 - 99);
                System.out.print(num[i][j] + " ");
                if (num[i][j] > max) max = num[i][j];
                if (num[i][j] < min) min = num[i][j];
            }
            System.out.println();

        }
        System.out.println("Максимальный элемент массива = " + max + ", минимальный = " + min);

    }
}
