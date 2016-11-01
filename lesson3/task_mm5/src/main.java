public class main {

    public static void main(String[] args) {

        int[][] num = new int[15][3];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 8) + 2;

                if (j == num[i].length - 1) {
                    num[i][j] = num[i][j - 2] * num[i][j - 1];

                    for (int cnt = 0; cnt < i; cnt++) {                     // перебор 3-го элемента, результата для определения совпадений
                        if (num[i][j] == num[cnt][j] && i > 0) {
                            if (num[i][j - 1] == num[cnt][j - 1] || num[i][j - 2] == num[i][j - 2])
                                --i;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < num.length; i++) {                               // вывод
            System.out.print("№ " + (i + 1) + ": ");
            for (int j = 0; j < num[i].length; j++) {
                if (j == 0)
                    System.out.print(num[i][j] + " * ");
                if (j == 1)
                    System.out.println(num[i][j] + " = ?");
            }
        }
    }
}