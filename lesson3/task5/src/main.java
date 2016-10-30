public class main {

    public static void main(String[] args) {
        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        int i, s1 = 0, s2 = 0;

        System.out.print("Первый массив : ");
        for (i = 0; i < ar1.length; i++) {
            ar1[i] = (int) (Math.random() * 6);
            s1 = s1 + ar1[i];
            System.out.print(ar1[i] + " ");
        }
        System.out.println();
        System.out.print("Второй массив : ");
        for (i = 0; i < ar2.length; i++) {
            ar2[i] = (int) (Math.random() * 6);
            s2 = s2 + ar2[i];
            System.out.print(ar2[i] + " ");
        }
        System.out.println();

        double sa1 = (double) s1 / ar1.length;
        double sa2 = (double) s2 / ar2.length;

        if (sa1 == sa2) {
            System.out.println("Средние арифметические массивов равны (" + sa1 + " и " + sa2 + ") ");
        } else if (sa1 > sa2) {
            System.out.println("Среднее арифметическое первого (" + sa1 + ") массива больше второго (" + sa2 + ")");
        } else {
            System.out.println("Среднее арифметическое второго (" + sa2 + ") массива больше первого (" + sa1 + ")");
        }

    }
}
