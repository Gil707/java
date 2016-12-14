/**
 * Created by GilEO on 14.12.2016.
 */
public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (Pizzeria.cook) {
                    Pizzeria.cook.wait();
                    System.out.println("3. Cook wake up and starts making pizza");
                    sleep(2000);
                    System.out.println("making.................................");
                    sleep(2000);
                    System.out.println("4. Pizza " + Pizzeria.pizza.getName() + " is ready");

                    synchronized (Pizzeria.oficiant) {
                        Pizzeria.oficiant.notify();
                    }
                }

            } catch (InterruptedException e) {

            }
        }
    }
}
