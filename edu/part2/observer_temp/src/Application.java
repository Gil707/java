import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int temp;

        Scanner sc = new Scanner(System.in);

        Station station = new Station();

        Observer o1 = new FirstObserver();
        station.addObserver(o1);
        station.addObserver(new SecondObserver());
        station.addObserver(new ThirdObserver());

//        station.removeObserver(o1);
        System.out.print("Введите температуру (целое число) : ");
        temp = sc.nextInt();

        station.setTemp(temp);
    }
}
