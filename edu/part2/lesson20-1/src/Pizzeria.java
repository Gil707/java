import java.util.Scanner;

public class Pizzeria {
    static Pizzeria pizzeria = new Pizzeria();
    static Pizza pizza = new Pizza();
    static boolean flag = false;

    static Client client = new Client();
    static Oficiant oficiant = new Oficiant();
    static Cook cook = new Cook();

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String pizzaName;
        System.out.print("Enter pizza your want: ");
        pizzaName = sc.nextLine();

        pizza.setName(pizzaName);

        cook.start();
        cook.sleep(200);

        oficiant.start();
        oficiant.sleep(200);

        client.start();
        client.sleep(200);

    }
}