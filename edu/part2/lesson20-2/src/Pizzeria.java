import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Pizzeria {
//    static Pizzeria pizzeria = new Pizzeria();
//    static Pizza pizza = new Pizza();

//    final static BlockingQueue<Pizza> queueFromClients = new ArrayBlockingQueue<>(1, true);
//    final static BlockingQueue<Pizza> queueFromOficiant = new ArrayBlockingQueue<>(1, true);
//    final static BlockingQueue<Pizza> queueFromCook = new ArrayBlockingQueue<>(1, true);
//    final static BlockingQueue<Pizza> queueFromPackman = new ArrayBlockingQueue<>(1, true);

    final static BlockingQueue<Pizza> queueFromClients = new LinkedBlockingQueue<>();
    final static BlockingQueue<Pizza> queueFromOficiant = new LinkedBlockingQueue<>();
    final static BlockingQueue<Pizza> queueFromCook = new LinkedBlockingQueue<>();
    final static BlockingQueue<Pizza> queueFromPackman = new LinkedBlockingQueue<>();

    static Client client = new Client("BOB");
    static Client client1 = new Client("ELENA");
    static Client client2 = new Client("ALEX");
    static Oficiant oficiant = new Oficiant();
    static Cook cook = new Cook();
    static Packman packman = new Packman();

    public static void main(String[] args) throws InterruptedException {

//        Scanner sc = new Scanner(System.in);
//        String pizzaName;
//        System.out.print("Enter pizza your want: ");
//        pizzaName = sc.nextLine();
//
//        pizza.setName(pizzaName);

        cook.start();
        cook.sleep(200);

        packman.start();
        packman.sleep(200);

        oficiant.start();
        oficiant.sleep(200);

        client.start();
        client.sleep(200);

        client1.start();
        client1.sleep(200);

        client2.start();
        client2.sleep(200);

    }
}