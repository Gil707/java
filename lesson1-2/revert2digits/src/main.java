// Максимальная цифра числа

import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число : ");
            int value = sc.nextInt();

            System.out.println("Максимальная цифра числа = " + maxdigit(value));

    }
        static int maxdigit(int a) {
          int digit;
          int value_max = 0;
            while (a > 0)
              {
                digit = a%10;
                if ( digit > value_max ) value_max=digit;
                a = (a - digit)/10;
              }
             return value_max;

         }
}