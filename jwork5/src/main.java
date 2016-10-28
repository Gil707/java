public class main {

    public static void main(String[] args) {

        int i;
        double dl;

        for(i = 1000; i <= 9999; i=(i+3)) {        // четырехзначные числа с шагом 3
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for(i = 1; i <= 55; i=(i+2)) {              // числа от 1 до 55 с шагом 2
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for(i = 90; i > 0; i=(i-5)) {              // неотрицательные числа от 90 до 0 с шагом 5
            if ((i%2) != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");                   // степени 2-ки

        for(i=1; i <= 20; i++) {
            dl = Math.pow(2,i);
            System.out.print((int)dl + " ");
        }
    }
}