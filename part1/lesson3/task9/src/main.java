public class main {

    public static void main(String[] args) {

        int[] ar1 = new int[10];
        int[] ar2 = new int[10];
        double[] ar3 = new double[10];
        int i;

        for (i = 0; i < 10; i++) {                          // заполняем 3 массива и выводим первый
            ar1[i] = (int) ((Math.random() * 9) + 1);
            ar2[i] = (int) ((Math.random() * 9) + 1);
            ar3[i] = (double) ar1[i]/ar2[i];
            System.out.print(ar1[i] + " ");
        }

        System.out.println();

        for (i = 0; i < 10; i++) {                          // выводим второй массив
            System.out.print(ar2[i] + " ");
        }

        System.out.println();

        for (i = 0; i < 10; i++) {                          // выводим третий массив
            System.out.printf("%.2f ", ar3[i]);

        }
        System.out.println();                               // проверяем и выводим целые числа
        for (i = 0; i < 10; i++) {
            if (ar3[i]%1 == 0) System.out.print((int)ar3[i] + " ");
        }


    }
}
