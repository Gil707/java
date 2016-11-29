public class main {

    public static void main(String[] args) {

        int[][] num = new int[7][5];
        int max = 1, start = 0, str = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Строка №" + (i+1) + ": ");
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) ((Math.random() * 11) - 5);
                System.out.print(num[i][j] + " ");
                max *= Math.abs(num[i][j]);
            }
            System.out.print("  (произведение элементов = " + max + ")");
             if (max > start) {
                 start = max; str = i+1;
             }
            max = 1;

            System.out.println();
         }
        System.out.println("\nМаксимальное значение строки = " + start + ", строка № " + str);
    }
}

