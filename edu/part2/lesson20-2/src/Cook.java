/**
 * Created by GilEO on 14.12.2016.
 */
public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
//                synchronized (Pizzeria.cook) {
//                    Pizzeria.cook.wait();
                    Pizza pizza = Pizzeria.queueFromOficiant.take();

                    System.out.println("3. Cook wake up and starts making " + pizza.getName() + " pizza, takes it from queueFromOficiant");
                    sleep(5000);
                    System.out.println("4. Pizza " + pizza.getName() + " is ready");

                    Pizzeria.queueFromCook.add(pizza);

//                    synchronized (Pizzeria.packman) {
//                        Pizzeria.packman.notify();
//                    }
//                }

            } catch (InterruptedException e) {

            }
        }
    }
}
