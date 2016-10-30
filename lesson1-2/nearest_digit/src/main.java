import java.util.Scanner;

public class main {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();

        if((a%2) == 0) {
            System.out.println("Числе четное");
        } else {
            System.out.println("Число нечетное");
        }

        System.out.print("Введите f, число относительно которого будет поиск: ");
        double f = in.nextDouble();

        System.out.print("Введите 2 целых числа для поиска ближайшего к " + f + " : ");
        double n = in.nextDouble();
        double m = in.nextDouble();

        if ((Math.abs(f-n)) == (Math.abs(f-m))) {
            System.out.println("Числа "+ n +" и "+m + " равноудалены от " + f);
        } else if ((Math.abs(f-n)) > (Math.abs(f-m))){
            System.out.println("Число " + m +" ближе к " + f);
        } else {
            System.out.println("Число " + n + " ближе к " + f);
        }
    }
}